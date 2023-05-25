public class Main01 {
    public static void main(String[] args) {
     double[] tab = new double[]{1,2,3,4,5.01,16,7,8,9,0};
     double max= tab[0];
     for (int i=0; i< tab.length; i++){
         if(tab[i]>max){
             max=tab[i];
         }
     }
        System.out.println(max);
    }
}
