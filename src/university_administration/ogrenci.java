
package university_administration;

public class ogrenci {
	private  int bolno;
	private String ograd,ogrsoyad;
	
	public ogrenci(int bolno, String ograd, String ogrsoyad) {
		super();
		this.bolno = bolno;
		this.ograd = ograd;
		this.ogrsoyad = ogrsoyad;
		
	}
	
	
	public ogrenci() {
		super();
	}


	public int getBolno() {
		return bolno;
	}

	public void setBolno(int bolno) {
		this.bolno = bolno;
	}

	public String getOgrad() {
		return ograd;
	}

	public void setOgrad(String ograd) {
		this.ograd = ograd;
	}

	public String getOgrsoyad() {
		return ogrsoyad;
	}

	public void setOgrsoyad(String ogrsoyad) {
		this.ogrsoyad = ogrsoyad;
	}
	
	
}
