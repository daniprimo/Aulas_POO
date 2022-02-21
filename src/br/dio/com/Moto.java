package br.dio.com;

public class Moto extends Veiculo {

    //Atributos
    String modelo;
    String montadora;
    String cilindradas;
    int capacidadeCombustivel;
    int  anoFabricacao;
    //Construtores
    Moto () {

    }

    Moto (String modelo, String montadora, int anoFabricacao){
        this.modelo = modelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
    }

    Moto (String modelo, String montadora, String cilindradas, int capacidadeCombustivel, int anoFabricacao){
        this.modelo = modelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.cilindradas = cilindradas;
        this.capacidadeCombustivel = capacidadeCombustivel;
    }



    //Setts e Getts do objeto
    void setModelo (String modelo){
        this.modelo = modelo;
    }

    String getModelo (){
        return modelo;
    }

    void setMontadora (String montadora){
        this.montadora = montadora;
    }

    String getMontadora (){
        return montadora;
    }

    void setCilindradas (String cilindradas){
        this.cilindradas = cilindradas;
    }

    String getCelindradas (){
        return cilindradas;
    }

    void setCapacidadeCombustivel (int capacidadeCombustivel){
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    int getCapacidadeCombustivel (){
        return capacidadeCombustivel;
    }

    void setAnoFrabricacao (int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    int getAnoFabricacao (){
        return  anoFabricacao;
    }

    //metodos
    double tempoDeUso (int anoVigente){
        return anoVigente-anoFabricacao;
    }

    double totalCombustivel (double valorCombustivel){
        return valorCombustivel*capacidadeCombustivel;
    }

}
