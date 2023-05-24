public class Main04 {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 1, 1, 0, 12, 1, 1, 1, 1, 1};
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                sum += tab[i];
                avg = sum / (i + 1);
            } else {
                System.out.println("Suma: " + sum + " Średnia: " + avg);
            }
        }
    }
    }

