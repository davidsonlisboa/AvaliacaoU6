package arquivosRecentes;

import java.util.ArrayList;
import java.util.List;

public class ArquivosRecentes {

private boolean att;
private List lista;


public ArquivosRecentes() {
	att = true;
	lista = new ArrayList <String> ();
}

//Nesse caso, o maximo sao 10 elementos na lista
public void adicionaArquivo(String arq) {
	if(lista.contains(arq)) {
		lista.remove(arq);
		lista.add(0, arq);
	}
	else {
		if(lista.size()==10){
			lista.remove(9);
		}
		lista.add(0,arq);
	}
	
}
	
public void esvaziaLista() {
	lista.clear();
}

public void mudaEstado() {
	if(att == true) {
		att = false;
	}
	else {
		att = true;
	}
}

public Boolean getEstado() {
	return att;
}

public List getLista() {
	return lista;
}

}
