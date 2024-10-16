package main.com.UI;

import main.com.conversormoedas.api.ConversorDeMoedas;
import main.com.conversormoedas.api.TelaLimpa;

import java.io.IOException;
import java.util.Scanner;

import static main.com.conversormoedas.api.TelaLimpa.centralizarTexto;

public class Codigo {
    public static void inicio() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*************************************\n");
        System.out.println("Olá seja bem vindo ao conversor de moedas\n");
        int op;
        System.out.print("""
                1) Real -> Dólar
                2) Real -> Peso argentino
                3) Real -> Euro
                4) Dólar -> Real
                5) Peso argentino -> Real
                6) Euro -> Real
                7) Outras opções
                0) Sair
                                      
                Escolha uma opção:\s""");
        op = sc.nextInt();
        do {
            switch (op) {
                case 1:
                    try {
                        Double currency = ConversorDeMoedas.currencyApi("BRL", "USD");
                        System.out.print("Digite o valor que deseja converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        TelaLimpa.clearScreen();
                        Codigo.inicio();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 2:
                    // ConversorDeMoedas.currencyApi("BRL","ARS" );
                    System.out.println("A conversão de BRL para ARS é: ");
                    try {
                        Double currency = ConversorDeMoedas.currencyApi("BRL", "ARS");
                        System.out.print("Digite o valor que deseja converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        TelaLimpa.clearScreen();
                        Codigo.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }

                    break;
                case 3:
                    //ConversorDeMoedas.currencyApi("BRL", "EUR");

                    try {
                        Double currency = ConversorDeMoedas.currencyApi("BRL", "EUR");
                        System.out.print("Digite o valor que deseja converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        TelaLimpa.clearScreen();
                        Codigo.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é invalido.");
                    }
                    break;
                case 4:
                    // ConversorDeMoedas.currencyApi("USD", "BRL");
                    try {
                        Double currency = ConversorDeMoedas.currencyApi("USD", "BRL");
                        System.out.print("Digite o valor que deseja converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        TelaLimpa.clearScreen();
                        Codigo.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 5:
                    //ConversorDeMoedas.currencyApi("ARS", "BRL");
                    try {
                        Double currency = ConversorDeMoedas.currencyApi("ARS", "BRL");
                        System.out.print("Digite o valor que deseja converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);


                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        TelaLimpa.clearScreen();
                        Codigo.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }

                    break;
                case 6:
                    // ConversorDeMoedas.currencyApi("EUR","BRL");
                    try {
                        Double currency = ConversorDeMoedas.currencyApi("EUR", "BRL");
                        System.out.print("Digite o valor que deseja converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        TelaLimpa.clearScreen();
                        Codigo.inicio();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);

    }

}
