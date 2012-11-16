/*
 * XML Type:  CT_DPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTDPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_DPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTDPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTDPr
{
    
    public CTDPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGCHR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "begChr");
    private static final javax.xml.namespace.QName SEPCHR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "sepChr");
    private static final javax.xml.namespace.QName ENDCHR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "endChr");
    private static final javax.xml.namespace.QName GROW$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "grow");
    private static final javax.xml.namespace.QName SHP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "shp");
    private static final javax.xml.namespace.QName CTRLPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "begChr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar getBegChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(BEGCHR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "begChr" element
     */
    public boolean isSetBegChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGCHR$0) != 0;
        }
    }
    
    /**
     * Sets the "begChr" element
     */
    public void setBegChr(org.openxmlformats.schemas.officeDocument.x2006.math.CTChar begChr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(BEGCHR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(BEGCHR$0);
            }
            target.set(begChr);
        }
    }
    
    /**
     * Appends and returns a new empty "begChr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar addNewBegChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(BEGCHR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "begChr" element
     */
    public void unsetBegChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGCHR$0, 0);
        }
    }
    
    /**
     * Gets the "sepChr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar getSepChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(SEPCHR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sepChr" element
     */
    public boolean isSetSepChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEPCHR$2) != 0;
        }
    }
    
    /**
     * Sets the "sepChr" element
     */
    public void setSepChr(org.openxmlformats.schemas.officeDocument.x2006.math.CTChar sepChr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(SEPCHR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(SEPCHR$2);
            }
            target.set(sepChr);
        }
    }
    
    /**
     * Appends and returns a new empty "sepChr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar addNewSepChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(SEPCHR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sepChr" element
     */
    public void unsetSepChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEPCHR$2, 0);
        }
    }
    
    /**
     * Gets the "endChr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar getEndChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(ENDCHR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endChr" element
     */
    public boolean isSetEndChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDCHR$4) != 0;
        }
    }
    
    /**
     * Sets the "endChr" element
     */
    public void setEndChr(org.openxmlformats.schemas.officeDocument.x2006.math.CTChar endChr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(ENDCHR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(ENDCHR$4);
            }
            target.set(endChr);
        }
    }
    
    /**
     * Appends and returns a new empty "endChr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar addNewEndChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(ENDCHR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "endChr" element
     */
    public void unsetEndChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDCHR$4, 0);
        }
    }
    
    /**
     * Gets the "grow" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff getGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(GROW$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grow" element
     */
    public boolean isSetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROW$6) != 0;
        }
    }
    
    /**
     * Sets the "grow" element
     */
    public void setGrow(org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff grow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().find_element_user(GROW$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(GROW$6);
            }
            target.set(grow);
        }
    }
    
    /**
     * Appends and returns a new empty "grow" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff addNewGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOnOff)get_store().add_element_user(GROW$6);
            return target;
        }
    }
    
    /**
     * Unsets the "grow" element
     */
    public void unsetGrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROW$6, 0);
        }
    }
    
    /**
     * Gets the "shp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTShp getShp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTShp target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTShp)get_store().find_element_user(SHP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shp" element
     */
    public boolean isSetShp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHP$8) != 0;
        }
    }
    
    /**
     * Sets the "shp" element
     */
    public void setShp(org.openxmlformats.schemas.officeDocument.x2006.math.CTShp shp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTShp target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTShp)get_store().find_element_user(SHP$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTShp)get_store().add_element_user(SHP$8);
            }
            target.set(shp);
        }
    }
    
    /**
     * Appends and returns a new empty "shp" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTShp addNewShp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTShp target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTShp)get_store().add_element_user(SHP$8);
            return target;
        }
    }
    
    /**
     * Unsets the "shp" element
     */
    public void unsetShp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHP$8, 0);
        }
    }
    
    /**
     * Gets the "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr getCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ctrlPr" element
     */
    public boolean isSetCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CTRLPR$10) != 0;
        }
    }
    
    /**
     * Sets the "ctrlPr" element
     */
    public void setCtrlPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr ctrlPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$10);
            }
            target.set(ctrlPr);
        }
    }
    
    /**
     * Appends and returns a new empty "ctrlPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr addNewCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ctrlPr" element
     */
    public void unsetCtrlPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CTRLPR$10, 0);
        }
    }
}
