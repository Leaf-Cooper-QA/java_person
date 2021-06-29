package personchallenge;

public class Runner {
	public static void main(String[] args) {
		Person person1 = new Person ("Steve",34,"Radio presenter");
		Person person2 = new Person ("Lucy",51,"Wildlife conservationalist");
		Person person3 = new Person ("Leaf",23,"Digital Consultant");
			
		Person[] peoplelist = {person1,person2,person3};
		
		for (Person person : peoplelist) {
		person.showdetails();
		}
	}


}
