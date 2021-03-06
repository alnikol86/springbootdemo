package ru.nikolaev.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nikolaev.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}