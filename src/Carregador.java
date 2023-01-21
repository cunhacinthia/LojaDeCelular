import javax.swing.JOptionPane;

public class Carregador extends Produto {
	private int modeloCarregador;

	public int getModeloCarregador() {
		return modeloCarregador;
	}

	public void setModeloCarregador(int modeloCarregador) {
		this.modeloCarregador = modeloCarregador;
	}
	
	@Override
	public void inserirDados() {
		super.inserirDados();
		this.modeloCarregador = Integer.parseInt(JOptionPane.showInputDialog("\nCARREGADOR APPLE:\n1 - CARREGADOR MAGSAFE\n2 - FONTE APPLE USB-C\n3 - CABO LIGHTNING USB-C\n4 - FONTE/CABO USB-C\n\n\nModelo do carregador: "));
		if(this.modeloCarregador == 1) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCARREGADOR APPLE:\nCARREGADOR MAGSAFE R$199,00\n\n\nValor do produto:"));
		}else if(this.modeloCarregador == 2) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCARREGADOR APPLE:\nFONTE APPLE USB-C 20W R$99,00\n\n\nValor do produto:"));
		}else if(this.modeloCarregador == 3) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCARREGADOR APPLE:\nCABO LIGHTNING USB-C R$99,00\n\n\nValor do produto:"));
		}else if(this.modeloCarregador == 4) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCARREGADOR APPLE:\nFONTE/CABO USB-C R$189,00\n\n\nValor do produto:"));
		}
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
	}
	
}
