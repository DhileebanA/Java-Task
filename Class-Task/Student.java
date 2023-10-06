class Coding1_28{

	int id;
	String name;

	void display(){
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String args[]){
		Coding1_28 obj = new Coding1_28(1001, "Arun.J");
		obj.display();
		
	}

	Coding1_28(int id, String name){
		this.name = name;
		this.id = id;

	}
	
}