package meu.projeto;

public class DesafioUm {

	public static void main(String[] args) {

		int quantidadeEstoque = 3;
		double valorDoProduro = 10.50;
		int quantidadeDeCompra = 8;
		double valorDaCompra = valorDoProduro * quantidadeDeCompra;
		double saldoDoClinte = 500;

		if (quantidadeEstoque >= quantidadeDeCompra) {
			
			if(saldoDoClinte >= valorDaCompra) {
				System.out.println("Compra realizada com sucesso");
				saldoDoClinte = saldoDoClinte - valorDaCompra;
				quantidadeEstoque = quantidadeEstoque - quantidadeDeCompra;
			
				
			} else {
				System.out.println("Valor da compra maior que seu saldo :(");
			}
			
		} else {

			System.err.println("Quantidade não disponível, estoque atual: " + quantidadeEstoque + ".");

		}
			
		System.out.println("Saldo atualizado: " + saldoDoClinte);
		System.out.println("Quantidade no estoque: " + quantidadeEstoque);
		
	}

}
