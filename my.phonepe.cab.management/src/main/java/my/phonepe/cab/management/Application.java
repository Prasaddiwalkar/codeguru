package my.phonepe.cab.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //	@Bean
    //	   public Docket productApi() {
    //	      return new Docket(DocumentationType.SWAGGER_2).select()
    //	         .apis(RequestHandlerSelectors.basePackage("my.phonepe.cab.management")).build();
    //	   }

}
