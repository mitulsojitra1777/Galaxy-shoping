package com.srinathji.shopngback.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srinathji.shopngback.dao.ProductDao;
import com.srinathji.shopngback.dto.Category;
import com.srinathji.shopngback.dto.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product product) {
		try{
			//addcategory to the database
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		try{
			//update to the database
			sessionFactory.getCurrentSession().update(product);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean deleteProduct(Product product) {
		try{
			//update to the database
			product.setActive(false);
			sessionFactory.getCurrentSession().update(product);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
			
		}
	}

	@Override
	public List<Product> list() {
		String selectActiveCategory="FROM Product WHERE active= :active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		
		return query.getResultList();
	}

	@Override
	public Product getProductById(int id) {
		return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
	}

}
