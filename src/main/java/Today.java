public class Today {
    public static void main(String[] args) {
//            int a = 224;
//        System.out.println(Long.toBinaryString(2));
//        System.out.println(Long.toBinaryString(4));
//        System.out.println(Long.toBinaryString(10));
//        System.out.println(Long.toBinaryString(120));

        System.out.println(Long.parseLong("1100",2));

//            Long.toBinaryString(2);
//        System.out.println(Long.parseLong("1111000", 2));
//        //System.out.println(Long.Bi("1111000", 2));
//
//        System.out.println(Long.toBinaryString(9));
//        System.out.println(Long.toBinaryString(240));
//
//
//        String twobinary = Long.toBinaryString(2);
//        System.out.println(twobinary);
//        twobinary = completeString(twobinary);
//        System.out.println(twobinary);


//        System.out.println(highOrderBitmask(220));

    }

    public static int highOrderBitmask(int wordSize) {
        String upper = Long.toBinaryString(wordSize);
        upper = completeString(upper);
        String lower = Long.toBinaryString(240);

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

    public static String completeString(String s){
        int num = 8 - s.length();
        String result = "0".repeat(num) + s;
        return result;
    }

}
