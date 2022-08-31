package com.example.practical;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@Data
public class Dataa {

    @Autowired
    private Duration duration;
    public  Duration getduration() {
       return duration;
   }

}
