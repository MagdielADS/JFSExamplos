/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.praticas.validator;

import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author magdiel-bruno
 */
public class PhoneValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(!validatePhone(String.valueOf(value))){
            FacesMessage message = new FacesMessage();
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            message.setSummary("Formato incorreto ou quantidade de caracteres insuficiente, insira apenas numeros!");
            throw new ValidatorException(message);
        }
    }
    
    public static boolean validatePhone(String phone){
        if((!differentNumber(phone)) || (phone.length() != 10)){
            return false;
        }
        return true;
    }
    
    public static boolean differentNumber(String phone){
        long ph;
        try{
            ph = Long.parseLong(phone);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
