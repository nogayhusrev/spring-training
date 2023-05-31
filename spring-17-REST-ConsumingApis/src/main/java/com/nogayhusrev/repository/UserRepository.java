package com.nogayhusrev.repository;

import com.nogayhusrev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
