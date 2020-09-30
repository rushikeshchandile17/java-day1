class Salary{
	public static void main(String args[]){
		if(args.length < 1){
			System.out.println("Insufficient arguments. Enter base salary as argument");
			System.exit(0);
		}
		double baseSalary = Double.parseDouble(args[0]);
		double hra = baseSalary * 0.4;
		double pf = baseSalary * 0.12; // deducted
		double medical = 1200;
		double ta = 800;
		double profTax = 300;
		
		double monthlySalary = baseSalary + hra - pf + medical + ta - profTax;
		System.out.println("Employee Monthly Salary = " + monthlySalary);
	}

}