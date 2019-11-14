import java.util.Scanner;
public class Test {
 public static void main(String[] args){
 
 double couns, full, result; 
 Scanner volume = new Scanner(System.in);
    System.out.print(" feed me iam starving : ");
	 
	 full = volume.nextDouble();
	 
	couns = 0;
	
	while ( full <=4.5 ){
		System.out.println(full);
		full = full + 0.12;
		
		couns = couns + 1;
	}
	System.out.println("----------------------------------------");
	System.out.println(" How much it loop :" + couns);
	result = couns*0.12;
	System.out.println(result);
				System.out.println( "iam full thank youu" );
 }
}
