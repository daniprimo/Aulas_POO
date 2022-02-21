package br.dio.com;

public class Caminhao extends Veiculo {
    //Atributos
    String modelo;
    String montadora;
    String eixo;
    int capacidadeCombustivel;
    int  anoFabricacao;
    //Construtores
    Caminhao () {

    }

    Caminhao (String modelo, String montadora, int anoFabricacao){
        this.modelo = modelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
    }

   Caminhao (String modelo, String montadora, String eixo, int capacidadeCombustivel, int anoFabricacao){
        this.modelo = modelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.eixo = eixo;
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

    void setEixo (String eixo){
        this.eixo = eixo;
    }

    String getEixo (){
        return eixo;
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
