/*Write a program to Create Class Product with id, name and price. Create an object with
names laptop and desktop and swap the prices.
Example:
Product laptop=new product(100,’sony’,8500)
Product desktop=new product(100,’sony’,35000)
Display laptop price as 35000 and desktop price as 8500, using pass by object. */


package assign2;

public class Product {
	int prodId;
	String prodName;
	double prodPrice;
	
	
	public Product(int id,String name, double price){
		prodId=id;
		prodName=name;
		prodPrice = price;
	}
	
	void display(Product desk){
		System.out.println("laptop price is "+ " " + desk.prodPrice + " and desktop price is " + prodPrice);
	}

	public static void main(String[] args) {
		Product laptop = new Product(100,"sony",8500);
		Product desktop=new Product(100,"sony",35000);
		laptop.display(desktop);

	}

}
