package HW2;

public class computer {
	int price ; // non-static variable
	public static String colour ; //this is static variable
		String brand; // non-static variable
		public static int year;// this is static variable
		
		public computer() {//1.constructor
			
		}
		public computer (int price,int year) {//2.constructor
			this.price = price;
			this.year = year;
		}
		public computer(String colour,String brand) {//3.constructor
			this.colour = colour;
			this.brand = brand;
		}
	
			public void displayComputerBrand() {//non-static void typed method
				System.out.println("Computer brand is MAC");
			}
				
			
			
		public int	showComputerPrice() {//non-static return type method
			return price;
			
		}
		public static void getComputerColour() {
			// TODO Auto-generated method stub
		}
		public static void displayComputerYear() {
			
		}

}
