class Sample5_3_2{
	public static void main (String args [] ){
		Sedan sedan = new Sedan();
		StationWagon sw = new StationWagon();
		sedan.ride();
		sw.ride();
	}
}

abstract class Car{
	void stop(){
		System.out.println("~‚Ü‚é");
	}
	void run(){
		System.out.println("‘–‚é");
	}
	
	abstract void ride();
}

class Sedan extends Car{
	void ride(){
		System.out.println("‰^“]è‡‚í‚¹‚Ä4læ‚ê‚Ü‚·B");
	}
}

abstract class Wagon extends Car{
}

class StationWagon extends Wagon{
	void ride(){
		System.out.println("‰^“]è‡‚í‚¹‚Ä6læ‚ê‚Ü‚·B");
	}
}