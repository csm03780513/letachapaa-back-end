package com.csm.letachapaa.repository;

import com.csm.letachapaa.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users,String> {
    Users findByUsername(String username);
}
