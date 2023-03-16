package application;

import java.util.ArrayList;
import java.util.List;

import entities.DadosEstado;

public class Program {

	public static void main(String[] args) {
		
		List<DadosEstado> list = new ArrayList<>();
		DadosEstado dados = new DadosEstado();
		
		DadosEstado sp = new DadosEstado("SP", 67836.43);
		DadosEstado rj = new DadosEstado("RJ", 36678.66);
		DadosEstado mg = new DadosEstado("MG", 29229.88);
		DadosEstado es = new DadosEstado("ES", 27165.48);
		DadosEstado outros = new DadosEstado("Outros", 19849.53);
		
		list.add(sp);
		list.add(rj);
		list.add(mg);
		list.add(es);
		list.add(outros);
		
		double total = dados.total(list);
		
		System.out.printf(dados.participacao(list, total));
	}

}
