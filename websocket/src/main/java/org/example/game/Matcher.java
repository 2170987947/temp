package org.example.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.websocket.Session;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Matcher {

    private BlockingQueue<Request> matchQueue = new LinkedBlockingQueue<>();
    private Gson gson = new GsonBuilder().create();

    private Matcher() {
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        handlerMatch();
                    } catch (InterruptedException | IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }

    private void handlerMatch() throws InterruptedException, IOException {
        Request player1 = matchQueue.take();
        Request player2 = matchQueue.take();
        System.out.println("匹配的两个玩家: " + player1.getUserId() + "   " + player2.getUserId());
        Session session1 = OnlineUserManager.getInstance().getSession(player1.getUserId());
        Session session2 = OnlineUserManager.getInstance().getSession(player2.getUserId());
        if (session1 == null) {
            matchQueue.put(player2);
            return;
        }
        if (session2 == null) {
            matchQueue.put(player1);
            return;
        }

        Room room = new Room();
        room.setUserId1(player1.getUserId());
        room.setUserId2(player2.getUserId());
        RoomManager.getInstance().addRoom(room);

        MatchResponse response1 = new MatchResponse();
        response1.setRoomId(room.getRoomId());
        response1.setWhite(true);
        response1.setOtherUserId(player2.getUserId());
        session1.getBasicRemote().sendText(gson.toJson(response1));
        MatchResponse response2 = new MatchResponse();
        response2.setRoomId(room.getRoomId());
        response2.setWhite(true);
        response2.setOtherUserId(player2.getUserId());
        session2.getBasicRemote().sendText(gson.toJson(response2));
    }

    private static Matcher matcher = new Matcher();
    
    public static Matcher getInstance() {
        return matcher;
    }

    public void addMatchQueue(Request request) throws InterruptedException {
        matchQueue.put(request);
    }

    public void deleteMAtchQueue(Request request) {
        matchQueue.remove(request);
    }
}
