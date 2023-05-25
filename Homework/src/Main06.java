public class Main06 {
    public static void main(String[] args){
        int[] tab = new int[10];
        // wypełnienie tablicy kwadratami licznika
        for (int i = 0; i< tab.length; i++)
        {
            tab[i]=i*i;
        }
        // wyświetlenie elementów przy uzyciu pętli for each
        for(int x :tab){
            System.out.print(x + ",");
        }
    }
}
