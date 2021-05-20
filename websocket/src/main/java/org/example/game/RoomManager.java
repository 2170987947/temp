package org.example.game;

import java.util.concurrent.ConcurrentHashMap;

public class RoomManager {
    private ConcurrentHashMap<String, Room> rooms = new ConcurrentHashMap<>();

    private RoomManager() {
    }
    private static RoomManager roomManager = new RoomManager();
    public static RoomManager getInstance() {
        return roomManager;
    }
    public void addRoom(Room room) {
        rooms.put(room.getRoomId(), room);
    }
    public void Room(Room room) {
        rooms.remove(room);
    }

    public Room getRoom(String roomId) {
        return rooms.get(roomId);
    }

}
