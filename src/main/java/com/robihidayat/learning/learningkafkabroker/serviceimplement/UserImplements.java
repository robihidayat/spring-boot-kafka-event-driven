package com.robihidayat.learning.learningkafkabroker.serviceimplement;

import com.robihidayat.learning.learningkafkabroker.entity.User;
import com.robihidayat.learning.learningkafkabroker.repository.UserRepository;
import com.robihidayat.learning.learningkafkabroker.service.UserServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImplements implements UserServies {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUserId(Long id) {
        return userRepository.findAllByUserId(id);
    }
}
