package com.dinsoft.springdemo.mvc;

import com.dinsoft.springdemo.mvc.annotation.IngectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:messages.properties")
public class ImplTest implements Test {
    @IngectRandomInt(min =2, max =7)
    private int repeat;
    @Value("${din.message}")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQute() {
        System.out.println("seyQute! repeat = "+repeat);
        if (message != null) {
            System.out.println("message: " + message);
        } else {
            System.out.println("message is null!");
        }
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }

    }
}
