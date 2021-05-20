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
}
