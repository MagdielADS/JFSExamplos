/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.praticas.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author magdiel-bruno
 */
public class PhoneConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String phone;
        phone = value.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\\-", "");
        return phone;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String phone = (String) value;
        phone = "(" + phone.substring(0, 2) + ")" + phone.substring(2, 6) + "-" + phone.substring(6, 10);
        return phone;
    }
    
}
