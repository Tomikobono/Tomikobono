public class Main03 {
    public static void main(String[] args) {
        double[] tabA = new double[]{1.09, 0.1, 0.0011, 1.02, 0, 1.91, 3.14, 0.0, 0.123, 1};
        double X=0;
        for(int i=0; i< tabA.length;i++){
            if(X==tabA[i]){
                System.out.println("Podana wartosc "+X +" wystepuje w tabeli na pozycji: " +(i+1));
            }
        }

    }
}
