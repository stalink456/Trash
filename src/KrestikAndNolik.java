public class KrestikAndNolik {
    public static void main(String[] args) {
        String[][] field = new String[3][3];
        String[] value = {"0", "X"};

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(value[(int) (Math.random() * 2)] + " ");
            }
            System.out.println();
        }
    }
}
