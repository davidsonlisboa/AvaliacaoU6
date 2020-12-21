package arquivosRecentes.test;

import org.junit.jupiter.api.Test;
import arquivosRecentes.ArquivosRecentes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class ArquivosRecentesTest {

	@Test
	void AtualizacaoTest(){
		ArquivosRecentes x = new ArquivosRecentes();
		boolean att1 = x.getEstado();
		x.mudaEstado();
		boolean att2 = x.getEstado();
		assertNotEquals(att1,att2);
	}

	@Test
	void AdicionaArquivoTest() {
		ArquivosRecentes x = new ArquivosRecentes();
		String arq01 = "Arquivo 01";
		x.adicionaArquivo(arq01);
		List lista = x.getLista();
		assertTrue(lista.contains(arq01));
	}


}
