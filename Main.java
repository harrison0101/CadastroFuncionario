import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FuncionarioControladora control = new FuncionarioControladora();
        Scanner sc = new Scanner(System.in);

        System.out.print("ID do funcionário: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.println("Cargos disponíveis:");
        for (Cargo c : Cargo.values()) {
            System.out.println("- " + c);
        }

        System.out.print("Escolha o cargo: ");
        Cargo cargo = Cargo.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Salário: ");
        double salario = Double.parseDouble(sc.nextLine());

        Funcionario f = new Funcionario(id, nome, cargo, salario);
        control.salvar(f);

        System.out.println("\n📋 Funcionários cadastrados:");
        ArrayList<Funcionario> todos = control.carregarTodos();
        for (Funcionario func : todos) {
            System.out.println("ID: " + func.getId() + " | Nome: " + func.getNome() +
                    " | Cargo: " + func.getCargo() + " | Salário: R$" + func.getSalario());
        }

        sc.close();
    }
}
