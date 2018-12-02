package com.auctions.controller;

import com.auctions.domain.UserDTO;
import com.auctions.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Log4j
@RestController
@SessionAttributes("sessionId")
@AllArgsConstructor
public class IdController {

    private UserService service;

    //아이디 중복확인 (회원가입에서 사용)
    @PostMapping(value = "/idCheck", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> idCheck(@RequestBody String id){
        log.info("idCheck() 실행 " + id);

        return service.confirmId(id) == null
                ? new ResponseEntity<>("-1", HttpStatus.NOT_FOUND)
                : new ResponseEntity<>("1", HttpStatus.OK);
    }

    //로그인 처리
    @PostMapping(value = "/pwCheck", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> pwCheck(@RequestBody UserDTO dto, Model model) {
        log.info("pwCheck: " + dto);

        String targetPw = service.getPw(dto.getUserId());

        if(dto.getUserPw().equals(targetPw)) {
            model.addAttribute("sessionId",dto.getUserId());
            return new ResponseEntity<>("success", HttpStatus.OK);
        }

        return new ResponseEntity<>("failure", HttpStatus.NOT_FOUND);
    }
}
