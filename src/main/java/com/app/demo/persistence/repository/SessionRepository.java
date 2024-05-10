package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Person;
import com.app.demo.persistence.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface SessionRepository extends JpaRepository<Users, Long> {
    Users finByNameAndPassword(String name, String password);
}
