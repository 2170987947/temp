package org.example.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/gameAPI/{userId}")
public class GameAPI {
    private int userId;
    private Gson gson = new GsonBuilder().create();

    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) {
        System.out.println("建立连接 userId ：" + userId);
        this.userId = Integer.parseInt(userId);

        OnlineUserManager.getInstance().online(this.userId, session);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("连接出现异常");
        throwable.printStackTrace();
        OnlineUserManager.getInstance().offline(this.userId);
    }

    @OnMessage
    public void onMessage(Session session, String message) throws IOException, InterruptedException {
        System.out.println("收到消息 message ：" + message);
        Request request = gson.fromJson(message, Request.class);
        if (request.getType().equals("startMatch")) {
            Matcher.getInstance().add(request);
        } else if (request.getType().equals("putChess")){
            Room room = RoomManager.getInstance().getRoom(request.getRoomId());
            room.putChess(request);
        } else {
            System.out.println("当前请求类型错误！ type： " + request.getType());
        }
    }

    @OnClose
    public void onClose() {
        System.out.println("连接已断开");
        OnlineUserManager.getInstance().offline(this.userId);
    }

}
