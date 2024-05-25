package com.example.messaging_app.model;

import com.example.messaging_app.type.MessageType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private MessageType type;
    private String content;
    private String sender;
    private String sessionId;
}
