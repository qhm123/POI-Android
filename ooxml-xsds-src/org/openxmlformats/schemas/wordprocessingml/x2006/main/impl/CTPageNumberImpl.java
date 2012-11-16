/*
 * XML Type:  CT_PageNumber
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PageNumber(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPageNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber
{
    
    public CTPageNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FMT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fmt");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "start");
    private static final javax.xml.namespace.QName CHAPSTYLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "chapStyle");
    private static final javax.xml.namespace.QName CHAPSEP$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "chapSep");
    
    
    /**
     * Gets the "fmt" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum getFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMT$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmt" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat xgetFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat)get_store().find_attribute_user(FMT$0);
            return target;
        }
    }
    
    /**
     * True if has "fmt" attribute
     */
    public boolean isSetFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FMT$0) != null;
        }
    }
    
    /**
     * Sets the "fmt" attribute
     */
    public void setFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat.Enum fmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FMT$0);
            }
            target.setEnumValue(fmt);
        }
    }
    
    /**
     * Sets (as xml) the "fmt" attribute
     */
    public void xsetFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat fmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat)get_store().find_attribute_user(FMT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STNumberFormat)get_store().add_attribute_user(FMT$0);
            }
            target.set(fmt);
        }
    }
    
    /**
     * Unsets the "fmt" attribute
     */
    public void unsetFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FMT$0);
        }
    }
    
    /**
     * Gets the "start" attribute
     */
    public java.math.BigInteger getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(START$2);
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
            return get_store().find_attribute_user(START$2) != null;
        }
    }
    
    /**
     * Sets the "start" attribute
     */
    public void setStart(java.math.BigInteger start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$2);
            }
            target.setBigIntegerValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" attribute
     */
    public void xsetStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(START$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(START$2);
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
            get_store().remove_attribute(START$2);
        }
    }
    
    /**
     * Gets the "chapStyle" attribute
     */
    public java.math.BigInteger getChapStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAPSTYLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "chapStyle" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetChapStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CHAPSTYLE$4);
            return target;
        }
    }
    
    /**
     * True if has "chapStyle" attribute
     */
    public boolean isSetChapStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAPSTYLE$4) != null;
        }
    }
    
    /**
     * Sets the "chapStyle" attribute
     */
    public void setChapStyle(java.math.BigInteger chapStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAPSTYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAPSTYLE$4);
            }
            target.setBigIntegerValue(chapStyle);
        }
    }
    
    /**
     * Sets (as xml) the "chapStyle" attribute
     */
    public void xsetChapStyle(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber chapStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CHAPSTYLE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(CHAPSTYLE$4);
            }
            target.set(chapStyle);
        }
    }
    
    /**
     * Unsets the "chapStyle" attribute
     */
    public void unsetChapStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAPSTYLE$4);
        }
    }
    
    /**
     * Gets the "chapSep" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum getChapSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAPSEP$6);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "chapSep" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep xgetChapSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep)get_store().find_attribute_user(CHAPSEP$6);
            return target;
        }
    }
    
    /**
     * True if has "chapSep" attribute
     */
    public boolean isSetChapSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAPSEP$6) != null;
        }
    }
    
    /**
     * Sets the "chapSep" attribute
     */
    public void setChapSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep.Enum chapSep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAPSEP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAPSEP$6);
            }
            target.setEnumValue(chapSep);
        }
    }
    
    /**
     * Sets (as xml) the "chapSep" attribute
     */
    public void xsetChapSep(org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep chapSep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep)get_store().find_attribute_user(CHAPSEP$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STChapterSep)get_store().add_attribute_user(CHAPSEP$6);
            }
            target.set(chapSep);
        }
    }
    
    /**
     * Unsets the "chapSep" attribute
     */
    public void unsetChapSep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAPSEP$6);
        }
    }
}
