package com.webSocket.config;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.webSocket.chat.ChatMessage;
import com.webSocket.chat.MessageType;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j

public class webSocketEventListener {

    private final SimpMessageSendingOperations  messageTemplate;

    @EventListener
    public void HandleWebSocketDisconnectListener(
            SessionDisconnectEvent event
        ) {
            StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
            String username = (String) headerAccessor.getSessionAttributes().get("username");

            if (username != null) {
                log.info("User dissconnected: {}",username);
                var chatMessage = ChatMessage.builder()
                        .type(MessageType.LEAVE)
                        .sender(username)
                        .build();
                // message that user has left the chat
                messageTemplate.convertAndSend("/topic/public", chatMessage);
                    
            }
            
            
    }
}
