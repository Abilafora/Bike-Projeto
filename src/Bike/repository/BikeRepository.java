package Bike.repository;

import Bike.model.Bikes;

public interface BikeRepository {
	

	// CRUD das Bikes
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Bikes Bike);
	public void atualizar(Bikes Bike);
	public void deletar(int numero);
	
	// Métodos 
	

	public void entradaEstoque(int modelo, String cor );
	public void saidaEstoque(int numero);

	
}
