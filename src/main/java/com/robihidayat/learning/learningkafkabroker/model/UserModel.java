package com.robihidayat.learning.learningkafkabroker.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserModel {

    @NotNull
    private String userName;

    @NotNull
    private String firstName;

}
