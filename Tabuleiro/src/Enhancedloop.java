public class Enhancedloop {
    public static void main(String[] args) {
        int [ ]a = {1,2,3,4};
        /* for (int x = 0 ; x <a.length ; x++) {
	        System.out.print(a[x]);
        } */
        for (int n : a) { // O for-each loop veio com o Java 6 como um loop especializado que simplifica a iteração sobre Arrays e Coleções.
	        System.out.print(n);
        }
    }
}
