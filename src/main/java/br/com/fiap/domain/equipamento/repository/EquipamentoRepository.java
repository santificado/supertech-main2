package br.com.fiap.domain.equipamento.repository;

import br.com.fiap.abstracao.Repository;
import br.com.fiap.domain.equipamento.model.Equipamento;

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
}
