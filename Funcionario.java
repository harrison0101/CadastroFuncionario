public class Funcionario {
    private int id;
    private String nome;
    private Cargo cargo;
    private double salario;

    public Funcionario(int id, String nome, Cargo cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public Cargo getCargo() { return cargo; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cargo.name() + ";" + salario;
    }

    public static Funcionario fromString(String linha) {
        String[] partes = linha.split(";");
        int id = Integer.parseInt(partes[0]);
        String nome = partes[1];
        Cargo cargo = Cargo.valueOf(partes[2]);
        double salario = Double.parseDouble(partes[3]);
        return new Funcionario(id, nome, cargo, salario);
    }
}
