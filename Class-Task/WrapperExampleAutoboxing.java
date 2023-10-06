class WrapperExampleAutoboxing{
	public static void main(String args[]){
		byte by=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0d;
		char c='a';
		boolean bo=true;
		
		Byte byteobj=Byte.valueOf(by);
		Short shortobj=Short.valueOf(s);
		Integer intobj=Integer.valueOf(i);
		Long longobj=Long.valueOf(l);
		float floatobj=f;
		double doubleobj=d;
		char charobj=c;
		boolean boolobj=bo;

		System.out.println("Print object value");
		System.out.println("Byte object: "+byteobj);
		System.out.println("Short object: "+shortobj);
		System.out.println("Int object: "+intobj);
		System.out.println("Long object: "+longobj);
		System.out.println("Float object: "+floatobj);
		System.out.println("Double object: "+doubleobj);
		System.out.println("Char object: "+charobj);
		System.out.println("Boolean object: "+boolobj);
		
		byte bytevalue=byteobj;
    		short shortvalue=shortobj;
    		int intvalue=intobj;
    		long longvalue=longobj;
    		float floatvalue=floatobj;
    		double doublevalue=doubleobj;
    		char charvalue=charobj;
    		boolean booleanvalue=boolobj;

		System.out.println("Print primitive value");
    		System.out.println("Byte value: "+bytevalue);
    		System.out.println("Short value: "+shortvalue);
    		System.out.println("Int value: "+intvalue);
    		System.out.println("Long value: "+longvalue);
    		System.out.println("Float value: "+floatvalue);
    		System.out.println("Double value: "+doublevalue);
    		System.out.println("Char value: "+charvalue);
    		System.out.println("Boolean value: "+booleanvalue);
	}
}