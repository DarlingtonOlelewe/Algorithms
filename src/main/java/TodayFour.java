import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TodayFour {
    public static void main(String[] args) {
        String[] all = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","WEST"};
        System.out.println(Arrays.toString(dirReduc(all)));
    }

    public static String[] dirReduc(String[] arr) {

        Stack<String> shortest = new Stack<>();
        shortest.add(arr[0]);

        for(int i = 1; i < arr.length; i++){

            if(!shortest.isEmpty() && arr[i].equals("NORTH") && shortest.peek().equals("SOUTH")) shortest.pop();
            else if(!shortest.isEmpty() && arr[i].equals("SOUTH") && shortest.peek().equals("NORTH")) shortest.pop();
            else if(!shortest.isEmpty() && arr[i].equals("EAST") && shortest.peek().equals("WEST")) shortest.pop();
            else if(!shortest.isEmpty() && arr[i].equals("WEST") && shortest.peek().equals("EAST")) shortest.pop();
            else shortest.add(arr[i]);

        }

        String[] result = new String[shortest.size()];

        for(int i = 0; i < shortest.size(); i++){
            result[i] = shortest.get(i);
        }

        return result;

    }
}
