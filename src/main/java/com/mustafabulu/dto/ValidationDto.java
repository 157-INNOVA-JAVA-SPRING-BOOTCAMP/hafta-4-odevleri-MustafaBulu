package com.mustafabulu.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// NEMM :  @NotEmpty @Email @Min @Max @Size
public class ValidationDto {

    @NotEmpty(message = "Kullanıcı Adını  girmediniz")
    private String userName;

    @NotEmpty(message = "Adınızı Giriniz")
    private String userFirstName;


    @NotEmpty(message = "Soyadınızı Giriniz")
    private String userSurname;


    @NotEmpty(message = "E-mail adresinizi giriniz")
    @Email(message = "Mail formatı uygun değil")
    private String emailAddress;


    @NotEmpty(message = "Password alanını boş geçemezsiniz")
    @Size(min=8,max=25)
    private String userPassword;


}
