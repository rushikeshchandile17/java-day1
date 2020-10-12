class Average{
	public static void main(String args[]){
		if(args.length < 3){
			System.out.println("Insufficient arguments. Enter 3 values");
			System.exit(0);
		}
		double v1 = Double.parseDouble(args[0]);
		double v2 = Double.parseDouble(args[1]);
		double v3 = Double.parseDouble(args[2]);
		
		double avg = (v1 + v2 + v3)/3;
		
		System.out.println("Average=" + avg);
	}
}
