//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// https://www.acmicpc.net/problem/1000
import java.util.Scanner;
public class AddAB{
    public static void main(String[] args){
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
//출력
//첫째 줄에 A+B를 출력한다.
       System.out.println(A+B);
        sc.close();


       
        }
}

// import java.util.Scanner;

// // 문제파악

// // 두 정수 A와 B를 입력받은 다음 A+B를 출력
// // 0 < A, B < 10

// // 유추파악 두 정수를 입력해 합을 출력

// // 주요단어 영문 이름 선정

// // 입력 input 정수 decimal 출력 output 합 plus

// public class Main{
//     // 두 정수 합 구함
//     public int plus(int input_first, int input_second) {
//         int output_plus = input_first + input_second;
//         return output_plus;
//     }
//     public static void main(String[] args) {
//         // 테스트 케이스
//         //  3 + 5 = 8
//         //  20 + 50 = 70
//         //  -1 + 5 = error
        
//         // 프로그래밍 순서
//         // 입력
//         Scanner sc = new Scanner(System.in);
//         int input_first = sc.nextInt();
//         int input_second = sc.nextInt();
//         sc.close();

//         // 처리
//         Main main = new Main();
//         int output_plus = main.plus(input_first, input_second);

//         // 출력
//         System.out.println(output_plus);
        
//     }
// }