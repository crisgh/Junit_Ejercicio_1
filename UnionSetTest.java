import static org.junit.Assert.*;

import org.junit.*;
import java.util.HashSet;
import java.util.Set;


public class UnionSetTest{

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
		Union.unionSet(null, null);
	}
	@Test() 
	public void RepeatElement()
	{
		vect1.add(1);
		Set<Integer> setResult = new HashSet<>();
		setResult.add(1);
        setResult.add(2);
        setResult.add(3);
        assertTrue(setResult.equals(Union.unionSet(vect1, vect2)));
	}
}

