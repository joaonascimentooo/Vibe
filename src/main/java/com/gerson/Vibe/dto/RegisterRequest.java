package com.gerson.Vibe.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RegisterRequest {
    @NotBlank(message = "Nome é obrigatorio")
    @Size(min = 3, max = 50, message = "O seu nome precisa ter no minimo 3 caracteres e no maximo 50 caracteres")
    private String name;

    @NotBlank(message = "Email é obrigatorio")
    private String email;

    @NotBlank(message = "A senha é obrigatoria")
    @Size(min = 6, message = "A senha no minimo precisa ter seis caracteres")
    private String password;


}
