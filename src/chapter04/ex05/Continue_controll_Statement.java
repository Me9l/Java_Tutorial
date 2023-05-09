package chapter04.ex05;

public class Continue_controll_Statement {
	public static void main(String[] args) {
		/*
		 * ----- continue ----- break : 실행문 탈출 continue : 스코프 내의, continue 이후 작성된 코드를
		 * skip 진행
		 */

		// - 단일 Loop
		// for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//			continue;
//			System.out.println(i);		//unreachable code
//		}

		// - if 문과 continue
//		for (int i = 0; i < 3; i++) {
//			System.out.println("before continue : i = " + i);
//			if (i == 1)
//				continue;
//			System.out.println("after continue : i = " + i);
//		}

		// - 다중 Loop 와 continue

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (j ==2 || i == 2)
//					continue;
//				System.out.println(i + " / " + j);
//			}
//		}

		// - 다중 Loop 와 continue ( LABEL )

		pos: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2 || i == 2)
					continue pos; //
				System.out.println(i + " , " + j);
			}
		}

	}
}
