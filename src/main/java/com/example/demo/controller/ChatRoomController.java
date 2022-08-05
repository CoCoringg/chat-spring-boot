package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.JsonResult;
import com.example.demo.service.ChatService;
import com.example.demo.vo.ChatRoom;

@Controller
@RequestMapping("/chat")
public class ChatRoomController {
	
//	@Autowired
//	private ChatService chatService;
//	
//	@GetMapping("/roomlist")
//	public String roomList(Model model) {
//		List<ChatRoomVo> rooms = chatService.findAllRooms();
//		System.out.println(rooms);
//		model.addAttribute("rooms", rooms);
//		return "chat/roomList";
//	}
//	
//	@PostMapping("/room")
//	public String insert(@ModelAttribute ChatRoomVo vo) {
//		System.out.println(vo);
//		chatService.insert(vo);
//		return "redirect:/chat/roomlist";
//	}
//	
//	@GetMapping("/{roomId}")
//	public String room(@PathVariable("roomId") long roomId, Model model) {
//		System.out.println(roomId);
//		String roomName = chatService.findRoom(roomId);
//		model.addAttribute("roomName", roomName);
//		return "chat/room";
//	}
	
//	@GetMapping("/card")
//	public ResponseEntity<JsonResult> readCard() {
//		return ResponseEntity
//				.status(HttpStatus.OK)
//				.body(JsonResult.success(chatService.findRoom());
//	}
	
	@Autowired
	private ChatService chatService;

    // 채팅 리스트 화면
    @GetMapping("/room")
    public String rooms(Model model) {
        return "chat/room";
    }
    
    // 모든 채팅방 목록 반환
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> room() {
        return chatService.findAllRoom();
    }
    // 채팅방 생성
    @PostMapping("/room")
    @ResponseBody
    public ChatRoom createRoom(@RequestParam String name) {
        return chatService.createRoom(name);
    }
    // 채팅방 입장 화면
    @GetMapping("/room/enter/{roomId}")
    public String roomDetail(Model model, @PathVariable String roomId) {
        model.addAttribute("roomId", roomId);
        return "/chat/roomdetail";
    }
    // 특정 채팅방 조회
    @GetMapping("/room/{roomId}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String roomId) {
        return chatService.findById(roomId);
    }
	
	
	
}
                                                                                                                                                                                                                               