/*
 * XML Type:  CT_PatternFill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PatternFill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPatternFillImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill
{
    
    public CTPatternFillImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FGCOLOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fgColor");
    private static final javax.xml.namespace.QName BGCOLOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bgColor");
    private static final javax.xml.namespace.QName PATTERNTYPE$4 = 
        new javax.xml.namespace.QName("", "patternType");
    
    
    /**
     * Gets the "fgColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getFgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(FGCOLOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fgColor" element
     */
    public boolean isSetFgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FGCOLOR$0) != 0;
        }
    }
    
    /**
     * Sets the "fgColor" element
     */
    public void setFgColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor fgColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(FGCOLOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(FGCOLOR$0);
            }
            target.set(fgColor);
        }
    }
    
    /**
     * Appends and returns a new empty "fgColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewFgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(FGCOLOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fgColor" element
     */
    public void unsetFgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FGCOLOR$0, 0);
        }
    }
    
    /**
     * Gets the "bgColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getBgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(BGCOLOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bgColor" element
     */
    public boolean isSetBgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGCOLOR$2) != 0;
        }
    }
    
    /**
     * Sets the "bgColor" element
     */
    public void setBgColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor bgColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(BGCOLOR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(BGCOLOR$2);
            }
            target.set(bgColor);
        }
    }
    
    /**
     * Appends and returns a new empty "bgColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewBgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(BGCOLOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bgColor" element
     */
    public void unsetBgColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGCOLOR$2, 0);
        }
    }
    
    /**
     * Gets the "patternType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum getPatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERNTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "patternType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType xgetPatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType)get_store().find_attribute_user(PATTERNTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "patternType" attribute
     */
    public boolean isSetPatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATTERNTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "patternType" attribute
     */
    public void setPatternType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType.Enum patternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERNTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATTERNTYPE$4);
            }
            target.setEnumValue(patternType);
        }
    }
    
    /**
     * Sets (as xml) the "patternType" attribute
     */
    public void xsetPatternType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType patternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType)get_store().find_attribute_user(PATTERNTYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType)get_store().add_attribute_user(PATTERNTYPE$4);
            }
            target.set(patternType);
        }
    }
    
    /**
     * Unsets the "patternType" attribute
     */
    public void unsetPatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATTERNTYPE$4);
        }
    }
}
