package hh.swd20.autoprojekti.domain;

public class Auto {

	// attribuutit
	private String merkki;
	private int valmistusvuosi;

	public Auto(String merkki, int valmistusvuosi) {
		super();
		this.merkki = merkki;
		this.valmistusvuosi = valmistusvuosi;
	}
	public Auto() {
		super();
		this.merkki = null;
		this.valmistusvuosi = 0;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public int getValmistusvuosi() {
		return valmistusvuosi;
	}

	public void setValmistusvuosi(int valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;

	}
}
