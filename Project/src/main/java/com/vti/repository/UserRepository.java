package com.vti.repository;

import com.vti.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User AS u WHERE u.email=?1 AND u.password =?2")
    User getByEmailAndPassword(String email, String password);

//    boolean existsByEmail(String email);
//
//    User findByEmail(String email);

    boolean existsByUsername(String username);

    User findByUsername(String username);

    User findByEmail(String email);

}
