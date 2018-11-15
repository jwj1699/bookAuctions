package com.auctions.service;

import com.auctions.domain.UserDTO;
import com.auctions.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Log4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    UserMapper mapper;


    @Override
    public void join(UserDTO dto) {
        mapper.join(dto);
    }

    @Override
    public String confirmId(String id) {
        return mapper.confirmId(id);
    }

    @Override
    public UserDTO get(String id) {
        return mapper.getUser(id);
    }

    @Override
    public int modify(UserDTO dto) {
        return mapper.update(dto);
    }
}
