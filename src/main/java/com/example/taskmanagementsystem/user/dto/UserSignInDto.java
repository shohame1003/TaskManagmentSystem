package com.example.taskmanagementsystem.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserSignInDto
{
    @NotBlank
    private String phoneNumber;

    @NotBlank
    private String password;
}