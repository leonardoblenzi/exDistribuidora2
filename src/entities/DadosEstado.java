package entities;

import java.util.List;

public class DadosEstado {
	private String estado;
	private Double valor;
	
	public DadosEstado() {
	}

	public DadosEstado(String estado, Double valor) {
		this.estado = estado;
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	//retorna a soma total dos valores por estado
	public double total(List<DadosEstado> list) {
		double soma = 0;
		for(int i=0; i<list.size(); i++) {
			soma += list.get(i).getValor();
		}
		return soma;
	}
	
	public String participacao(List<DadosEstado> list, double total){
		StringBuilder sb = new StringBuilder();
		for(DadosEstado dado: list){
			double part = 0;
			part = dado.getValor() / total * 100;
			sb.append("Estado: " + dado.getEstado());
			sb.append(" Participação: " + String.format("%.2f", part));
			sb.append("\n");
		}
		return sb.toString();

	}
	
	
}
