package com.guardians.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UrlRequestDto {
    private String originalUrl;
    private LocalDateTime expiresAt;
    private int usageLimit = 1; // default value to 1
}