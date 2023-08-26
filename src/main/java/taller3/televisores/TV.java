package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTv;
	
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (canal < 1 || canal > 120){
			return;
		}
		this.canal = canal;
	}


	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (volumen < 0 || volumen > 7){
			return;
		}
		this.volumen = volumen;
	}


	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	

	public int getNumTv() {
		return numTv;
	}
	
	public void setNumTv(int numTv) {
		TV.numTv = numTv;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		canal++;
	}
	
	public void canalDown() {
		canal--;
	}
	
	public void volumenUp() {
		volumen++;
	}
	
	public void volumenDown() {
		volumen--;
	}
	
}
