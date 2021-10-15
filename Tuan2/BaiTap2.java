import java.util.Scanner;

//Bai tap tim loi sai
public class BaiTap2 {
public static void main(String[] args){	
	
	String s="";
	char c=' ';
	//System.out.println(c =='a');
	Scanner keyboard = new Scanner(System.in);
	do {
		System.out.println("Enter 'A' for option A " + "or 'B' for option B ");
		s  = keyboard.next();
		s.toLowerCase(); //Lenh nay khong thay doi gia tri cua s. Sua thanh s = s.toLowerCase();
		c= s.charAt(0);
		System.out.println(s+"\n");
	}
	while( (c!='a') || (c!='b') );//Dieu kien nay luon dung => lap vo han
}
}
