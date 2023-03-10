package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	private static final boolean FALSE = false;

	public static int solicitarOpcoes() {
		String[] opcoes = { "Cadatrar conta", "Movimentar conta", "Relatórios e consultas", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static String solicitarTitular() {
		String titular = JOptionPane.showInputDialog("Informe o nome do titular da conta: ");
		return titular;
	}

	public static int solicitarTipoConta() {
		int tipoConta;
		do {
			tipoConta = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o tipo da conta (1 - Corrente, 2 - Poupança): "));
		} while ((tipoConta < 1) && (tipoConta > 2));

		return tipoConta;
	}

	public static String solicitarDataTransacao() {
		String data = JOptionPane.showInputDialog("Data da transação: ");

		return data;
	}

	public static int solicitarTipoTransacao() {
		String[] transacao = { "Depositar", "Sacar", "Voltar ao menu anterior" };
		JComboBox<String> tipoTransacao = new JComboBox<String>(transacao);
		JOptionPane.showConfirmDialog(null, tipoTransacao, "Tipo transação", JOptionPane.OK_CANCEL_OPTION);
		return tipoTransacao.getSelectedIndex();
	}

	public static int solicitarDiaTransacao() {
		String[] dia = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15","16","17","18","19" };
		JComboBox<String> diaTransacao = new JComboBox<String>(dia);
		JOptionPane.showConfirmDialog(null, diaTransacao, "Tipo transação", JOptionPane.OK_CANCEL_OPTION);
		return diaTransacao.getSelectedIndex();
	}

	public static int solicitarMesTransacao() {
		String[] mes = { "Depositar", "Sacar", "Voltar ao menu anterior" };
		JComboBox<String> mesTransacao = new JComboBox<String>(mes);
		JOptionPane.showConfirmDialog(null, mesTransacao, "Tipo transação", JOptionPane.OK_CANCEL_OPTION);
		return mesTransacao.getSelectedIndex();
	}

	public static int solicitarAnoTransacao() {
		String[] ano = { "Depositar", "Sacar", "Voltar ao menu anterior" };
		JComboBox<String> anoTransacao = new JComboBox<String>(ano);
		JOptionPane.showConfirmDialog(null, anoTransacao, "Tipo transação", JOptionPane.OK_CANCEL_OPTION);
		return anoTransacao.getSelectedIndex();
	}

	public static int confirmarRelatorio() {
		String[] relatorio = { "Dados da conta", "Saldo", "Extrato completo", "Extrato de entrada",
				"Extrato de saídas" };
		JComboBox<String> tipoRelatorio = new JComboBox<String>(relatorio);
		JOptionPane.showConfirmDialog(null, tipoRelatorio, "Tipo relatório", JOptionPane.OK_CANCEL_OPTION);
		return tipoRelatorio.getSelectedIndex();
	}

	public static double solicitarValorTransacao() {
		double valorTransacao;

		valorTransacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da transação: "));

		return valorTransacao;
	}

	public static double confirmarValorDepositoInicial() {
		double valorTransacaoEntrada = 0.00;
		int confDepositoinicial;

		confDepositoinicial = Integer
				.parseInt(JOptionPane.showInputDialog("Deseja realizar depósito inicial? (1 - Sim, 2 - Não): "));
		while ((confDepositoinicial < 1) || (confDepositoinicial > 2)) {
			JOptionPane.showMessageDialog(null,
					"Transação selecionada é inválida! \n Deseja realizar depósito inicial? (1 - Sim, 2 - Não): ");
		}

		if (confDepositoinicial == 1) {
			valorTransacaoEntrada = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da transação: "));
		} else if (confDepositoinicial == 2) {
			valorTransacaoEntrada = 0.00;
		}

		return valorTransacaoEntrada;
	}

}
