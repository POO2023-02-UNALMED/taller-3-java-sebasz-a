package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void canalUp() {
		if (tv.estado == false) {
			return;
		}
		else if (tv.canal == 120) {
			return;
		}
		tv.canal++;
	}
	
	public void canalDown() {
		if (tv.estado == false) {
			return;
		}
		else if (tv.canal == 1) {
			return;
		}
		tv.canal--;
	}
	
	public void volumenUp() {
		if (tv.estado == false) {
			return;
		}
		else if (tv.volumen == 7) {
			return;
		}
		tv.volumen++;
	}
	
	public void volumenDown() {
		if (tv.estado == false) {
			return;
		}
		else if (tv.volumen == 0) {
			return;
		}
		tv.volumen--;
	}
	
	public void setCanal(int canal) {
		if(tv.estado == false) {
			return;
		}
		else if (canal < 1 || canal > 120) {
			return;
		}
		tv.canal = canal;
	}
	
	public void setVolumen(int volumen) {
		if (tv.estado == false) {
			return;
		}
		else if (volumen < 0 || volumen > 7) {
			return;
		}
		tv.volumen = volumen;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
}
