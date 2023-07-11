package days01;

public class Print03 {

	public static void main(String[] args) {
		
		System.out.printf("\t\t   ###성적표###\n");
		System.out.printf("----------------------------------------------\n");
		System.out.printf("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("----------------------------------------------\n");
		
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n", 1, "홍길동" , 98, 87, 86, 98+87+86 , (98+87+86)/3.0 );
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n",
					2, "홍길남" , 78, 76, 65, 78+76+78 , (78+76+78)/3.0 );
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n",
					3, "홍길서" , 100,100,100, 300 , 100.0 );
		System.out.printf("----------------------------------------------\n");
		
			//						###성적표###
			// 		-------------------------------------------
			// 		번호	성명		국어	영어	수학	총점	평균
			//		-------------------------------------------
			//		1		홍길동		89		87		89		254	85.2
			//		2		홍길서		87		55		87		243	80.3
			//		3		홍길남		59		88		66		254	82.4
			// ----------------------------------------------
		
		// 위 성적표의 내용중 1번 2번 3번 학생의 데이터들을 %d  %f  %s 를 이용하여 출력하고
		// 총점 평균도 계산된 결과가 나오도록 구성하세요.

	}

}