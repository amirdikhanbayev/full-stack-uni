package org.amirs.uniback.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.amirs.uniback.model.User;
import org.amirs.uniback.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<User> listUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User createUser(User user) {
        return creatUserCheck(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(userRepository.findByEmail(email));
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
        log.info("User deleted");
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User update(User user) {
        return updateUser(user);
    }


    private User updateUser(User user){
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        if (existingUser != null) {
            existingUser.setEmail(user.getEmail());
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        } else {
            throw new RuntimeException("User not founded");
        }
    }

    private User creatUserCheck(User user){
        User checkUser = userRepository.findByEmail(user.getEmail());
        if(checkUser != null){
            return userRepository.insert(user);
        }else {
            throw new RuntimeException("User is all ready present");
        }
    }
}
