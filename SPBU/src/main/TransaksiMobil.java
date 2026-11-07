package main;

public class TransaksiMobil extends LayananSPBU implements Pembayaran, LayananTambahan{
	public TransaksiMobil(String idTransaksi) {
		super(idTransaksi);
	}
	
	public TransaksiMobil(String idTransaksi, double jumlahLiter) {
		super(idTransaksi, jumlahLiter);
		if(getJumlahLiter() > 60.0) {
			setJumlahLiter(60.0);
			System.out.println("Peringatan (" + idTransaksi + "): Pengisian mobil dibatasi maksimal 60 liter!");
		}
	}
	
	@Override
	public void prosesIsiBensin(double uangBayar) {
		double totalHarga = getJumlahLiter() * HARGA_PER_LITER;
		if (uangBayar >= totalHarga) {
			setStatusLunas(true);
			System.out.println("Pengisian mobil berhasil! Kembalian: " + (uangBayar - totalHarga));
		} else {
			setStatusLunas(false);
			System.out.println("Pembayaran tidak cukup! Kurang: " + (totalHarga - uangBayar));
		}
	}

	@Override
	public void cetakStruk(){
		super.cetakStruk();
		System.out.println("Status Lunas: " + isStatusLunas());
		System.out.println("Jenis Kendaraan: Mobil");
	}

	@Override
	public void bayar(double uang) {
		prosesIsiBensin(uang);
	}
	
	@Override
	public void cekTekananAngin() {
		if(getJumlahLiter() == 0.0) {
			setStatusLunas(true);
		}
		System.out.println("Tekanan angin ban mobil diperiksa...");
	}
}
