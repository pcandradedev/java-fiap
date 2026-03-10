package pratica01;

public class Teste {
    public static void main(String[] args) {
        Cor vermelho = new Cor("Vermelho", 255, 0, 0);
        Cor azul = new Cor("Azul", 0, 0, 255);
        Cor branco = new Cor("Branco", 255, 255, 255);
        Cor verde = new Cor("Verde", 0, 255, 0);

        Carro carro = new Carro("Ford", 5, 4, 4.2, 2021, vermelho, "TJQ-7B19", 1.0f);

        System.out.println("\nInformações do pratica01.Carro: ");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("pratica01.Cor: " + carro.getCor().getNome());
        System.out.println("Quantidade de Lugares:" + carro.getQuantidadeLugares());
        System.out.println("Quantidade de Portas: " + carro.getQuantidadePortas());
        System.out.println("Comprimento: " + carro.getComprimento());
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Motor " +  carro.getMotor());

        System.out.println("Informações modificada (pratica01.Cor): ");
        carro.setCor(azul);
        System.out.println("pratica01.Carro: " + carro.getCor().getNome());

        System.out.println("\nInformações do Avião: ");
        Aviao aviao = new Aviao("Boeing 737", 189, "PT-ABC", 39.5, 2018, branco, 2);
        System.out.println("Modelo: " + aviao.getModelo());
        System.out.println("pratica01.Cor: " + aviao.getCor().getNome());
        System.out.println("Quantidade de Lugares: " +  aviao.getQuantidadeLugares());
        System.out.println("Prefixo: " + aviao.getPrefio());
        System.out.println("Comprimento: " + aviao.getComprimento());
        System.out.println("Ano de Fabricação: " + aviao.getAnoFabricacao());
        System.out.println("Quantidade de Turbinas: " +  aviao.getQuantidadeTurbinas());





    }
}
