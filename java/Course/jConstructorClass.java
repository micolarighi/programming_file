public class jConstructorClass {

	String name;
	int hp;
	int atp;

	jConstructorClass(String name, int hp, int atp) {
		this.name = name;
		this.hp = hp;
		this.atp = atp;
	}

	void displayInfo() {
		System.out.println("Hero name : " + this.name);
		System.out.println("Hero health : " + this.hp);
		System.out.println("Hero Attack Power :" + this.atp);
	}

}