
public class Electronic extends Product {
	String type;
	String brand;

	public Electronic(String productname, int productprice, String type,String brand) {
		super(productname, productprice);
		this.brand=brand;
		this.type=type;
		// TODO Auto-generated constructor stub
	}

	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return super.productprice;
	}

	@Override
	public void printSpecification() {
		// TODO Auto-generated method stub
		System.out.print( super.productname+super.productprice+this.type+this.brand);

		
	}

}
