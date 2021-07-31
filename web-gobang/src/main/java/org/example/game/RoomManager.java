package org.example.game;

import java.util.concurrent.ConcurrentHashMap;

public class RoomManager {
    private static RoomManager roomManager = new RoomManager();
    private ConcurrentHashMap<String, Room> rooms = new ConcurrentHashMap<>();
    private RoomManager(){}
    public static RoomManager getInstance() {
        return roomManager;
    }

    public void addRoom(String roomId, Room room) {
        rooms.put(roomId, room);
    }

    public void removeRoom(String roomId) {
        rooms.remove(roomId);
    }

    public Room getRoom(String roomId) {
        return rooms.get(roomId);
    }
}
