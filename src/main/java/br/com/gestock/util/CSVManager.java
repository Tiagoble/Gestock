package br.com.gestock.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class CSVManager {

    private static final String NOME_ARQUIVO = "usuarios.csv";
    private static final String SEPARADOR = ",";

    public static void verificarECriarArquivo() {
        try {
            new FileWriter(NOME_ARQUIVO, true).close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo CSV: " + e.getMessage(), "Erro de Arquivo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean cadastrarUsuario(String login, String senha) {
        if (verificarLoginExistente(login)) {
            JOptionPane.showMessageDialog(null, "Erro: O usuário " + login + " já está cadastrado.", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String novaLinha = login + SEPARADOR + senha;

        try (FileWriter fw = new FileWriter(NOME_ARQUIVO, true);
                 BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {

            out.println(novaLinha);
            return true;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo CSV: " + e.getMessage(), "Erro de Gravação", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean realizarLogin(String login, String senha) {

        try (BufferedReader br = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }
                String[] dados = linha.split(SEPARADOR);

                if (dados.length == 2) {
                    String loginCSV = dados[0].trim();
                    String senhaCSV = dados[1].trim();

                    if (login.equals(loginCSV) && senha.equals(senhaCSV)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo CSV: " + e.getMessage(), "Erro de Leitura", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private static boolean verificarLoginExistente(String login) {
        try (BufferedReader br = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }
                String[] dados = linha.split(SEPARADOR);
                if (dados.length > 0 && login.equals(dados[0].trim())) {
                    return true;
                }
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }
}
