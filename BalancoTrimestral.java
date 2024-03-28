package empresagastos;

public class BalancoTrimestral {
	public static void main (String [] Args) {
	int gastosJaneiro=15000;
	int gastosFevereiro=23000;
	int gastosMarco=17000;

	// 
	
	
	int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	System.out.println (gastosTrimestre);// para imprimir entre parenteses
	
	int mediaMensal = gastosTrimestre/3; // 
			
			System.out.println ("Valor da Media Mensal = "+ mediaMensal);
	
	}
	
	

}
