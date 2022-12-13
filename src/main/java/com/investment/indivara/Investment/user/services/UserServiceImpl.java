package com.investment.indivara.Investment.user.services;

import com.investment.indivara.Investment.user.entity.User;
import com.investment.indivara.Investment.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@Validated
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(()-> new EntityNotFoundException("Id dengan nomor : " + userId + " Tidak Ditemukan"));
    }

    @Override
    public User updateUser(Long userId, User user) {
        User original = findById(userId);
        if (user.getNamaLengkap() != null){
            original.setNamaLengkap(user.getNamaLengkap());
        }

        if (user.getPassword() != null){
            original.setPassword(user.getPassword());
        }

        if (user.getEmail() != null){
            original.setEmail(user.getEmail());
        }

        if (user.getNomerTelpon() !=null){
            original.setNomerTelpon(user.getNomerTelpon());
        }
        userRepository.save(original);
        return original;
    }

    @Override
    public String deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return "User Berhasil di Hapus";
    }


}
