package org.example.game;

import javax.websocket.Session;
import java.util.concurrent.ConcurrentHashMap;

public class OnlineUserManager {

    private ConcurrentHashMap<Integer, Session> users = new ConcurrentHashMap<>();
    public static OnlineUserManager onlineUserManager = new OnlineUserManager();

    public static OnlineUserManager getInstance() {
        return onlineUserManager;
    }

    public void online(int userId, Session session) {
        users.put(userId, session);
    }


    private OnlineUserManager() {
    }

    public void offline(int userId) {
        users.remove(userId);
    }

    public Session getSession(int userId) {
        return users.get(userId);
    }
}
