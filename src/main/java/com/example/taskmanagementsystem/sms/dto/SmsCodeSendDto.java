package com.example.taskmanagementsystem.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsCodeSendDto
{
    private String phoneNumber;
}
