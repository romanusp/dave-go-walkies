package com.rompa.davegowalkies.park;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkController {

    @GetMapping(value = "/park")
    public Park getMethodName(@RequestParam String parkName) {
        return new Park("ChristChurch", LocalDateTime.parse("2018-05-05T11:50:55"),
                LocalDateTime.parse("2018-05-05T11:50:55"), LocalDateTime.parse("2018-05-05T11:50:55"));
    }
}
