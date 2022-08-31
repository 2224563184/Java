package com.redis;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Data
@Component
public class redis {
    @Autowired
    private RedisTemplate redisTemplate;

  public  void test(){
      ValueOperations valueOperations = redisTemplate.opsForValue();

      valueOperations.set("1","a");
      valueOperations.set("2","b");
      Object o = valueOperations.get("2");
      System.out.println(o);
  }
}
