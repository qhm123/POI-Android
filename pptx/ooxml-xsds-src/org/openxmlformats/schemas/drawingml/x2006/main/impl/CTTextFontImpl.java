/*
 * XML Type:  CT_TextFont
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextFont(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextFontImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont
{
    
    public CTTextFontImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEFACE$0 = 
        new javax.xml.namespace.QName("", "typeface");
    private static final javax.xml.namespace.QName PANOSE$2 = 
        new javax.xml.namespace.QName("", "panose");
    private static final javax.xml.namespace.QName PITCHFAMILY$4 = 
        new javax.xml.namespace.QName("", "pitchFamily");
    private static final javax.xml.namespace.QName CHARSET$6 = 
        new javax.xml.namespace.QName("", "charset");
    
    
    /**
     * Gets the "typeface" attribute
     */
    public java.lang.String getTypeface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEFACE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeface" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface xgetTypeface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface)get_store().find_attribute_user(TYPEFACE$0);
            return target;
        }
    }
    
    /**
     * True if has "typeface" attribute
     */
    public boolean isSetTypeface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPEFACE$0) != null;
        }
    }
    
    /**
     * Sets the "typeface" attribute
     */
    public void setTypeface(java.lang.String typeface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEFACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEFACE$0);
            }
            target.setStringValue(typeface);
        }
    }
    
    /**
     * Sets (as xml) the "typeface" attribute
     */
    public void xsetTypeface(org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface typeface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface)get_store().find_attribute_user(TYPEFACE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface)get_store().add_attribute_user(TYPEFACE$0);
            }
            target.set(typeface);
        }
    }
    
    /**
     * Unsets the "typeface" attribute
     */
    public void unsetTypeface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPEFACE$0);
        }
    }
    
    /**
     * Gets the "panose" attribute
     */
    public byte[] getPanose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PANOSE$2);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "panose" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPanose xgetPanose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPanose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPanose)get_store().find_attribute_user(PANOSE$2);
            return target;
        }
    }
    
    /**
     * True if has "panose" attribute
     */
    public boolean isSetPanose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PANOSE$2) != null;
        }
    }
    
    /**
     * Sets the "panose" attribute
     */
    public void setPanose(byte[] panose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PANOSE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PANOSE$2);
            }
            target.setByteArrayValue(panose);
        }
    }
    
    /**
     * Sets (as xml) the "panose" attribute
     */
    public void xsetPanose(org.openxmlformats.schemas.drawingml.x2006.main.STPanose panose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPanose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPanose)get_store().find_attribute_user(PANOSE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPanose)get_store().add_attribute_user(PANOSE$2);
            }
            target.set(panose);
        }
    }
    
    /**
     * Unsets the "panose" attribute
     */
    public void unsetPanose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PANOSE$2);
        }
    }
    
    /**
     * Gets the "pitchFamily" attribute
     */
    public byte getPitchFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PITCHFAMILY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PITCHFAMILY$4);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "pitchFamily" attribute
     */
    public org.apache.xmlbeans.XmlByte xgetPitchFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_attribute_user(PITCHFAMILY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_default_attribute_value(PITCHFAMILY$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "pitchFamily" attribute
     */
    public boolean isSetPitchFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PITCHFAMILY$4) != null;
        }
    }
    
    /**
     * Sets the "pitchFamily" attribute
     */
    public void setPitchFamily(byte pitchFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PITCHFAMILY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PITCHFAMILY$4);
            }
            target.setByteValue(pitchFamily);
        }
    }
    
    /**
     * Sets (as xml) the "pitchFamily" attribute
     */
    public void xsetPitchFamily(org.apache.xmlbeans.XmlByte pitchFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_attribute_user(PITCHFAMILY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_attribute_user(PITCHFAMILY$4);
            }
            target.set(pitchFamily);
        }
    }
    
    /**
     * Unsets the "pitchFamily" attribute
     */
    public void unsetPitchFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PITCHFAMILY$4);
        }
    }
    
    /**
     * Gets the "charset" attribute
     */
    public byte getCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CHARSET$6);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "charset" attribute
     */
    public org.apache.xmlbeans.XmlByte xgetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_attribute_user(CHARSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_default_attribute_value(CHARSET$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "charset" attribute
     */
    public boolean isSetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHARSET$6) != null;
        }
    }
    
    /**
     * Sets the "charset" attribute
     */
    public void setCharset(byte charset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARSET$6);
            }
            target.setByteValue(charset);
        }
    }
    
    /**
     * Sets (as xml) the "charset" attribute
     */
    public void xsetCharset(org.apache.xmlbeans.XmlByte charset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_attribute_user(CHARSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_attribute_user(CHARSET$6);
            }
            target.set(charset);
        }
    }
    
    /**
     * Unsets the "charset" attribute
     */
    public void unsetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHARSET$6);
        }
    }
}
