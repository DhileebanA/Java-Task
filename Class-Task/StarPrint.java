public class StarPrint {

	public static void main(String[] args) {
		int term=5, i=5, j=0;
		boolean on=true;
		while(on){
			System.out.print("* ");
			i-=1;
			if(i==j){
				System.out.println();
				i=term-=1;
				if(term==j){
					on=false;
				}
			}
			
		}
	}

}