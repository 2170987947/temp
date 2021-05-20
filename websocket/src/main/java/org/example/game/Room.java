package org.example.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.ToString;

import javax.websocket.Session;
import java.io.IOException;
import java.util.UUID;

@ToString
@Getter
public class Room {
    private Gson gson = new GsonBuilder().create();

    private static final int MAX_ROW = 15;
    private static final int MAX_COL = 15;
    private String roomId;
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

    private int checkWinner(int userId, int row, int col) {
        return 0;
    }
}
