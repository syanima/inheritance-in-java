public class MyFruits {
	String name;
	String color;

	public MyFruits(String name,String color){
		this.name = name;
		this.color = color;
	}

	public void taste(){
		System.out.println("Taste of "+name+" is bad");
	}
}