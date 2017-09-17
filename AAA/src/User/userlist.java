/*ayyLiliccausnew erstthange this template, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.ArrayList;
import login.logdata;

/**
 *
 * @author USER
 */
public class userlist {
    ArrayList<logdata>userlist; 

   /* public userlist(ArrayList<logdata> userlit) {
        this.userlit = userlit;
    }*/
    public userlist()
    {userlist= new ArrayList<logdata>();
    userlist.add(new logdata("A","A"));
    userlist.add(new logdata("Ram","12345"));
    userlist.add(new logdata("Sita","1548"));
    userlist.add(new logdata("Gita","A4152"));
    }
    

    public ArrayList<logdata> getUserlit() {
        return userlist;
    }

    public void setUserlit(ArrayList<logdata> userlit) {
        this.userlist = userlit;
    }
    
    
}
