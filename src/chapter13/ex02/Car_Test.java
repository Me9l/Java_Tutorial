package chapter13.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Car_Test {

	public static void main(String[] args) {
				
		// 1. Car 객체 5개 생성
		Car hyundai = new Car("HyunDai", "Granduer", "Black", 240);
		Car kia = new Car("KIA", "K9", "Black", 250);
		Car chevorolet = new Car("Chevorolet", "Trax", "White", 220);
		Car porsche = new Car("Porsche","Cayenne","Gray",280);
		Car volvo = new Car("Volvo", "Xc90", "White", 230);
		
		// 2. ArrayList 에 객체 저장
		List<Car> carArrayList = new ArrayList<>();
		carArrayList.add(hyundai);
		carArrayList.add(kia);
		carArrayList.add(chevorolet);
		carArrayList.add(porsche);
		carArrayList.add(volvo);
		
		// 3. Vector 에 저장
		List<Car> carVectorList = new Vector<>();
		carVectorList.addAll(carArrayList);
		
		// 4. LinkedList 에 저장
		List<Car> carLinkedList = new LinkedList<>();
		carLinkedList.addAll(carArrayList);
		
		// 5. 각 리스트에 저장된 Car 객체 출력
		
		for (int i = 0; i < carArrayList.size(); i++) {
			System.out.println(carArrayList.get(i));
		}
		System.out.println();
		for (Car k : carVectorList) {
			System.out.println(k);
		}
		System.out.println();
		for (Car m : carLinkedList) {
			System.out.println(m);
		}
		System.out.println();
	
			Car[] c1 = new Car[5] ;
			String[] str1 = new String[] {"현","기","삼","쉐","볼"};
			String[] str2 = new String[] {"소","개","말","양","쥐"};
			String[] str3 = new String[] {"흙","물","양","고","불"};
			for (int i = 0; i < c1.length; i++) {
				c1[i] = new Car(str1[i],str2[i],str3[i],(i+1)*65);
				System.out.println(c1[i]);
			}
			
			List<String> carCo = new ArrayList<>();
			List<String> carNa = new ArrayList<>();
			carCo.add("현대");
			carCo.add("대우");
			carNa.add("포니");
			carNa.add("포터");
			
			System.out.println(carCo + " : " + carNa);
	}
}
