package Bike.model;

public class BikeSpeed extends Bikes {
	
	private String pneu ;

	public BikeSpeed(int numero, int modelo, String cor, String marca, String pneu) {
		super(numero, modelo, cor, marca);
		this.pneu = pneu;
	}

	public String getPneu() {
		return pneu;
	}

	public void setPneu(String pneu) {
		this.pneu = pneu;
	}
	
	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Aniversário da conta: " + this.pneu);
	 }
}
