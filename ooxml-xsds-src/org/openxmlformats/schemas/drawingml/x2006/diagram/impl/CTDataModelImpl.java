/*
 * XML Type:  CT_DataModel
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_DataModel(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTDataModelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTDataModel
{
    
    public CTDataModelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "ptLst");
    private static final javax.xml.namespace.QName CXNLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "cxnLst");
    private static final javax.xml.namespace.QName BG$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "bg");
    private static final javax.xml.namespace.QName WHOLE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "whole");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    
    
    /**
     * Gets the "ptLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList getPtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList)get_store().find_element_user(PTLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ptLst" element
     */
    public void setPtLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList ptLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList)get_store().find_element_user(PTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList)get_store().add_element_user(PTLST$0);
            }
            target.set(ptLst);
        }
    }
    
    /**
     * Appends and returns a new empty "ptLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList addNewPtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTPtList)get_store().add_element_user(PTLST$0);
            return target;
        }
    }
    
    /**
     * Gets the "cxnLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList getCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList)get_store().find_element_user(CXNLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cxnLst" element
     */
    public boolean isSetCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXNLST$2) != 0;
        }
    }
    
    /**
     * Sets the "cxnLst" element
     */
    public void setCxnLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList cxnLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList)get_store().find_element_user(CXNLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList)get_store().add_element_user(CXNLST$2);
            }
            target.set(cxnLst);
        }
    }
    
    /**
     * Appends and returns a new empty "cxnLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList addNewCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCxnList)get_store().add_element_user(CXNLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "cxnLst" element
     */
    public void unsetCxnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXNLST$2, 0);
        }
    }
    
    /**
     * Gets the "bg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting getBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting)get_store().find_element_user(BG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bg" element
     */
    public boolean isSetBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BG$4) != 0;
        }
    }
    
    /**
     * Sets the "bg" element
     */
    public void setBg(org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting bg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting)get_store().find_element_user(BG$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting)get_store().add_element_user(BG$4);
            }
            target.set(bg);
        }
    }
    
    /**
     * Appends and returns a new empty "bg" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting addNewBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFormatting)get_store().add_element_user(BG$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bg" element
     */
    public void unsetBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BG$4, 0);
        }
    }
    
    /**
     * Gets the "whole" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting getWhole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting)get_store().find_element_user(WHOLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "whole" element
     */
    public boolean isSetWhole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHOLE$6) != 0;
        }
    }
    
    /**
     * Sets the "whole" element
     */
    public void setWhole(org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting whole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting)get_store().find_element_user(WHOLE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting)get_store().add_element_user(WHOLE$6);
            }
            target.set(whole);
        }
    }
    
    /**
     * Appends and returns a new empty "whole" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting addNewWhole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTWholeE2OFormatting)get_store().add_element_user(WHOLE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "whole" element
     */
    public void unsetWhole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHOLE$6, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$8) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$8, 0);
        }
    }
}
