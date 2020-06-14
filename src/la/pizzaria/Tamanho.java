package la.pizzaria;

import java.io.Serializable;

public class Tamanho implements Serializable {
    private int id;
        private String nomeTamanho;
        private double multValor;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getMultValor() {
            return multValor;
        }

        public void setMultValor(double multValor) {
            this.multValor = multValor;
        }

        public String getNomeTamanho() {
            return nomeTamanho;
        }
        public void setNomeTamanho(String nomeTamanho) {
            this.nomeTamanho = nomeTamanho;
        }
        

        public Tamanho(int id, String nomeTamanho, double multValor) {
            this.id = id;
            this.nomeTamanho = nomeTamanho;
            this.multValor = multValor;
        }
}
