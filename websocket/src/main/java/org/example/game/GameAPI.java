package org.example.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/game/{userId}")
public class GameAPI {

    private int userId;
    private Gson gson = new GsonBuilder().create();

    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) {
        this.userId = Integer.parseInt(userId);
        System.out.println("连接建立! userId = " + this.userId);
        OnlineUserManager.getInstance().online(this.userId, session);
    }

    @OnClose
    public void onClose() {
        System.out.println("连接关闭! userId = " + this.userId);
        OnlineUserManager.getInstance().offline(this.userId);
    }

    @OnError
    public void onError(Session session, Throwable e) {
        System.out.println("连接异常 userId = " + this.userId);
        e.printStackTrace();
    }

    @OnMessage
    public void onMesage(Session session, String message) throws IOException {
        System.out.println("收到消息! message: " + message);
        Request request = gson.fromJson(message, Request.class);
        if (request.getType().equals("startMatch")) {

        } else if (request.getType().equals("putChess")) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}
