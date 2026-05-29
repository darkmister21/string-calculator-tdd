public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Rozdzielamy po przecinku LUB nowej linii
        String[] tokens = numbers.split(",|\n");
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}