package br.dio.com;

class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        // atraves do getts e Setts realizar a atribuição de valor aos atributos do objeto
        carro1.setCor("Preto ");
        carro1.setModelo("BMW Serie S ");
        carro1.setCapacidadeDoTanque(59);

        //mostrando na tela os conteudos do objeto

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println("Valor para encher o tanque R$"+ carro1.totalDoTanque(5.88));
        System.out.println();

        // usando a sobrecarga para criar o objeto

        Carro carro2 = new Carro("GOL 1993 1.6 Gas", "Verde ", 32);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeDoTanque());
        System.out.println("Valor para encher o tanque R$"+ carro2.totalDoTanque(5.88));



    }

}
