import java.io.*;
import java.util.ArrayList;

public class FuncionarioControladora {
    private static final String ARQUIVO = "funcionarios.txt";

    public void salvar(Funcionario f) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            bw.write(f.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Funcionario> carregarTodos() {
        ArrayList<Funcionario> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(Funcionario.fromString(linha));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
