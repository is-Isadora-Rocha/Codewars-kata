package countByX;

import java.util.stream.IntStream;

public class Kata {
    public static int[] countBy(int x, int n){
        /*

        int[] mult = new int[n];

        for (int i = 0; i < n; i++){
            mult[i] = x * (i + 1);
        }
        return mult;

         */

        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
/*
        rangeClosed(int start, int end) – Retorna um fluxo int ordenado sequencial
        de startInclusive ( inclusive ) a endInclusive ( inclusive ) em uma etapa incremental de 1.

        => IntStream.range(1, 5);  	//1,2,3,4
        => IntStream.rangeClosed(1, 5);  	//1,2,3,4,5

*/
    }
}
