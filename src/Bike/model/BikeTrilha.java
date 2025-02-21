package Bike.model;

public class BikeTrilha extends Bikes {

	private String quadro;
	
	public BikeTrilha(int numero, int modelo, String cor, String marca,String quadro) {
		super(numero, modelo, cor, marca);
		
		this.quadro = quadro;
		
	}

	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Aniversário da conta: " + this.quadro);
	 }
	
}
