package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;



import productcrudapp.model.Product;


public class ProductDao {

	
	@Autowired
	 private HibernateTemplate hibernateTemplate;
	
	

	// create product
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernateTemplate.save(product);
	}
	
	// get all product
	
	public List<Product> getProducts(){
		
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}
	
	//delete Single product
	
	@Transactional
	public void deleteProduct(int pid) {
		
		Product product = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}
	
	// get the single product
	
	public Product getProduct(int pid) {
		
		
		Product p = this.hibernateTemplate.get(Product.class, pid);
		return p;
		
	}
}
