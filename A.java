import java.io.*;
import java.util.*;
class A {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int r1=scan.nextInt();
		int r2=scan.nextInt();
		int r3=scan.nextInt();
		int rot=scan.nextInt();
		int res=0;
		if(r1>0 && r3>0)
		{
		    res=rot/r3;
		}
		System.out.print(res);
	}
}