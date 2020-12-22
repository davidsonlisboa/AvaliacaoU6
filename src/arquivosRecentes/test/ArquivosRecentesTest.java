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
	
	@Test
	void EsvaziaTest() {
		ArquivosRecentes x = new ArquivosRecentes();
		String arq = "Arquivo teste";
		x.adicionaArquivo(arq);
		String arq2 = "Arquivo teste2";
		x.adicionaArquivo(arq2);
		x.esvaziaLista();
		List lista = x.getLista();
		assertTrue(lista.isEmpty());
	}
	
	@Test
	void LimiteDeArquivosTest() {
		ArquivosRecentes x = new ArquivosRecentes();
		for(int i=1;i<=11;i++) {
			x.adicionaArquivo("arq"+i);
		}
		assertEquals(10,x.getLista().size());
	}
}
