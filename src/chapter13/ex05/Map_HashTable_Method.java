package chapter13.ex05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Map_HashTable_Method {

	public static void main(String[] args) {
		/*
		 * map<K,V> 
		 *		K == key : 중복 불가능. Set으로 관리. 
		 * 		V == Value : 중복 가능.
		 * 
		 * - HashMap <K,V> : Key(HashSet) 출력시 순서를 고려하지 않는다. SingleThread(ArrayList)
		 * - HashTable <K,V> : Key(HashSet) 출력시 순서를 고려하지 않는다. MultiThread(Vector), 모든 메소드가 동기화.
		 * - LinkedHashMap<K,V>: Key(LinkedHashSet) 입력 순서대로 처리된다.
		 * - TreeMap<K,V> : Key(TreeSet) 정렬되어 입력된다. (기본 : 오름차순 정렬)
		 */

		// Map
		Map<Integer, String> hTable1 = new Hashtable<>();

		// put<K,V> Key와 value로 구성
		hTable1.put(0, "admin");
		hTable1.put(1, "user1");
		hTable1.put(2, "user2");
		hTable1.put(2, "user3"); // overWrite
		hTable1.put(3, "user3");
		System.out.println(hTable1);

		// putAll(other Map<E>);
		Map<Integer, String> hTable2 = new Hashtable<>();
		hTable2.put(3, "강형욱");
		hTable2.put(4, "조철봉");
		hTable2.putAll(hTable1); // K,V의 타입이 같아야 putAll 사용 가능.
		System.out.println(hTable2);

		// replace (K key, V value)
		hTable2.replace(2, "이수근");
		hTable2.replace(5, "이재용"); // 해당 key 가 없으면 실행되지 않음. (exception 발생하지 않는다.)
		System.out.println(hTable2);

		// replace(K key, V oldValue, V newValue);
		hTable2.replace(2, "이수근", "강호동"); // key와 value가 일치하는 값의 value를 3번째 파라미터로 수정.
		System.out.println(hTable2);
		hTable2.replace(2, "강호동", "이재용");
		System.out.println(hTable2);

		// get(Object key) : Key를 통해 Value 를 가져온다.
		System.out.println(hTable2.get(2));

		// containsKey (Object Key)
		System.out.println(hTable2.containsKey(2)); // Key값이 있으면 true
		System.out.println(hTable2.containsKey(6)); // Key값이 없으면 false

		// containsValue() : 해당 값이 존재하면 true.
		System.out.println(hTable2.containsValue("이수근"));
		System.out.println(hTable2.containsValue(""));

		// Set<K> keySet() : Key값만 조회.
		Set<Integer> keySet = hTable2.keySet();
		System.out.println("keySet : " + keySet);

		// Set<Map.Entry<Integer,String> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println("entrySet : " + entrySet);

		// size() : 총 갯수.
		System.out.println(hTable2.size());

		// remove(Object key) : Key를 이용하여 삭제.
		hTable2.remove(1);
		hTable2.remove(5); // 없어도 오류 발생하지 않음.
		System.out.println(hTable2);

		// remove(Object key, Object value) : key와 value가 일치해야 삭제.
		hTable2.remove(2, "이수근");
		hTable2.remove(4, "강형욱");
		System.out.println(hTable2);
	}
}