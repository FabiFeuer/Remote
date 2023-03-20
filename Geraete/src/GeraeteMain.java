//package Geraete.src;

public class GeraeteMain {

	public static void main(String[] args) {
		
		String[] testIP = {"1.0.0.1","7.6.3.20", "4.3.40.3", 
				"1g2.168.17.4","192.168.17.4.4", "10.20.30.40", 
				"192.200.1.9", "300.40.200.3", "10.3.2", "10.4", "dhdhdfhdfh","" };
		int i = 0;
		while (testIP[i].length()>1) {
			System.out.println(Geraete.isipAdresse(testIP[i]));
			i++;
		}
		/*
		String testIP="23.";
		if(testIP.substring(2,3).equals(".")) {
			System.out.print("punkt" + testIP.substring(2,3));
		} 
		*/
		
	}



} // .7.8.9
