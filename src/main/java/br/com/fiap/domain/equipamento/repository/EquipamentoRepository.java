package br.com.fiap.domain.equipamento.repository;

import br.com.fiap.abstracao.Repository;
import br.com.fiap.domain.equipamento.model.Equipamento;

import java.util.Collection;
import java.util.List;

public class EquipamentoRepository extends Repository {

    public static Equipamento save(Equipamento e){
        var tipo =e.getTipo();
        if(tipo != null){
            tipo = TipoEquipamentoRepository.findById(tipo.getId());
        }


        manager.getTransaction().begin();
        e.setTipo(tipo);
        manager.persist(e);
        manager.getTransaction().commit();

        return e;
    }
    public static Equipamento findByID(Long id){
        return manager.find(Equipamento.class, id);
    }

    public static List<?> findall(){
        String jpql = "From Equipamento";
        return manager.createQuery(jpql).getResultList();
    }
}
