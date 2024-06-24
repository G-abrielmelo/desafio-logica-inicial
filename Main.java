import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do herói
        System.out.println("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        // Solicita a quantidade de XP
        System.out.println("Digite a quantidade de XP do herói: ");
        int xp = scanner.nextInt();

        // Determina o nível com base na XP
        String nivel;
        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp <= 2000) {
            nivel = "Bronze";
        } else if (xp <= 5000) {
            nivel = "Prata";
        } else if (xp <= 7000) {
            nivel = "Ouro";
        } else if (xp <= 8000) {
            nivel = "Platina";
        } else if (xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        // Exibe a mensagem final
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        // Fecha o scanner
        scanner.close();
    }
}
