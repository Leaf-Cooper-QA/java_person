package personchallenge;

public class Person {
	String name;
	int age;
	String jobtitle;
	
	Person(){
		
	}
	
	Person(String name, int age, String jobtitle) {
		this.name=name;
		this.age=age;
		this.jobtitle=jobtitle;
	}
	
	public void showdetails() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(jobtitle);
	}

}
