//package geraete;

public class Router extends Geraete {
	private int schnittstellenAnzahl;
	
	Router (){
		setNetzwerkfaehig(true);
	}

	public int getSchnittstellenAnzahl() {
		return schnittstellenAnzahl;
	}

	public void setSchnittstellenAnzahl(int schnittstellenAnzahl) {
		this.schnittstellenAnzahl = schnittstellenAnzahl;
	}
	
	
}
