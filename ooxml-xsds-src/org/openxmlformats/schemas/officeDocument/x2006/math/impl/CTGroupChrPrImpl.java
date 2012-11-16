/*
 * XML Type:  CT_GroupChrPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_GroupChrPr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTGroupChrPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTGroupChrPr
{
    
    public CTGroupChrPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "chr");
    private static final javax.xml.namespace.QName POS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "pos");
    private static final javax.xml.namespace.QName VERTJC$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "vertJc");
    private static final javax.xml.namespace.QName CTRLPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "ctrlPr");
    
    
    /**
     * Gets the "chr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar getChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(CHR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chr" element
     */
    public boolean isSetChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHR$0) != 0;
        }
    }
    
    /**
     * Sets the "chr" element
     */
    public void setChr(org.openxmlformats.schemas.officeDocument.x2006.math.CTChar chr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().find_element_user(CHR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(CHR$0);
            }
            target.set(chr);
        }
    }
    
    /**
     * Appends and returns a new empty "chr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTChar addNewChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTChar target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTChar)get_store().add_element_user(CHR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "chr" element
     */
    public void unsetChr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHR$0, 0);
        }
    }
    
    /**
     * Gets the "pos" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().find_element_user(POS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pos" element
     */
    public boolean isSetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$2) != 0;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().find_element_user(POS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().add_element_user(POS$2);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().add_element_user(POS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pos" element
     */
    public void unsetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$2, 0);
        }
    }
    
    /**
     * Gets the "vertJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot getVertJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().find_element_user(VERTJC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vertJc" element
     */
    public boolean isSetVertJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTJC$4) != 0;
        }
    }
    
    /**
     * Sets the "vertJc" element
     */
    public void setVertJc(org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot vertJc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().find_element_user(VERTJC$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().add_element_user(VERTJC$4);
            }
            target.set(vertJc);
        }
    }
    
    /**
     * Appends and returns a new empty "vertJc" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot addNewVertJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTTopBot)get_store().add_element_user(VERTJC$4);
            return target;
        }
    }
    
    /**
     * Unsets the "vertJc" element
     */
    public void unsetVertJc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTJC$4, 0);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$6, 0);
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
            return get_store().count_elements(CTRLPR$6) != 0;
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().find_element_user(CTRLPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$6);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTCtrlPr)get_store().add_element_user(CTRLPR$6);
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
            get_store().remove_element(CTRLPR$6, 0);
        }
    }
}
