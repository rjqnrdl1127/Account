package com.example.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountDtoTest {

    @Test
    void accountDto() {
        AccountDto accountDto  = new AccountDto();
        accountDto.setAccountNumber("accountNumber");
        accountDto.setNickname("seongmin");

        System.out.println(accountDto.getAccountNumber());
        System.out.println(accountDto.getNickname());
    }
}