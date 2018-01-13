public class Calculator {

    public int calculate(String s) throws Exception {
        String[] numbers = s.split(",|\n");
        if(s.isEmpty()){
            return 0;
        }
        if(s.length() == 1){
            return Integer.parseInt(s);
        } else {
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
}
