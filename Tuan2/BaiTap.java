public class BaiTap {

static void BT1(){
	int col = 0;
	int max = 9;
	int step = 2;
	while(col!=9) {
		for(int i = 0; i<=9 ; i++ ) {
			if(i<=max) System.out.print(i); else System.out.print(" ");
		}
		System.out.print(" ");
		for(int i = 9; i>=0 ; i-- ) {
			if(i<=max) System.out.print(i); else System.out.print(" ");
		}
		System.out.print("\n");
		col++;
		max = max  - step;
		if(max == 1) step = -2;
	}
}

public static void main(String[] args){
	BT1();	
}

}
