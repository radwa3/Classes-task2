

import javax.swing.JOptionPane;

public class TestHyper {

	public static void main(String[] args){
		Product []products =new Product[10];
		
		
		String welcome= JOptionPane.showInputDialog("Welcome : "+"Enter "+"\n"+"(+) to add product"+"\n"+"(-) to delete product "+"\n"+"(#) to show all products ");
if (welcome.equals("+")){
		String add = JOptionPane.showInputDialog( "Choose product type"+"\n"+"1-Vegetble product"+"\n"+"2-Electronic product"+"\n"+"3-Cloth product");
	for(int i=0;i<10;i++){
	if(add.equals("1")){
		
		String  name = JOptionPane.showInputDialog( "Enter Name : ");
		String price = JOptionPane.showInputDialog( "Enter Price : ");
		String amount = JOptionPane.showInputDialog( "Enter Amount : ");
		String expirayDate = JOptionPane.showInputDialog( "Enter Expiry Date : ");
		
		Product v = new Vegetable(name, Integer.parseInt(price), Integer.parseInt(amount), expirayDate);
		products[i]=v;
		break;
		
	}
	else if (add.equals("2"))
	{
		String name = JOptionPane.showInputDialog( "Enter Name : ");
		String price = JOptionPane.showInputDialog( "Enter Price : ");
		String type = JOptionPane.showInputDialog( "Enter type : ");
		String brand = JOptionPane.showInputDialog( "Enter brand : ");
		
		Product e = new Electronic (name, Integer.parseInt(price), type, brand);
		products[i]=e;
		break;

	}
	
	else if (add.equals("3"))
	{
		String name = JOptionPane.showInputDialog( "Enter Name : ");
		String price = JOptionPane.showInputDialog( "Enter Price : ");
		String size = JOptionPane.showInputDialog( "Enter size : ");
		String color = JOptionPane.showInputDialog( "Enter color : ");
		
		Product c = new Clothes (name, Integer.parseInt(price), size, color);
		products[i]=c;
		break;

	}
	
	
	}
	}
else if(welcome.equals("-")){
	for(int i=9;9<=i;i--){
		if(products[i]!= null){
			products[i]=null;	
			break;
		}
		
		
	}
		
	}


else if(welcome.equals("#")){
	for(int i=0;i<10;i++){
		
		if(products[i] instanceof Vegetable){
			
			((Vegetable)products[i]).printSpecification();
					
		}
		
		else if (products[i] instanceof Electronic){
			((Electronic)products[i]).printSpecification();
		}
		
        else if (products[i] instanceof Clothes){
        	((Clothes)products[i]).printSpecification();
			
		}
	}
		
	}
	}
}
