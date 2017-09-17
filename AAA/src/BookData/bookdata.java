/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BookData;

/**
 *
 * @author USER
 */
public class bookdata 
{
    String Name;
    String BookId;
    Integer Prices;
    String Aother;
    String Publication;
    String Addition;

    public bookdata( String BookId, String Name, Integer Prices, String Aother, String Publication, String Addition) {
         this.BookId= BookId ;
        this.Name = Name;
        this.Prices = Prices;
        this.Aother = Aother;
        this.Publication = Publication;
        this.Addition = Addition;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }
    
    public bookdata()
    {}

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getPrices() {
        return Prices;
    }

    public void setPrices(Integer Prices) {
        this.Prices = Prices;
    }

    public String getAother() {
        return Aother;
    }

    public void setAother(String Aother) {
        this.Aother = Aother;
    }

    public String getPublication() {
        return Publication;
    }

    public void setPublication(String Publication) {
        this.Publication = Publication;
    }

    public String getAddition() {
        return Addition;
    }

    public void setAddition(String Addition) {
        this.Addition = Addition;
    }
    
    
}
