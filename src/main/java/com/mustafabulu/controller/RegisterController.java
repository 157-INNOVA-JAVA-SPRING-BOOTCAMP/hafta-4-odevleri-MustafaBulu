package com.mustafabulu.controller;

import com.mustafabulu.dto.ValidationDto;
import com.mustafabulu.entity.UserEntity;
import com.mustafabulu.repository.IUserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@Controller
@Log4j2

//@Controller @Log4j2 @GEtMapping @PostMapping @Valid @ModelAttribute
public class RegisterController {


    @Autowired
    IUserRepository iUserRepository;

    // http://localhost:8080/register
    @GetMapping("/register")
    public String getForm(Model model) {
        model.addAttribute("key_form", new ValidationDto());
        return "register";
    }

    // http://localhost:8080/register
    @PostMapping("/register")
    public String postForm(@Valid @ModelAttribute("key_form") ValidationDto dto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            log.error("Hata var");
            log.info(dto);
            return "register";
        }
        //database yazılacak alan

        UserEntity userEntity = UserEntity
                .builder()
                .userId(0L)
                .userName(dto.getUserName())
                .userFirstName(dto.getUserFirstName())
                .userSurname(dto.getUserSurname())
                .emailAddress(dto.getEmailAddress())
                .password(dto.getUserPassword())
                .build();


        iUserRepository.save(userEntity);

        log.info(dto);
        return "success";
    }

    // http://127.0.0.1:8080/client/controller/string
    //Gelen bir veriyi burada tüketmek için bu yapıyı kurguladık.
    @GetMapping("/client/controller/string")
    @ResponseBody
    public String getServicesStringProduct(){
        String URL="http://localhost:8080/rest/manueljson";
        RestTemplate restTemplate=new RestTemplate();
        String jsonData=restTemplate.getForObject(URL,String.class);
        log.info(jsonData.toUpperCase());
        //database veri eklemek
        return jsonData;
    }  }



