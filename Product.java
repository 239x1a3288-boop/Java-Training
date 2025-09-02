package day2;

public class Product {
	String ProductName;
	int Price,Quantity;
	float GST,Discount;
	public static void main(String[] args) {
		Product P1 = new Product();
		P1.ProductName="SUGAR";
		P1.Price=100;
		P1.Quantity=500;
		P1.GST=5.5f;
		P1.Discount=30.5f;
		System.out.println("Product Name = "+P1.ProductName);
		System.out.println("Price = "+P1.Price);
		System.out.println("Product Quantity = "+P1.Quantity);
		System.out.println("Discount = "+P1.Discount);
		System.out.println("GST = "+P1.GST);
		Product P2 = new Product();
		P2.ProductName="COCONUT";
		P2.Price=150;
		P2.Quantity=50;
		P2.GST=5.9f;
		P2.Discount=25.5f;
		System.out.println("Product Name = "+P2.ProductName);
		System.out.println("Price = "+P2.Price);
		System.out.println("Product Quantity = "+P2.Quantity);
		System.out.println("Discount = "+P2.Discount);
		System.out.println("GST = "+P2.GST);
		Product P3 = new Product();
		P3.ProductName="FREEDOM OIL";
		P3.Price=200;
		P3.Quantity=1000;
		P3.GST=15.8f;
		P3.Discount=35.5f;
		System.out.println("Product Name = "+P3.ProductName);
		System.out.println("Price = "+P3.Price);
		System.out.println("Product Quantity = "+P3.Quantity);
		System.out.println("Discount = "+P3.Discount);
		System.out.println("GST = "+P3.GST);
		Product P4 = new Product();
		P4.ProductName="FLOUR";
		P4.Price=50;
		P4.Quantity=500;
		P4.GST=25.5f;
		P4.Discount=40.5f;
		System.out.println("Product Name = "+P4.ProductName);
		System.out.println("Price = "+P4.Price);
		System.out.println("Product Quantity = "+P4.Quantity);
		System.out.println("Discount = "+P4.Discount);
		System.out.println("GST = "+P4.GST);
		Product P5 = new Product();
		P5.ProductName="COMPUTER";
		P5.Price=30000;
		P5.Quantity=500;
		P5.GST=53.5f;
		P5.Discount=50.5f;
		System.out.println("Product Name = "+P5.ProductName);
		System.out.println("Price = "+P5.Price);
		System.out.println("Product Quantity = "+P5.Quantity);
		System.out.println("Discount = "+P5.Discount);
		System.out.println("GST = "+P5.GST);
	}
	
}
