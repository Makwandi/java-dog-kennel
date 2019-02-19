/**
* Reza Rohani
* rero6268
* @author  Reza Rohani
* @version 1.0
* @since   2016-01-11
*/
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Hund {
	private String hundNamn;
	private String hundRas;
	private int hundAlder;
	private int hundVikt;
	private double hundSvansLangd;
	private static ArrayList<Hund> hundLista = new ArrayList<Hund>();
	DecimalFormat df = new DecimalFormat("#.#");

	public Hund(String namn, String ras,  int alder,  int vikt, double svans){
		 hundNamn = namn;
		 hundRas = ras;
		 hundAlder = alder;
		 hundVikt = vikt;
		 hundSvansLangd = svans;
	}
	public String toString()
	{
		return hundNamn  + "  " + hundRas + "  " + hundAlder + " år " + hundVikt + " kg svans=" + df.format(hundSvansLangd);
	}
	public void setHundNamn(String namn){
		hundNamn = namn;
	}
	public void setHundRas (String ras){
		hundRas = ras;
	}
	public void setHundAlder(int alder){
		hundAlder = alder;
	}
	public void setHundvikt(int vikt){
		hundVikt = vikt;
	}
	public void setHundSvansLangd(double svans){
		hundSvansLangd = svans;
	}
	public String getHundNamn(){
		return hundNamn;
	}
	public String getHundRas(){
		return hundRas;
	}
	public int getHundAlder(){
		return hundAlder;
	}
	public int getHundVikt(){
		return hundVikt;
	}
	public double getSvansLangd(){
		return hundSvansLangd;
	}
	public static void regHund(String namnHund, String rasHund, int alderHund, int viktHund, double svansHund){	
		hundLista.add(new Hund(namnHund, rasHund, alderHund, viktHund, svansHund));
	}
	public static void taBortHund(String hundTaBort){
		@SuppressWarnings("unused")
		boolean HittadHund = false;
		
		for (int i = 0; i < hundLista.size(); i++){
			if(hundLista.get(i).getHundNamn().equalsIgnoreCase(hundTaBort)){
				hundLista.remove(i);
				System.out.println("Hunden med det angivna namnet är borttagen");
				HittadHund=true;
			}
			if(HittadHund = false){
				System.out.println("Hund med det namnet fanns ej i registret");
			}
		}
	}
	public static void svansLangd(int langd){
		for (int j = 0; j < hundLista.size(); j++){
			if(hundLista.get(j).getSvansLangd() >= langd){
			System.out.println(hundLista.get(j));
			}
			else {
			System.out.println("Finns ej :(");
			
			}
		}
	}
}
