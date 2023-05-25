public class Main02 {
    public static void main(String[] args) {
        double[] tab = new double[]{1.09,0.1,0.0011,1.02,3.1,1.91,3.14,0.1,0.123,1};
        double result=0;
        for(int i=0; i< tab.length;i++){
            result+=tab[i];
        }
        System.out.println(result);
    }
}
