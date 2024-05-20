import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        int x = 1;

        List<Jogo> lista_Jogos = new ArrayList<>();
        Jogo j1 = new Jogo();
        Jogo j2 = new Jogo();

        Scanner entrada_op = new Scanner(System.in);
        Scanner entrada_x = new Scanner(System.in);
        Scanner entrada_nome_jogo = new Scanner(System.in);
        Scanner entrada_preco_jogo = new Scanner(System.in);
        Scanner entrada_genero_jogo = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação que deseja realizar(1 - Salvar as informações do jogo no arquivo txt / 2 - Mostrar as informações dos jogos salvos no arquivo / 3 - Ordenar os jogos em ordem crescente de preço / 4 - Ordenar os jogos em ordem decrescente de preço / 5 - Utilize JOptionPane para mostrar se as operações deram certo ou não): ");
        op = entrada_op.nextInt();

        while(x != 0) {

            switch (op) {
                case 1: {
                    System.out.println("Digite o nome do jogo: ");
                    String nome = entrada_nome_jogo.nextLine();

                    System.out.println("Digite o preço do jogo: ");
                    Double preco = entrada_preco_jogo.nextDouble();

                    sc.nextLine();

                    System.out.println("Digite o gênero do jogo: ");
                    String genero = entrada_genero_jogo.nextLine();

                    OutputStream fluxoSaida = null;
                    OutputStreamWriter geradorFluxoSaida = null;
                    BufferedWriter bufferSaida = null;
                    String linha1_nome = null;
                    Double linha2_preco = null;
                    String linha3_genero = null;

                    try {
                        fluxoSaida = new FileOutputStream("C://Users//larac//C206-L1//Prova 3 Lab POO_Lara Conte Gomes//src//Informações Jogos");
                        geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
                        bufferSaida = new BufferedWriter(geradorFluxoSaida);
                        linha1_nome = nome;
                        linha2_preco = preco;
                        linha3_genero = genero;
                        bufferSaida.write(linha1_nome);
                        bufferSaida.write(" ");
                       try {
                           bufferSaida.write(String.valueOf(linha2_preco));
                       }catch (PrecoNegativoException e){
                           System.out.println(e.getMessage());
                           break;
                       }
                        bufferSaida.write(" ");
                        bufferSaida.write(linha3_genero);
                        bufferSaida.write(" ");
                        bufferSaida.newLine();

                    } catch (FileNotFoundException ex) {
                        System.err.printf("FileNotFoundException: %s.%n", ex);
                    } catch (IOException ex) {
                        System.err.printf("IOExcpetion: %s.%n", ex);
                    } finally {
                        try {
                            bufferSaida.close();
                        } catch (IOException ex) {
                            System.err.printf("IOExcpetion: %s.%n", ex);
                        }
                    }

                    System.out.println("Deseja realizar mais alguma operação(1 - sim, 0 - Não): ");
                    x = entrada_x.nextInt();

                    break;
                }
                case 2: {
                    InputStream fluxoEntrada = null;
                    InputStreamReader leitorFluxoEntrada = null;
                    BufferedReader bufferEntrada = null;
                    String linha1_jogo = null;

                    try {
                        fluxoEntrada = new FileInputStream("C://Users//larac//C206-L1//Prova 3 Lab POO_Lara Conte Gomes//src//Informações Jogos");
                        leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
                        bufferEntrada = new BufferedReader(leitorFluxoEntrada);
                        linha1_jogo = bufferEntrada.readLine();

                        while (linha1_jogo != null) {
                            System.out.println(linha1_jogo);
                            linha1_jogo =  bufferEntrada.readLine();
                        }

                    } catch (FileNotFoundException e) {
                        System.err.printf("FileNotFoundException: %s.%n", e);
                    } catch (IOException e) {
                        System.err.printf("IOExcpetion: %s.%n", e);
                    } finally {
                        try {
                            bufferEntrada.close();
                        } catch (IOException e) {
                            System.err.printf("IOExcpetion: %s.%n", e);
                        }
                    }

                    System.out.println("Deseja realizar mais alguma operação(1 - sim, 0 - Não): ");
                    x = entrada_x.nextInt();
                    break;
                }
                case 3:
                {
                    try {
                        j1.setPreco(455);
                    }catch(PrecoNegativoException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                    j2.setPreco(266);

                    lista_Jogos.add(j1);
                    lista_Jogos.add(j2);

                    Collections.sort(lista_Jogos);

                    for(Jogo j: lista_Jogos){
                        System.out.println(j.getPreco());
                    }

                    System.out.println("Deseja realizar mais alguma operação(1 - sim, 0 - Não): ");
                    x = entrada_x.nextInt();

                    break;
                }
                case 4:
                {
                    Collections.sort(lista_Jogos, Collections.reverseOrder());

                    for(Jogo j: lista_Jogos){
                        System.out.println(j.getPreco());
                    }

                    System.out.println("Deseja realizar mais alguma operação(1 - sim, 0 - Não): ");
                    x = entrada_x.nextInt();

                    break;
                }
                case 5:
                {
                    JOptionPane.showMessageDialog(null, "Ok");
                    break;
                }
            }

            if(x != 0) {
                System.out.println("Digite a operação que deseja realizar(1 - Salvar as informações do jogo no arquivo txt / 2 - Mostrar as informações dos jogos salvos no arquivo / 3 - Ordenar os jogos em ordem crescente de preço / 4 - Ordenar os jogos em ordem decrescente de preço / 5 - Utilize JOptionPane para mostrar se as operações deram certo ou não): ");
                op = entrada_op.nextInt();
            }
        }
    }
}