package com.robihidayat.learning.learningkafkabroker.repository;

import com.robihidayat.learning.learningkafkabroker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findAllByUserId(Long id);
}
