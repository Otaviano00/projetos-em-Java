/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Listas {
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    ArrayList<Devolucao> devolucoes = new ArrayList<>();
    ArrayList<Multa> multas = new ArrayList<>();

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public ArrayList<Devolucao> getDevolucoes() {
        return devolucoes;
    }

    public void setDevolucoes(ArrayList<Devolucao> devolucoes) {
        this.devolucoes = devolucoes;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
    
    // Partes dos alunos
     
    public void armazenaAluno(String matricula, String nome, String serie, String situacao) {
        alunos.add(new Aluno(matricula, nome, serie, situacao));
    }
    
    public boolean removerAlunos(String matricula) {
        if ((buscaAluno(matricula) != -1) && (alunos.get(buscaAluno(matricula)).getSituacao().equals("---"))) {
            alunos.remove(buscaAluno(matricula));
            return true;
        } else {
            return false;
        }
    }
    
    public Object[] imprimeAluno(int index) {
        
        if (index != -1) {
            Object[] vetor = this.alunos.get(index).toVector();
            return new Object[] {index + 1, vetor[0], vetor[1], vetor[2], vetor[3]};
        } else {
            return new Object[4];
        }
    }
    
    public int buscaAluno(String matricula) {
        int index = -1;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                index = alunos.indexOf(aluno);
            }
        }
        return index;
    }
    
    public DefaultTableModel imprimeTodosAlunos(JTable jTtabelaAlunos) {
        
        DefaultTableModel tabela = (DefaultTableModel) jTtabelaAlunos.getModel();
    
        for (int i = 0; i < this.alunos.size(); i++) {
            tabela.addRow((imprimeAluno(i)));
        }
        
        return tabela;
        
    }
    
    // Partes dos livros
    
    public void armazenaLivro( String codigo, String nome, String autor, String situacao) {
        livros.add(new Livro(codigo, nome, autor, situacao));
    }
    
    public boolean removerLivros(String codigo) {
        if ((buscaLivro(codigo) != -1) && (livros.get(buscaLivro(codigo)).getSituacao().equals("---"))) {
            livros.remove(buscaLivro(codigo));
            return true;
        } else {
            return false;
        }
    }
    
    public Object[] imprimeLivro(int index) {
        
        if (index != -1) {
            Object[] vetor = this.livros.get(index).toVector();
            return new Object[] {index + 1, vetor[0], vetor[1], vetor[2], vetor[3]};
        } else {
            return new Object[4];
        }
    }
 
    public int buscaLivro(String codigo) {
        int index = -1;
        for (Livro livro : livros) {
            if (livro.getCodigo().equals(codigo)) {
                index = livros.indexOf(livro);
            }
        }
        return index;
    }

    public DefaultTableModel imprimeTodosLivros(JTable jTtabelaLivros) {
        
        DefaultTableModel tabela = (DefaultTableModel) jTtabelaLivros.getModel();
    
        for (int i = 0; i < this.livros.size(); i++) {
            tabela.addRow(imprimeLivro(i));
        }
        
        return tabela;
        
    }
    
    // Parte dos empréstimos

    public void armazenaEmprestimo(int idEmprestimo, String matriculaAluno, String nomeAluno, String codigoLivro, String nomeLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao, String situacao) {
        emprestimos.add(new Emprestimo(idEmprestimo, matriculaAluno, nomeAluno, codigoLivro, nomeLivro, dataEmprestimo, dataDevolucao, situacao));
    }
    
    public Object[] imprimeEmprestimo(int index) {
        
        if (index != -1) {
            Object[] vetor = this.emprestimos.get(index).toVector();
            return new Object[] {vetor[0], vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], vetor[7]};
        } else {
            return new Object[7];
        }
    }
    
    public Emprestimo devolveEmprestimo(int index) {
        if (index != -1) {
            return this.emprestimos.get(index);
        } else {
            return null;
        }
    }
    
    public int buscaEmprestimo(String matriculaAluno, String codigoLivro) {
        int index = -1;
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getMatriculaAluno().equals(matriculaAluno) && emprestimo.getCodigoLivro().equals(codigoLivro) && emprestimo.getSituacao() == "X") {
                index = emprestimos.indexOf(emprestimo);
            }
        }
        return index;
    }
    
    public DefaultTableModel imprimeTodosEmprestimos(JTable jTtabelaEmprestimos) {
        
        DefaultTableModel tabela = (DefaultTableModel) jTtabelaEmprestimos.getModel();
    
        for (int i = 0; i < this.emprestimos.size(); i++) {
            tabela.addRow(imprimeEmprestimo(i));
        }
        
        return tabela;
        
    }
    
    public void colocarSituacao(String matriculaAluno, String situacaoAluno, String codigoLivro, String situacaoLivro) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matriculaAluno)) {
                aluno.setSituacao(situacaoAluno);
                break;
            }
        }
        for (Livro livro : livros) {
            if (livro.getCodigo().equals(codigoLivro)) {
                livro.setSituacao(situacaoLivro);
                break;
            }
        }
    }
    
    // Parte das devoluções
    
    public void armazenaDevolucao(int idDevolucao, Emprestimo emprestimo, LocalDate dataDevolucao, String situacao) {
        int id = idDevolucao;
        String matriculaAluno = emprestimo.getMatriculaAluno();
        String nomeAluno = emprestimo.getNomeAluno();
        String codigoLivro = emprestimo.getCodigoLivro();
        String nomeLivro = emprestimo.getNomeLivro();
        LocalDate dataEmprestimo = emprestimo.getDataEmprestimo();
        LocalDate dataD = dataDevolucao;
        String situacao1 = situacao;
        
        devolucoes.add(new Devolucao(id, matriculaAluno, nomeAluno, codigoLivro, nomeLivro, dataEmprestimo, dataDevolucao, situacao));
    }
    
    public Object[] imprimeDevolucao(int index) {
        
        if (index != -1) {
            Object[] vetor = this.devolucoes.get(index).toVector();
            return new Object[] {vetor[0], vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6], vetor[7]};
        } else {
            return new Object[7];
        }
    }
    
    public DefaultTableModel imprimeTodosDevolucoes(JTable jTtabelaEmprestimos) {
        
        DefaultTableModel tabela = (DefaultTableModel) jTtabelaEmprestimos.getModel();
    
        for (int i = 0; i < this.devolucoes.size(); i++) {
            tabela.addRow(imprimeDevolucao(i));
        }
        
        return tabela;
        
    }
}
