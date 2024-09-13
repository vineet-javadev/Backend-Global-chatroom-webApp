package com.global_chatroom.chatroom.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatMessage {
    private String  message;
    private String sender;

    public ChatMessage(ChatMessage chatMessage){
        this.message = chatMessage.getMessage();
        this.sender = chatMessage.getSender();
    }

}
