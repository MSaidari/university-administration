
package university_administration;

public class ylogrencisi extends ogrenci{
	private int ogrid;
	private String durum;
	public static int syc=0;
	
	public ylogrencisi(int bolno, String ograd, String ogrsoyad, int ogrid, String durum) {
		super(bolno, ograd, ogrsoyad);
		this.ogrid = ogrid;
		this.durum = durum;
		ogrid=syc++;
		durum="yukseklisans";
	}

	public ylogrencisi(int bolno, String ograd, String ogrsoyad) {
		super(bolno, ograd, ogrsoyad);
		ogrid=syc++;
		durum="yukseklisans";
	}

	public int getOgrid() {
		return ogrid;
	}

	public void setOgrid(int ogrid) {
		this.ogrid = ogrid;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}
	
	
	
}
