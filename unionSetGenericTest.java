import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.*;

public class unionSetGenericTest {

	Set<Integer> vect1 = new HashSet<>();
	Set<Integer> vect2 = new HashSet<>();
	
	@Before public void setUp()         // Preparamos los parametros para realizar los test
	{     
		vect1.add(1);
		vect2.add(2);
		vect2.add(3);
	}
	
	@Test(expected=NullPointerException.class) 
	public void VectorsAreNull()
	{
		Union.unionSetGeneric(null, null);
	}

}
