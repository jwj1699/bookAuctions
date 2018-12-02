package com.auctions.controller;

import com.auctions.domain.UserDTO;
import com.auctions.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Log4j
@Controller
@SessionAttributes("sessionId")
@AllArgsConstructor
public class UserControllerTests {

    private UserService service;

    @GetMapping("/join")
    public String join(){
        return "join";
    }

    @PostMapping("/join")
    public String join(UserDTO dto, RedirectAttributes rttr){
        log.info("join() " + dto);

        service.join(dto);

        rttr.addFlashAttribute("result", dto.getUserId());
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    //로그아웃
    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus){
        log.info("logout");

        sessionStatus.setComplete();

        return "redirect:/";
    }
}
