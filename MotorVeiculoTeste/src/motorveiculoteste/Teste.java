package motorveiculoteste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[10];

        for (int i = 0; i < 5; i++) {
    VeiculoPasseio passeio = new VeiculoPasseio();

    System.out.println("Informe os dados do veículo de passeio " + (i + 1));
    System.out.print("Quantidade de rodas: ");
    passeio.setQtdRodas(scanner.nextInt());

    System.out.print("Velocidade máxima: ");
    passeio.setVelocMax(scanner.nextFloat());

    scanner.nextLine(); 
    System.out.print("Placa: ");
    passeio.setPlaca(scanner.nextLine());

    System.out.print("Marca: ");
    passeio.setMarca(scanner.nextLine());

    System.out.print("Modelo: ");
    passeio.setModelo(scanner.nextLine());

    System.out.print("Cor: ");
    passeio.setCor(scanner.nextLine());

    System.out.print("Quantidade de passageiros: ");
    passeio.setQtdPassageiros(scanner.nextInt());

    veiculos[i] = passeio;
    System.out.println("Veículo de passeio cadastrado");
}

for (int i = 5; i < 10; i++) {
    Carga carga = new Carga();

    System.out.println("Informe os dados do veículo de carga " + (i - 4));

    System.out.print("Velocidade máxima: ");
    carga.setVelocMax(scanner.nextFloat());

    scanner.nextLine();  
    System.out.print("Placa: ");
    carga.setPlaca(scanner.nextLine());

    System.out.print("Marca: ");
    carga.setMarca(scanner.nextLine());

    System.out.print("Modelo: ");
    carga.setModelo(scanner.nextLine());

    System.out.print("Cor: ");
    carga.setCor(scanner.nextLine());

    System.out.print("Carga máxima: ");
    carga.setCargaMax(scanner.nextInt());

    System.out.print("Tara: ");
    carga.setTara(scanner.nextInt());

    veiculos[i] = carga;
    System.out.println("Veículo de carga cadastrado");
}

System.out.println("Veículos cadastrados:");
for (Veiculo veiculo : veiculos) {
    System.out.println("Quantidade de rodas: " + veiculo.getQtdRodas());
    System.out.println("Velocidade máxima: " + veiculo.getVelocMax());
    System.out.println("Placa: " + veiculo.getPlaca());
    System.out.println("Marca: " + veiculo.getMarca());
    System.out.println("Modelo: " + veiculo.getModelo());
    System.out.println("Cor: " + veiculo.getCor());

    if (veiculo instanceof VeiculoPasseio) {
        VeiculoPasseio passeio = (VeiculoPasseio) veiculo;
        System.out.println("Quantidade de passageiros: " + passeio.getQtdPassageiros());
    } else if (veiculo instanceof Carga) {
        Carga carga = (Carga) veiculo;
        System.out.println("Carga máxima: " + carga.getCargaMax());
        System.out.println("Tara: " + carga.getTara());
    }

    System.out.println();
}
    }
}
