/*
 * XML Type:  CT_PatternFillProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_PatternFillProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPatternFillPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties
{
    
    public CTPatternFillPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FGCLR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fgClr");
    private static final javax.xml.namespace.QName BGCLR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bgClr");
    private static final javax.xml.namespace.QName PRST$4 = 
        new javax.xml.namespace.QName("", "prst");
    
    
    /**
     * Gets the "fgClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getFgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(FGCLR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fgClr" element
     */
    public boolean isSetFgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FGCLR$0) != 0;
        }
    }
    
    /**
     * Sets the "fgClr" element
     */
    public void setFgClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor fgClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(FGCLR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(FGCLR$0);
            }
            target.set(fgClr);
        }
    }
    
    /**
     * Appends and returns a new empty "fgClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewFgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(FGCLR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fgClr" element
     */
    public void unsetFgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FGCLR$0, 0);
        }
    }
    
    /**
     * Gets the "bgClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getBgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(BGCLR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bgClr" element
     */
    public boolean isSetBgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGCLR$2) != 0;
        }
    }
    
    /**
     * Sets the "bgClr" element
     */
    public void setBgClr(org.openxmlformats.schemas.drawingml.x2006.main.CTColor bgClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(BGCLR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(BGCLR$2);
            }
            target.set(bgClr);
        }
    }
    
    /**
     * Appends and returns a new empty "bgClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewBgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(BGCLR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bgClr" element
     */
    public void unsetBgClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGCLR$2, 0);
        }
    }
    
    /**
     * Gets the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal.Enum getPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "prst" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal xgetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal)get_store().find_attribute_user(PRST$4);
            return target;
        }
    }
    
    /**
     * True if has "prst" attribute
     */
    public boolean isSetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRST$4) != null;
        }
    }
    
    /**
     * Sets the "prst" attribute
     */
    public void setPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal.Enum prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRST$4);
            }
            target.setEnumValue(prst);
        }
    }
    
    /**
     * Sets (as xml) the "prst" attribute
     */
    public void xsetPrst(org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal prst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal)get_store().find_attribute_user(PRST$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPresetPatternVal)get_store().add_attribute_user(PRST$4);
            }
            target.set(prst);
        }
    }
    
    /**
     * Unsets the "prst" attribute
     */
    public void unsetPrst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRST$4);
        }
    }
}
