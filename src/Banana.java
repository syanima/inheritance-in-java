public class Banana extends Fruits implements InsectResistant,Ripening{
	//int numOfSeeds;

	public Banana(String name,String color,int numOfSeeds ){
		super(name,color,numOfSeeds);
	}

	public void pealUsage(){
		System.out.println("Peal of "+name+" banana is edible");
	}

	@Override

	public void taste(){
		System.out.println("Taste of "+name+" is sweet");
	}

	public void resistance(){
		System.out.println("Insect resistance is possible in "+name);
	}

	public void organicRipe(){
		System.out.println("Organic Ripening is possible in "+name);
	}


}