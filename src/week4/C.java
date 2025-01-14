package week4;
//parent class
//also known as run time
// also known as polymorphism
class A{
	void display() {
		System.out.println("class A");
	}
}
//intermediatory-class
class B{
	void display() {
		System.out.println("Class B");
	}
}
public class C extends B {
	void display() {
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//object creation
		C c =  new C();
		//calling-method
		c.display();
	}

}
