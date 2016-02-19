import java.util.*;

abstract class Human{
	String name;
	String address;
	
	Human(String name,String address){
		this.name=name;
		this.address=address;
	}
	public abstract void work();
}

class Student extends Human{
	int id;
	public Student(String name,String address,int id){
		super(name,address);
		this.id=id;
	}
	public void work(){
		System.out.println(this.address+"在の学籍番号"+this.id+"番の学生"+this.name+"は勉強します。");
	}
}

class Teacher extends Human{
	String practice;
	public Teacher(String name,String address,String practice){
		super(name,address);
		this.practice=practice;
	}
	public void work(){
		System.out.println(this.address+"在住の教員"+this.name+"は"+this.practice+"の授業をします。");
	}
}

class School{
	private ArrayList humans;
	
	public School(){
		this.humans=new ArrayList();
	}
	public void setHuman(Human human){
		this.humans.add(human);
	}
	public void showHuman(int index){
		Human human=(Human)this.humans.get(index);
		human.work();
	}
	public void showAllHuman(){
		Iterator ite=this.humans.iterator();
		while(ite.hasNext()){
			Human human=(Human)ite.next();
			human.work();
		}
	}
}

class Array{
	public static void main(String[] args){
		School school=new School();
		
		Student student1=new Student("山田","武蔵野市",91014);
		Teacher teacher1=new Teacher("佐藤","世田谷区","コンピュータ哲学");
		
		school.setHuman(student1);
		school.setHuman(teacher1);
		school.showAllHuman();
	}
}