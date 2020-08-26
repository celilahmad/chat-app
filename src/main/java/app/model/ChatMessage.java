package app.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ChatMessage {

    private MessageType type;

    private String content;

    private String sender;

    private String time;
}
