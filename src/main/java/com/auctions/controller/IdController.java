package com.auctions.controller;

import com.auctions.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
@AllArgsConstructor
public class IdController {

    private UserMapper mapper;

    @PostMapping(value = "/idCheck", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> idCheck(@RequestBody String id){
        log.info("idCheck() 실행 " + id);

        return mapper.confirmId(id) == null
                ? new ResponseEntity<>("-1", HttpStatus.NOT_FOUND)
                : new ResponseEntity<>("1", HttpStatus.OK);
    }
}
