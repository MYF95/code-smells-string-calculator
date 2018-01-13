public class Calculator {

    public int calculate(String input) throws Exception {
        String[] numbers = input.split(",|\n");
        if(input.isEmpty()){
            return 0;
        }
        if(input.length() == 1){
            return toInt(input);
        } else {
           return getSum(numbers);
        }
    }

    private int toInt(String input){
        return Integer.parseInt(input);
    }

    private int getSum(String[] numbers) throws Exception {
        negativeInputs(numbers);
        return calculateValues(numbers);
    }

    private void negativeInputs(String[] numbers) throws Exception {
        for (String current:numbers){
            if(toInt(current) < 0){
                throw new Exception("Negative input is not allowed");
            }
        }
    }

    private int calculateValues(String[] numbers){
        int sum = 0;
        for (String current:numbers){
            if(toInt(current) > 1000){
                continue;
            }
            sum += toInt(current);
        }
        return sum;
    }
}
