import java.lang.Math;

class MathFunctionExample{
	public static void main(String args[]){
	
		System.out.println("abc(): "+Math.abs(-12123)); // return positive value = 12123

		System.out.println("cbrt(): "+Math.cbrt(27)); // return Qube root value = 3.0

		System.out.println("sqrt(): "+Math.sqrt(4)); // return Square root value = 2.0

		System.out.println("signnum(): "+ Math.signum(15)); // return the given number sign with 1.0 = + 1.0

		System.out.println("rint(): "+Math.rint(1.4)); // return the rounded value in float = 1.0

		System.out.println("ceil(): "+ Math.ceil(-0.87)); // return the nearest highest round value = 0.0

		System.out.println("floor(): "+ Math.floor(1.23)); // return the nearest highest round value = 1.0

		System.out.println("random(): "+ Math.random()); // return the random number between 0 to 1 = 0.534234

		System.out.println("pow(): "+ Math.pow(5,3)); // return the power

		System.out.println("max(): "+ Math.max(-22,22));

		System.out.println("min(): " + Math.min(-22,22));

		System.out.println("copySign(): "+ Math.copySign(5,-3));

		System.out.println("exp(): "+ Math.exp(2)); // euler's theorm exponential = e**x return 2.178**2

		System.out.println("expm1(): " + Math.expm1(2)); exponential - 1

		System.out.println("getExponent(): " + Math.getExponent(1234.5678));

		System.out.println("hypot(): "+ Math.hypot(2,3));

		System.out.println("IEEEremainder(): " + Math.IEEEremainder(10,10)); // formula 1.a/b=value 2.a-b*value = 0.0

		System.out.println("nextAfter(): "+ Math.nextAfter(2,5)); // return first 

		System.out.println("nextUp(): "+ Math.nextUp(2));

		System.out.println("round(): "+ Math.round(2.9)); // return the rounded value in float = 1.0

	System.out.println("acos(): " + Math.acos(-1));
	System.out.println("asin(): " + Math.asin(-1));
	System.out.println("atan(): " + Math.atan(-1));
	System.out.println("atan2(): " + Math.atan2(1,2.5));
	System.out.println("cos(): " + Math.cos(1));
	System.out.println("cosh(): " + Math.cosh(1));
	System.out.println("log(): " + Math.log(10));
	System.out.println("log10(): " + Math.log10(10));
	System.out.println("log1p(): " + Math.log1p(10));
	System.out.println("sin(): " + Math.sin(0.2));
	System.out.println("sinh(): " + Math.sinh(2.5));
	System.out.println("tan(): " + Math.tan(2.5));
	System.out.println("tanh(): " + Math.tanh(2.5));
	System.out.println("toDegrees(): " + Math.toDegrees(Math.PI/4));
	System.out.println("toRadians(): " + Math.toRadians(45));
	System.out.println("ulp(): " + Math.ulp(2.5));
											
}
}