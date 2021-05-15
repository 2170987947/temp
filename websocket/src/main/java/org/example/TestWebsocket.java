package org.example;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/websocketTest/{userId}")
public class TestWebsocket {
    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) {
        System.out.println("连接建立与 userId = " + userId + " 的连接");
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("我是服务器");
            }
        };
        t.start();
    }
    @OnClose
    public void onClose() {
        System.out.println("断开连接");
    }
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("连接异常");
        error.printStackTrace();
    }
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println("收到消息 message :" + message);
        session.getBasicRemote().sendText(message);
    }
}
