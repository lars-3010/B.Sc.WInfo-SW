/**
 * This is the class "Article"
 * @author Lars
 *
 */
public class Article {
    private int id;
    private String name;
    private int inStock;
    private int salesPrice;

    public int getId() {
        return this.id; // @return die ID des Artikels
    }

    public void setId(int id) {
        this.id = id; // @param id die neue ID des Artikels
    }

    public String getName() {
        return this.name; // @return der Name des Artikels
    }

    public void setName(String name) {
        this.name = name; // @param name der neue Name des Artikels
    }

    public int getInStock() {
        return this.inStock; // @return die Anzahl der auf Lager befindlichen Artikel
    }
    public void setInStock(int inStock) {
        this.inStock = inStock; // @param inStock die neue Anzahl der auf Lager befindlichen Artikel
    }
    public int getSalesPrice() {
        return this.salesPrice; // @return der Verkaufspreis des Artikels
    }
    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice; // @param salesPrice der neue Verkaufspreis des Artikels
    }

}