package com.salambasha.medicare;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.salambasha.medicare.dao.AdminRepository;
import com.salambasha.medicare.dao.CategoryRepository;
import com.salambasha.medicare.dao.UserRepository;
import com.salambasha.medicare.entities.Admin;
import com.salambasha.medicare.entities.Category;
import com.salambasha.medicare.entities.User;

@SpringBootTest
@RunWith(SpringRunner.class)
class MedicareApplicationTests {
	@Autowired
	CategoryRepository cateRepo;
	
	@Autowired
	UserRepository userRepo;

	@Test
public void ifNewCategoryAdded_thenSuccess() {
		
		Category category = new Category("Test Category");
		
		cateRepo.save(category);
		
		//assertEquals(9,cateRepo.findAll().size()); 
		
	}
	


	@Test
	public void ifNewUserAdded_thenSuccess() {
		
		User user = new User("Testuser","testuser@gmail.com",979884544,"test");
		
		userRepo.save(user);
		
	//	assertEquals(11,userRepo.findAll()); 
		
	}

}
