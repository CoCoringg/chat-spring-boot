package com.example.demo.vo;

import java.util.UUID;

public class ChatRoom {
	private String roomId;
    private String roomName;
    
    

    public String getRoomId() {
		return roomId;
	}



	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}



	public String getRoomName() {
		return roomName;
	}



	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	


	@Override
	public String toString() {
		return "ChatRoom [roomId=" + roomId + ", roomName=" + roomName + "]";
	}



	public static ChatRoom create(String name) {
        ChatRoom room = new ChatRoom();
        room.roomId = UUID.randomUUID().toString();
        room.roomName = name;
        return room;
    }
}
