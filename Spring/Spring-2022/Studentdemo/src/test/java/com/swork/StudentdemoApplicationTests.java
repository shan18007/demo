package com.swork;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.swork.entities.Student;
import com.swork.repo.StudentRepository;

@SpringBootTest
class StudentdemoApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void studentRepoTest() {
		Student st=new Student();
		st.setFee(40d);
		st.setName("Jay");
		studentRepository.save(st);
	}
	
	@Test
	public void updateStudentTest() {
		Optional<Student> student = studentRepository.findById(1);
		student.get().setFee(45d);
		System.out.println(student);
	}

}
