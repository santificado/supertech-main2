package br.com.fiap.domain.equipamento.repository;

import br.com.fiap.domain.equipamento.model.TipoEquipamento;
import br.com.fiap.abstracao.Repository;

import java.util.Collection;

public class TipoEquipamentoRepository extends Repository {

    public static TipoEquipamento save(TipoEquipamento t){
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
        return t;
    }

    public static TipoEquipamento findById(Long id){
        return manager.find(TipoEquipamento.class, id);
    }

    public static Collection<TipoEquipamento> findAll() {
        String jpql = "From TipoEquipamento";
        return manager.createQuery(jpql).getResultList();
    }
}
