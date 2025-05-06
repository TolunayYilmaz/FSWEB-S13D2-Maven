package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Palidrom sayı "+isPalindrome(121));
        System.out.println("Mükkemmel Sayı "+isPerfectNumber(6));
        System.out.println("Kelime Sayılar "+numberToWords(123));
    }


    public static boolean isPalindrome(int number){


        String[] numberArray=String.valueOf((number)).replace("-","").split("");
        String[] reverseNumberArray=new String[numberArray.length];
        boolean result=false;

        for (int i = 0; i <reverseNumberArray.length ; i++) {
             reverseNumberArray[(reverseNumberArray.length-1)-i]=numberArray[i];
        }
        for (int i = 0; i < reverseNumberArray.length; i++) {
            if(reverseNumberArray[i].equals(numberArray[i])){
                result=true;
            }
            else{
                result=false;
            }
        }

        return  result;
    }

    public static boolean isPerfectNumber (int number){

        if(number<0){
            return false;
        }
       else{

            int sum=0;
            for (int i = 1; i < number; i++) {
                if(number%i==0){
                    sum+=i;
                }
            }
           if(sum==number){

                return true;
            }
           else {
               return  false;
           }

        }




    }

    public static String numberToWords  (int number){
      if(number<0){
          return "Invalid Value";
      }
        String[] wordNumbers={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] numberArray=String.valueOf((number)).split("");
        String result="";
        for (int i = 0; i < numberArray.length; i++) {
           int a=Integer.parseInt(numberArray[i]);
           result +=" "+ wordNumbers[a];
        }
        result=result.trim();
        return result;

    }





}
