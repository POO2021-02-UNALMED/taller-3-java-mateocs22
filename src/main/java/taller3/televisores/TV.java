package taller3.televisores;

public class TV {
	
	private static int numTv;
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado= estado;
		numTv ++ ;
	}
	
	public void turnOn() {
		this.estado = true; 
	}
	
	public void turnOff() {
		this.estado = false; 
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;	
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120 && estado == true) {
			this.canal = canal;
		}
	}
	 
	public int getCanal() {
		 return canal;
	 }
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if (volumen >= 0 && canal <= 7 && estado == true) {
			this.volumen = volumen;
		}
	}
	
	public int getVolumen() {
		return volumen; 
	}
	
	public void setControl(Control control) {
		this.control= control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (canal < 120 && estado == true) {
			canal++; 
		}
	}
	
	public void canalDown() {
		if (canal > 1 && estado == true) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (volumen < 7 && estado == true){
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (volumen > 0 && estado == true) {
			volumen--;
		}
	}

}
