
package university_administration;

import java.util.Scanner;

public class anasayfa {
	public static void menu(bolum[] bol) {
		int secim = 0;
		System.out.println("1- Tüm Bölümlerin Bilgilerini Listele\r\n" + "2- Lisans Öğrencilerini Listele\r\n"
				+ "3- Yüksek Lisans Öğrencilerini Listele\r\n" + "4- Dersleri Listele\r\n" + "5- Arama Yap\r\n"
				+ "6- Çıkış");
		Scanner veri = new Scanner(System.in);
		secim = veri.nextInt();
		switch (secim) {
		case 1:
			tumbolumlistele(bol);
			menu(bol);
			break;
		case 2:
			lisanslistele(bol);
			menu(bol);
			break;
		case 3:
			ylisanslistele(bol);
			menu(bol);
			break;
		case 4:
			derslistele(bol);
			menu(bol);
			break;
		case 5:
			aramayap(bol);
			menu(bol);
			break;
		case 6:
			System.out.println("cikis yaptınız...");
			break;
		default :
			System.out.println("yanlış seçim yaptınız...");
			menu(bol);
				

		}
	}

	private static void aramayap(bolum[] bol) {
		if(bol.length!=0)
		{
			String kelime;
			Scanner veri = new Scanner(System.in);
			System.out.println("aradıgınız kelimeyi giriniz:");
			int syc=0;
			int kontrol=0;
			kelime = veri.next();
			
			System.out.println("Ögrenciler:");
			for (int i = 0; i < bol.length; i++) 
			{
				
				for (int j = 0; j < bol[i].ogrenciler.length; j++) 
				{
					
					if((bol[i].ogrenciler[j].getOgrad()).equals(kelime) || (bol[i].ogrenciler[j].getOgrsoyad()).equals(kelime))
					{
						syc=1;
						if (bol[i].ogrenciler[j] instanceof ylogrencisi) 
						{
							ylogrencisi ylisans = (ylogrencisi) bol[i].ogrenciler[j];

							System.out.println("\t" +ylisans.getDurum()+" "+ ylisans.getOgrid() + " " + ylisans.getOgrad() + " " + ylisans.getOgrsoyad());

						}else 
						{
							lisansogrencisi lisans = (lisansogrencisi) bol[i].ogrenciler[j];

							System.out.println("\t" + lisans.getDurum()+" " + lisans.getOgrid() + " " + lisans.getOgrad() + " "+ lisans.getOgrsoyad());
						
						}
					}
						
				}
				
			}
			if(syc==0)
			{
				System.out.println("\t aranan isimde ve  soyisimde ogrenci bulunamadı");	
			}
			
			System.out.println("dersler:");
			for(int i=0;i<bol.length;i++)
			{
				
				for (int j = 0; j < bol[i].dersler.length; j++) 
				{
					if(bol[i].dersler[j].getDersad().equals(kelime))
					{
						kontrol=1;
						System.out.println("\t" +bol[i].getBolad()+ " " + bol[i].dersler[j].getDersid() + " " + bol[i].dersler[j].getDersad() + " " + bol[i].dersler[j].getDerskredi());
					}
				}
			}
			if(kontrol==0)
			{
				System.out.println("\taranan isimde ders bulunamadı");		
			}
			
		}else
		{
			System.out.println("hiç bölum yok");
		}
		
	}

	private static void derslistele(bolum[] bol) {
		if (bol.length != 0) 
		{
			System.out.println("Tum Bolumlerdeki dersler:");
			for (int i = 0; i < 10; i++) 
			{
				System.out.println("\t" + (i + 1) + " kredilik dersler");
				for (int j = 0; j < bol.length; j++)
				{
					for (int k = 0; k < bol[j].dersler.length; k++) 
					{
						if (i + 1 == bol[j].dersler[k].getDerskredi())
						{
							System.out.println("\t\t" + bol[j].dersler[k].getDersid() + " " + bol[j].dersler[k].getDersad());
						}

					}
				}
			}
		} else 
		{
			System.out.println("hiç bolum yok");
		}

	}

	private static void ylisanslistele(bolum[] bol) {
		if (bol.length != 0) 
		{
			System.out.println("Tum bölümlerdeki YuksekLisans ogrencileri:");
			for (int i = 0; i < bol.length; i++) 
			{
				for (int j = 0; j < bol[i].ogrenciler.length; j++) 
				{

					if (bol[i].ogrenciler[j] instanceof ylogrencisi) 
					{
						ylogrencisi ylisans = (ylogrencisi) bol[i].ogrenciler[j];

						System.out.println(
								"\t\t" + ylisans.getOgrid() + " " + ylisans.getOgrad() + " " + ylisans.getOgrsoyad());

					}
				}
			}
		} else 
		{
			System.out.println("hiç bölum yok");
		}

	}

