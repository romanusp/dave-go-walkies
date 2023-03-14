package com.rompa.davegowalkies.park;

import java.time.LocalDateTime;

public record Park(String name, LocalDateTime openingTime, LocalDateTime closingTime, LocalDateTime toiletsLockTime) {
    
}
