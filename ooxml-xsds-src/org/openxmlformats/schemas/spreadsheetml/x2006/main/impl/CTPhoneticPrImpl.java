/*
 * XML Type:  CT_PhoneticPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PhoneticPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPhoneticPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr
{
    
    public CTPhoneticPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONTID$0 = 
        new javax.xml.namespace.QName("", "fontId");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName ALIGNMENT$4 = 
        new javax.xml.namespace.QName("", "alignment");
    
    
    /**
     * Gets the "fontId" attribute
     */
    public long getFontId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTID$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "fontId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId xgetFontId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId)get_store().find_attribute_user(FONTID$0);
            return target;
        }
    }
    
    /**
     * Sets the "fontId" attribute
     */
    public void setFontId(long fontId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONTID$0);
            }
            target.setLongValue(fontId);
        }
    }
    
    /**
     * Sets (as xml) the "fontId" attribute
     */
    public void xsetFontId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId fontId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId)get_store().find_attribute_user(FONTID$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId)get_store().add_attribute_user(FONTID$0);
            }
            target.set(fontId);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType)get_default_attribute_value(TYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
    
    /**
     * Gets the "alignment" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment.Enum getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALIGNMENT$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "alignment" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment xgetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment)get_default_attribute_value(ALIGNMENT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "alignment" attribute
     */
    public boolean isSetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGNMENT$4) != null;
        }
    }
    
    /**
     * Sets the "alignment" attribute
     */
    public void setAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment.Enum alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENT$4);
            }
            target.setEnumValue(alignment);
        }
    }
    
    /**
     * Sets (as xml) the "alignment" attribute
     */
    public void xsetAlignment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment)get_store().add_attribute_user(ALIGNMENT$4);
            }
            target.set(alignment);
        }
    }
    
    /**
     * Unsets the "alignment" attribute
     */
    public void unsetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGNMENT$4);
        }
    }
}
