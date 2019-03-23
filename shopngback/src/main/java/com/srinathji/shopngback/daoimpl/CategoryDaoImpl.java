package com.srinathji.shopngback.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.srinathji.shopngback.dao.CategoryDao;
import com.srinathji.shopngback.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	private static List<Category> categorys = new ArrayList<>();

	static {
		Category category = new Category();
		// adding category data
		category.setId(1);
		category.setName("mobile");
		category.setDescription("mobile phones");
		category.setActive(true);
		category.setImageurl("categorymob.png");
		categorys.add(category);
		category = new Category();
		category.setId(2);
		category.setName("tv");
		category.setDescription("tv");
		category.setActive(true);
		category.setImageurl("tv.png");
		categorys.add(category);
		category = new Category();
		category.setId(3);
		category.setName("swich");
		category.setDescription("swich");
		category.setActive(true);
		category.setImageurl("swich.png");
		categorys.add(category);
	}

	public List<Category> list() {
		return categorys;
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		for (Category category : categorys) {
			if (category.getId() == id)
				return category;

		}
		return null;
	}

}
