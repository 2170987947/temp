package org.example.game;

import javax.websocket.Session;
import java.util.concurrent.ConcurrentHashMap;

public class OnlineUserManager {
    private static OnlineUserManager onlineUserManager = new OnlineUserManager();
    private ConcurrentHashMap<Integer, Session> users = new ConcurrentHashMap<>();

    private OnlineUserManager() {

    }

    public static OnlineUserManager getInstance() {
        return onlineUserManager;
    }

    public void online(int userId, Session session) {
        users.put(userId, session);
    }

    public void offline(int userId) {
        users.remove(userId);
    }

    public Session getSession(int userId) {
        return users.get(userId);
    }
}
