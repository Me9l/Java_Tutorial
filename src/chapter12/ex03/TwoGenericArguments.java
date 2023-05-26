package chapter12.ex03;

class KeyValue <K,V>{
	/*
	 * A ~ Z 임의의 타입 지정
	 * 많이 쓰는 약어 : T : Type, K : Key, V : Value, N : Number
	 */
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
//	public void setKV(K key,V value) {
//		this.key = key;
//		this.value = value;
//	}
	
}

public class TwoGenericArguments {
	public static void main(String[] args) {
		// 1. String, Integer 를 arguments 로 사용하는 객체 생성.
		KeyValue <String, Integer> kv1 = new KeyValue<>();	// int : X , Integer : O
		
		// setter
		kv1.setKey("Key");
		kv1.setValue(1);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
//		kv1.setKV("키",100);
//		System.out.println(kv1.getKey());
//		System.out.println(kv1.getValue());
		
		KeyValue <String,Integer> kv2 = new KeyValue<>();
		
		kv2.setKey("Cheese Burger");
		kv2.setValue(3000);
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		// 2. Integer, String 을 arguments 로 사용하는 객체 생성.
		KeyValue <Integer,String> kv3 = new KeyValue<>();
		
		kv3.setKey(404);
		kv3.setValue("Page Not Found");
		
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		// 3. argument에 Void를 사용하면 해당 argument는 사용되지 않는다.
		KeyValue <String, Void> kv4 = new KeyValue<>();		// Void 대문자 V
		kv4.setKey("String Key");
		kv4.setValue(null);
		System.out.println(kv4.getKey());
		System.out.println(kv4.getValue());
		
		
	}
}
