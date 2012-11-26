/*
 * XML Type:  CT_TextSpacing
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextSpacing(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextSpacingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing
{
    
    public CTTextSpacingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPCPCT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcPct");
    private static final javax.xml.namespace.QName SPCPTS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcPts");
    
    
    /**
     * Gets the "spcPct" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent getSpcPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent)get_store().find_element_user(SPCPCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spcPct" element
     */
    public boolean isSetSpcPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPCPCT$0) != 0;
        }
    }
    
    /**
     * Sets the "spcPct" element
     */
    public void setSpcPct(org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent spcPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent)get_store().find_element_user(SPCPCT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent)get_store().add_element_user(SPCPCT$0);
            }
            target.set(spcPct);
        }
    }
    
    /**
     * Appends and returns a new empty "spcPct" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent addNewSpcPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPercent)get_store().add_element_user(SPCPCT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "spcPct" element
     */
    public void unsetSpcPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPCPCT$0, 0);
        }
    }
    
    /**
     * Gets the "spcPts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint getSpcPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint)get_store().find_element_user(SPCPTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spcPts" element
     */
    public boolean isSetSpcPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPCPTS$2) != 0;
        }
    }
    
    /**
     * Sets the "spcPts" element
     */
    public void setSpcPts(org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint spcPts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint)get_store().find_element_user(SPCPTS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint)get_store().add_element_user(SPCPTS$2);
            }
            target.set(spcPts);
        }
    }
    
    /**
     * Appends and returns a new empty "spcPts" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint addNewSpcPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacingPoint)get_store().add_element_user(SPCPTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "spcPts" element
     */
    public void unsetSpcPts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPCPTS$2, 0);
        }
    }
}
