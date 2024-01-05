
package br.com.controller;

public class Multa {
    private int idMulta;
    private Emprestimo emprestimo;
    private double valorMulta;
    private boolean pago;

    public Multa(int idMulta, Emprestimo emprestimo) {
        this.idMulta = idMulta;
        this.emprestimo = emprestimo;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
  
}
