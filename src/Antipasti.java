public class Antipasti {

    //TODO ampliare le funzionalità delle classi
    private String nome;
    private Double prezzo;
    private String descrizione;
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

    //TODO dov'è il metodo per stampare
    public void print(){

        System.out.println("stampare qua");
    }

}