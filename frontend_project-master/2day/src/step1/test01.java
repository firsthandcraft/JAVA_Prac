package step1;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
	
		  /*세개의 숫자를 입력받아 
         * 세개의 숫자중 가장 작은수를 출력하는 프로그램
         */
        System.out.println("첫 숫자를 입력하세요");
        
        Scanner sc = new Scanner(System.in);
        int input_no1 = sc.nextInt();
        System.out.println("두번재 숫자를 입력하세요");
        int input_no2 = sc.nextInt();
        System.out.println("세번째 숫자를 입력하세요");
        int input_no3 = sc.nextInt();

        //input_no1 제일 클때
//      if( input_no1 < input_no2 && input_no1 < input_no3) {
//          System.out.println("작은수 :"+input_no1);
//      } else if(input_no1 == input_no2 && input_no2 == input_no3) {
//          System.out.println("같다");
//      }   else {      
//              if(input_no2 <input_no3) {  
//                  System.out.println("작은수 :"+input_no2);
//              } else {    
//                  System.out.println("작은수 :"+input_no3);
//              }
//      }
        
        System.out.println("------------------");
        /*
        if( input_no1 < input_no2 && input_no1 < input_no3) {
            if(input_no2 < input_no3) {
                System.out.println("작은수 :"+input_no1);
                System.out.println("중간수 :"+input_no2);
                System.out.println("큰수 :"+input_no3);
            } else{
                System.out.println("작은수 :"+input_no1);
                System.out.println("중간수 :"+input_no3);
                System.out.println("큰수 :"+input_no2);
            }   
            
        } else if(input_no1 < input_no2 || input_no1 < input_no3) {
            if(input_no2 < input_no1 && input_no2 < input_no3) {
                System.out.println("작은수 :"+input_no2);
                System.out.println("중간수 :"+input_no1);
                System.out.println("큰수 :"+input_no3);
            } else if(input_no3 < input_no1 && input_no3 < input_no2){
                System.out.println("작은수 :"+input_no3);
                System.out.println("중간수 :"+input_no1);
                System.out.println("큰수 :"+input_no2);
            }   
        } else{//1이 제일 클때       
                if(input_no2 <input_no3) {
                    System.out.println("작은수 :"+input_no2);
                    System.out.println("중간수 :"+input_no3);
                    System.out.println("큰수 :"+input_no1);
                } else {
                    System.out.println("작은수 :"+input_no3);
                    System.out.println("중간수 :"+input_no2);
                    System.out.println("큰수 :"+input_no1);
                }
        }
        System.out.println("------------------");
        */
        if(input_no1 < input_no2) {
            if(input_no2 < input_no3) {
                System.out.println("중간수 :"+input_no2);
            } else {
                if(input_no1 < input_no3) {
                    System.out.println("중간수 :"+input_no3);
                }else {
                    System.out.println("중간수 :"+input_no1);
                }
            }
        } else {
            if(input_no2 < input_no3) {
                System.out.println("중간수 :"+input_no3);
            }else {
                System.out.println("중간수 :"+input_no2);
            }   
        }
        
        sc.close();



	}

}
