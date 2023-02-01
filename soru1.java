import java.util.Scanner;

public class soru1 {
// klavyeden tek sayi al ve desen olustur: ornek: 5 
//        *	
//        *
//    * * * * *  
//        * 
//        * 
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("tek sayi giriniz: ");
		int sayi = girdi.nextInt();
		if (sayi % 2 == 0) {
			System.out.println("lutfen tek sayi giriniz. ");
		} else {
			YildizOlustur(sayi);
			 
			 for(int t=1;t<=sayi;t++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 YildizOlustur(sayi);
			 
			 
			 
		}
	}
		
		public static void YildizOlustur(int sayi){
			 for(int k=1;k<=(sayi/2);k++) {
		           for(int i=1;i<=(sayi/2);i++) {
		        	   System.out.print(" ");
		           }
		           System.out.print("*");
		           System.out.println();
					 }
		}

	
}


cikti:


tek sayi giriniz: 5
  *
  *
*****
  *
  *
