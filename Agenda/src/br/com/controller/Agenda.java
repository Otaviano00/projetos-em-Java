
package br.com.controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Agenda {
    private ArrayList<Contato> agenda = new ArrayList<>();
    private ArrayList<Contato> contApagados = new ArrayList<>();

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Contato> getContApagados() {
        return contApagados;
    }

    public void setContApagados(ArrayList<Contato> contApagados) {
        this.contApagados = contApagados;
    }
    
    public void armazenaPessoa(String nome, Integer telefone, String email) {
        this.agenda.add(new Contato(nome, telefone, email));
    }
    
    public boolean removePessoa(String nome) {
        if (buscaPessoa(nome) == -1) {        
            return false;
        } else {
            contApagados.add(this.agenda.get(buscaPessoa(nome)));
            this.agenda.remove(buscaPessoa(nome));    
            return true;
        }
    }
    
    public int buscaPessoa(String nome) {        
        int index = -1;
        for (Contato contato : agenda) {
            if (contato.getNome().equals(nome)) {
                index = agenda.indexOf(contato);
            }
        }
        return index;
    }
    
    public Object[] imprimeApagado(int index) {
        Object[] vetor = this.contApagados.get(index).toVector();
        return new Object[] {index + 1, vetor[0], vetor[1], vetor[2] };
    }
    
    public DefaultTableModel imprimeAgenda(JTable jTable1) {
        DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
    
        for (int i = 0; i < this.agenda.size(); i++) {
            tabela.addRow(imprimePessoa(i));
        }
        
        return tabela;
    
    }
    
    public Object[] imprimePessoa(int index) {
        
        if (index != -1) {
            Object[] vetor = this.agenda.get(index).toVector();
            return new Object[] {index + 1, vetor[0], vetor[1], vetor[2] };
        } else {
            return new Object[4];
        }
    }
}
