/*
 * XML Type:  CT_ReadingModeInkLockDown
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_ReadingModeInkLockDown(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTReadingModeInkLockDownImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown
{
    
    public CTReadingModeInkLockDownImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALPG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "actualPg");
    private static final javax.xml.namespace.QName W$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
    private static final javax.xml.namespace.QName H$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "h");
    private static final javax.xml.namespace.QName FONTSZ$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fontSz");
    
    
    /**
     * Gets the "actualPg" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum getActualPg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUALPG$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actualPg" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff xgetActualPg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ACTUALPG$0);
            return target;
        }
    }
    
    /**
     * Sets the "actualPg" attribute
     */
    public void setActualPg(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff.Enum actualPg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUALPG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUALPG$0);
            }
            target.setEnumValue(actualPg);
        }
    }
    
    /**
     * Sets (as xml) the "actualPg" attribute
     */
    public void xsetActualPg(org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff actualPg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().find_attribute_user(ACTUALPG$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff)get_store().add_attribute_user(ACTUALPG$0);
            }
            target.set(actualPg);
        }
    }
    
    /**
     * Gets the "w" attribute
     */
    public java.math.BigInteger getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure)get_store().find_attribute_user(W$2);
            return target;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(java.math.BigInteger w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$2);
            }
            target.setBigIntegerValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure)get_store().find_attribute_user(W$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure)get_store().add_attribute_user(W$2);
            }
            target.set(w);
        }
    }
    
    /**
     * Gets the "h" attribute
     */
    public java.math.BigInteger getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "h" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure xgetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure)get_store().find_attribute_user(H$4);
            return target;
        }
    }
    
    /**
     * Sets the "h" attribute
     */
    public void setH(java.math.BigInteger h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(H$4);
            }
            target.setBigIntegerValue(h);
        }
    }
    
    /**
     * Sets (as xml) the "h" attribute
     */
    public void xsetH(org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure)get_store().find_attribute_user(H$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STPixelsMeasure)get_store().add_attribute_user(H$4);
            }
            target.set(h);
        }
    }
    
    /**
     * Gets the "fontSz" attribute
     */
    public java.math.BigInteger getFontSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTSZ$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "fontSz" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetFontSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(FONTSZ$6);
            return target;
        }
    }
    
    /**
     * Sets the "fontSz" attribute
     */
    public void setFontSz(java.math.BigInteger fontSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTSZ$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONTSZ$6);
            }
            target.setBigIntegerValue(fontSz);
        }
    }
    
    /**
     * Sets (as xml) the "fontSz" attribute
     */
    public void xsetFontSz(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber fontSz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(FONTSZ$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(FONTSZ$6);
            }
            target.set(fontSz);
        }
    }
}
