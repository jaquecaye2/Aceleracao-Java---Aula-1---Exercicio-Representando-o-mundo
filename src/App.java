public class App {
    public static void main(String[] args) throws Exception {
        Materia materia = new Materia();

        materia.setNomeMateria("Cálculo");
        materia.conteudo.setNomeConteudo("Derivadas");
        
        System.out.println(materia.getNomeMateria());
        System.out.println(materia.conteudo.getNomeConteudo());
    }
}
