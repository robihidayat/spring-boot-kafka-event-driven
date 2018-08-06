package com.robihidayat.learning.learningkafkabroker.service;
import com.robihidayat.learning.learningkafkabroker.entity.User;

public interface UserServies {

    User findByUserId(Long aLong);

}
