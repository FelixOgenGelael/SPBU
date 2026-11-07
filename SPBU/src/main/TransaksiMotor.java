package main;

public class TransaksiMotor extends LayananSPBU implements Pembayaran{
	TransaksiMotor(String idTransaksi){
		super(idTransaksi);
	}
	
	@Override
	public void prosesIsiBensin(double uangBayar) {
		double totalHarga = getJumlahLiter() * HARGA_PER_LITER;
		if (uangBayar >= totalHarga) {
			setStatusLunas(true);
			System.out.println("Pengisian bensin motor berhasil! Kembalian: " + (uangBayar - totalHarga));
		} else {
			setStatusLunas(false);
			System.out.println("Pembayaran tidak cukup! Kurang: " + (totalHarga - uangBayar));
		}
	}
	
	@Override
	public void cetakStruk(){
		super.cetakStruk();
		System.out.println("Status Lunas: " + isStatusLunas());
		System.out.println("Jenis Kendaraan: Motor");
	}

	@Override
	public void bayar(double uang) {
		prosesIsiBensin(uang);
	}
}
