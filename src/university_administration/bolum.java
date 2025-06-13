
package university_administration;

public class bolum {
	private int bolno;
	private String bolad;
	public ogrenci[] ogrenciler;
	public ders[] dersler;
	
	public bolum(int bolno, String bolad) {
		super();
		this.bolno = bolno;
		this.bolad = bolad;
	}
	
	
	public bolum() {
		super();
	}


	public int getBolno() {
		return bolno;
	}


	public void setBolno(int bolno) {
		this.bolno = bolno;
	}


	public String getBolad() {
		return bolad;
	}


	public void setBolad(String bolad) {
		this.bolad = bolad;
	}


	


	
	
	
	
}
