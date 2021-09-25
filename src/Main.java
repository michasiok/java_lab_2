public class Main {
    public static void main(String[] args) {
        System.out.println("Petla break");
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                System.out.println("break");
                break;
            }
            System.out.println("i="+i);
        }
        System.out.println();
        System.out.println("Petla continue");
        for (int j = 0; j < 10; j++) {
            if (j==3){
                System.out.println("continue");
                continue;
            }
            System.out.println("j="+j);
        }

        System.out.println();
        System.out.println("Petla return");
        for (int k = 0; k < 10; k++) {
            if (k==3){
                System.out.println("return");
                return;
            }
            System.out.println("k="+k);
        }
    }
}
