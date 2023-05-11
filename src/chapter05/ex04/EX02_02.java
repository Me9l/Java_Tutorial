package chapter05.ex04;

public class EX02_02 {
	public static void main(String[] args) {
		int[][] arr1 = new int[4][200];

		for (int i = 0; i < arr1.length; i++) {
		    for (int j = 0; j < arr1[i].length; j++) {
		        if (i == 0) {								// 0 행 : 5의 배수
		            arr1[i][j] = (j + 1) * 5;
		        } else if (i == 1) {						// 1 행 : 3의 배수
		            arr1[i][j] = (j + 1) * 3;
		        } else if (i == 2) {						// 2 행 : 7,8의 배수
		            int val = 1;
		            while (j < arr1[i].length) {
		                if (val % 7 == 0 || val % 8 == 0) {
		                    arr1[i][j] = val;
		                    j++;
		                }
		                val++;
		            }
		        } else if (i == 3) {						// 3 행 : 4,7의 공배수
		            int val = 1;
		            while (j < arr1[i].length) {
		                if (val % 4 == 0 && val % 7 == 0) {
		                    arr1[i][j] = val;
		                    j++;
		                }
		                val++;
		            }
		        }
		    }
		}
	}
}
