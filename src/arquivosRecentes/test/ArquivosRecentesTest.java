package arquivosRecentes.test;

import org.junit.jupiter.api.Test;
import arquivosRecentes.ArquivosRecentes;
import static org.junit.jupiter.api.Assertions.*;


public class ArquivosRecentesTest {

	@Test
	void AtualizacaoTest(){
		ArquivosRecentes x = new ArquivosRecentes();
		boolean att1 = x.getEstado();
		x.mudaEstado();
		boolean att2 = x.getEstado();
		assertNotEquals(att1,att2);
	}



}
