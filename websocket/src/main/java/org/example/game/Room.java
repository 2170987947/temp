package org.example.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
public class Room {
    private static final int MAX_ROW = 15;
    private static final int MAX_COL = 15;
    private String rommId;
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
        this.rommId = UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        Room room = new Room();
        System.out.println(room.rommId);
    }
}
