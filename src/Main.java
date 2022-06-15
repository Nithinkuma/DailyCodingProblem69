import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String strs = br.readLine();
        String[] strings = strs.trim().split(" ");

        List<Integer> inputArray = new ArrayList<>();
        for (String str : strings) {
            inputArray.add(Integer.parseInt(str));
        }
        System.out.println(maxProductOfThreeElements(inputArray));
    }

    private static long maxProductOfThreeElements(List<Integer> inputArray) {
        int length = inputArray.size()-1;
        inputArray.sort(Comparator.naturalOrder());
        long posProduct = (long) inputArray.get(length) * inputArray.get(length-1)* inputArray.get(length-2);
        long posAndNegProduct = (long) inputArray.get(0) * inputArray.get(1)* inputArray.get(length);
        return Math.max(posProduct,posAndNegProduct);
    }
}