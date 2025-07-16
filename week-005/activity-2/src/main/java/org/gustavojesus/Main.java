package org.gustavojesus;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Double> aminoAcidMass = new HashMap<>();
        aminoAcidMass.put('A', 71.03711);
        aminoAcidMass.put('C', 103.00919);
        aminoAcidMass.put('D', 115.02694);
        aminoAcidMass.put('E', 129.04259);
        aminoAcidMass.put('F', 147.06841);
        aminoAcidMass.put('G', 57.02146);
        aminoAcidMass.put('H', 137.05891);
        aminoAcidMass.put('I', 113.08406);
        aminoAcidMass.put('K', 128.09496);
        aminoAcidMass.put('L', 113.08406);
        aminoAcidMass.put('M', 131.04049);
        aminoAcidMass.put('N', 114.04293);
        aminoAcidMass.put('P', 97.05276);
        aminoAcidMass.put('Q', 128.05858);
        aminoAcidMass.put('R', 156.10111);
        aminoAcidMass.put('S', 87.03203);
        aminoAcidMass.put('T', 101.04768);
        aminoAcidMass.put('V', 99.06841);
        aminoAcidMass.put('W', 186.07931);
        aminoAcidMass.put('Y', 163.06333);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo contendo a sequência da proteína: ");
        String fileName = scanner.nextLine().trim();
        scanner.close();

        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Erro: Arquivo não encontrado ou caminho inválido!");
            return;
        }

        Stack<Character> proteinStack = new Stack<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char aminoAcid : line.trim().toCharArray()) {
                    if (aminoAcidMass.containsKey(aminoAcid)) {
                        proteinStack.push(aminoAcid);
                    } else {
                        System.out.println("Erro: Caractere inválido encontrado na sequência -> " + aminoAcid);
                        return;
                    }
                }
            }

            double totalMass = 0.0;
            while (!proteinStack.isEmpty()) {
                char aminoAcid = proteinStack.pop();
                totalMass += aminoAcidMass.get(aminoAcid);
            }

            System.out.printf("Massa total da proteína: %.3f%n", totalMass);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
