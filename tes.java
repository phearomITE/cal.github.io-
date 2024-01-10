import static java.lang.Math.sqrt; 

public class tes {
    public static void main(String[] args) {
        double sum = 0;
        int i = 1, j = 2;

        while (j <= 625) {
            sum += sqrt(j) - sqrt(i); 
            i += 1;
            j += 1;
        }

        System.out.println("Sum of the series: " + sum);
    }
}

