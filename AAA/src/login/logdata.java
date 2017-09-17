/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author USER

*/
public class logdata 
{
    String user;
String pwd;

    public logdata(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }
public logdata()
{}

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
   
    
}
