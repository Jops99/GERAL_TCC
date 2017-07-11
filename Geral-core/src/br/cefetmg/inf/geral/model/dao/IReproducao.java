package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Reproducao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IReproducao {
    Long inserir(Reproducao reproducao) throws PersistenciaException;
    boolean atualizar(Reproducao reproducao) throws PersistenciaException;
    boolean delete(Reproducao reproducao) throws PersistenciaException;
    ArrayList<Reproducao> listarTodos() throws PersistenciaException;
    Reproducao consultarPorId(Long id) throws PersistenciaException;
}
