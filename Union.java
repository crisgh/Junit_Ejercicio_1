import java.util.Vector;

public class Union {

	/**
	* @return New object (different from a and b) of class Vector that
	* contains the union set (NO elements can be repeated) of a and b
	* @param a Vector containing elements, including null. It is not a set,
	* so it can have repeated elements, and they can be of different
	* classes / types
	* @param b Vector containing elements, including null. It is not a set,
	* so it can have repeated elements, and they can be of different
	* classes / types
	* @throws NullPointerException If a or b is null
	*/
	public static Vector union (Vector a, Vector b){
		if (a == null || b == null) {
			throw new NullPointerException();
		}
		Vector vectorresult = new Vector();
		for (int i=0;i<a.size();i++) {
            if (!vectorresult.contains(a.elementAt(i))) {
            	vectorresult.addElement(a.elementAt(i));
            }
        }
        for (int i=0;i<b.size();i++) {
            if (!vectorresult.contains(b.elementAt(i))) {
            	vectorresult.addElement(b.elementAt(i));
            }
        }
		return vectorresult;
	}
}
