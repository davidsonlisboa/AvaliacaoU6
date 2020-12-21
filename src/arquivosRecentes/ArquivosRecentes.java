package arquivosRecentes;

public class ArquivosRecentes {

private boolean Atualizacao;
	
public void adicionaPrograma() {
	
}	

public void removeAntigo() {
	
}
	
public void esvaziaLista() {
	
}

public void mudaEstado() {
	if(Atualizacao == true) {
		Atualizacao = false;
	}
	else {
		Atualizacao = true;
	}
}

public Boolean getEstado() {
	return Atualizacao;
}



}
