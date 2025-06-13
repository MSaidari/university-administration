
package university_administration;

public class ders {
	private int bolno,dersid,derskredi;
	private String dersad;
	public static int syc=0;
	
	public ders(int bolno, int derskredi, String dersad) {
		super();
		this.bolno = bolno;
		this.derskredi = derskredi;
		this.dersad = dersad;
		dersid=syc++;
	}

	public int getBolno() {
		return bolno;
	}

	public void setBolno(int bolno) {
		this.bolno = bolno;
	}

	public int getDersid() {
		return dersid;
	}

	public void setDersid(int dersid) {
		this.dersid = dersid;
	}

	public int getDerskredi() {
		return derskredi;
	}

	public void setDerskredi(int derskredi) {
		this.derskredi = derskredi;
	}

	public String getDersad() {
		return dersad;
	}

	public void setDersad(String dersad) {
		this.dersad = dersad;
	}
	
	
}
