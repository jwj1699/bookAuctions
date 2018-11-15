package com.auctions.service;

import com.auctions.domain.UserDTO;

public interface UserService {

    public void join(UserDTO dto);

    public String confirmId(String id);

    public UserDTO get(String id);

    public int modify(UserDTO dto);
}
