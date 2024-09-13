package com.global_chatroom.chatroom.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.global_chatroom.chatroom.Model.ChatMessage;

@RestController
public class ChatController {
    
    @CrossOrigin(origins = "https://frontend-global-chatroom.vercel.app")
    @MessageMapping("/message")
    @SendTo("/topic/subscribers")
    public ChatMessage broadCastMessage(ChatMessage chatMessage){
        return chatMessage;
    }
}
