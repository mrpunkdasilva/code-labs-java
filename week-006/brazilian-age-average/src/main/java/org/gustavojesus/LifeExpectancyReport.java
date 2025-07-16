package org.gustavojesus;

import java.util.HashMap;

/**
 * Classe responsável por gerar e exibir um relatório de expectativa de vida média por região.
 * O relatório é formatado em uma tabela com cores ANSI para uma melhor visualização.
 */
class LifeExpectancyReport {
    private HashMap<String, Double> lifeExpectancyMap;

    // Códigos ANSI para cores
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    /**
     * Construtor da classe LifeExpectancyReport.
     *
     * @param lifeExpectancyMap Uma HashMap contendo as regiões e suas respectivas expectativas de vida média.
     */
    public LifeExpectancyReport(HashMap<String, Double> lifeExpectancyMap) {
        this.lifeExpectancyMap = lifeExpectancyMap;
    }

    /**
     * Método responsável por exibir o relatório de expectativa de vida média.
     * O relatório é formatado em uma tabela com cores ANSI para uma melhor visualização.
     */
    public void displayReport() {
        // Cabeçalho estilizado
        System.out.println(CYAN + "╔════════════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + "       MÉDIA DE EXPECTATIVA DE VIDA       " + CYAN + "" + RESET);
        System.out.println(CYAN + "╠════════════════════════════════════════════╣" + RESET);

        // Tabela de dados
        System.out.printf(CYAN + "║ " + RESET + "%-15s " + CYAN + "│ " + RESET + "%s" + CYAN + " \n", "Região", "Média (anos)");
        System.out.println(CYAN + "╠════════════════════════════════════════════╣" + RESET);

        for (String region : lifeExpectancyMap.keySet()) {
            System.out.printf(CYAN + "║ " + RESET + "%-15s " + CYAN + "│ " + GREEN + "%.2f" + CYAN + " anos \n", region, lifeExpectancyMap.get(region));
        }

        // Rodapé estilizado
        System.out.println(CYAN + "╚════════════════════════════════════════════╝" + RESET);
        System.out.println(PURPLE + "✨ Relatório gerado com sucesso! ✨" + RESET);
    }
}