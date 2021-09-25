public class Main {
    public static void main(String[] args) {
        int liczba = 1000;
        int nrIndexu = 57680;
        do{
            liczba--;
            if(liczba % 80 == 0){
                System.out.println("Liczba " + liczba + " jest podzielna przez 80");
            }
        }while(liczba>0);

        int[] tablicaInt = {23,52,143,1,-100};
        int iteratorInt = 0;
        while (iteratorInt<tablicaInt.length){
            System.out.println(tablicaInt[iteratorInt]);
            iteratorInt++;
        }

        double[] tablicaDouble = {23.01,52.123,143.2,1.0,-100.78};
        int iteratorDouble = 0;
        while (iteratorDouble<tablicaDouble.length){
            System.out.println(tablicaDouble[iteratorDouble]);
            iteratorDouble++;
        }
        String[] tablicaString = {"qwe", "rty", "uio", "asd", "ghj"};
        int iteratorString = tablicaString.length-1;
        while (iteratorString >= 0){
            System.out.println(tablicaString[iteratorString]);
            iteratorString--;
        }
//
//        while(true){
//          nieskończona pętla
//        }

//        while(false){
//            nigdy sie nie wykona
//        }
//

    }
}
