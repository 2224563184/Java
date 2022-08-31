package itheima.Model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "chineuu")
public class chineuu {
  private String userid;
  private Integer  age;
}
