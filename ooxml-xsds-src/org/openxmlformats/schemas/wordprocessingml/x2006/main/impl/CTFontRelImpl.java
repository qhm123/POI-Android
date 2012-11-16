/*
 * XML Type:  CT_FontRel
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FontRel(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontRelImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRelImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontRel
{
    
    public CTFontRelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONTKEY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fontKey");
    private static final javax.xml.namespace.QName SUBSETTED$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "subsetted");
    
    
    /**
     * Gets the "fontKey" attribute
     */
    public java.lang.String getFontKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTKEY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fontKey" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid xgetFontKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid)get_store().find_attribute_user(FONTKEY$0);
            return target;
        }
    }
    
    /**
     * True if has "fontKey" attribute
     */
    public boolean isSetFontKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FONTKEY$0) != null;
        }
    }
    
    /**
     * Sets the "fontKey" attribute
     */
    public void setFontKey(java.lang.String fontKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTKEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONTKEY$0);
            }
            target.setStringValue(fontKey);
        }
    }
    
    /**
     * Sets (as xml) the "fontKey" attribute
     */
    public void xsetFontKey(org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid fontKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid)get_store().find_attribute_user(FONTKEY$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STGuid)get_store().add_attribute_user(FONTKEY$0);
            }
            target.set(fontKey);
        }
    }
    
    /**
     * Unsets the "fontKey" attribute
     */
    public void unsetFontKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FONTKEY$0);
        }
    }
    
    /**
     * Gets the "subsetted" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getSubsetted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSETTED$2);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "subsetted" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetSubsetted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SUBSETTED$2);
            return target;
        }
    }
    
    /**
     * True if has "subsetted" attribute
     */
    public boolean isSetSubsetted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBSETTED$2) != null;
        }
    }
    
    /**
     * Sets the "subsetted" attribute
     */
    public void setSubsetted(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum subsetted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBSETTED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBSETTED$2);
            }
            target.setEnumValue(subsetted);
        }
    }
    
    /**
     * Sets (as xml) the "subsetted" attribute
     */
    public void xsetSubsetted(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff subsetted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(SUBSETTED$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(SUBSETTED$2);
            }
            target.set(subsetted);
        }
    }
    
    /**
     * Unsets the "subsetted" attribute
     */
    public void unsetSubsetted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBSETTED$2);
        }
    }
}
