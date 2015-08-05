package target;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.isaiasdrocha.business.PartidaImpl;
import br.com.isaiasdrocha.domain.Jogador;
import br.com.isaiasdrocha.enuns.EnumNivelDesafio;
import br.com.isaiasdrocha.enuns.EnumStatusJogo;
import br.com.isaiasdrocha.exception.BusinessException;

public class PartidaTest {

	private static Jogador jogador;
	private static PartidaImpl partida;

	@BeforeClass
	public static void init() {
		partida = new PartidaImpl();
	}

	/*****************************************************/
	/********************** SUCESSO **********************/
	/*****************************************************/
	@Test
	public void iniciarJogoSucesso() {
		jogador = new Jogador("Fulano", EnumNivelDesafio.FACIL);
		partida.iniciarJogo(jogador);
		assertEquals(EnumStatusJogo.JOGANDO, partida.getStatusJogo(jogador));
	}

	/*****************************************************/
	/******************* ERROS JOGADOR *******************/
	/*****************************************************/
	@Test
	public void testIniciarJogoErroJogadorNaoInstanciado() {
		try {
			jogador = null;
			partida.iniciarJogo(jogador);
			assertEquals(EnumStatusJogo.PARADO, partida.getStatusJogo(jogador));
		} catch (BusinessException bE) {
			assertTrue("ERRO: Jogador n‹o instanciado".equals(bE.getMessage()));
		}
	}

	@Test
	public void testIniciarJogoErroNomeJogadorNaoInformado() {
		try {
			jogador = new Jogador("", EnumNivelDesafio.FACIL);
			partida.iniciarJogo(jogador);
			assertEquals(EnumStatusJogo.PARADO, partida.getStatusJogo(jogador));
		} catch (BusinessException bE) {
			assertTrue("ERRO: Nome do jogador n‹o informado".equals(bE.getMessage()));
		}
	}
	
	@Test
	public void testIniciarJogoErroNomeJogadorNulo() {
		try {
			jogador = new Jogador(null, EnumNivelDesafio.FACIL);
			partida.iniciarJogo(jogador);
			assertEquals(EnumStatusJogo.PARADO, partida.getStatusJogo(jogador));
		} catch (BusinessException bE) {
			assertTrue("ERRO: Nome do jogador n‹o informado".equals(bE.getMessage()));
		}
	}
	
	@Test
	public void testIniciarJogoErroNivelDesafioNaoInformado() {
		try {
			jogador = new Jogador("Pedro", null);
			partida.iniciarJogo(jogador);
			assertEquals(EnumStatusJogo.PARADO, partida.getStatusJogo(jogador));
		} catch (BusinessException bE) {
			assertTrue("ERRO: N’vel de desafio do jogador n‹o foi informado".equals(bE.getMessage()));
		}
	}
	
	@Test
	public void testGetStatusJogoParadoPorErro() {
		try {
			jogador = new Jogador("Pedro", null);
			partida.iniciarJogo(jogador);
		} catch (BusinessException bE) {
			assertEquals(EnumStatusJogo.PARADO, partida.getStatusJogo(jogador));
		}
	}

}