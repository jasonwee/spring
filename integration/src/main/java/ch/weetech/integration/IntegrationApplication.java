package ch.weetech.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class IntegrationApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(IntegrationApplication.class, args);

		ConfigurableApplicationContext ctx = new SpringApplication(IntegrationApplication.class).run(args);
                System.out.println("Hit Enter to terminate");
                System.in.read();
                ctx.close();
	}

}
