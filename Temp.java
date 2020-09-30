class Temp{
	public static void main(String args[]){
	System.out.println(args[0]);
	System.out.println(args[1]);

	
	double C = Double.parseDouble(args[0]);
	double F = Double.parseDouble(args[1]);
	
	System.out.println("Temp in C = " +((0.56)*(F-32)));
	System.out.println("Temp in F = " +((9*C/5) + 32));




}
}