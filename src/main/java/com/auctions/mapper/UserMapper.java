package com.auctions.mapper;

import com.auctions.domain.UserDTO;

public interface UserMapper {

    public void join(UserDTO dto);

    public int confirmId(String id);
}
