package br.com.hello.repository;

import java.util.List;

public interface IRepository<T> { //Generics
	
	public void save(T tipo); //inserir dados
	public void delete (Integer id); // excluir dados
	public List<T> findAll(); // buscar todos
	public T findById(Integer id); // buscar por ID
	public void update(T tipo); // atualizar
	
	

}
