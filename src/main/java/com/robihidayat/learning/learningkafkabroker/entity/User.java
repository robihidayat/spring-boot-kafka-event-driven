package com.robihidayat.learning.learningkafkabroker.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="table_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name")
    @NotNull
    private String userName;


    @Column(name = "first_name")
    private String firstName;


}
