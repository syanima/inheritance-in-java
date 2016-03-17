public class Fruits {
	String name;
	String color;
	int numOfSeeds;

	public Fruits(String name,String color,int numOfSeeds){
		this.numOfSeeds = numOfSeeds;
		this.name = name;
		this.color = color;
	}

	public void taste(){
		System.out.println("Taste of "+name+" is good");
	}

	public void price(){
		System.out.println("The price is low for "+name);
	}

	public void seeds(){
		System.out.println("The number of seeds is "+numOfSeeds);
	}
}