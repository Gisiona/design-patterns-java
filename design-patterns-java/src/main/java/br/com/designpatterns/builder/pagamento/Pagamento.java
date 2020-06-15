package br.com.designpatterns.builder.pagamento;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pagamento{
	
	private UUID codigo;
	private double valor;
	private String descricao;
	private LocalDateTime dataPagamento;
	

	public UUID getCodigo() {
		return codigo;
	}

	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}
	
	private Pagamento(double valor, String descricao) {
		this.codigo = UUID.randomUUID();
		this.valor = valor;
		this.descricao = descricao;
		this.dataPagamento = LocalDateTime.now();
	}

	public static class PagamentoBuilder {
		private UUID codigo;
		private double valor;
		private String descricao;
		private LocalDateTime dataPagamento;
		
		public PagamentoBuilder() {}
		
		public PagamentoBuilder codigo() {
			this.codigo = codigo;
			return this;
		}
		
		public PagamentoBuilder valor(double valor) {
			this.valor = valor;
			return this;
		}
		
		public PagamentoBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		
		public PagamentoBuilder dataPagamento() {
			this.dataPagamento = dataPagamento;
			return this;
		}
		
		public Pagamento builder() {
			return new Pagamento(valor, descricao);
		}		
	}
	
	@Override
	public String toString() {
		return "Pagamento [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + ", dataPagamento="
				+ dataPagamento + "]";
	}

}
