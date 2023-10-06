import java.util.Scanner;
class Coding1_31{
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	public static void main(String args[]){
		Coding1_31 obj = new Coding1_31();
		Scanner scanobj = new Scanner();
		int id = scanobj.nextInt();
		String name = scanobj.next();
		int m1 = scanobj.nextInt();
		int m2 = scanobj.nextInt();
		int m3 = scanobj.nextInt();
		obj.strudentDetails(id,name,m1,m2,m3);
		
	}
	void studentDetails(int id,String name,int m1,int m2,int m3){
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
}