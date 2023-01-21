import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		String nomeProduto = JOptionPane.showInputDialog("PRODUTO:\n1 - CELULAR\n2 - CAPINHA\n3 - CARREGADOR\n4 - PELICULA\n\n\n");
		
		if (nomeProduto.equals("1")) {
			Celular venda1 = new Celular();
			venda1.inserirDados();
			venda1.atualizarValor(10);
			venda1.mostrar();
		} else if (nomeProduto.equals("2")) {
			Capinha venda1 = new Capinha();
			venda1.inserirDados();
			venda1.atualizarValor(10);
			venda1.mostrar();
		} else if(nomeProduto.equals("3")) {
			Carregador venda1 = new Carregador();
			venda1.inserirDados();
			venda1.atualizarValor(10);
			venda1.mostrar();
		}else if(nomeProduto.equals("4")) {
			Pelicula venda1 = new Pelicula();
			venda1.inserirDados();
			venda1.atualizarValor(10);
			venda1.mostrar();
		}
	}

}
