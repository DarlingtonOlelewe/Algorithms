public class BinaryWatch {
    public static void main(String[] args) {

        for(int i = 0; i <= 50; i++) {
            System.out.println("for "+i+" == "+toBinary(i));

        }

        System.out.println(toBinary(34));



    }

    static int toBinary(int num){
        if (num == 0) return 0;
        StringBuilder result = new StringBuilder();

        while(num > 0){
            int remainder = num % 2;
            result.append(remainder);
            num = num - remainder;
            num /= 2;
        }

        return Integer.parseInt(result.reverse().toString());
    }
}
