public class Sum3And5Challenge {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
                System.out.println("Number that met the conditions is: " + i);
                sum += i;
            }
            if(count == 5){
                System.out.println("Sum of the numbers that met the conditions is: " + sum);
                break;
            }
        }
    }
}
