package customer;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {
	  @Bean
	   CommandLineRunner initDatabase(CustomerRepository repository) {
	       return args -> {
	           log.info("Preloading " + repository.save(new Customer("Anor", "Londo", "darksouls@gmail.com", "66666666")));
	            
	       };
	}
}
