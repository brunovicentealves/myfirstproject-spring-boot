package com.devsuoerior.myfirstproject;

import com.devsuoerior.myfirstproject.entities.Category;
import com.devsuoerior.myfirstproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// CommandLineRunner faz com que rode algo quando a aplicação for iniciada
public class MyfirstprojectApplication  implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(1L,"Electronics");
		Category cat2 = new Category(2L,"Books");

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);

	}
}
