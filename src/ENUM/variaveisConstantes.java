package ENUM;

public enum variaveisConstantes {



        TAMANHO(100), PRIMEIRO(1), ULTIMO(200);


        private final int valor;


        variaveisConstantes(int valor) {
            this.valor = valor;
        }

        public Integer getValor() {
            return valor;
        }

    }

