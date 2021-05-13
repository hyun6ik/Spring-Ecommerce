package com.example.userservice.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "이메일 필수 등록이요 ㅋ_ㅋ")
    @Size(min = 2, message = "이메일 2글자 이상이요 ㅋ_ㅋ")
    @Email
    private String email;

    @NotNull(message = "패스워드 필수 등록이요 ㅋ_ㅋ")
    @Size(min = 3, message = "비번 8글자 이상 16글자 이하요 ㅋ_ㅋ")
    private String password;

    @NotNull(message = "이름 필수 등록이요 ㅋ_ㅋ")
    @Size(min = 2, message = "이름 2글자 이상이요 ㅋ_ㅋㅋ")
    private String name;

}
