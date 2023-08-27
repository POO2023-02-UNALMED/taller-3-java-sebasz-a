package taller3.televisores;

public class TV {
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
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
		if (this.estado == false){
			return;
		}
		else if (canal < 1 || canal > 120){
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
		if (this.estado == false){
			return;
		}
		else if (volumen < 0 || volumen > 7){
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
	

	public static int getNumTV() {
		return numTv;
	}
	
	public static void setNumTV(int numTv) {
		TV.numTv = numTv;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTv++;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if (this.estado == false){
			return;
		}
		else if (this.canal == 120){
			return;
		}
		canal++;
	}
	
	public void canalDown() {
		if (this.estado == false){
			return;
		}
		else if (this.canal == 0){
			return;
		}
		canal--;
	}
	
	public void volumenUp() {
		if (this.estado == false){
			return;
		}
		else if (this.volumen == 7){
			return;
		}
		volumen++;
	}
	
	public void volumenDown() {
		if (this.estado == false){
			return;
		}
		else if (this.volumen == 0){
			return;
		}
		volumen--;
	}
}
