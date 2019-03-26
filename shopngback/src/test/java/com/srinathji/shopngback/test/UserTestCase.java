package com.srinathji.shopngback.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinathji.shopngback.dao.CategoryDao;
import com.srinathji.shopngback.dao.UserDao;
import com.srinathji.shopngback.dto.Category;
import com.srinathji.shopngback.dto.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;

	private static UserDao userDao;
	private User user;
	

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.srinathji.shopngback");
		context.refresh();

		userDao = (UserDao) context.getBean("userDao");

	}

	// @Test
	// public void addcetogery(){
	// category=new Category();
	// category.setName("tv");
	// category.setImageurl("tv.png");
	// category.setDescription("tv");
	// category.setActive(true);
	// Assert.assertEquals("successfully add category..... ",true,
	// categoryDao.addCategory(category) );
	// }
	/*@Test
	public void getCategorybyID() {
		category = categoryDao.getCategoryById(3);
//		Assert.assertEquals("successfully get single catogory  from category table..... ","computer",
//				 category.getName());
		System.out.println(category.getName()+","+category.getImageurl());
		
	}*/
/*	 @Test
	 public void updateetogery(){
		 category = categoryDao.getCategoryById(7);
		 category.setName("bulb");
		 category.setImageurl("bulb.png");
		 category.setDescription("bulb");
		 category.setActive(false);
		 Assert.assertEquals("successfully update category..... ",true,
				 categoryDao.updateCategory(category) );
	 }*/
	@Test
	public void getallcat() {
		
		Assert.assertEquals("successfully get all catogory  from category table..... ","1",
				 userDao.list());
		//System.out.println(category.getName()+","+category.getImageurl());
		
	}

}
