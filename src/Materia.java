public class Materia {
    private String nomeMateria;
    Conteudo conteudo = new Conteudo();

    public String getNomeMateria(){
        return this.nomeMateria;
    }

    public void setNomeMateria(String nomeMateria){
        this.nomeMateria = nomeMateria;
    }
}
