package com.gerson.Vibe.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    @NotBlank(message = "Email é obrigatorio")
    private String email;

    @NotBlank(message = "Senha é Obrigatorio")
    private String password;
}
