package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Informasi: Harga per Liter = Rp" + LayananSPBU.HARGA_PER_LITER + "\n");
		
		Pembayaran motor1 = new TransaksiMotor("TRX-0001", 20.0);
		
		motor1.bayar(50000.0);
		motor1.bayar(200000.0);
		
		LayananSPBU motor = (LayananSPBU) motor1;
		System.out.println("\n[Struk Motor]");
		motor.cetakStruk();
		
		Pembayaran mobil1 = new TransaksiMobil("TRX-0002");
		
		LayananSPBU mobil = (LayananSPBU) mobil1;
		mobil.setJumlahLiter(40.0);
		
		mobil1.bayar(300000.0);
		mobil1.bayar(450000.0);
		System.out.println("\n[Struk Mobil]");
		mobil.cetakStruk();
		
		LayananTambahan layananMobil = (LayananTambahan) mobil;
		layananMobil.cekTekananAngin();
	}

}
