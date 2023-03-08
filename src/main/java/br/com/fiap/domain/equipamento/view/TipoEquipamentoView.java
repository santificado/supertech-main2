package br.com.fiap.domain.equipamento.view;

import br.com.fiap.domain.equipamento.model.TipoEquipamento;

import javax.swing.*;

public class TipoEquipamentoView {

    public static TipoEquipamento showForm(TipoEquipamento t) {
        var tipo = new TipoEquipamento();


        String nome= JOptionPane.showInputDialog("Tipo Equipamento", t == null?"": t.getNome());

        tipo.setNome(nome).setId(t==null?null:t.getId());

        return tipo;
    }
}
