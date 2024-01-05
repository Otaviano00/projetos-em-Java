
package br.com.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Emprestimo {
    private int idEmprestimo;
    private String matriculaAluno;
    private String nomeAluno;
    private String codigoLivro;
    private String nomeLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String situacao;

    public Emprestimo(int idEmprestimo, String matriculaAluno, String nomeAluno, String codigoLivro, String nomeLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao, String situacao) {
        this.idEmprestimo = idEmprestimo;
        this.matriculaAluno = matriculaAluno;
        this.nomeAluno = nomeAluno;
        this.codigoLivro = codigoLivro;
        this.nomeLivro = nomeLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.situacao = situacao;
        
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    
    public void setDataDevolucao(LocalDate data) {
        this.dataDevolucao = data;
    }
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
   
    

    public Object[] toVector() {
        String data1 = dataEmprestimo.getDayOfMonth() + "/" + dataEmprestimo.getMonthValue() + "/" + dataEmprestimo.getYear();
        String data2 = dataDevolucao.getDayOfMonth() + "/" + dataDevolucao.getMonthValue() + "/" + dataDevolucao.getYear();
        return new Object[] {idEmprestimo, matriculaAluno, nomeAluno, codigoLivro, nomeLivro, data1, data2, situacao};
    }
}
