package enumPackage;

/**
 * enum che indentifica la tipologia di dessert
 */
public enum TipoDessertEnum {
    CREMA("Crema"),
    FRUTTA("Frutta"),
    CIOCCOLATO("Cioccolato");

    private String tipologia;

    TipoDessertEnum(String tipologia) {
        this.tipologia = tipologia;
    }
}
