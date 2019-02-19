package chapter7_Inheritance;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;

		System.out.println(name);
		System.out.println(this.name); // this, referring to the calling object's name is null until it is set to the
										// calling variablex
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(323, "Jenna");
		s1.display();
		s2.display();
	}
}
