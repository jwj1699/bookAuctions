package com.auctions.controller;

import com.auctions.domain.UserDTO;
import com.auctions.service.UserService;
import com.auctions.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Log4j
@Controller
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

}
