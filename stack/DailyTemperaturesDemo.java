import java.util.Arrays;
import java.util.Stack;

public class DailyTemperaturesDemo {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temps = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temps)));
    }
}