package sec_verify07;

public class Util {

	public static <K,V> V getvalue(Pair<K,V> p , K key) {
		if(p.getKey().equals(key)) {
			return p.getValue();
		}
		return null;
	}
}
