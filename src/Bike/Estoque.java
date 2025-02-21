package Bike;


import java.io.IOException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;
import Bike.model.Bikes;
import Bike.controller.BikeController;
import Bike.model.BikeSpeed;
import Bike.model.BikeTrilha;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =new Scanner(System.in);
		BikeController bicicletas = new BikeController();
		
		int numero, modelo;
		String marca,quadro,cor, pneu;
		
		Bikes t1 = new BikeSpeed(123, 452, "Azul", "Scoot", "perelli");
		t1.visualizar();
		
		Bikes s1 = new BikeTrilha(995, 700, "Prata", "Canondate","Quadro48");
		s1.visualizar();
		
		
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 Estoque Bike Abi <3                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Nova Bike  (entrada de estoque)      ");
			System.out.println("            2 - Listar todas as Bikes                ");
			System.out.println("            3 - Consultar Bike por número            ");
			System.out.println("            4 - Atualizar Dados da Bike              ");
			System.out.println("            5 - Apagar produto               ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			
			try {
				opcao = leia.nextInt();
			}catch(AnnotationTypeMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nLojas de Bike da Abi, aqui a aventura começa");
				
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(" Nova Bike  (entrada de estoque");
					
					System.out.println(" Digite o numero de identificação da Bike");
					numero=leia.nextInt();
					
					System.out.println(" Digite o marca:\n");
					marca = leia.nextLine();
					
					System.out.println(" Digite a cor do produto");
					cor = leia.nextLine();
					
					do {
					System.out.println(" Digite o modelo de bike (1 para bike de trilha ou 2 para bike Speed):");
					modelo = leia.nextInt();
					
					}while (modelo < 1 && modelo > 2);
					
					
					switch(modelo) {
						case 1 : {
							System.out.println("Digite o qual é o quadro ");
							quadro = leia.nextLine();
							bicicletas.cadastrar(new BikeTrilha(bicicletas.gerarNumero(),modelo,cor, marca, quadro));
							}
						case 2 : {
							System.out.println("Digite qual o tipo de pneu");
							pneu =leia.nextLine();
							bicicletas.cadastrar(new BikeSpeed(bicicletas.gerarNumero(), modelo,cor, marca, pneu));
						}
					}
					
					keyPress();

					break;
				case 2:
					System.out.println("Listar todas as Bikes \n");
					bicicletas.listarTodas();
					
					keyPress();
					
					break;
				case 3:
					System.out.println("Consultar Bike por número");
					
					System.out.println("Digite o número de identificação da Bike ID: ");
					numero = leia.nextInt();
					
					bicicletas.procurarPorNumero(numero);
					
					keyPress();

					break;
				case 4:
					System.out.println("Atualizar dados da Bike");
					
					System.out.println("Digite o número de identificação da bike: ");
					numero = leia.nextInt();
					
					var buscaBike = bicicletas.buscarNaCollection(numero);

					if (buscaBike != null) {
						
						System.out.println("Digite o Numero de identificação da Bike: ");
						numero =leia.nextInt();
						
						System.out.println("Digite a cor da  Bike: ");
						cor =leia.nextLine();
						
						System.out.println("Digite a marca da Bike: ");
						marca =leia.nextLine();
						
						modelo = buscaBike.getModelo();
						
						switch(modelo) {
						case 1 -> {
							System.out.println("Digite o tipo de Pneu  ");
							pneu= leia.nextLine();
							bicicletas.atualizar(new BikeSpeed(numero,modelo,cor, marca, pneu));
						}
						case 2 -> {
							System.out.println("Digite o modelo do quadro: ");
							quadro= leia.nextLine();
							bicicletas.atualizar(new BikeTrilha(numero,modelo,cor, marca, quadro));
						}
						default ->{
							System.out.println("Tipo de Bike inválida");
						}
					}
					
				}else
					System.out.println("\nConta não encontrada!");
					
					keyPress();

					break;
				case 5:
					
					System.out.println("Apagar a Produto\n");
					
					System.out.println("Digite o número de identificação do produto: ");
					numero = leia.nextInt();
						
					bicicletas.deletar(numero);
					
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
			
			
		}
		
	}

    public static void keyPress() {

		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
	
}

