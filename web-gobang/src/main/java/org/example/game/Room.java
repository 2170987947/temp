package org.example.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.Session;
import java.io.IOException;
import java.util.UUID;

public class Room {
    private Gson gson = new GsonBuilder().create();
    private static final int MAX_ROW = 15;
    private static final int MAX_COL = 15;
    private String roomId;
    private int userId1;
    private int userId2;
    private int[][] chessBoard = new int[MAX_ROW][MAX_COL];

    public String getRoomId() {
        return roomId;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public Room() {
        this.roomId = UUID.randomUUID().toString();
    }



    public static void main(String[] args) {
        Room room = new Room();
        System.out.println(room.roomId);
    }

    public void putChess(Request request) throws IOException {
        int chess = request.getUserId() == userId1 ? 1 : 2;
        int row = request.getRow();
        int col = request.getCol();
        if (chessBoard[row][col] != 0) {
            System.out.println("落子位置有误" + request);
            return;
        }
        chessBoard[row][col] = chess;
        printChessBoard();
        int winner = checkWinner(chess, row, col);

        PutChessResponse response = new PutChessResponse();
        response.setUserId(request.getUserId());
        response.setRow(row);
        response.setCol(col);
        response.setWinner(winner);
        Session session1 = OnlineUserManager.getInstance().getSession(userId1);
        Session session2 = OnlineUserManager.getInstance().getSession(userId2);
        if (session1 == null && session2 == null) {
            RoomManager.getInstance().removeRoom(roomId);
            return;
        }
        if (session1 == null) {
            response.setWinner(userId2);
        }
        if (session2 == null) {
            response.setWinner(userId1);
        }

        session1.getBasicRemote().sendText(gson.toJson(response));
        session2.getBasicRemote().sendText(gson.toJson(response));

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
//                return chess;
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
//                return chess;
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
//                return chess;
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
//                    return chess;
                }
            }
        }
        if (done) {
            return chess;
        }
        return 0;
    }

    private void printChessBoard() {
        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
