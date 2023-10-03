public class StringMethods{
	public static void main(String args[]){
		String value = "Batch 18 is toxic";
		String val = "Batch 18 is toxic";
		System.out.println(value.contains(" toxic"));
		System.out.println(value.concat(" By birth"));
		System.out.println(value.equals("Batch 18 is toxic"));
		System.out.println(value.equalsIgnoreCase("Batch 18 is TOXIC"));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.length());
		System.out.println("charAt(): "+value.charAt(4));
		System.out.println("compareTo(): "+value.compareTo(val));
		System.out.println("compareToIgnoreCase(): "+value.compareToIgnoreCase(val));
		System.out.println("compareTo(): "+value.compareTo("hello"));
		System.out.println("indexOf(): "+value.indexOf('s'));
		System.out.println("isEmpty(): "+value.isEmpty());
		System.out.println("replace(): "+value.replace("toxic","Vedappu"));
		System.out.println("substring(): "+value.substring(3,11));
		System.out.println("trim(): "+value.trim());
		System.out.println("lastIndexOf(): "+value.lastIndexOf('i'));
		System.out.println("hashCode(): "+value.hashCode());
		System.out.println("format(): "+value.format("%x",5)); //d,x,s
		System.out.println("join(): "+value.join("*","sakthi","kishore","boopathi","mathi"));
		System.out.println("replaceAll():"+value.replaceAll("i","y"));
	}
}