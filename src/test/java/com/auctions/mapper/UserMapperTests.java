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

    @Test
    public void testJoin(){
        UserDTO dto = new UserDTO();

        dto.setUserId("testId");
        dto.setUserPw("1234");
        dto.setUserMail("testMail");
        dto.setUserCollege("testCollege");

        mapper.join(dto);
    }
}
