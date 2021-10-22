package BT;

public class BaiTap {
	static String tinhTong(String str1, String str2)
	{
	    if (str1.length() > str2.length()){
	        String t = str1;
	        str1 = str2;
	        str2 = t;
	    }
	 
	    String str = "";
	 
	    int n1 = str1.length(), n2 = str2.length();
	 
	    str1=new StringBuilder(str1).reverse().toString(); //nho_hon
	    str2=new StringBuilder(str2).reverse().toString(); //lon hon
	 
	    int carry = 0;
	    for (int i = 0; i < n1; i++)
	    {

	        int sum = ((int)(str1.charAt(i) - '0') + (int)(str2.charAt(i) - '0') + carry);
	        str += (char)(sum % 10 + '0');
	 
	        carry = sum / 10;
	    }
	    
	    for (int i = n1; i < n2; i++)
	    {
	        int sum = ((int)(str2.charAt(i) - '0') + carry);
	        str += (char)(sum % 10 + '0');
	        carry = sum / 10;
	    }
	 
	    if (carry > 0)
	        str += (char)(carry + '0');
	 
	    str = new StringBuilder(str).reverse().toString();
	 
	    return str;
	}
	static String tinhHieu(String str1, String str2)
	{
	    if (str1.length() < str2.length()){
	        String t = str1;
	        str1 = str2;
	        str2 = t;
	    }
	    while( str1.length() != str2.length() ) str2 = "0" + str2  ;
	    String str = "";
	    
	    int n1 = str1.length(), n2 = str2.length();
	 
	    str1=new StringBuilder(str1).reverse().toString(); //lon hon
	    str2=new StringBuilder(str2).reverse().toString(); //nho hon
	    
	    int carry = 0;
	    
	    
	    for (int i = 0; i < n1; i++)
	    {
	    	int a = (int)(str1.charAt(i) - '0');
	    	int b = (int)(str2.charAt(i) - '0');
	        int sub = (a - b - carry  >= 0 ) ? (a - b - carry) : (10 + (a-b) - carry )  ;
	        str += (char)(sub % 10 + '0');
	 
	        carry = (a - b - carry < 0) ?  1 : 0 ;
	    }
	    
	    for (int i = n1; i < n2; i++)
	    {
	    	int a = 0;
	    	int b = (int)(str2.charAt(i) - '0');
	        int sub = (a - b - carry  >= 0 ) ? (a - b - carry) : (10 + (a-b) - carry )  ;
	        str += (char)(sub % 10 + '0');
	 
	        carry = (a - b - carry < 0) ?  1 : 0  ;
	    }
	 
	 
	    str = new StringBuilder(str).reverse().toString();
	    while(str.charAt(0) == '0' ) str = str.substring(0, str.length()-1) ; 	
	    return str;
	}
	 
	public static void main(String[] args)
	{
	    String str1 = "350456489";
	    String str2 = "6655550";
	    System.out.println(tinhTong(str1, str2));
	    System.out.println(tinhHieu(str1, str2));
	}
	
}
