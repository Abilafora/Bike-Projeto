package Bike.model;

public abstract class Bikes {
	
	private int numero;
	private int modelo ;
	private String cor;
	private String marca;
	
	
	public Bikes(int numero, int modelo, String cor, String marca) {
		super();
		this.numero = numero;
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getModelo() {
		return modelo;
		
		
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	public void visualizar() {

		String modelo = "";
		
		switch(this.modelo) {
		case 1:
			modelo = "MoutBike";
		break;
		case 2:
			modelo = "Speed";
		break;
		}
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Bike:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Bike: " + this.numero);
		System.out.println("Tipo Modelo: " + modelo);
		System.out.println("Qual cor da sua bike " + this.cor);
		System.out.println("Sua Marca " + this.marca);
	}


	public static void procurarPorNumero(int numero2) {
		// TODO Auto-generated method stub
		
	}
}
