package org.example.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MatchResponse {
    private String type = "startMatch";
    private String roomId;
    private boolean isWhite;

    @Override
    public String toString() {
        return "MatchResponse{" +
                "type='" + type + '\'' +
                ", roomId='" + roomId + '\'' +
                ", isWhite=" + isWhite +
                ", otherUserId=" + otherUserId +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public int getOtherUserId() {
        return otherUserId;
    }

    public void setOtherUserId(int otherUserId) {
        this.otherUserId = otherUserId;
    }

    private int otherUserId;
}
