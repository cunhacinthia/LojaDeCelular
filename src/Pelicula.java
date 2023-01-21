import javax.swing.JOptionPane;

public class Pelicula extends Produto {
	private int modeloPelicula;

	public int getModeloPelicula() {
		return modeloPelicula;
	}

	public void setModeloPelicula(int modeloPelicula) {
		this.modeloPelicula = modeloPelicula;
	}
	
	@Override
	public void inserirDados() {
		super.inserirDados();
		this.modeloPelicula = Integer.parseInt(JOptionPane.showInputDialog("\nPELICULA:\n1 - PRIVATIVA VIDRO 3D\n2 - VIDRO TEMPERADO\n3 - PRIVATIVA VIDRO\n\n\nModelo de pelicula: "));
		if(this.modeloPelicula == 1) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nPELICULA:\nPRIVATIVA VIDRO 3D R$79,00\n\n\nValor do produto:"));
		}else if(this.modeloPelicula == 2) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nPELICULA:\nVIDRO TEMPERADO R$ 59,00\n\n\nValor do produto:"));
		}else if(this.modeloPelicula == 3) {
			this.preco = Double.parseDouble(JOptionPane.showInputDialog("\nPELICULA:\nHIDROGEL ANTI-IMPACTO R$49,00\n\n\nValor do produto:"));
		}
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
	}

}
