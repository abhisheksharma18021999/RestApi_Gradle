package nearpe;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GeoInfpApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeoInfpApplication.class, args);
    }
}
