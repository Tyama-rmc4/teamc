class A{
	public void show(){
		System.out.println("A");
	}
}

classs B extends A {
	public void show() {
		System.out.println("B");
	}
}

public class Sample5_2_1{
	public static void main(String args[]){
		A a=new A();
		B b=new B();
		a.show();
		b.show();
	}
}
