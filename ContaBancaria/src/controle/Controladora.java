package controle;

import modelo.Conta;
import visualizacao.*;

import javax.swing.JOptionPane;

import modelo.*;

public class Controladora {
	public void exibeMenu() {
		int opcao;
		int transacao;
		int relatorio;

		do {
			opcao = EntradaSaida.solicitarOpcoes();
			switch (opcao) {
			case 0:
				EntradaSaida.solicitarTitular();
				EntradaSaida.solicitarDataTransacao();
				EntradaSaida.solicitarTipoConta();
				EntradaSaida.confirmarValorDepositoInicial();
				break;
			case 1:
				transacao = EntradaSaida.solicitarTipoTransacao();
				switch (transacao) {
				case 0:
					JOptionPane.showMessageDialog(null, "Opção selecionada: Depósito.");
					EntradaSaida.solicitarDataTransacao();
					EntradaSaida.solicitarValorTransacao();
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Opção selecionada: Saque.");
					EntradaSaida.solicitarDataTransacao();
					EntradaSaida.solicitarValorTransacao();
					break;
				case 2:
				}
				break;
			case 2:
				relatorio = EntradaSaida.confirmarRelatorio();
				switch (relatorio) {
				case 0:

					break;
				case 1:
					break;

				case 2:
					break;

				case 3:
					break;
				}
				break;
			case 3:
				System.exit(0);
				break;
			}
		} while (opcao != 2);
		// EntradaSaida.exibeMsgEncerraPrograma();

	}

}
