package org.example.game;


public class Request {
    private String type;
    private int userId;
    private String roomId;
    private int row;
    private int col;

    @Override
    public String toString() {
        return "Request{" +
                "type='" + type + '\'' +
                ", userId=" + userId +
                ", roomId='" + roomId + '\'' +
                ", x=" + row +
                ", y=" + col +
                '}';
    }

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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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
}
