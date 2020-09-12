/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author hatai
 */
public class MyBean implements Serializable {
    
    public static final String FOOTBALL_VALUE_PROPERTY = "football_value";
    
    private String football_value;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getFootballValue() {
        return football_value;
    }
    
    public void setFootballValue(String value) {
        String oldValue = football_value;
        football_value = value;
        propertySupport.firePropertyChange(FOOTBALL_VALUE_PROPERTY, oldValue, football_value);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
