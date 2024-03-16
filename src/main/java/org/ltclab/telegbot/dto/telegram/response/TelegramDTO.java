package org.ltclab.telegbot.dto.telegram.response;

import lombok.Data;

import java.util.ArrayList;

@Data
public class TelegramDTO {
    private boolean ok;
    private ArrayList<Result> result;
}
