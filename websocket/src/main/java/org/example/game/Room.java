package org.example.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.ToString;

import javax.websocket.Session;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

@ToString
@Getter
public class Room {
    private Gson gson = new GsonBuilder().create();

    private static final int MAX_ROW = 15;
    private static final int MAX_COL = 15;
    private String roomId;

    @Override
    public String toString() {
        return "Room{" +
                "gson=" + gson +
                ", roomId='" + roomId + '\'' +
                ", userId1=" + userId1 +
                ", userId2=" + userId2 +
                ", chessBoard=" + Arrays.toString(chessBoard) +
                '}';
    }

    public Gson getGson() {
        return gson;
    }

    public static int getMaxRow() {
        return MAX_ROW;
    }

    public static int getMaxCol() {
        return MAX_COL;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getUserId1() {
        return userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public int[][] getChessBoard() {
        return chessBoard;
    }

    private int userId1;
    private int userId2;

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    private int[][] chessBoard = new int[MAX_ROW][MAX_COL];

    public Room() {
        this.roomId = UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        Room room = new Room();
        System.out.println(room.roomId);
    }

    public void putchess(Request request) throws IOException {
        int userId = request.getUserId() == userId1 ? 1 : 2;
        int row = request.getRow();
        int col = request.getCol();
        chessBoard[row][col] = userId;
        printChess(chessBoard);
        Session session1 = OnlineUserManager.getInstance().getSession(userId1);
        Session session2 = OnlineUserManager.getInstance().getSession(userId2);
        PutChessResponse response = new PutChessResponse();
        response.setCol(col);
        response.setRow(row);
        response.setUserId(request.getUserId());
        int winner = checkWinner(userId, row, col);
        response.setWinner(winner);
        session1.getBasicRemote().sendText(gson.toJson(response));
        session2.getBasicRemote().sendText(gson.toJson(response));
    }

    private void printChess(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int checkWinner(int chess, int row, int col) {
        boolean done = false;
        for (int c= col - 4; c <= col ; c++) {
            if (c < 0 || c + 4 >= MAX_COL) {
                continue;
            }
            if (chessBoard[row][c] == chess
                    && chessBoard[row][c + 1] == chess
                    && chessBoard[row][c + 2] == chess
                    && chessBoard[row][c + 3] == chess
                    && chessBoard[row][c + 4] == chess
            ) {
                done = true;
            }
        }

        for (int r = row - 4; r <= row; r++) {
            if (r < 0 || r + 4 >= MAX_ROW) {
                continue;
            }
            if (chessBoard[r][col] == chess
                    && chessBoard[r + 1][col] == chess
                    && chessBoard[r + 2][col] == chess
                    && chessBoard[r + 3][col] == chess
                    && chessBoard[r + 4][col] == chess
            ) {
                done = true;
            }
        }

        for (int r = row - 4, c = col - 4; r <= row && c <= col; r++, c++) {
            if (r < 0 || r + 4 >= MAX_ROW || c < 0 || c + 4 >= MAX_COL) {
                continue;
            }
            if (chessBoard[r][c] == chess
                    && chessBoard[r + 1][c + 1] == chess
                    && chessBoard[r + 2][c + 2] == chess
                    && chessBoard[r + 3][c + 3] == chess
                    && chessBoard[r + 4][c + 4] == chess
            ) {
                done = true;
            }
        }

        for (int r = row - 4; r <= row; r++) {
            for (int c = col + 4; c >= col; c--) {
                if (r < 0 || c >= MAX_COL || r + 4 >= MAX_ROW || c - 4 < 0 ) {
                    continue;
                }
                if (chessBoard[r][c] == chess
                        && chessBoard[r + 1][c - 1] == chess
                        && chessBoard[r + 2][c - 2] == chess
                        && chessBoard[r + 3][c - 3] == chess
                        && chessBoard[r + 4][c - 4] == chess
                ) {
                    done = true;
                }
            }
        }
        if (done) {
            return chess;
        }
        return 0;
    }
}
