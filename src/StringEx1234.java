
public class StringEx1234 {
	
	public static void main(String args[]){
		
		System.out.println(" Hello..");
		
		try{
			
			int a = 5, b =0, c;
			c  = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Error Caught");
		}finally{
			
			System.out.println("Error Caught successfully..");
			
		}
		
		String s ="PAYPAL";
		char c[] = s.toCharArray();
		int count =0;
		for(int i=0; i<c.length; i++){
			count =0;
			for(int j=i; j<c.length; j++){
				
				if(c[i] == c[j]){
					count++;
					System.out.println(c[i]+" reepated times are "+count);
					
				}
			}
			
			
		}
		
	}

}
