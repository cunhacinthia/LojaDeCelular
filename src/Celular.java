import javax.swing.JOptionPane;

public class Celular extends Produto {
	
	private String marca;
	private int modelo;
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	private int memoriaGB;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getMemoriaGB() {
		return memoriaGB;
	}
	public void setMemoriaGB(int memoriaGB) {
		this.memoriaGB = memoriaGB;
	}
	@Override
	public void inserirDados() {
		super.inserirDados();
		for (int i = 1; i <= this.getQuantidade(); i++) {
			this.modelo = Integer.parseInt(JOptionPane.showInputDialog("\nAPPLE:\n1 - IPHONE 14 PRO MAX\n2 - IPHONE 13 PRO MAX\n\n\nModelo: "));
			if(this.modelo ==1) {
				this.memoriaGB = Integer.parseInt(JOptionPane.showInputDialog("\nAPPLE:\n1 - IPHONE 14 PRO MAX  128GB\n2 - IPHONE 14 PRO MAX  258GB\n\n\nMemoria: "));
				if(this.memoriaGB == 1) {
					this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nAPPLE:\nIPHONE 14 PRO MAX  128GB  R$10.499,00\n\n\nValor do Produto:"));
				}else if(this.memoriaGB == 2) {
					this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nAPPLE:\nIPHONE 14 PRO MAX  258GB  R$10.999,00\n\n\nValor do Produto:"));
				}
			}else if(this.modelo == 2) {
					this.memoriaGB = Integer.parseInt(JOptionPane.showInputDialog("\nAPPLE:\n1 - IPHONE 13 PRO MAX  128GB\n2 - IPHONE 13 PRO MAX  256GB\n\n\nMemoria: "));
				if(this.memoriaGB == 1) {
					this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nAPPLE:\nIPHONE 13 PRO MAX  128GB  R$7.999,00\n\n\nValor do Produto:"));
				}else if(this.memoriaGB == 2) {
					this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nAPPLE:\nIPHONE 13 PRO MAX  256GB  R$8.499,00\n\n\nValor do Produto:"));
				}
			}
		}
	}
	@Override
	public void mostrar() {
		super.mostrar();
	}
	
	

}