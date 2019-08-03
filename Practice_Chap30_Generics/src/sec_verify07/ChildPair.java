package sec_verify07;

public class ChildPair<K, V> extends Pair<K, V> {

	K key;
	V value;
	
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public ChildPair(K key, V value) {
		super(key, value);
		this.key = key;
		this.value = value;
	}

}
