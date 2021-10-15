import java.lang.reflect.Array;
import java.util.Arrays;

public class ChuanHoaCau {
static void ChuanHoa(String s) 
{
	String words[] =  s.split(" ");
	String newString="";
	for(int i=0; i<words.length; i++)
	{
		if(words[i]!="") {
			newString = newString + words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() +" ";		
		}
	}
	newString = newString.replace(" . ", ". ");
	System.out.print(newString);
}
public static void main(String[] args)
{
	String a ="lop hoc  java . bat daU luc muoi hai gio";
	ChuanHoa(a);
}


}
