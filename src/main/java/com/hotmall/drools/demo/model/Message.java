package com.hotmall.drools.demo.model;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
public class Message {

    public enum MessageType {
        HI,
        GOODBYE,
        CHAT
    }

    public Message(MessageType type, String target) {
        this.messageType = type;
        this.target = target;
    }

    private MessageType messageType;
    private String target;
}
