package br.com.designpatterns.builder.pagamento;

public class StartMain {

	public static void main(String[] args) {
		
		Pagamento pagamento = new Pagamento.PagamentoBuilder()
				.descricao("Pagamento do Projeto")
				.valor(200.0)
				.builder();
		
		System.out.println(pagamento.toString());
		
	}
}
