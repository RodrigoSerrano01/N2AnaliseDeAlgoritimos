package ArquivoService;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GerenciaArquivo {


    public static void salvaArquivo(List<Integer> lista, int tamanho) throws IOException {
        OutputStream arq = new FileOutputStream( "teste.txt");
        Writer wr = new OutputStreamWriter(arq);

        BufferedWriter br = new BufferedWriter(wr);

        lista.forEach(a -> {
            try {
                br.write(a.toString() + ":");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        br.close();
    }

    public static List<Integer> leArquivo(Integer tamanho) throws IOException {
        FileReader fr = new FileReader("teste.txt");
        List<String> listaAux = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            //listaAux= Arrays.stream(((str.split(":")))).toList();
            listaAux = Arrays.stream(((str.split(":")))).collect(Collectors.toList());
        }

        return listaAux.stream().map(s -> Integer.parseInt(String.valueOf(s))).collect(Collectors.toList());
    }

}
