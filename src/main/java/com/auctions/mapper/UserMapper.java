package com.auctions.mapper;

import com.auctions.domain.UserDTO;

public interface UserMapper {

    public void join(UserDTO dto);

    public String confirmId(String id);

    public UserDTO getUser(String id);

    public int update(UserDTO dto);
}
