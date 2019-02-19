/**
* Reza Rohani
* rero6268
* @author  Reza Rohani
* @version 1.0
* @since   2016-01-11
*/

import java.util.Scanner;

public class Kennel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean avslutaInte = true;
		
		
		while(avslutaInte)
		{
			System.out.print("Vad vill du göra? (Ange Nr)\n" +
				"1. Registrera\n" +
				"2. Lista\n"+
				"3. Ta bort\n" +
				"4. Avsluta\n"); 
			System.out.println();
		
		
		
			int valdFunktion = sc.nextInt();
			sc.nextLine();
			switch(valdFunktion){
			
			case 1:
				String regNamn;
				String regRas;
				int regAlder;
				int regVikt;
				double regSvans;
				final double TAX = 3.7;
				
				System.out.println("Ange namn på hund: ");
				regNamn = sc.nextLine();
				System.out.println("Ange ras: ");
				regRas = sc.nextLine();
				System.out.println("Ange ålder: ");
				regAlder = sc.nextInt();
				System.out.println("Ange Vikt: ");
				regVikt = sc.nextInt();
				
				if(regRas.equalsIgnoreCase("tax")){
					regSvans = TAX;
				}else{
				 regSvans = (regAlder+regVikt)/10.0;
				}
				
				System.out.println();
				Hund.regHund(regNamn, regRas, regAlder, regVikt, regSvans);
				System.out.println();
				break;
				
			case 2:
				int svansLangd;
				
				System.out.println("Ange minsta svanslängd:  ");
				svansLangd = sc.nextInt();
				
				System.out.println();
				Hund.svansLangd(svansLangd);
				System.out.println();
				break;
				
			case 3:
				String taBortNamn;
				
				System.out.println("Ange namn på hund du vill ta bort: ");
				taBortNamn = sc.nextLine();
				
				System.out.println();
				Hund.taBortHund(taBortNamn);
				System.out.println();
				break;
				
			case 4:
				System.out.println();
				System.out.println("Tack och hej!");
				sc.close();
				avslutaInte = false;
				break;
				
			default:
				System.out.println();
				System.out.println("Fel val. Testa ett annat Nr:");
				System.out.println();
				break;
			}
		}	
	}
}
