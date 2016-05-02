public class RangeToCheck{
	
	int lowbound, 
		upbound,
		palin=0,
		nonlych=0,
		lych=0;
	
	public RangeToCheck(int x, int y){
			this.lowbound=x;
			this.upbound=y;
		}
	
	void findLych(){
		String palinin="";
		String palininInverse="";
		long p1,
		     p2,
		     sum,
		     j;
		
		for(int i=lowbound; i<=upbound; i++){
			palinin= ""+i;
			
			palininInverse= new StringBuilder(palinin).reverse().toString();
			if(palinin.equals(palininInverse)){
				palin++;
				continue;
			}
			
			for(j=0; j<30; j++){
				p1=Long.parseLong(palinin);
				p2=Long.parseLong(palininInverse);
				sum=p1+p2;
				palinin="" +sum;
				palininInverse= new StringBuilder(palinin).reverse().toString();
				if(palinin.equals(palininInverse)){
					nonlych++;
					break;
				}
			}
			
			if(j==30){
				System.out.println("Lychrel candidate: "+i);
				lych++;
			}
		}
		
		System.out.println("");
		System.out.println("In the range from " + lowbound + " to " + upbound + " I found:");
		System.out.println(palin + " natural palinindromes");
		System.out.println(nonlych + " non-lychrel numbers");
		System.out.println(lych + " lycherel candidates");
	}	
}
