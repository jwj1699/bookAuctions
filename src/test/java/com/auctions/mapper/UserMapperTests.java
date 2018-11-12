package com.auctions.mapper;

import com.auctions.domain.UserDTO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/root-context.xml")
@Log4j
public class UserMapperTests {

    @Setter(onMethod_ = {@Autowired})
    private UserMapper mapper;

    //가입테스트
    public void testJoin(){
        UserDTO dto = new UserDTO();

        dto.setUserId("testId");
        dto.setUserPw("1234");
        dto.setUserMail("testMail");
        dto.setUserCollege("testCollege");

        mapper.join(dto);
    }


    //중복여부 테스트
    public void testConfirmId(){

        log.info("testId = " + mapper.confirmId("testId"));
        log.info("abc = " + mapper.confirmId("abc"));
    }


    //유저 정보 불러오기 테스트
    public void getUser(){

        log.info("testId의 정보 = " + mapper.getUser("testId"));
    }

    @Test
    //정보 수정 테스트
    public void update(){

        UserDTO dto = new UserDTO();

        dto.setUserId("testId");
        dto.setUserPw("12345");
        dto.setUserMail("updateMail");
        dto.setUserCollege("updateCollege");

        mapper.update(dto);
    }


}
