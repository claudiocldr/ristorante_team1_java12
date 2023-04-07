public class Antipasti {
    private String nome;
    private Double prezzo;
    private String descrizione;

    //TODO inserire enumerati
    private Integer checkTipoMenu;

    public Antipasti(String nome, Double prezzo, String descrizione, Integer checkTipoMenu) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.checkTipoMenu = checkTipoMenu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getCheckTipoMenu() {
        return checkTipoMenu;
    }

    public void setCheckTipoMenu(Integer checkTipoMenu) {
        this.checkTipoMenu = checkTipoMenu;
    }

    //TODO inserire una classe utility con i colori
    public void printAntipasti() {

        System.out.println("\n" + "\033[0;1m" + nome + "\033[0m" + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
    }

}