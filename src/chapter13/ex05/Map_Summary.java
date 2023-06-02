package chapter13.ex05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Summary {
	public static void main(String[] args) {
		
		// 1. HashMap : 입력순서 != 출력순서 / 단일 스레드 환경에서 사용하기 좋은 자료구조.
		//				Key값이나 Value에 null 허용
		Map<String,Integer> hMap = new HashMap<>();
		hMap.put("다", 30);
		hMap.put("마", 40);
		hMap.put("나", 50);
		hMap.put("가", 60);
		hMap.put("가", 30);		// Overwrite, value는 중복 가능
		System.out.println("HashMap : "+hMap);
		
		// 2. HashTable : 입력순서 != 출력순서 / 멀티 스레드 환경에서 사용하기 좋은 자료구조.
		// HashMap 에 비해 느리다. (다른 스레드가 block되고 unblock 되는 대기 시간을 기다리기 때문.)
		// null 을 허용하지 않는다.
		Map<String,Integer> hTable = new Hashtable<>();
		hTable.put("다", 30);
		hTable.put("마", 40);
		hTable.put("나", 50);
		hTable.put("가", 60);
		hTable.put("가", 30);
		System.out.println("HashTable : "+hTable);
		
		// 3. LinkedHashMap : 입력순서 == 출력순서.
		Map<String,Integer> lhMap = new LinkedHashMap<>();
		lhMap.put("다", 30);
		lhMap.put("마", 40);
		lhMap.put("나", 50);
		lhMap.put("가", 60);
		lhMap.put("가", 30);
		System.out.println("LinkedHashMap : "+lhMap);
		
		// 4. TreeMap : Key로 정렬되어 저장. (오름차순)
		Map<String,Integer> tMap = new TreeMap<>();
		tMap.put("다", 30);
		tMap.put("마", 40);
		tMap.put("나", 50);
		tMap.put("가", 60);
		tMap.put("가", 30);
		System.out.println("TreeMap : "+tMap);
		
	}
}
