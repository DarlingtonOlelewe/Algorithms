public class MultiplyStrings {
    public static void main(String[] args) {
//        System.out.println("print"+(char)'6');
//        System.out.println((char)9);
//        System.out.println((char)12);
        System.out.println(multiply("432","2"));


//        for(char i = '0'; i <= 'z'; i++ ){
//            System.out.println(i+"     respective"+(int)i);
//        }
    }

    static public String multiply(String num1, String num2){
       String result = "";

       while(!num1.equals("")){
           int last1 = num1.charAt(num1.length() - 1);
           int last2 = num2.charAt(num2.length() - 1);
           int cal = (last1 - 48) * (last2 - 48);
           char i = (char) (cal + 48);

           result = i + result;
           num1 = num1.substring(0,num1.length()-1);
       }

       return result;
    }
}
