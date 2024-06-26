package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
