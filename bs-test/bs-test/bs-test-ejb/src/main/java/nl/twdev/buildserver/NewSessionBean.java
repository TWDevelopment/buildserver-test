/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.twdev.buildserver;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class NewSessionBean {

    public void businessMethod() {
        
        System.out.println("test123");
        System.out.println("test123");
        System.out.println("test123");
        System.out.println("test123");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
