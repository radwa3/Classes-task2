
public class Clothes extends Product{

	String size ;
	String color ;
	
	public Clothes(String productname, int productprice,String size,String color) {
		super(productname, productprice);
		this.size=size;
		this.color=color;
		// TODO Auto-generated constructor stub
	}

	
	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		if (this.size.equals("xxl" )|| this.size.equals("xxxl"))
		return super.productprice * 1.4 ;
		else 
			return super.productprice;

	}

	@Override
	public void printSpecification() {
		// TODO Auto-generated method stub
		System.out.print( super.productname+super.productprice+this.size+this.color);
	}

}
