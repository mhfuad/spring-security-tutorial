package com.fuad.springsecurityclient.service;

import com.fuad.springsecurityclient.entity.User;
import com.fuad.springsecurityclient.model.UserModel;

public interface UserService {

    User registerUser(UserModel userModel);
}
