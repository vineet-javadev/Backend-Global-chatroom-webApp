package com.global_chatroom.chatroom.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import com.global_chatroom.chatroom.Model.ChatMessage;

@RestController
public class ChatController {
    
    @MessageMapping("/message")
    @SendTo("/topic/subscribers")
    public ChatMessage broadCastMessage(ChatMessage chatMessage){
        return chatMessage;
    }
}
