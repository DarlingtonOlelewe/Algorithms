public class Today3 {
    public static void main(String[] args) {
//        int a = 224;
//        System.out.println(Long.toBinaryString(2));?
//        System.out.println(Long.toBinaryString(10));
//        System.out.println(Long.toBinaryString(120));




//        System.out.println(highOrderBitmask(220));


//        System.out.println(generateHighs(8));

//        System.out.println(220%24);
//        System.out.println(220%16);
//        System.out.println(220%8);
//        System.out.println(220%4);

        System.out.println(highOrderBitmask(98));
//        System.out.println(highOrderBitmask(240));
//
//        System.out.println(checkBit(8));
//        System.out.println(checkBit(4));
//        System.out.println(checkBit(2));




    }

    public static int highOrderBitmask(int wordSize) {
        int bits = checkBit(wordSize);
        String upper = Long.toBinaryString(wordSize);
        upper = completeString(upper,bits);
        String lower = generateHighs(bits);

        String resultBinary = "";

        for(int i = 0; i < lower.length(); i++){

            if(upper.charAt(i) == '1' && lower.charAt(i) == '1'){
                resultBinary += "1";
            }else {
                resultBinary += "0";
            }
        }

        int result = (int)Long.parseLong(resultBinary,2);
        return result;
    }

    public static String completeString(String s,int bits){
        int num = bits - s.length();
        String result = "1".repeat(num) + s;
        return result;
    }

    public static String generateHighs(int num){
        String result = "";

        int half = num/2;
        for(int i=0; i < half; i++){
            result += "1";
        }

        for(int i = half; i < num; i++){
            result += "0";
        }
        return result;
    }

    public static int checkBit(int num){
        int i;
        for(i = 1; i<=24; i*=2){

            num = num/i;
            System.out.println(num+" "+i);
            if (num == 0) break;
            if (num == 1) return i * 2;

        }

        return i/2;
    }


}
