
public abstract class  Product {
	String productname;
	int productprice;
	
	
	public Product(String productname, int productprice) {
		super();
		this.productname = productname;
		this.productprice = productprice;
	}
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
	
	public abstract double calculatePrice();
	public abstract void printSpecification();
	

}
