import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//Prueba parametrizada de todos las opciones de piedra papel tijera lagarto spock
@RunWith(Parameterized.class)
public class ParametrizadaCheckWinner {
		private String accion1;
		private String accion2;
		public ParametrizadaCheckWinner(String a, String  b) {
			accion1=a;
			accion2=b;
		}
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList
				(new Object[][] {{"PIEDRA","TIJERAS"},{"PAPEL","PIEDRA"},{"PIEDRA","LAGARTO"},{"SPOCK","PIEDRA"},
					{"TIJERAS","PAPEL"},{"PAPEL","SPOCK"},{"LAGARTO","PAPEL"},{"TIJERAS","LAGARTO"},{"SPOCK","TIJERAS"},
					{"LAGARTO","SPOCK"}});
		
	}
	@Test
	public void testCheckWinner() {
		MoveWords m=new MoveWords();
		assertEquals(m.checkWinner(accion1, accion2),m.GANA);
	}
}

	