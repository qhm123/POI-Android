/*
 * XML Type:  CT_TextPath
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTTextPath
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_TextPath(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTTextPathImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTTextPath
{
    
    public CTTextPathImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName ON$4 = 
        new javax.xml.namespace.QName("", "on");
    private static final javax.xml.namespace.QName FITSHAPE$6 = 
        new javax.xml.namespace.QName("", "fitshape");
    private static final javax.xml.namespace.QName FITPATH$8 = 
        new javax.xml.namespace.QName("", "fitpath");
    private static final javax.xml.namespace.QName TRIM$10 = 
        new javax.xml.namespace.QName("", "trim");
    private static final javax.xml.namespace.QName XSCALE$12 = 
        new javax.xml.namespace.QName("", "xscale");
    private static final javax.xml.namespace.QName STRING$14 = 
        new javax.xml.namespace.QName("", "string");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$0) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public java.lang.String getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$2);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$2) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$2);
            }
            target.setStringValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.apache.xmlbeans.XmlString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$2);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$2);
        }
    }
    
    /**
     * Gets the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "on" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$4);
            return target;
        }
    }
    
    /**
     * True if has "on" attribute
     */
    public boolean isSetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ON$4) != null;
        }
    }
    
    /**
     * Sets the "on" attribute
     */
    public void setOn(schemasMicrosoftComVml.STTrueFalse.Enum on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ON$4);
            }
            target.setEnumValue(on);
        }
    }
    
    /**
     * Sets (as xml) the "on" attribute
     */
    public void xsetOn(schemasMicrosoftComVml.STTrueFalse on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ON$4);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ON$4);
            }
            target.set(on);
        }
    }
    
    /**
     * Unsets the "on" attribute
     */
    public void unsetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ON$4);
        }
    }
    
    /**
     * Gets the "fitshape" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getFitshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITSHAPE$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fitshape" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetFitshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FITSHAPE$6);
            return target;
        }
    }
    
    /**
     * True if has "fitshape" attribute
     */
    public boolean isSetFitshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FITSHAPE$6) != null;
        }
    }
    
    /**
     * Sets the "fitshape" attribute
     */
    public void setFitshape(schemasMicrosoftComVml.STTrueFalse.Enum fitshape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITSHAPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITSHAPE$6);
            }
            target.setEnumValue(fitshape);
        }
    }
    
    /**
     * Sets (as xml) the "fitshape" attribute
     */
    public void xsetFitshape(schemasMicrosoftComVml.STTrueFalse fitshape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FITSHAPE$6);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(FITSHAPE$6);
            }
            target.set(fitshape);
        }
    }
    
    /**
     * Unsets the "fitshape" attribute
     */
    public void unsetFitshape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FITSHAPE$6);
        }
    }
    
    /**
     * Gets the "fitpath" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getFitpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITPATH$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fitpath" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetFitpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FITPATH$8);
            return target;
        }
    }
    
    /**
     * True if has "fitpath" attribute
     */
    public boolean isSetFitpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FITPATH$8) != null;
        }
    }
    
    /**
     * Sets the "fitpath" attribute
     */
    public void setFitpath(schemasMicrosoftComVml.STTrueFalse.Enum fitpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FITPATH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FITPATH$8);
            }
            target.setEnumValue(fitpath);
        }
    }
    
    /**
     * Sets (as xml) the "fitpath" attribute
     */
    public void xsetFitpath(schemasMicrosoftComVml.STTrueFalse fitpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FITPATH$8);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(FITPATH$8);
            }
            target.set(fitpath);
        }
    }
    
    /**
     * Unsets the "fitpath" attribute
     */
    public void unsetFitpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FITPATH$8);
        }
    }
    
    /**
     * Gets the "trim" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getTrim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIM$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "trim" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetTrim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(TRIM$10);
            return target;
        }
    }
    
    /**
     * True if has "trim" attribute
     */
    public boolean isSetTrim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRIM$10) != null;
        }
    }
    
    /**
     * Sets the "trim" attribute
     */
    public void setTrim(schemasMicrosoftComVml.STTrueFalse.Enum trim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRIM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRIM$10);
            }
            target.setEnumValue(trim);
        }
    }
    
    /**
     * Sets (as xml) the "trim" attribute
     */
    public void xsetTrim(schemasMicrosoftComVml.STTrueFalse trim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(TRIM$10);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(TRIM$10);
            }
            target.set(trim);
        }
    }
    
    /**
     * Unsets the "trim" attribute
     */
    public void unsetTrim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRIM$10);
        }
    }
    
    /**
     * Gets the "xscale" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getXscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XSCALE$12);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "xscale" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetXscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(XSCALE$12);
            return target;
        }
    }
    
    /**
     * True if has "xscale" attribute
     */
    public boolean isSetXscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XSCALE$12) != null;
        }
    }
    
    /**
     * Sets the "xscale" attribute
     */
    public void setXscale(schemasMicrosoftComVml.STTrueFalse.Enum xscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XSCALE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XSCALE$12);
            }
            target.setEnumValue(xscale);
        }
    }
    
    /**
     * Sets (as xml) the "xscale" attribute
     */
    public void xsetXscale(schemasMicrosoftComVml.STTrueFalse xscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(XSCALE$12);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(XSCALE$12);
            }
            target.set(xscale);
        }
    }
    
    /**
     * Unsets the "xscale" attribute
     */
    public void unsetXscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XSCALE$12);
        }
    }
    
    /**
     * Gets the "string" attribute
     */
    public java.lang.String getString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "string" attribute
     */
    public org.apache.xmlbeans.XmlString xgetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRING$14);
            return target;
        }
    }
    
    /**
     * True if has "string" attribute
     */
    public boolean isSetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRING$14) != null;
        }
    }
    
    /**
     * Sets the "string" attribute
     */
    public void setString(java.lang.String string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRING$14);
            }
            target.setStringValue(string);
        }
    }
    
    /**
     * Sets (as xml) the "string" attribute
     */
    public void xsetString(org.apache.xmlbeans.XmlString string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRING$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRING$14);
            }
            target.set(string);
        }
    }
    
    /**
     * Unsets the "string" attribute
     */
    public void unsetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRING$14);
        }
    }
}
