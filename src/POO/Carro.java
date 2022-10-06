package POO;

class Carro {
    String cor;
    String modelo;
    Integer capacidadeDoTanque;

    Carro() {

    }

    Carro(String cor, String modelo, Integer capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;


    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }


    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }



    void setCapacidadeDoTanque(Integer capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }
    Integer getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeDoTanque * valorCombustivel;
    }
}
