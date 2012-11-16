/*
 * XML Type:  CT_RgbColor
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RgbColor(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRgbColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRgbColor
{
    
    public CTRgbColorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RGB$0 = 
        new javax.xml.namespace.QName("", "rgb");
    
    
    /**
     * Gets the "rgb" attribute
     */
    public byte[] getRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RGB$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rgb" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(RGB$0);
            return target;
        }
    }
    
    /**
     * True if has "rgb" attribute
     */
    public boolean isSetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RGB$0) != null;
        }
    }
    
    /**
     * Sets the "rgb" attribute
     */
    public void setRgb(byte[] rgb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RGB$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RGB$0);
            }
            target.setByteArrayValue(rgb);
        }
    }
    
    /**
     * Sets (as xml) the "rgb" attribute
     */
    public void xsetRgb(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex rgb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().find_attribute_user(RGB$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex)get_store().add_attribute_user(RGB$0);
            }
            target.set(rgb);
        }
    }
    
    /**
     * Unsets the "rgb" attribute
     */
    public void unsetRgb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RGB$0);
        }
    }
}
