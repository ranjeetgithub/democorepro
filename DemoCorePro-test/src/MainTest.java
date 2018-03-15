

public class MainTest {

	public static void main(String[] args) {
		/** prime no**/
		/*boolean flagPrime = true;
		Scanner inputLength = new Scanner(System.in);
		int length = inputLength.nextInt();
		for(int i=2;i<=length;i++){
			flagPrime = true;
			for(int j=2;j<=i;j++){
				if(i%j==0 && i!=j){
					flagPrime = false;
					break;
				}
			}
			if(flagPrime == true)System.out.println("prime no="+i);
		}
*/
		/** palindor no-16461 **/
		int no = 16461;
		int temp1 = no;
		int no1=0 ;
		int length = String.valueOf(no).length();
		for(int i=0;i<length;i++){
			int temp = no%10;
			no1=no1*10+temp;
			no = no/10;
		}
		if(temp1 == no1)System.out.println("palindor no");
		
	}

}
