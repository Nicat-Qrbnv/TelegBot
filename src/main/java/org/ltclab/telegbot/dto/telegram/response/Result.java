package org.ltclab.telegbot.dto.telegram.response;

import lombok.Data;

@Data
public class Result {
    private int update_id;
    private Message message;
}
