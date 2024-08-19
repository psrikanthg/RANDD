
public class ArgumExa {
	
	

	 public static void main(String args[]){
		 int j;
		 
		 Integer intObj=Integer.valueOf(args[args.length-1]);
	      int i = intObj.intValue();
            System.out.println(" arg are "+args[1]+" "+i);
            
            
	      if(args.length > 1) 
	         System.out.println(i);
	      if(args.length > 0)
	         System.out.println(i - 1);
	      else 
	         System.out.println(i - 2);
	 }
			 
}
