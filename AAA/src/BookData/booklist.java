
package BookData;

import java.util.ArrayList;
import login.logdata;


public class booklist 
{
 ArrayList<bookdata>booklist;
{
booklist= new ArrayList<bookdata>();
   booklist.add(new bookdata("ID_01","Letc",150,"Yashwant Kaneatkar","Mehata@publicationHouse","5"));
    booklist.add(new bookdata("ID_20","yayati",300,"Raj N k","Mehata@publicationHouse","1"));
    booklist.add(new bookdata("ID_05","Think on",520,"N.S.mahi","Wtd","2"));
    booklist.add(new bookdata("ID_03","Letc",320,"Yashwant Kaneatkar","JoshipublicationHouse","4"));
    booklist.add(new bookdata("ID_08","Genral Apptitude ",250,"Yashwant Kaneatkar","Agarawalpublication","9"));
    booklist.add(new bookdata("ID_51","CDS Study Material",600,"s.s Joshi","ArihantpublicationHouse","7"));
    booklist.add(new bookdata("ID_23","SSB Intervie",450,"N.S Natraj","NaterajpublicationHouse","3"));
    booklist.add(new bookdata("ID_10","c++",250,"Yashwant Kaneatkar","publicationHouse","2"));
    booklist.add(new bookdata("ID_1","commputer networks",250,"Achute Godbole","Mehata@publicationHouse","7"));
    booklist.add(new bookdata("ID_04","Chawa",350,"Shiwaji Savant","worldpublicationHouse","3"));
    }

    public ArrayList<bookdata> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<bookdata> booklist) {
        this.booklist = booklist;
    }

  
  
    

   

    
    
    
    

    
    
}    
