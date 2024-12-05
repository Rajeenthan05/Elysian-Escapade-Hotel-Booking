package com.Elysian_Escapade.Elysian_Escapade_Hotel.service.interface;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.LoginRequest;
import com.Elysian_Escapade.Elysian_Escapade_Hotel.dto.Response;
import com.Elysian_Escapade.Elysian_Escapade_Hotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
