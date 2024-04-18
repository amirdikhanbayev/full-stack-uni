package org.amirs.uniback.service;

import org.amirs.uniback.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface UserService {

    Page<User> listUsers(Pageable pageable);

    User createUser(User user);

    Optional<User> findByEmail(String email);

    void deleteById(String id);

    Optional<User> findById(String id);

    User update(User user);
}
