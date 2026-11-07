package main;

public abstract class LayananSPBU {
	public static final double HARGA_PER_LITER = 10000.0;
	
	private final String idTransaksi;
	
	private double jumlahLiter;
	private boolean statusLunas;
	
	public LayananSPBU(String idTransaksi) {
		this.idTransaksi = idTransaksi;
		this.jumlahLiter = 0.0;
		this.statusLunas = false;
	}
	
	public LayananSPBU(String idTransaksi, double jumlahLiter) {
		this.idTransaksi = idTransaksi;
		this.jumlahLiter = jumlahLiter;
		this.statusLunas = false;
	}
	
	public abstract void prosesIsiBensin(double uangBayar);
	
	public void cetakStruk() {
		System.out.println("ID Transaksi: " + idTransaksi);
		System.out.println("Jumlah Liter: " + jumlahLiter);
	}
	
	public String getIdTransaksi() {
		return idTransaksi;
	}

	public double getJumlahLiter() {
		return jumlahLiter;
	}
	public void setJumlahLiter(double jumlahLiter) {
		this.jumlahLiter = jumlahLiter; 
	}
	
	public boolean isStatusLunas() {
		return statusLunas;
	}
	public void setStatusLunas(boolean statusLunas) {
		this.statusLunas = statusLunas;
	}
}