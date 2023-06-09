import Dao.AntipastiDao;
import Dao.BevandeDao;
import enumPackage.*;
import portate.*;

import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Menu menuCarne = new Menu("Carne", TipologiaEnum.CARNE, 50.00, ChefStellatiEnum.MARCUS_SAMUELSSON);


        //carne
        Portata anti1 = new Antipasti("Carpaccio di manzo", 10.50,
                "Fettina di manzo crudo condita con succo di limone, servita con rucola e scaglie di parmigiano.", 1,
                "Slice of raw beef seasoned with lemon juice, served with rocket and parmesan flakes.",
                TipoPiattoEnum.KM_ZERO);
        Portata anti2 = new Antipasti("Polpettine di carne al sugo", 12.00,
                "Polpettine di carne mista (manzo e maiale) in un sugo di pomodoro.", 1,
                "Mixed meatballs (beef and pork) in a tomato sauce.",
                TipoPiattoEnum.PIATTO_TIPICO);
        Portata anti3 = new Antipasti("Involtini di carne con verdure", 15.00,
                "Fettine di carne ripiene di verdure (carote, zucchine, peperoni) cotte in padella.", 1,
                "Slices of meat stuffed with vegetables (carrots, courgettes, peppers) cooked in a pan.",
                TipoPiattoEnum.MENU_STANDARD);
        //pesce
        Portata anti4 = new Antipasti("Tartare di tonno", 18.50,
                "Tartare di tonno crudo condita con olio evo, succo di lime, sale e pepe, servita con avocado a cubetti.", 2,
                "Raw tuna tartare seasoned with extra virgin olive oil, lime juice, salt and pepper, served with diced avocado.",
                TipoPiattoEnum.KM_ZERO);
        Portata anti5 = new Antipasti("Crostini con salmone affumicato e formaggio", 20.50,
                "Crostini di pane tostato con salmone, formaggio fresco cremoso, erba cipollina e pepe.",2,
                "Toasted croutons with salmon, fresh cream cheese, chives and pepper.",
                TipoPiattoEnum.MENU_STANDARD);
        Portata anti6 = new Antipasti("Gamberetti in salsa rosa", 22.00,
                "Gamberetti lessi serviti con salsa rosa (salsa a base di maionese, ketchup, brandy).",2,
                "Boiled prawns served with pink sauce (mayonnaise-based sauce, ketchup, brandy).",
                TipoPiattoEnum.PIATTO_TIPICO);
        //vegan
        Portata anti7 = new Antipasti("Crostini con hummus e verdure grigliate",
                8.50, "Crostini di pane tostato spalmati con hummus di ceci e verdure di stagione grigliate.",3,
                "Toasted croutons spread with chickpea hummus and grilled seasonal vegetables.",
                TipoPiattoEnum.CONSIGLIATO_CHEF);
        Portata anti8 = new Antipasti(
                "Frittelle di zucchine e patate e salsa yogurt",
                10.00,
                "Frittelle di zucchine e patate, servite con salsa allo yogurt vegetale (yogurt vegetale a base di soia o mandorle).", 3,
                "Courgette and potato fritters, served with vegetable yoghurt sauce (soy or almond-based vegetable yoghurt).",
                TipoPiattoEnum.MENU_STANDARD);
        Portata anti9 = new Antipasti("Involtini di melanzane con cous cous e verdure", 12.00,
                "Fettine di melanzane grigliate ripiene di cous cous con verdure di stagione cotte in padella.", 3,
                "Slices of grilled aubergines filled with cous cous with seasonal vegetables cooked in a pan.",
                TipoPiattoEnum.BIOLOGICO);

        anti1.addAllergeni(AllergeniEnum.LATTE);
        anti2.addAllergeni(AllergeniEnum.NICKEL);
        //    anti4.addAllergeni(AllergeniEnum.PESCE);
        //    anti5.addAllergeni(AllergeniEnum.PESCE);
        //    anti6.addAllergeni(AllergeniEnum.CROSTACEI);
        //    anti8.addAllergeni(AllergeniEnum.LATTE);


        //PRIMI

        Portata primiPiatti1 = new PrimiPiatti("Cannelloni alla genovese e sedano ", 13.0,
                "cannelloni  ripieni di carne e sedano croccante gratinati al forno ", 1,
                true, 60);
        Portata primiPiatti2 = new PrimiPiatti("Ravioli di coniglio ", 16.5,
                "ravioli  ripieni di coniglio e aromi conditi con burro e salvia", 1,
                true, 12);
        Portata primiPiatti3 = new PrimiPiatti("Risotto d’autunno ", 15.0,
                "risotto con castagne mele e capocollo profumato con rosmarino ", 1,
                true, 20);
        //Pesce
        Portata primiPiatti4 = new PrimiPiatti("Risotto all’onda con velo di gamberi crudi", 13.5,
                "risotto cremoso con gamberi crudi e zafferano ", 2,
                false, 20);
        Portata primiPiatti5 = new PrimiPiatti("Paccheri, anelli di calamari, pomodoro e salicornia", 15.0,
                "paccheri con calamari pomodoro e salicornia conditi con olio extravergine d’oliva ", 2,
                true, 15);
        Portata primiPiatti6 = new PrimiPiatti("Linguine con capesante, tartufo bianco e basilico", 14.0,
                "linguine con capesante tartufo bianco e basilico conditi con olio extravergine d’oliva ", 2,
                false, 15);
        //Vegan
        Portata primiPiatti7 = new PrimiPiatti("Ravioli vegani di barbabietole con mele e noci", 12.5,
                "ravioli vegani ripieni di barbabietole mele e noci conditi con burro e salvia ", 3,
                true, 15);
        Portata primiPiatti8 = new PrimiPiatti("Spaghetti al pesto di avocado, basilico e pinoli", 13.0,
                "spaghetti al pesto di avocado basilico e pinoli conditi con olio extravergine d’oliva ", 3,
                true, 15);
        Portata primiPiatti9 = new PrimiPiatti("Conchiglioni con broccoli e mandorle", 14.5,
                "conchiglioni ripieni di broccoli e mandorle gratinati al forno ",3,
                true, 25);


        primiPiatti1.addAllergeni(AllergeniEnum.SEDANO);
        primiPiatti2.addAllergeni(AllergeniEnum.LATTE);
        //    primiPiatti4.addAllergeni(AllergeniEnum.CROSTACEI);
        //    primiPiatti5.addAllergeni(AllergeniEnum.NICKEL);
        //    primiPiatti6.addAllergeni(AllergeniEnum.CROSTACEI);
        //    primiPiatti7.addAllergeni(AllergeniEnum.NICKEL);
        //    primiPiatti8.addAllergeni(AllergeniEnum.GLUTINE);
        //    primiPiatti9.addAllergeni(AllergeniEnum.FRUTTA_A_GUSCIO);


        // SECONDI

        Portata arrosto = new SecondiPiatti("Arrosto di Maiale al latte", 13.0,
                "morbido arrosto di maiale avvolto in una vellutata di latte e aromi",1,
                "Patate al forno", CotturaEnum.COTTA );
        Portata manzo = new SecondiPiatti("Manzo alla Stroganoff", 14.0,
                "straccetti di manzo cotti in una salsa di panna acida, senape e funghi", 1,
                "Verdure", CotturaEnum.MEDIA);
        Portata pollo = new SecondiPiatti("Pollo al curry", 9.0,
                "bocconcini di pollo in una salsa esotica di yogurt, curry e pomodoro", 1,
                "Insalata", CotturaEnum.COTTA);
        // Pesce
        Portata salmone = new SecondiPiatti("Salmone al limone", 14.0,
                "filetti di salmone al forno profumati al limone", 2,
                "Patate al forno", CotturaEnum.SANGUE);
        Portata gamberi = new SecondiPiatti("Spiedini di gamberi e calamari", 13.0,
                "spiedini di gamberi e calamari grigliati e conditi con prezzemolo", 2,
                "Insalata", CotturaEnum.COTTA);
        Portata orata = new SecondiPiatti("Sandwich di orata alla siciliana", 12.0,
                "panini senza glutine farciti con filetti di orata cotti al forno e una crema di pomodorini secchi, capperi e olive", 2,
                "Patatine fritte", CotturaEnum.MEDIA);
        // Vegan
        Portata polpette = new SecondiPiatti("Polpette di lenticchie", 8.0,
                "polpette di lenticchie al forno o in padella con pane, aglio e prezzemolo", 3,
                "Verdure", CotturaEnum.COTTA);
        Portata tofu = new SecondiPiatti("Tofu piccante", 9.0,
                "fette di tofu alla piastra con limone e peperoncino", 3,
                "Verdure croccanti alla piastra", CotturaEnum.MEDIA);
        Portata seitan = new SecondiPiatti("Seitan al vino Rosso", 10.0,
                "seitan stufato con vino rosso, cipolla, rosmarino e senape", 3,
                "Funghi porcini", CotturaEnum.MEDIA);

        arrosto.addAllergeni(AllergeniEnum.LATTE);
        manzo.addAllergeni(AllergeniEnum.LATTE);
        pollo.addAllergeni(AllergeniEnum.ARACHIDI);
        // gamberi.addAllergeni(AllergeniEnum.CROSTACEI);
        // orata.addAllergeni(AllergeniEnum.NICKEL);
        // polpette.addAllergeni(AllergeniEnum.GLUTINE);


        // Dessert
        Portata dessert1 = new Dessert("Creme Brulee", 2.30,
                "Crema inglese cotta e sormontata da una sfoglia croccante di zucchero caramellato", 1,
                TipoDessertEnum.CREMA, ChefStellatiEnum.MARIO_PARMEGGIANI,
                "panna fresca liquida, latte, tuorli, zucchero, baccello di vaniglia");
        Portata dessert2 = new Dessert("Cheesecake alle albicocche", 5.90,
                "Base di pasta biscotto su cui poggia un alto strato di crema di formaggio fresco con topping alle albicocche.", 1,
                TipoDessertEnum.FRUTTA, ChefStellatiEnum.MARIO_PARMEGGIANI,
                "biscotti g.free, burro, philadelphia, panna fresca, zucchero gelatina alimentare," +
                        " bacche di vaniglia, confettura di albicocca");
        Portata dessert3 = new Dessert("Cheesecake al cioccolato", 5.90,
                "Base di biscotto su cui poggia un alto strato di crema di formaggio fresco con topping al cioccolato.", 1,
                TipoDessertEnum.CIOCCOLATO, ChefStellatiEnum.MARCUS_SAMUELSSON,
                "biscotti, burro, philadelphia, panna fresca, zucchero gelatina alimentare," +
                        " bacche di vaniglia, crema di cioccolato, scaglie di cioccolato fondente");
        Portata dessert4 = new Dessert("Torta setteveli", 7.40,
                "Pan di Spagna, mandorle pugliesi, mousse di nocciole del Piemonte, cioccolato Madagascar e un fondo di gianduia croccante ai cereali " , 2,
                TipoDessertEnum.CIOCCOLATO,ChefStellatiEnum.MARCUS_SAMUELSSON, "uova, zucchero, farina, cacao, crema nocciola,cereali al cioccolato,amido di riso, latte ,gelatina, panna, pasta di nocciole,cioccolato fondente, schiroppo di glucosio");
        Portata dessert5 = new Dessert("Strudel di mele", 6.38,
                "Un gustosissimo rotolo di pasta farcito con mele, uvetta, pinoli e cannella.", 2,
                TipoDessertEnum.FRUTTA, ChefStellatiEnum.VICKY_LAU,
                "mele, uvetta, marsala o vermouth, confettura di albicocca, mandorle," +
                        " panna vegetale, zucchero, cannella");
        Portata dessert6 = new Dessert("Gelo di Anguria", 3.99,
                "Il gelo di anguria (gelu di muluni in siciliano), anche detto gelo d'anguria, " + "è un tipico dolce al cucchiaio siciliano, tradizionalmente preparato a Ferragosto", 3,
                TipoDessertEnum.FRUTTA, ChefStellatiEnum.VICKY_LAU,
                "succo di anguria amido di frumento, zucchero di canna, anice, gocce di cioccolato fondente");

        dessert1.addAllergeni(AllergeniEnum.LATTE);
        dessert2.addAllergeni(AllergeniEnum.LATTE);
        dessert3.addAllergeni(AllergeniEnum.LATTE);
        dessert4.addAllergeni(AllergeniEnum.UOVA);
        dessert4.addAllergeni(AllergeniEnum.LATTE);
        dessert5.addAllergeni(AllergeniEnum.LATTE);


        //Bevande
        Portata acqua = new Bevande("Acqua naturale 0.5l", 1.00, "Acqua di Nepi",1, 0);
        Portata acquaG = new Bevande("Acqua naturale 1l", 2.00, "Boario",1, 0);
        Portata acquaFrizzante = new Bevande("Acqua frizzante 0.5l", 1.00, "Guizza",1, 0);
        Portata acquaFrizzanteG = new Bevande("Acqua frizzante 1l ", 2.00, "Natia",2, 0);
        Portata cocaColaL = new Bevande("Coca Cola", 2.00, "Lattina da 33cl", 2, 0);
        Portata cocaColaB = new Bevande("Coca Cola bottiglia", 4.00, "Bottiglia da 1.5l",2, 0);
        Portata sprite = new Bevande("Sprite", 2.00, "Lattina da 33cl",3, 0);
        Portata fanta = new Bevande("Fanta", 2.00, "Lattina da 33cl", 3,0);
        Portata birraBionda = new Bevande("Birra bionda 0.25 cl", 4.00, "Helles",3, 4.5);
        Portata birraBiondaG = new Bevande("Birra bionda 0.50 cl", 5.00, "Golden Ale",1, 5);
        Portata birraRossa = new Bevande("Birra rossa 0.25cl", 4.00, "Peroni Gran Riserva",2, 6);
        Portata birraRossaG = new Bevande("Birra rossa 0.5cl", 5.00, "McFarland", 3,6);

        menuCarne.addAllPortate(Arrays.asList(anti1, anti2, anti3, primiPiatti1, primiPiatti2, primiPiatti3, arrosto, manzo, pollo,
                dessert1, dessert2, dessert3, dessert4, dessert5, dessert6, acqua, acquaG, acquaFrizzanteG, acquaFrizzante, cocaColaB,
                cocaColaL, sprite, fanta, birraBionda, birraBiondaG, birraRossa, birraRossaG));
        Ristorante ristorante = new Ristorante("Coppa Cicuti", "San Giovanni Rotondolo", "\n\n\t\t\t"
                + UtilityColorEnum.ANSI_YELLOW_BACKGROUND.getCodice() + UtilityColorEnum.ANSI_BLACK.getCodice() +
                "  C O P P A  C I C U T I  " + UtilityColorEnum.ANSI_RESET.getCodice() + "\n" + "\t\t\t" + "L'esperienza che ferma il tempo\n" +
                "Le lancette rallentano il loro avanzare, nell’aria il racconto di piatti che emozionano al primo sguardo."
                + "\n" + " Danzatori silenziosi si muovono intorno a te per regalarti lo spettacolo di un servizio impeccabile,"
                + "\n" + " in una cornice di dettagli moreschi che parlano di storie antiche: signore e signori, " +
                "benvenuti nel Ristorante di Coppa Cicuti." + "\n\t", 50.0, "⭐⭐⭐⭐⭐",
                5, 3, 2, true);

        ristorante.getMenuList().add(menuCarne);
        Prenotazione p = new Prenotazione(2, "mario rossi");
        ristorante.prenotaTavolo(p);
        Prenotazione p1 = new Prenotazione(4, " v");
        Prenotazione p2 = new Prenotazione(1, " f");
        Prenotazione p3 = new Prenotazione(2, " s");
        Prenotazione p4 = new Prenotazione(4, " a");
        Prenotazione p5 = new Prenotazione(2, " t");
        Prenotazione p6 = new Prenotazione(5, "Flavio f");
        Prenotazione p7 = new Prenotazione(8, "bob f");
        Prenotazione cr7 = new Prenotazione(8, "cristiano ronaldo");
        ristorante.prenotaTavolo(p2);
        ristorante.prenotaTavolo(p3);
        ristorante.prenotaTavolo(p4);
        ristorante.prenotaTavolo(p5);
        ristorante.prenotaTavolo(p6);
        ristorante.prenotaTavolo(p1);
        ristorante.prenotaTavolo(p7);
        ristorante.liberaTavolaDallaCassa(p4);

        ristorante.prenotaTavoloVip(cr7);

        ristorante.prenotaTavolo(p);

        Cliente cliente1 = new Cliente("Mario", "Rossi", "320", TipologiaEnum.CARNE);
        cliente1.printInfo();
        ristorante.printGlobale();
        ristorante.printMenuCliente(cliente1.getMenuPreferito());

        AntipastiDao antipastiDao = new AntipastiDao();
//        antipastiDao.insertSQL(anti1);ù
        antipastiDao.printSQL();
    }
}