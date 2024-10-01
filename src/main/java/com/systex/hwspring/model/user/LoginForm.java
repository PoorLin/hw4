package com.systex.hwspring.model.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class LoginForm {

    @NotBlank(message = "請輸入信箱")
    @NotNull(message = "請輸入信箱")
    @Email(message = "請輸入有效信箱")
    private String email;

    @NotNull(message = "請輸入密碼")
    @NotBlank(message = "請輸入密碼")
    private String password;

    public LoginForm() {
    }
}
