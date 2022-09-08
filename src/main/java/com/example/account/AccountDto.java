package com.example.account;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDateTime registeredAt;
}
