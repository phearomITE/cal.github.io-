public class test {

    public static void main(String[] args){
        // initialize variable
        double sum=0;
        int i=3,j=5;
        // loop through the series and add each tern to sum
        while (i<=99) {
            sum +=(double) i/j;
            i +=2;
            j +=2;  
        }
        //print sum
        System.out.println("sum of series :" +sum);
    }
}
