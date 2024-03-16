package org.ltclab.telegbot.service;

import lombok.RequiredArgsConstructor;
import org.ltclab.telegbot.dto.telegram.response.Result;
import org.ltclab.telegbot.feign.TelegramClient;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class TelegramService {

    private final ModelMapper mm;
    private final TelegramClient tc;

    public ArrayList<String> getMessages () {
        ArrayList<String> msgs = new ArrayList<>();
        ArrayList<Result> updates = tc.getUpdates().getResult();
        updates.forEach(u -> msgs.add(u.getMessage().getText()));
        return msgs;
    }

}
