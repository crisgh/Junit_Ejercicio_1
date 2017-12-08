import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.*;

public class UnionTest {

	Vector vect1 = new Vector();
	Vector vect2 = new Vector();

	@Before public void setUp()         // Preparamos los parametros para realizar los test
	{     
		vect1.add(1);
		vect2.add(2);
		vect2.add(3);
	}
}