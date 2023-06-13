package NumeroService;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumerosRandomizados {

        private List<Integer> set;


        public Integer[] getArrayNumeros() {
            return this.set.stream().toArray(n -> new Integer[n]);
        }


        public NumerosRandomizados(Integer tamanho, Integer primeiro, Integer ultimo) {
            this.set = new Random().ints(primeiro, ultimo).distinct().limit(tamanho).boxed().collect(Collectors.toList());
        }

    }
