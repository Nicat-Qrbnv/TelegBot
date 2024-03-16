package org.ltclab.telegbot.feign;

import org.ltclab.telegbot.dto.telegram.response.TelegramDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nctqrbnv-myBot", url = "https://api.telegram.org/bot7137674776:AAF1hFh06hxqM2IIhNduwfx5DHH20GGzFqw")
public interface TelegramClient {
    @GetMapping("/getUpdates")
    TelegramDTO getUpdates ();
}