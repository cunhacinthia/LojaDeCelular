import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto {
	private int id;
	private String nomeCliente;
	public double preco;
	public int quantidade;
	private double valor;
	private double valorTotal;
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	private double desconto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void inserirDados() {
	this.id = Integer.parseInt(JOptionPane.showInputDialog("Código da Venda: "));
	this.nomeCliente = JOptionPane.showInputDialog("Nome do Cliente: ");
	this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Produtos: "));
	this.desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto: "));
	}
	
	
	public double atualizarValor(double desconto) {
		this.valor += (this.preco * this.quantidade)* this.desconto / 100;
		this.valorTotal += (this.preco * this.quantidade) - this.valor;
		return this.valorTotal;
		
	}
	
	public void mostrar() {
	String mensagem = "Venda";
	mensagem += "\n Código: " + this.id;
	mensagem += "\n Nome do Cliente: " + this.nomeCliente;
	mensagem += "\n Valor do Produto: " + this.preco;
	mensagem += "\n Quantidade de Produtos: " + this.quantidade;
	mensagem += "\n Desconto: " + this.desconto;
	
	NumberFormat formatar = DecimalFormat.getCurrencyInstance();
	mensagem += "\n Valor Total: " + formatar.format(this.valorTotal);
	
	JOptionPane.showConfirmDialog(null,mensagem );
	
	}
	
	
	
	
}
