package com.investment.indivara.Investment.user.services;

import com.investment.indivara.Investment.user.entity.User;

public interface UserService {

    User createUser(User user);

    User findById(Long userId);

    User updateUser(Long userId, User user);

    String deleteUser(Long userId);


}
