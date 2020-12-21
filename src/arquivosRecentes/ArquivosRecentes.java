package arquivosRecentes;

import java.util.ArrayList;
import java.util.List;

public class ArquivosRecentes {

private boolean att;
private List lista;


public ArquivosRecentes() {
	att = false;
	lista = new ArrayList <String> ();
}
	
public void adicionaArquivo(String arq) {
	lista.add(arq);
}	

//Nesse caso, o maximo sao 10 elementos na lista
public void removeAntigo() {
	
}
	
public void esvaziaLista() {
	
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
