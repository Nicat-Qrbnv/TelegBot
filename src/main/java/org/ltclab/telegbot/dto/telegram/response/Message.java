package org.ltclab.telegbot.dto.telegram.response;

import lombok.Data;

@Data
public class Message {
    private int message_id;
    private From from;
    private Chat chat;
    private int date;
    private String text;
}
