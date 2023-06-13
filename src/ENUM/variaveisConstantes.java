package ENUM;

public enum variaveisConstantes {



        TAMANHO(10000), PRIMEIRO(1), ULTIMO(20000);


        private final int valor;


        variaveisConstantes(int valor) {
            this.valor = valor;
        }

        public Integer getValor() {
            return valor;
        }

    }

