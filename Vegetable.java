

public class Vegetable extends  Product{

	String expiryDate;
	int amount ;
	
	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	
	public Vegetable(String productname, int productprice,int amount,String expirydate) {
		super(productname, productprice);
		this.amount=amount;
		this.expiryDate= expirydate;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return this.amount* super.productprice;
	}

	@Override
	public void printSpecification() {
		// TODO Auto-generated method stub
		System.out.print( super.productname+super.productprice+this.amount+this.expiryDate);
	
	}

}
