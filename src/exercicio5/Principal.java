package exercicio5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        String filePath = "/Users/alvarohenriquecartanopimentel/Alvaro/Trabalho/VSCODE/DEVinHouse-05_2023/" +
                "Turma Clamed/Módulo 2 - Java + SQL/M2S03-Lista/src/exercicio5/";
        String fileName = "Sorteios.txt";

        Path fileFullPath = Path.of(filePath+fileName);
//        System.out.println(Files.exists(fileFullPath));

        List<Concurso> listaConcursos = new ArrayList<>();

        try {
            List<String> fileRead = Files.readAllLines(fileFullPath);
//            System.out.println(fileRead);
            fileRead.forEach(n -> {
                String[] novoN = n.split(",");
                int numero = Integer.parseInt(novoN[0]);
                LocalDate localDate = LocalDate.of(Integer.parseInt(novoN[1].split("/")[2]),
                        Integer.parseInt(novoN[1].split("/")[1]),
                        Integer.parseInt(novoN[1].split("/")[0]));
                int[] sorteios = new int[6];
                for (int i = 0; i < 6; i++){
                    sorteios[i] = Integer.parseInt(novoN[i+2]);
                }
//                System.out.println(Arrays.toString(sorteios));
                listaConcursos.add(new Concurso(numero, localDate, sorteios));

            });
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("Deu errado!");
        }
        System.out.println(listaConcursos);
    }
}
