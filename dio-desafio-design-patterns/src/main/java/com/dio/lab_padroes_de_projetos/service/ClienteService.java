package com.dio.lab_padroes_de_projetos.service;

import com.dio.lab_padroes_de_projetos.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
