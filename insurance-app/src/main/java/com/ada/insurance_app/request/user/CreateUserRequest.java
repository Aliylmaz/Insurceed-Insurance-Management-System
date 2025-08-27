package com.ada.insurance_app.request.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CreateUserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}