import static org.junit.Assert.*;

import org.junit.Test;

public class checkWinnerTest {
//Aqui probaremos si todos las combinaciones funcionan correctamente
	@Test
	public void PapelTijeraTest() {
		String papel="PAPEL";
		String tijera="TIJERA";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(papel,tijera),m.PIERDE);
	}
	@Test
	public void PapelPiedraTest() {
		String papel="PAPEL";
		String piedra="PIEDRA";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(papel,piedra),m.GANA);
	}
	@Test
	public void PapelLagartoTest() {
		String papel="PAPEL";
		String lagarto="LAGARTO";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(papel,lagarto),m.PIERDE);
	}
	@Test
	public void PapelSpockTest() {
		String papel="PAPEL";
		String spock="SPOCK";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(papel,spock),m.GANA);
	}
	@Test
	public void PiedraTijeraTest() {
		String piedra="PIEDRA";
		String tijera="TIJERAS";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(piedra,tijera),m.GANA);
	}
	@Test
	public void PiedraLagartoTest() {
		String piedra="PIEDRA";
		String lagarto="LAGARTO";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(piedra,lagarto),m.GANA);
	}
	@Test
	public void PiedraSpockTest() {
		String piedra="PIEDRA";
		String spock="SPOCK";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(piedra,spock),m.PIERDE);
	}
	@Test
	public void TijeraLagartoTest() {
		String tijera="TIJERAS";
		String lagarto="LAGARTO";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(tijera,lagarto),m.GANA);
	}
	@Test
	public void TijeraSpockTest() {
		String tijera="TIJERAS";
		String spock="SPOCK";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(tijera,spock),m.PIERDE);
	}
	@Test
	public void LagartoSpockTest() {
		String lagarto="LAGARTO";
		String spock="SPOCK";
		MoveWords m= new MoveWords();
		assertEquals(m.checkWinner(lagarto,spock),m.GANA);
	}
	

}
