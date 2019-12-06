package com.kazou.school;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.kazou.school.controller.FormationRepository;
import com.kazou.school.controller.StudentRepository;
import com.kazou.school.model.Formation;
import com.kazou.school.model.Student;

@SpringBootApplication
public class KazouSchoolApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(KazouSchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(Formation.class, Student.class);
		
		Formation f1 = formationRepository.save(new Formation(null, "REACT", 800, null));
		Formation f2 = formationRepository.save(new Formation(null, "VUEJS", 700, null));
		Formation f3 = formationRepository.save(new Formation(null, "ANGULAR", 760, null));
		Formation f4 = formationRepository.save(new Formation(null, "JAVA-J2EE", 900, null));
		Formation f5 = formationRepository.save(new Formation(null, "SPRING BOOT", 500, null));
		
		studentRepository.save(new Student(null, "Teddie", "Frisel", new Date(), f1));
	}

}
