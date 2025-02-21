package Bike.controller;
import java.util.ArrayList;
import Bike.model.Bikes;
import Bike.repository.BikeRepository;

public class BikeController implements BikeRepository {
	//<tipo > 
	private ArrayList<Bikes> listarBikes = new ArrayList<Bikes>();
	int numero=0;
	
	
	@Override
	public void procurarPorNumero(int numero) {

		var bici = buscarNaCollection(numero);
		if (bici != null)
			bici.visualizar();
		else
			System.out.println("Idenentificação da bike"+ numero + "não encontrada");
	}

	@Override
	public void listarTodas() {
		for(var bicicletas : listarBikes) {
			bicicletas.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Bikes Bike) {
		listarBikes.add(Bike);
		System.out.println("\n A Bike número: " + Bike.getNumero() + "foi criada com sucesso");
		
	}

	@Override
	public void atualizar(Bikes Bike) {
		var buscarBike = buscarNaCollection(Bike.getNumero());
		
		if(buscarBike != null) {
			listarBikes.set(listarBikes.indexOf(buscarBike),Bike);
			System.out.println("\n A Bike número: " + Bike.getNumero() + "foi atualizado com sucesso");
		}else
			System.out.println("\n A Bike número: " + Bike.getNumero() + "não encontrado");
		
		
	}

	/*@Override
	public void saidaEstoque(int numero) {
	      var bike = buscarNaCollection(numero);
			
			if (bike != null) {
				int resultado = bike.saidaEstoque(numero);
				
				if(resultado > 0)
					System.out.println("\n A retida da Bike  " + numero + "do etoque foi efetuado com sucesso!");		
			
			}else
				System.out.println("\nA A bike de numero: " + numero + " não foi encontrada!");
		
	}
  */
	@Override
	public void entradaEstoque(int modelo, String cor) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Bikes buscarNaCollection(int numero) {
		//
		for (var bici : listarBikes) {
			if (bici.getNumero() == numero) {
				return bici;
			}
		}
		
		return null;
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saidaEstoque(int numero) {
		// TODO Auto-generated method stub
		
	}
	
}
