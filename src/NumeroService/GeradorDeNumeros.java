package NumeroService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GeradorDeNumeros {

        private static List<Integer> set;


        public Integer[] getArrayNumeros() {
            return this.set.stream().toArray(n -> new Integer[n]);
        }


        public static List<Integer> numerosRandomizados(Integer tamanho, Integer primeiro, Integer ultimo) {
           set = new Random().ints(primeiro, ultimo).distinct().limit(tamanho).boxed().collect(Collectors.toList());
           return set;
        }

        public static List<Integer> numerosCrescentes(Integer tamanho, Integer primeiro) {
           set =  new ArrayList<>();
            for (int i =primeiro; i< tamanho; i ++){
                set.add(i);
            }
            return set;
        }

    public static List<Integer> numerosDec(Integer tamanho, Integer primeiro) {
        set =  new ArrayList<>();
        for (int i =tamanho; i>= primeiro; i --){
            set.add(i);
        }
        return set;
    }


    }
