package motorveiculoteste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5];

        for (int i = 0; i < 5; i++) {
            Veiculo veiculo = new Veiculo();

            System.out.println("Informe os dados do veículo " + (i + 1));
            System.out.print("Quantidade de rodas: ");
            veiculo.setQtdRodas(scanner.nextInt());

            System.out.print("Velocidade máxima: ");
            veiculo.setVelocMax(scanner.nextFloat());

            scanner.nextLine();  // Limpar o buffer
            System.out.print("Placa: ");
            veiculo.setPlaca(scanner.nextLine());

            System.out.print("Marca: ");
            veiculo.setMarca(scanner.nextLine());

            System.out.print("Modelo: ");
            veiculo.setModelo(scanner.nextLine());

            System.out.print("Cor: ");
            veiculo.setCor(scanner.nextLine());
            
            System.out.print("Informe os dados do motor do veículo:\n");
            System.out.print("Quantidade de pistões: ");
            int qtdPist = scanner.nextInt();
            System.out.print("Potência: ");
            int potencia = scanner.nextInt();

            veiculo.getMotor().setQtdPist(qtdPist);
            veiculo.getMotor().setPotencia(potencia);

            veiculos[i] = veiculo;
        }

        System.out.println("Veículos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("Quantidade de rodas: " + veiculo.getQtdRodas());
            System.out.println("Velocidade máxima: " + veiculo.getVelocMax());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println();
        }
    }
}
