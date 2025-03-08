import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Olá, Mundo!
        System.out.println("Olá, Mundo!");
        
        // 2. Boas-vindas
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        
        // 3. Nome e salário
        System.out.print("Nome do Funcionário: ");
        String funcionario = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.printf("O funcionário %s tem um salário de R$%.2f em junho.\n", funcionario, salario);
        
        // 4. Soma de dois números
        System.out.print("Digite um valor: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 = scanner.nextInt();
        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + (num1 + num2));
        
        // 5. Média de duas notas
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.printf("A média entre %.1f e %.1f é igual a %.1f\n", nota1, nota2, (nota1 + nota2) / 2);
        
        // 6. Antecessor e sucessor
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("O antecessor de " + numero + " é " + (numero - 1));
        System.out.println("O sucessor de " + numero + " é " + (numero + 1));
        
        // 7. Dobro e terça parte
        System.out.print("Digite um número: ");
        double real = scanner.nextDouble();
        System.out.printf("O dobro de %.1f é %.1f\n", real, real * 2);
        System.out.printf("A terça parte de %.1f é %.5f\n", real, real / 3);
        
        // 8. Conversão de metros
        System.out.print("Digite uma distância em metros: ");
        double metros = scanner.nextDouble();
        System.out.println("Distância de " + (metros * 100) + " cm e " + (metros * 1000) + " mm");
        
        // 9. Conversão de real para dólar
        System.out.print("Quanto dinheiro você tem na carteira? R$");
        double dinheiro = scanner.nextDouble();
        System.out.printf("Você pode comprar US$%.2f\n", dinheiro / 3.45);
        
        // 10. Cálculo de área e tinta necessária
        System.out.print("Largura da parede: ");
        double largura = scanner.nextDouble();
        System.out.print("Altura da parede: ");
        double altura = scanner.nextDouble();
        double area = largura * altura;
        System.out.printf("Área total: %.2f metros quadrados. Você precisará de %.2f litros de tinta.\n", area, area / 2);
        
        // 11. Cálculo do Delta
        System.out.print("Valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Valor de C: ");
        double c = scanner.nextDouble();
        double delta = (b * b) - (4 * a * c);
        System.out.println("O valor de Delta é " + delta);
        
        // 12. Preço promocional
        System.out.print("Preço do produto: R$");
        double preco = scanner.nextDouble();
        System.out.printf("Preço com desconto: R$%.2f\n", preco * 0.95);
        
        // 13. Aumento de salário
        System.out.print("Salário atual: R$");
        double salarioAtual = scanner.nextDouble();
        System.out.printf("Novo salário com 15%% de aumento: R$%.2f\n", salarioAtual * 1.15);
        
        // 14. Cálculo de aluguel de carro
        System.out.print("Quantos Km percorridos? ");
        double km = scanner.nextDouble();
        System.out.print("Quantos dias alugado? ");
        int dias = scanner.nextInt();
        double precoTotal = (dias * 90) + (km * 0.2);
        System.out.printf("Preço total a pagar: R$%.2f\n", precoTotal);
        
        // 15. Cálculo de salário por dias trabalhados
        System.out.print("Quantos dias trabalhados? ");
        int diasTrabalhados = scanner.nextInt();
        double salarioMensal = diasTrabalhados * 8 * 25;
        System.out.printf("Salário total: R$%.2f\n", salarioMensal);
        
        // 16. Redução do tempo de vida de um fumante
        System.out.print("Quantos cigarros fumados por dia? ");
        int cigarrosPorDia = scanner.nextInt();
        System.out.print("Quantos anos fumando? ");
        int anosFumando = scanner.nextInt();
        int totalCigarros = cigarrosPorDia * anosFumando * 365;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / (60 * 24);
        System.out.println("Você perdeu aproximadamente " + diasPerdidos + " dias de vida devido ao fumo.");
        
        scanner.close();
    }
}
