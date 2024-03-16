package org.ltclab.telegbot.controller;

import lombok.AllArgsConstructor;
import org.ltclab.telegbot.service.TelegramService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@AllArgsConstructor
@RestController
@RequestMapping("tlg")
public class TelegramController {

    private final TelegramService ts;

    @GetMapping("/updates")
    ArrayList<String> getUpdates () {
        return ts.getMessages();
    }
}
