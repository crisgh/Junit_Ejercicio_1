import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
	/**
	* @return New Set (different from a and b) that contains the
	* union set of a and b
	* @param a Set of elements. It can contain the null element. It can’t
	* contain repeated elements
	* @param b Set of elements. It can contain the null element. It can’t
	* contain repeated elements
	* @throws NullPointerException If a or b is null
	*/
	public static Set unionSet (Set a, Set b){
		if (a == null || b == null) {
			throw new NullPointerException();
		}

		Set<Object> setResult = new HashSet<Object>();
		for (Iterator i = a.iterator(); i.hasNext(); ) {
            Object f = i.next();
            if (!setResult.contains(f)) {
            	setResult.add(f);
            }
        }

        
        for (Iterator i = b.iterator(); i.hasNext(); ) {
            Object f = i.next();
            if (!setResult.contains(f)) {
            	setResult.add(f);
            }
        }
		return setResult;
	}
	/**
	* @return New Set (different from a and b) that contains the
	* union set of a and b
	* @param a Set of elements. It can contain the null element. It can’t
	* contain repeated elements. The heterogeneity is limited.
	* @param b Set of elements. It can contain the null element. It can’t
	* contain repeated elements. The heterogeneity is limited.
	* @throws NullPointerException If a or b is null
	*/
	public static <E> Set<E> unionSetGeneric (Set<? extends E> a, Set<? extends E> b){
		if (a == null || b == null) {
			throw new NullPointerException();
		}
		Set<E> setResultado = new HashSet<E>();
		return setResultado;
	}
}
