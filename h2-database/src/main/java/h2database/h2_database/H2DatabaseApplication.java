package h2database.h2_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class H2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseApplication.class, args);
	}

}
