package com.example.oxagile.sprynchan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oxagile.sprynchan.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
