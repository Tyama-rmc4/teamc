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
		System.out.println("�~�܂�");
	}
	void run(){
		System.out.println("����");
	}
	
	abstract void ride();
}

class Sedan extends Car{
	void ride(){
		System.out.println("�^�]�荇�킹��4�l���܂��B");
	}
}

abstract class Wagon extends Car{
}

class StationWagon extends Wagon{
	void ride(){
		System.out.println("�^�]�荇�킹��6�l���܂��B");
	}
}