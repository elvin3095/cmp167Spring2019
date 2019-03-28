
public class testing {

	public static void main(String[] args) {
		Person person1 = new Person("Laura", 16, 'f');
		Person person2 = new Person("tito", 18, 'm');
		Person person3 = new Person("Sandra", 21, 'f');
		Person person4 = new Person("Tom", 10, 'm');
	
		System.out.print("Expeting cannot generate DL,got: ");
		DMV.generateDL(person1.age, true);
		
		System.out.print("Expeting cannot generate DL,got: ");
		DMV.generateDL(person2.age, false);
		
		System.out.print("Expeting generate DL,got: ");
		DMV.generateDL(person3.age, true);
		
		System.out.print("Expeting cannot generate DL,got: ");
		DMV.generateDL(person4.age, true);
	}

}
