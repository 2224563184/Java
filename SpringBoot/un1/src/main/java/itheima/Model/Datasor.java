package itheima.Model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@Component("Datasor")
@ConfigurationProperties(prefix = "datasour")
public class Datasor {
   private String url;
   private String driver;
   private String username;
   private String password;

}
