package com.robihidayat.learning.learningkafkabroker.api;

import com.robihidayat.learning.learningkafkabroker.model.UserModel;
import com.robihidayat.learning.learningkafkabroker.response.ResponseJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.invoke.MethodHandles;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @PostMapping("/user")
    private ResponseEntity<ResponseJson> insertUser(@Valid @RequestBody UserModel userModel){
        LOGGER.info("TEST_LOGGER", userModel.getFirstName());
        ResponseJson responseJson = new ResponseJson("Success","400",null);
        return ResponseEntity.ok(responseJson);
    }


}
