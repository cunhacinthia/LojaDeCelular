import javax.swing.JOptionPane;

public class Capinha extends Produto {
	
	private int modeloCelular;
	private int modeloCapinha;
	
	
	public int getModeloCelular() {
		return modeloCelular;
	}

	public void setModeloCelular(int modeloCelular) {
		this.modeloCelular = modeloCelular;
	}

	public int getModeloCapinha() {
		return modeloCapinha;
	}

	public void setModeloCapinha(int modeloCapinha) {
		this.modeloCapinha = modeloCapinha;
	}

	@Override
	public void inserirDados() {
		super.inserirDados();
		this.modeloCelular = Integer.parseInt(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\n1 - IPHONE 14 PRO MAX\n2 - IPHONE 13 PRO MAX\n\n\nModelo do celular: "));
		if(this.modeloCelular == 1) {
			this.modeloCapinha = Integer.parseInt(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\n1 - SILICONE SLIM EMBORRACHADA\n2 - ACRÍLICO TRANSPARENTE\n3 - CASE ANTI IMPACTO\n\n\nModelo capinha: "));
			if(this.modeloCapinha == 1) {
				this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\nSILICONE SLIM EMBORRACHADA R$50,00\n\n\nValor do Produto:"));
			}else if(this.modeloCapinha == 2) {
				this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\nACRÍLICO TRANSPARENTE R$30,00\n\n\nValor do Produto:"));
			}else if(this.modeloCapinha == 3) {
				this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\nCASE ANTI IMPACTO R$40,00\n\n\nValor do Produto:"));
			}
		}else if(this.modeloCelular == 2) {
			this.modeloCapinha = Integer.parseInt(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\n1 - SILICONE SLIM EMBORRACHADA\n2 - ACRÍLICO TRANSPARENTE\n3 - CASE ANTI IMPACTO\n\n\nModelo capinha: "));
			if(this.modeloCapinha == 1) {
				this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\nSILICONE SLIM EMBORRACHADA R$50,00\n\n\nValor do Produto:"));
			}else if(this.modeloCapinha == 2) {
				this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\nACRÍLICO TRANSPARENTE R$30,00\n\n\nValor do Produto:"));
			}else if(this.modeloCapinha == 3) {
				this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nCAPINHAS DA APPLE:\nCASE ANTI IMPACTO R$40,00\n\n\nValor do Produto:"));
			}
		}
	}
	@Override
	public void mostrar() {
		super.mostrar();
	}
	
	
}
