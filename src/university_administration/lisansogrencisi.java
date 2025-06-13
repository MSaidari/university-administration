
package university_administration;

public class lisansogrencisi extends ogrenci{
	private int ogrid,ogrsınıf;
	private String durum;
	public static int syc=0;
	
	public lisansogrencisi(int bolno, String ograd, String ogrsoyad, int ogrid, int ogrsınıf, String durum) {
		super(bolno, ograd, ogrsoyad);
		this.ogrid = ogrid;
		this.ogrsınıf = ogrsınıf;
		this.durum = durum;
		ogrid=syc++;
		durum = "lisans";
	}

	public lisansogrencisi(int bolno, String ograd, String ogrsoyad, int ogrsınıf) {
		super(bolno, ograd, ogrsoyad);
		this.ogrsınıf = ogrsınıf;
		ogrid=syc++;
		durum = "lisans";
	}
	

	

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public lisansogrencisi(int bolno, String ograd, String ogrsoyad) {
		super(bolno, ograd, ogrsoyad);
	}

	public int getOgrid() {
		return ogrid;
	}

	public void setOgrid(int ogrid) {
		this.ogrid = ogrid;
	}

	public int getOgrsınıf() {
		return ogrsınıf;
	}

	public void setOgrsınıf(int ogrsınıf) {
		this.ogrsınıf = ogrsınıf;
	}

	
	
	
	
	

}
