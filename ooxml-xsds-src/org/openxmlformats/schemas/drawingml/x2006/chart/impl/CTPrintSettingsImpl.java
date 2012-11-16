/*
 * XML Type:  CT_PrintSettings
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_PrintSettings(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTPrintSettingsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings
{
    
    public CTPrintSettingsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADERFOOTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "headerFooter");
    private static final javax.xml.namespace.QName PAGEMARGINS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pageMargins");
    private static final javax.xml.namespace.QName PAGESETUP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pageSetup");
    private static final javax.xml.namespace.QName LEGACYDRAWINGHF$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legacyDrawingHF");
    
    
    /**
     * Gets the "headerFooter" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter getHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "headerFooter" element
     */
    public boolean isSetHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERFOOTER$0) != 0;
        }
    }
    
    /**
     * Sets the "headerFooter" element
     */
    public void setHeaderFooter(org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter headerFooter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter)get_store().find_element_user(HEADERFOOTER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$0);
            }
            target.set(headerFooter);
        }
    }
    
    /**
     * Appends and returns a new empty "headerFooter" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter addNewHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter)get_store().add_element_user(HEADERFOOTER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "headerFooter" element
     */
    public void unsetHeaderFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERFOOTER$0, 0);
        }
    }
    
    /**
     * Gets the "pageMargins" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins getPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins)get_store().find_element_user(PAGEMARGINS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageMargins" element
     */
    public boolean isSetPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEMARGINS$2) != 0;
        }
    }
    
    /**
     * Sets the "pageMargins" element
     */
    public void setPageMargins(org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins pageMargins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins)get_store().find_element_user(PAGEMARGINS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins)get_store().add_element_user(PAGEMARGINS$2);
            }
            target.set(pageMargins);
        }
    }
    
    /**
     * Appends and returns a new empty "pageMargins" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins addNewPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins)get_store().add_element_user(PAGEMARGINS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pageMargins" element
     */
    public void unsetPageMargins()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEMARGINS$2, 0);
        }
    }
    
    /**
     * Gets the "pageSetup" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup getPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup)get_store().find_element_user(PAGESETUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageSetup" element
     */
    public boolean isSetPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGESETUP$4) != 0;
        }
    }
    
    /**
     * Sets the "pageSetup" element
     */
    public void setPageSetup(org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup pageSetup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup)get_store().find_element_user(PAGESETUP$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup)get_store().add_element_user(PAGESETUP$4);
            }
            target.set(pageSetup);
        }
    }
    
    /**
     * Appends and returns a new empty "pageSetup" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup addNewPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup)get_store().add_element_user(PAGESETUP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "pageSetup" element
     */
    public void unsetPageSetup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGESETUP$4, 0);
        }
    }
    
    /**
     * Gets the "legacyDrawingHF" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId getLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().find_element_user(LEGACYDRAWINGHF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legacyDrawingHF" element
     */
    public boolean isSetLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGACYDRAWINGHF$6) != 0;
        }
    }
    
    /**
     * Sets the "legacyDrawingHF" element
     */
    public void setLegacyDrawingHF(org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId legacyDrawingHF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().find_element_user(LEGACYDRAWINGHF$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().add_element_user(LEGACYDRAWINGHF$6);
            }
            target.set(legacyDrawingHF);
        }
    }
    
    /**
     * Appends and returns a new empty "legacyDrawingHF" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId addNewLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId)get_store().add_element_user(LEGACYDRAWINGHF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "legacyDrawingHF" element
     */
    public void unsetLegacyDrawingHF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGACYDRAWINGHF$6, 0);
        }
    }
}
