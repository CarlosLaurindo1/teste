package modelo;

import java.util.ArrayList;
import visualizacao.EntradaSaida;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import visualizacao.*;

public class Conta {

	private String titularDaConta;
	private int tipo;
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public ArrayList<Movimentacao> listaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}
	
	public void gerarSaldo(Movimentacao movimentacao) {
		
	}

	public void depositar(EntradaSaida titularDaConta, int tipo, double saldo) {
		double saldoFinal = 0.00;
		
		if (tipo == 1) {
			
		} else {

		}
	}

	public void sacar(String titularDaConta, int tipo, double saldo) {
		if (tipo == 1) {

		} else {

		}
	}

}
