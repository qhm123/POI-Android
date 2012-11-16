/*
 * XML Type:  CT_Sym
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Sym(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSymImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym
{
    
    public CTSymImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "font");
    private static final javax.xml.namespace.QName CHAR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "char");
    
    
    /**
     * Gets the "font" attribute
     */
    public java.lang.String getFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "font" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(FONT$0);
            return target;
        }
    }
    
    /**
     * True if has "font" attribute
     */
    public boolean isSetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FONT$0) != null;
        }
    }
    
    /**
     * Sets the "font" attribute
     */
    public void setFont(java.lang.String font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONT$0);
            }
            target.setStringValue(font);
        }
    }
    
    /**
     * Sets (as xml) the "font" attribute
     */
    public void xsetFont(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString font)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(FONT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(FONT$0);
            }
            target.set(font);
        }
    }
    
    /**
     * Unsets the "font" attribute
     */
    public void unsetFont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FONT$0);
        }
    }
    
    /**
     * Gets the "char" attribute
     */
    public byte[] getChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$2);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "char" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xgetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().find_attribute_user(CHAR$2);
            return target;
        }
    }
    
    /**
     * True if has "char" attribute
     */
    public boolean isSetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAR$2) != null;
        }
    }
    
    /**
     * Sets the "char" attribute
     */
    public void setChar(byte[] xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAR$2);
            }
            target.setByteArrayValue(xchar);
        }
    }
    
    /**
     * Sets (as xml) the "char" attribute
     */
    public void xsetChar(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().find_attribute_user(CHAR$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().add_attribute_user(CHAR$2);
            }
            target.set(xchar);
        }
    }
    
    /**
     * Unsets the "char" attribute
     */
    public void unsetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAR$2);
        }
    }
}
