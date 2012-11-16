/*
 * XML Type:  CT_Fill
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Fill(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFillImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill
{
    
    public CTFillImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATTERNFILL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "patternFill");
    private static final javax.xml.namespace.QName GRADIENTFILL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "gradientFill");
    
    
    /**
     * Gets the "patternFill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill getPatternFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill)get_store().find_element_user(PATTERNFILL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "patternFill" element
     */
    public boolean isSetPatternFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTERNFILL$0) != 0;
        }
    }
    
    /**
     * Sets the "patternFill" element
     */
    public void setPatternFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill patternFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill)get_store().find_element_user(PATTERNFILL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill)get_store().add_element_user(PATTERNFILL$0);
            }
            target.set(patternFill);
        }
    }
    
    /**
     * Appends and returns a new empty "patternFill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill addNewPatternFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill)get_store().add_element_user(PATTERNFILL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "patternFill" element
     */
    public void unsetPatternFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTERNFILL$0, 0);
        }
    }
    
    /**
     * Gets the "gradientFill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill getGradientFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill)get_store().find_element_user(GRADIENTFILL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gradientFill" element
     */
    public boolean isSetGradientFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRADIENTFILL$2) != 0;
        }
    }
    
    /**
     * Sets the "gradientFill" element
     */
    public void setGradientFill(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill gradientFill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill)get_store().find_element_user(GRADIENTFILL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill)get_store().add_element_user(GRADIENTFILL$2);
            }
            target.set(gradientFill);
        }
    }
    
    /**
     * Appends and returns a new empty "gradientFill" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill addNewGradientFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGradientFill)get_store().add_element_user(GRADIENTFILL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "gradientFill" element
     */
    public void unsetGradientFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRADIENTFILL$2, 0);
        }
    }
}
