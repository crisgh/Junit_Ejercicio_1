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
	@Test(expected=NullPointerException.class) 
	public void TestVectorsareNull()
	{
		Union.union(null, null);
	}
	@Test() 
	public void ClassDiferent()
	{
		vect1.add("string1");
		vect2.add(("string2"));
        Vector vectorResult = new Vector(5);
        vectorResult.addElement(1);
        vectorResult.addElement(2);
        vectorResult.addElement("Perro");
        vectorResult.addElement(3);
        vectorResult.addElement("Gato");
        assertFalse(vectorResult.equals(Union.union(vect1, vect2)));
	}
	@Test() 
	public void RepeatElement()
	{
		vect1.add(1);
        Vector vectorResult = new Vector(3);
        vectorResult.addElement(1);
        vectorResult.addElement(2);
        vectorResult.addElement(3);
        assertTrue(vectorResult.equals(Union.union(vect1, vect2)));
}

}