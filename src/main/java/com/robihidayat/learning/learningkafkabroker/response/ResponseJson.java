package com.robihidayat.learning.learningkafkabroker.response;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class ResponseJson {
    private String message;
    private String code;
    private Gson data;

    public ResponseJson(String message, String code, Gson data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }
}
