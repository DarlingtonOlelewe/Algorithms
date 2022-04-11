public class Today2 {

    public static void main(String[] args) {

    }

    public static String highAndLow(String numbers) {
        String[] numbersArr = numbers.split(" ");

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int i = 0; i< numbersArr.length; i++){
            int num = Integer.parseInt(numbersArr[i]);

            highest = Math.max(num,highest);
            lowest = Math.min(num,lowest);

        }

        String result = ""+highest+" "+lowest;


        return result;
    }
}
