import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class TestePais {

	Pais pais = new Pais();
	Pais copia = new Pais();
	static int id = 1;
	
	@Before
	void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, "Russia", 999999, 999999);
		copia = new Pais(id, "Mexico", 1111, 1111 );
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
}
