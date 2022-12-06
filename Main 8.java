/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	// Değişkenleri oluşturalım
		int a, b;
		double c;
		
		//Kullanıcıdan veri alalım
		
		Scanner girdi= new Scanner(System.in);
		System.out.print("1. kenarı giriniz : ");
		a=girdi.nextInt();
		
		System.out.print("2. kenarı giriniz : ");
		b=girdi.nextInt();
		
		c=Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenus : " +c);
	}
}