	private static void lisanslistele(bolum[] bol) {
		if (bol.length != 0) 
		{
			System.out.println("Tum Bolumlerdeki Lisans Ögrencileri:");
			for (int i = 0; i < 6; i++) 
			{
				System.out.println("\t" + (i + 1) + ".Sınıf Ögrencileri:");
				for (int j = 0; j < bol.length; j++) 
				{
					for (int k = 0; k < bol[j].ogrenciler.length; k++) 
					{
						if (bol[j].ogrenciler[k] instanceof lisansogrencisi) 
						{
							lisansogrencisi lisans = (lisansogrencisi) bol[j].ogrenciler[k];

							if (lisans.getOgrsınıf() == i + 1) 
							{
								System.out.println("\t\t" + lisans.getOgrid() + " " + lisans.getOgrad() + " "
										+ lisans.getOgrsoyad());
							}
						}
					}
				}
			}
		} else 
		{
			System.out.println("hiç bölum yok");
		}

	}

	public static void tumbolumlistele(bolum[] bol) {
		if (bol.length != 0) 
		{
			for (int i = 0; i < bol.length; i++) 
			{
				System.out.println("Bolum no:" + bol[i].getBolno() + " Bolum ad:" + bol[i].getBolad());

				System.out.println("lisans ogrencileri:");
				for (int j = 0; j < bol[i].ogrenciler.length; j++) 
				{
					if (bol[i].ogrenciler[j] instanceof lisansogrencisi) 
					{
						lisansogrencisi lisans = (lisansogrencisi) bol[i].ogrenciler[j];

						System.out.println("\t" + (j + 1) + ".Ögrenci:" + lisans.getOgrid() + " " + lisans.getOgrad()
								+ " " + lisans.getOgrsoyad() + " " + lisans.getOgrsınıf());
					}
				}
				System.out.println("yukseklisans ogrencileri:");
				for (int j = 0; j < bol[i].ogrenciler.length; j++) 
				{
					if (bol[i].ogrenciler[j] instanceof ylogrencisi) 
					{
						ylogrencisi ylisans = (ylogrencisi) bol[i].ogrenciler[j];

						System.out.println("\t" + (j + 1) + ".Ögrenci:" + ylisans.getOgrid() + " " + ylisans.getOgrad()
								+ " " + ylisans.getOgrsoyad());
					}

				}
				System.out.println("Dersler:");
				for (int j = 0; j < bol[i].dersler.length; j++) 
				{
					System.out.println("\t" + (j + 1) + ".ders:" + bol[i].dersler[j].getDersid() + " "
							+ bol[i].dersler[j].getDersad() + " " + bol[i].dersler[j].getDerskredi());
				}

			}
		}else
		{
			System.out.println("hiç bölum yok");
		}

	}

	public static void main(String[] args) {
		int bolumsayisi, bolumno, lisansogr, ylisansogr, ogrsınıf, dersadet, derskredi;
		String bolumad, ograd, ogrsoyad, dersad;
		Scanner veri = new Scanner(System.in);
		System.out.println("kaç bölüm olacak ?");
		bolumsayisi = veri.nextInt();

		bolum[] bolumdizisi = new bolum[bolumsayisi];
		for (int i = 0; i < bolumsayisi; i++) 
		{

			System.out.println((i + 1) + ".bölüm no giriniz:");
			bolumno = veri.nextInt();

			System.out.println((i + 1) + ".bölüm ad giriniz:");
			bolumad = veri.next();

			bolumdizisi[i] = new bolum(bolumno, bolumad);

			System.out.println((i + 1) + ".bölümün kaç lisans ogrencisi olsun ?");
			lisansogr = veri.nextInt();
			System.out.println((i + 1) + ".bölümün kaç yuksek lisans ogrencisi olsun ?");
			ylisansogr = veri.nextInt();

			bolumdizisi[i].ogrenciler = new ogrenci[lisansogr + ylisansogr];

			for (int j = 0; j < lisansogr; j++) 
			{
				System.out.println((j + 1) + ".lisans ogrencisinin ad giriniz:");
				ograd = veri.next();

				System.out.println((j + 1) + ".lisans ogrencisinin soyad giriniz:");
				ogrsoyad = veri.next();

				System.out.println((j + 1) + ".lisans ogrencisinin sınıf  giriniz:");
				ogrsınıf = veri.nextInt();
				bolumdizisi[i].ogrenciler[j] = new lisansogrencisi(bolumno, ograd, ogrsoyad, ogrsınıf);
			}
			int a = 0;
			for (int j = lisansogr; j < lisansogr + ylisansogr; j++) 
			{
				a++;
				System.out.println((a) + ".yukseklisans ogrencisinin ad giriniz:");
				ograd = veri.next();

				System.out.println((a) + ".yukseklisans ogrencisinin soyad giriniz:");
				ogrsoyad = veri.next();

				bolumdizisi[i].ogrenciler[j] = new ylogrencisi(bolumno, ograd, ogrsoyad);
			}
			System.out.println((i + 1) + ".bölümün kaç dersi olsun ?");
			dersadet = veri.nextInt();

			bolumdizisi[i].dersler = new ders[dersadet];
			for (int j = 0; j < dersadet; j++) 
			{
				System.out.println((j + 1) + ".dersin adını giriniz:");
				dersad = veri.next();

				System.out.println((j + 1) + ".dersin kredisini giriniz:");
				derskredi = veri.nextInt();

				bolumdizisi[i].dersler[j] = new ders(bolumno, derskredi, dersad);

			}

		}
		menu(bolumdizisi);

	}

}
