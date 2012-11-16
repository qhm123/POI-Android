/*
 * XML Type:  CT_Proxy
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTProxy
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Proxy(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTProxyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTProxy
{
    
    public CTProxyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("", "start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("", "end");
    private static final javax.xml.namespace.QName IDREF$4 = 
        new javax.xml.namespace.QName("", "idref");
    private static final javax.xml.namespace.QName CONNECTLOC$6 = 
        new javax.xml.namespace.QName("", "connectloc");
    
    
    /**
     * Gets the "start" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(START$0);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_default_attribute_value(START$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "start" attribute
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(START$0) != null;
        }
    }
    
    /**
     * Sets the "start" attribute
     */
    public void setStart(schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$0);
            }
            target.setEnumValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" attribute
     */
    public void xsetStart(schemasMicrosoftComOfficeOffice.STTrueFalseBlank start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(START$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().add_attribute_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Unsets the "start" attribute
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(START$0);
        }
    }
    
    /**
     * Gets the "end" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(END$2);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_default_attribute_value(END$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "end" attribute
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(END$2) != null;
        }
    }
    
    /**
     * Sets the "end" attribute
     */
    public void setEnd(schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$2);
            }
            target.setEnumValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" attribute
     */
    public void xsetEnd(schemasMicrosoftComOfficeOffice.STTrueFalseBlank end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().add_attribute_user(END$2);
            }
            target.set(end);
        }
    }
    
    /**
     * Unsets the "end" attribute
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(END$2);
        }
    }
    
    /**
     * Gets the "idref" attribute
     */
    public java.lang.String getIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDREF$4);
            return target;
        }
    }
    
    /**
     * True if has "idref" attribute
     */
    public boolean isSetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDREF$4) != null;
        }
    }
    
    /**
     * Sets the "idref" attribute
     */
    public void setIdref(java.lang.String idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDREF$4);
            }
            target.setStringValue(idref);
        }
    }
    
    /**
     * Sets (as xml) the "idref" attribute
     */
    public void xsetIdref(org.apache.xmlbeans.XmlString idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDREF$4);
            }
            target.set(idref);
        }
    }
    
    /**
     * Unsets the "idref" attribute
     */
    public void unsetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDREF$4);
        }
    }
    
    /**
     * Gets the "connectloc" attribute
     */
    public int getConnectloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTLOC$6);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectloc" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetConnectloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CONNECTLOC$6);
            return target;
        }
    }
    
    /**
     * True if has "connectloc" attribute
     */
    public boolean isSetConnectloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTLOC$6) != null;
        }
    }
    
    /**
     * Sets the "connectloc" attribute
     */
    public void setConnectloc(int connectloc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTLOC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTLOC$6);
            }
            target.setIntValue(connectloc);
        }
    }
    
    /**
     * Sets (as xml) the "connectloc" attribute
     */
    public void xsetConnectloc(org.apache.xmlbeans.XmlInt connectloc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CONNECTLOC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CONNECTLOC$6);
            }
            target.set(connectloc);
        }
    }
    
    /**
     * Unsets the "connectloc" attribute
     */
    public void unsetConnectloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTLOC$6);
        }
    }
}
