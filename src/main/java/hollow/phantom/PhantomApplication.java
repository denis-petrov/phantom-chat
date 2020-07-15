package hollow.phantom;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhantomApplication {

	public static void main(String[] args) {
		Sentry.capture("Application started");
		SpringApplication.run(PhantomApplication.class, args);
	}

}
