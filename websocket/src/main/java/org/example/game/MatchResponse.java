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
    private int otherUserId;
}
