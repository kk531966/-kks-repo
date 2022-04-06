package practice;
 
public class Class_b extends Class_a {
	void b() {
		System.out.println("i am subclass");
	}
public static void main (String [] arg) {
	
	Class_b obj=new Class_b() ;
	obj.a();
	obj.b();
	
	
	
	
}

}