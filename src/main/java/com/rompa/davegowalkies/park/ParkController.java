package com.rompa.davegowalkies.park;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkController {

    @GetMapping(value="/park")
    public Park getMethodName(@RequestParam String param) {
        return new Park("ChristChurh");
    }
    
    
}
