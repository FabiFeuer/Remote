
//package Geraete.src;

/**
 * 
 * @author Administrator
 *
 */
public class Geraete {
	private String geraeteName;
	String kaufDatum;
	boolean netzwerkfaehig = true;

	/**
	 * Konstruktor ohne Parameter
	 */
	public Geraete() {
		this.geraeteName = "Noch nicht benannt";
	}

	/**
	 * 
	 * @param geraeteName Konstruktor mit dem Parameter Name des Geraets
	 */
	public Geraete(String geraeteName) {
		this.geraeteName = geraeteName;
	}

	/**
	 * Soll ueberpreufen ob es sich um eine IPv4 Adresse handelt.
	 * 
	 * @param ipAdresse String der zu testenden Adresse
	 * @return boolean true wenn IPv4 Adresse
	 */
	public static boolean isipAdresse(String ipAdresse) {
		boolean gueltigeIPAdresse = true;
		var punkt1 = 0;
		int punkt2 = 0;
		int punkt3 = 0;
		int punkt4 = 0;
		int term1 = -1; // 10.0.0
		int term2 = -1;
		int term3 = -1;
		int term4 = -1;

		// Ermittel de Punkte im String
		for (int i = 0; i < ipAdresse.length(); i++) {
			if (ipAdresse.substring(i, i + 1).equals(".") & 
					punkt1 != 0 & punkt2 != 0 & punkt3 != 0 & punkt4 == 0) {
				punkt4 = i;
			}

			if (ipAdresse.substring(i, i + 1).equals(".") & 
					punkt1 != 0 & punkt2 != 0 & punkt3 == 0) {
				punkt3 = i;
			}

			if (ipAdresse.substring(i, i + 1).equals(".") & 
					punkt1 != 0 & punkt2 == 0) {
				punkt2 = i;
			}

			if (ipAdresse.substring(i, i + 1).equals(".") & 
					punkt1 == 0) {
				punkt1 = i;
			}

		}
		// Test ob der String 3 Punkte 
		
		try{
		
			if(punkt1 !=0 && punkt2 !=0 && punkt3 !=0 && punkt4==0) {
		term1 = Integer.parseInt(ipAdresse.substring(0, punkt1));
		term2 = Integer.parseInt(ipAdresse.substring(punkt1+1, punkt2));
		term3 = Integer.parseInt(ipAdresse.substring(punkt2+1, punkt3));
		term4 = Integer.parseInt(ipAdresse.substring(punkt3+1, ipAdresse.length()));
		} else {

			gueltigeIPAdresse = false;
			
		}
		}catch (Exception e){
			gueltigeIPAdresse = false;

		}

		// Wenn die Terme auserhalb von 0-255 sind, dann false 

		if((term1<256 & term1>-1 & term2<256 & term2>-1 & term3<256 & term3>-1)){


		}else{

			gueltigeIPAdresse = false;

		}

			
			
		System.out.println("IP Adresse " + ipAdresse + " Pos1 " + 
				punkt1 + " Pos2 " + punkt2 + " Pos3 " + punkt3 +
				" Pos4 " + punkt4 + " term1 " + term1 + " term2 " + 
				term2 + " term3 " + term3 + " term4 " + term4);

		return gueltigeIPAdresse;
	}

	/**
	 * Getter ob Geraet netzwerkfaehig ist
	 * 
	 * @return boolean true wenn netzwerkfaehig
	 */
	public boolean isNetzwerkfaehig() {
		return netzwerkfaehig;
	}

	/**
	 * Setter ob Geraet netzwerkfaehig ist
	 * 
	 * @param netzwerkfaehig true wenn netzwerkfaehig
	 */
	public void setNetzwerkfaehig(boolean netzwerkfaehig) {
		this.netzwerkfaehig = netzwerkfaehig;
	}

	/**
	 * Getter Geraetename
	 * 
	 * @return Den Namen des Geraets zurueckgeben
	 */
	public String getGeraeteName() {
		return geraeteName;
	}

	/**
	 * Setter Geraetename Begraenst den Namen auf 20 Zeichen
	 * 
	 * @param geraeteName Den Namen des Geraets setzen.
	 */
	public void setGeraeteName(String geraeteName) {
		int maxZeichenkettenLaenge = 20;
		if (geraeteName.length() > maxZeichenkettenLaenge) {
			geraeteName = geraeteName.substring(0, maxZeichenkettenLaenge);
		}
		this.geraeteName = geraeteName;

	}

}
