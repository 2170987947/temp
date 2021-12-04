package org.example.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class PutChessResponse {
    private String type = "putchess";
    private int userId;
    private int row;
    private int col;
    private int winner;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "PutChessResponse{" +
                "type='" + type + '\'' +
                ", userId=" + userId +
                ", row=" + row +
                ", col=" + col +
                ", winner=" + winner +
                '}';
    }
}
