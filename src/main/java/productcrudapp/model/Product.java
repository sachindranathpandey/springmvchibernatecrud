package productcrudapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String descriptiopn;
	private long price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, String descriptiopn, long price) {
		super();
		this.name = name;
		this.descriptiopn = descriptiopn;
		this.price = price;
	}


	public Product(int id, String name, String descriptiopn, long price) {
		super();
		this.id = id;
		this.name = name;
		this.descriptiopn = descriptiopn;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriptiopn() {
		return descriptiopn;
	}
	public void setDescriptiopn(String descriptiopn) {
		this.descriptiopn = descriptiopn;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descriptiopn=" + descriptiopn + ", price=" + price + "]";
	}
	
	
	
}
