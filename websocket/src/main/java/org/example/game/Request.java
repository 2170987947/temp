package org.example.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Request {

    private String type;
    private int userId;
    private String roomId;
    private int row;
    private int col;

}
