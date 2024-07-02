/**
 * This is the class "ArticleApp" which uses the class Article
 * @author Lars
 *
 */
public class ArticleApp {
    public static void main(String[] args) throws Exception {
        
        Article article1 = new Article();
        Article article2 = new Article();

        // Setzen der Eigenschaften für Artikel 1
        article1.setId(1);
        article1.setName("Nudeln");
        article1.setInStock(10);
        article1.setSalesPrice(3);

        // Setzen der Eigenschaften für Artikel 2
        article2.setId(7);
        article2.setName("Pesto");
        article2.setInStock(20);
        article2.setSalesPrice(2);
        
        // Ausgabe der Eigenschaften für Artikel 1 und 2
        System.out.println(article1.getName() + " Id: " + article1.getId() + "," 
                                              + " InStock: " + article1.getInStock() + ","
                                              + " SalesPrice: " + article1.getSalesPrice() + ""); 

        System.out.println(article2.getName() + " Id: " + article2.getId() + "," 
                                              + " InStock: " + article2.getInStock() + ","
                                              + " SalesPrice: " + article2.getSalesPrice() + "");
        
                                              
    }                                          
}