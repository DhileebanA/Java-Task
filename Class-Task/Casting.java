class Casting{
	public static void main(String[] args){
		int inum = 10;
		System.out.println(inum);
		
		float fnum = inum;
		System.out.println(fnum);
		
		double dnum = 1.12345678901234567890 + fnum;
		System.out.println(dnum);
		
		byte bnum = (byte) dnum;
		System.out.println(bnum);
	}
}