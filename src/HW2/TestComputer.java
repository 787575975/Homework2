package HW2;

public class TestComputer {

	public static void main(String[] args) {
		computer myComputer = new computer(1200,2018);
		
		computer yourComputer = new computer("Silver", "Mac");
		
		myComputer.displayComputerBrand();//called non-static method
		myComputer.showComputerPrice();
		
		myComputer.getComputerColour();
		myComputer.displayComputerBrand();//called static method
		
		computer.getComputerColour();
		computer.displayComputerYear();
		
		System.out.println("My computer price is :" + myComputer.price);
		
		System.out.println("your computer color is :" + myComputer.year);
		
		System.out.println("My computer year is : " +  myComputer.colour);
		
		System.out.println("your computer brand is :" + yourComputer.brand);
		
	}

}
