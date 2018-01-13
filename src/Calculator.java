public class Calculator {

    public int calculate(String input) throws Exception {
        String[] numbers = input.split(",|\n");
        if(input.isEmpty()){
            return 0;
        }
        if(input.length() == 1){
            return Integer.parseInt(input);
        } else {
           return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) throws Exception {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i]) < 0){
                throw new Exception("Negative input is not allowed");
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i]) > 1000){
                continue;
            }
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
