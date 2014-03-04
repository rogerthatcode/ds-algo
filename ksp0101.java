import java.util.Scanner;

public class ksp0101{
    public static void main(String[] args){
	System.out.print("Enter string to check : ");
	int flag = 0;
	Scanner str = new Scanner(System.in);
	String data = str.nextLine();
	boolean[] a = new boolean[256];
	for(int i=0; i<data.length(); i++){
	    if(a[data.charAt(i)]){
		System.out.println("Unique charactes test fail!");
		flag = 1;
		break;
	    }
	    else{
		a[data.charAt(i)] = true;
	    }
	}
	if(flag == 0){
	    System.out.println("Unique characters test pass!");
	}
    }
}