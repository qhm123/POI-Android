/*
 * XML Type:  CT_Path
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTPath
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Path(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTPathImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTPath
{
    
    public CTPathImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName V$2 = 
        new javax.xml.namespace.QName("", "v");
    private static final javax.xml.namespace.QName LIMO$4 = 
        new javax.xml.namespace.QName("", "limo");
    private static final javax.xml.namespace.QName TEXTBOXRECT$6 = 
        new javax.xml.namespace.QName("", "textboxrect");
    private static final javax.xml.namespace.QName FILLOK$8 = 
        new javax.xml.namespace.QName("", "fillok");
    private static final javax.xml.namespace.QName STROKEOK$10 = 
        new javax.xml.namespace.QName("", "strokeok");
    private static final javax.xml.namespace.QName SHADOWOK$12 = 
        new javax.xml.namespace.QName("", "shadowok");
    private static final javax.xml.namespace.QName ARROWOK$14 = 
        new javax.xml.namespace.QName("", "arrowok");
    private static final javax.xml.namespace.QName GRADIENTSHAPEOK$16 = 
        new javax.xml.namespace.QName("", "gradientshapeok");
    private static final javax.xml.namespace.QName TEXTPATHOK$18 = 
        new javax.xml.namespace.QName("", "textpathok");
    private static final javax.xml.namespace.QName INSETPENOK$20 = 
        new javax.xml.namespace.QName("", "insetpenok");
    private static final javax.xml.namespace.QName CONNECTTYPE$22 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connecttype");
    private static final javax.xml.namespace.QName CONNECTLOCS$24 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connectlocs");
    private static final javax.xml.namespace.QName CONNECTANGLES$26 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connectangles");
    private static final javax.xml.namespace.QName EXTRUSIONOK$28 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "extrusionok");
    
    
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
     * Gets the "v" attribute
     */
    public java.lang.String getV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "v" attribute
     */
    public org.apache.xmlbeans.XmlString xgetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(V$2);
            return target;
        }
    }
    
    /**
     * True if has "v" attribute
     */
    public boolean isSetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(V$2) != null;
        }
    }
    
    /**
     * Sets the "v" attribute
     */
    public void setV(java.lang.String v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(V$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(V$2);
            }
            target.setStringValue(v);
        }
    }
    
    /**
     * Sets (as xml) the "v" attribute
     */
    public void xsetV(org.apache.xmlbeans.XmlString v)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(V$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(V$2);
            }
            target.set(v);
        }
    }
    
    /**
     * Unsets the "v" attribute
     */
    public void unsetV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(V$2);
        }
    }
    
    /**
     * Gets the "limo" attribute
     */
    public java.lang.String getLimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIMO$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "limo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIMO$4);
            return target;
        }
    }
    
    /**
     * True if has "limo" attribute
     */
    public boolean isSetLimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LIMO$4) != null;
        }
    }
    
    /**
     * Sets the "limo" attribute
     */
    public void setLimo(java.lang.String limo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIMO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIMO$4);
            }
            target.setStringValue(limo);
        }
    }
    
    /**
     * Sets (as xml) the "limo" attribute
     */
    public void xsetLimo(org.apache.xmlbeans.XmlString limo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIMO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIMO$4);
            }
            target.set(limo);
        }
    }
    
    /**
     * Unsets the "limo" attribute
     */
    public void unsetLimo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LIMO$4);
        }
    }
    
    /**
     * Gets the "textboxrect" attribute
     */
    public java.lang.String getTextboxrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBOXRECT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "textboxrect" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTextboxrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTBOXRECT$6);
            return target;
        }
    }
    
    /**
     * True if has "textboxrect" attribute
     */
    public boolean isSetTextboxrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTBOXRECT$6) != null;
        }
    }
    
    /**
     * Sets the "textboxrect" attribute
     */
    public void setTextboxrect(java.lang.String textboxrect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBOXRECT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTBOXRECT$6);
            }
            target.setStringValue(textboxrect);
        }
    }
    
    /**
     * Sets (as xml) the "textboxrect" attribute
     */
    public void xsetTextboxrect(org.apache.xmlbeans.XmlString textboxrect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTBOXRECT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTBOXRECT$6);
            }
            target.set(textboxrect);
        }
    }
    
    /**
     * Unsets the "textboxrect" attribute
     */
    public void unsetTextboxrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTBOXRECT$6);
        }
    }
    
    /**
     * Gets the "fillok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getFillok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLOK$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fillok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetFillok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLOK$8);
            return target;
        }
    }
    
    /**
     * True if has "fillok" attribute
     */
    public boolean isSetFillok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLOK$8) != null;
        }
    }
    
    /**
     * Sets the "fillok" attribute
     */
    public void setFillok(schemasMicrosoftComVml.STTrueFalse.Enum fillok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLOK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLOK$8);
            }
            target.setEnumValue(fillok);
        }
    }
    
    /**
     * Sets (as xml) the "fillok" attribute
     */
    public void xsetFillok(schemasMicrosoftComVml.STTrueFalse fillok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLOK$8);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(FILLOK$8);
            }
            target.set(fillok);
        }
    }
    
    /**
     * Unsets the "fillok" attribute
     */
    public void unsetFillok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLOK$8);
        }
    }
    
    /**
     * Gets the "strokeok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getStrokeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKEOK$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "strokeok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetStrokeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(STROKEOK$10);
            return target;
        }
    }
    
    /**
     * True if has "strokeok" attribute
     */
    public boolean isSetStrokeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKEOK$10) != null;
        }
    }
    
    /**
     * Sets the "strokeok" attribute
     */
    public void setStrokeok(schemasMicrosoftComVml.STTrueFalse.Enum strokeok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKEOK$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKEOK$10);
            }
            target.setEnumValue(strokeok);
        }
    }
    
    /**
     * Sets (as xml) the "strokeok" attribute
     */
    public void xsetStrokeok(schemasMicrosoftComVml.STTrueFalse strokeok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(STROKEOK$10);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(STROKEOK$10);
            }
            target.set(strokeok);
        }
    }
    
    /**
     * Unsets the "strokeok" attribute
     */
    public void unsetStrokeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKEOK$10);
        }
    }
    
    /**
     * Gets the "shadowok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getShadowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOWOK$12);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "shadowok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetShadowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(SHADOWOK$12);
            return target;
        }
    }
    
    /**
     * True if has "shadowok" attribute
     */
    public boolean isSetShadowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHADOWOK$12) != null;
        }
    }
    
    /**
     * Sets the "shadowok" attribute
     */
    public void setShadowok(schemasMicrosoftComVml.STTrueFalse.Enum shadowok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHADOWOK$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHADOWOK$12);
            }
            target.setEnumValue(shadowok);
        }
    }
    
    /**
     * Sets (as xml) the "shadowok" attribute
     */
    public void xsetShadowok(schemasMicrosoftComVml.STTrueFalse shadowok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(SHADOWOK$12);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(SHADOWOK$12);
            }
            target.set(shadowok);
        }
    }
    
    /**
     * Unsets the "shadowok" attribute
     */
    public void unsetShadowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHADOWOK$12);
        }
    }
    
    /**
     * Gets the "arrowok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getArrowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARROWOK$14);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "arrowok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetArrowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ARROWOK$14);
            return target;
        }
    }
    
    /**
     * True if has "arrowok" attribute
     */
    public boolean isSetArrowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARROWOK$14) != null;
        }
    }
    
    /**
     * Sets the "arrowok" attribute
     */
    public void setArrowok(schemasMicrosoftComVml.STTrueFalse.Enum arrowok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARROWOK$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARROWOK$14);
            }
            target.setEnumValue(arrowok);
        }
    }
    
    /**
     * Sets (as xml) the "arrowok" attribute
     */
    public void xsetArrowok(schemasMicrosoftComVml.STTrueFalse arrowok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(ARROWOK$14);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(ARROWOK$14);
            }
            target.set(arrowok);
        }
    }
    
    /**
     * Unsets the "arrowok" attribute
     */
    public void unsetArrowok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARROWOK$14);
        }
    }
    
    /**
     * Gets the "gradientshapeok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getGradientshapeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRADIENTSHAPEOK$16);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "gradientshapeok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetGradientshapeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(GRADIENTSHAPEOK$16);
            return target;
        }
    }
    
    /**
     * True if has "gradientshapeok" attribute
     */
    public boolean isSetGradientshapeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRADIENTSHAPEOK$16) != null;
        }
    }
    
    /**
     * Sets the "gradientshapeok" attribute
     */
    public void setGradientshapeok(schemasMicrosoftComVml.STTrueFalse.Enum gradientshapeok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRADIENTSHAPEOK$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRADIENTSHAPEOK$16);
            }
            target.setEnumValue(gradientshapeok);
        }
    }
    
    /**
     * Sets (as xml) the "gradientshapeok" attribute
     */
    public void xsetGradientshapeok(schemasMicrosoftComVml.STTrueFalse gradientshapeok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(GRADIENTSHAPEOK$16);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(GRADIENTSHAPEOK$16);
            }
            target.set(gradientshapeok);
        }
    }
    
    /**
     * Unsets the "gradientshapeok" attribute
     */
    public void unsetGradientshapeok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRADIENTSHAPEOK$16);
        }
    }
    
    /**
     * Gets the "textpathok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getTextpathok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTPATHOK$18);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "textpathok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetTextpathok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(TEXTPATHOK$18);
            return target;
        }
    }
    
    /**
     * True if has "textpathok" attribute
     */
    public boolean isSetTextpathok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTPATHOK$18) != null;
        }
    }
    
    /**
     * Sets the "textpathok" attribute
     */
    public void setTextpathok(schemasMicrosoftComVml.STTrueFalse.Enum textpathok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTPATHOK$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTPATHOK$18);
            }
            target.setEnumValue(textpathok);
        }
    }
    
    /**
     * Sets (as xml) the "textpathok" attribute
     */
    public void xsetTextpathok(schemasMicrosoftComVml.STTrueFalse textpathok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(TEXTPATHOK$18);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(TEXTPATHOK$18);
            }
            target.set(textpathok);
        }
    }
    
    /**
     * Unsets the "textpathok" attribute
     */
    public void unsetTextpathok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTPATHOK$18);
        }
    }
    
    /**
     * Gets the "insetpenok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getInsetpenok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETPENOK$20);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insetpenok" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetInsetpenok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INSETPENOK$20);
            return target;
        }
    }
    
    /**
     * True if has "insetpenok" attribute
     */
    public boolean isSetInsetpenok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSETPENOK$20) != null;
        }
    }
    
    /**
     * Sets the "insetpenok" attribute
     */
    public void setInsetpenok(schemasMicrosoftComVml.STTrueFalse.Enum insetpenok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETPENOK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETPENOK$20);
            }
            target.setEnumValue(insetpenok);
        }
    }
    
    /**
     * Sets (as xml) the "insetpenok" attribute
     */
    public void xsetInsetpenok(schemasMicrosoftComVml.STTrueFalse insetpenok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INSETPENOK$20);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(INSETPENOK$20);
            }
            target.set(insetpenok);
        }
    }
    
    /**
     * Unsets the "insetpenok" attribute
     */
    public void unsetInsetpenok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSETPENOK$20);
        }
    }
    
    /**
     * Gets the "connecttype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectType.Enum getConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTTYPE$22);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STConnectType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "connecttype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectType xgetConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectType)get_store().find_attribute_user(CONNECTTYPE$22);
            return target;
        }
    }
    
    /**
     * True if has "connecttype" attribute
     */
    public boolean isSetConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTTYPE$22) != null;
        }
    }
    
    /**
     * Sets the "connecttype" attribute
     */
    public void setConnecttype(schemasMicrosoftComOfficeOffice.STConnectType.Enum connecttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTTYPE$22);
            }
            target.setEnumValue(connecttype);
        }
    }
    
    /**
     * Sets (as xml) the "connecttype" attribute
     */
    public void xsetConnecttype(schemasMicrosoftComOfficeOffice.STConnectType connecttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectType)get_store().find_attribute_user(CONNECTTYPE$22);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STConnectType)get_store().add_attribute_user(CONNECTTYPE$22);
            }
            target.set(connecttype);
        }
    }
    
    /**
     * Unsets the "connecttype" attribute
     */
    public void unsetConnecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTTYPE$22);
        }
    }
    
    /**
     * Gets the "connectlocs" attribute
     */
    public java.lang.String getConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTLOCS$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectlocs" attribute
     */
    public org.apache.xmlbeans.XmlString xgetConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTLOCS$24);
            return target;
        }
    }
    
    /**
     * True if has "connectlocs" attribute
     */
    public boolean isSetConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTLOCS$24) != null;
        }
    }
    
    /**
     * Sets the "connectlocs" attribute
     */
    public void setConnectlocs(java.lang.String connectlocs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTLOCS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTLOCS$24);
            }
            target.setStringValue(connectlocs);
        }
    }
    
    /**
     * Sets (as xml) the "connectlocs" attribute
     */
    public void xsetConnectlocs(org.apache.xmlbeans.XmlString connectlocs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTLOCS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTLOCS$24);
            }
            target.set(connectlocs);
        }
    }
    
    /**
     * Unsets the "connectlocs" attribute
     */
    public void unsetConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTLOCS$24);
        }
    }
    
    /**
     * Gets the "connectangles" attribute
     */
    public java.lang.String getConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTANGLES$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectangles" attribute
     */
    public org.apache.xmlbeans.XmlString xgetConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTANGLES$26);
            return target;
        }
    }
    
    /**
     * True if has "connectangles" attribute
     */
    public boolean isSetConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTANGLES$26) != null;
        }
    }
    
    /**
     * Sets the "connectangles" attribute
     */
    public void setConnectangles(java.lang.String connectangles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTANGLES$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTANGLES$26);
            }
            target.setStringValue(connectangles);
        }
    }
    
    /**
     * Sets (as xml) the "connectangles" attribute
     */
    public void xsetConnectangles(org.apache.xmlbeans.XmlString connectangles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTANGLES$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTANGLES$26);
            }
            target.set(connectangles);
        }
    }
    
    /**
     * Unsets the "connectangles" attribute
     */
    public void unsetConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTANGLES$26);
        }
    }
    
    /**
     * Gets the "extrusionok" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONOK$28);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "extrusionok" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(EXTRUSIONOK$28);
            return target;
        }
    }
    
    /**
     * True if has "extrusionok" attribute
     */
    public boolean isSetExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTRUSIONOK$28) != null;
        }
    }
    
    /**
     * Sets the "extrusionok" attribute
     */
    public void setExtrusionok(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum extrusionok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONOK$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTRUSIONOK$28);
            }
            target.setEnumValue(extrusionok);
        }
    }
    
    /**
     * Sets (as xml) the "extrusionok" attribute
     */
    public void xsetExtrusionok(schemasMicrosoftComOfficeOffice.STTrueFalse extrusionok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(EXTRUSIONOK$28);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(EXTRUSIONOK$28);
            }
            target.set(extrusionok);
        }
    }
    
    /**
     * Unsets the "extrusionok" attribute
     */
    public void unsetExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTRUSIONOK$28);
        }
    }
}
