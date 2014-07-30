/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author magdiel-bruno
 */
@ManagedBean(name = "person")
@RequestScoped
public class PersonBean {
    
    private String phone;
    
    /**
     * Creates a new instance of PersonBean
     */
    public PersonBean() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
