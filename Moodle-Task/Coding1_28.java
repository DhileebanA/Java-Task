class Coding1_28{

	int id;
	String name;

	public static void main(String args[]){
		Coding1_28 obj = new Coding1_28();
		obj.studentDetail(1001, "Arun.J" );

		System.out.println(obj.name);
		System.out.println(obj.id);

	}

	public void studentDetail(int id,String name){
		this.name = name;
		this.id = id;

	}
	
}