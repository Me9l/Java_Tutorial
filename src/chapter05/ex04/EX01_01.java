package chapter05.ex04;

public class EX01_01 {
	public static void main(String[] args) {
		/*
		 * arr1 : 4행 100열
		 * arr1[0] : 10의 배수 저장
		 * arr1[1] : 3의 배수 저장
		 * arr1[2] : 3의 배수, 6의배수가 아닌 수 저장
		 * arr1[3] : 7의 배수, 8의배수 저장
		 * for 문을 사용해 출력.
		 */
		
		int[][] arr1 = new int[4][100];
		for (int i = 0; i < arr1.length ; i++) {
		  	int j = 0 ;
			  	if ( i == 0 ) {							//arr1[0] : 10의 배수 저장
				for (int val = 1;; val++) {
					if ((val) % 10 == 0) {
						arr1[i][j] = val;
						j++;
					}
					if ( j == arr1[i].length ) break;
				}
		  	} else if ( i == 1 ) {						// arr1[1] : 3의 배수 저장
		  		for ( int val = 1 ; ; val++) {
		  			if (val % 3 == 0) {
		  				arr1[i][j] = val;
		  				j++;
		  			}
		  			if ( j == arr1[i].length ) break;
		  		}
		  	} else if ( i == 2 ) {						// arr1[2] : 3의 배수, 6의배수가 아닌 수 저장
		  		for ( int val = 1 ; ; val++) {
		  			if ( val % 3 == 0 && val % 6 != 0 ) {
		  				arr1[i][j] = val;
		  				j++;
		  			}
		  			if ( j == arr1[i].length ) break;
		  		}
		  		
			} else if ( i == 3 ) {						// arr1[3] : 7의 배수, 8의배수 저장
				for ( int val = 1 ; true ; val++ ) {
					if ( val % 7 == 0 || val % 8 == 0 ) {
						arr1[i][j] = val;
						j++;
					}
					if ( j == arr1[i].length ) break;
				}
			}
		}
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("================================== arr1[%d] =================================\n",i);
			for (int k = 0; k < arr1[i].length; k++) {
				System.out.print(arr1[i][k] + "\t");
				if ((k+1)%10==0) {
					System.out.println();
				}
			}
		}
		
	}
}
