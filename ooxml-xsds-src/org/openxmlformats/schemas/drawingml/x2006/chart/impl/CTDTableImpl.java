/*
 * XML Type:  CT_DTable
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_DTable(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTDTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable
{
    
    public CTDTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHOWHORZBORDER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showHorzBorder");
    private static final javax.xml.namespace.QName SHOWVERTBORDER$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showVertBorder");
    private static final javax.xml.namespace.QName SHOWOUTLINE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showOutline");
    private static final javax.xml.namespace.QName SHOWKEYS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showKeys");
    private static final javax.xml.namespace.QName SPPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
    private static final javax.xml.namespace.QName TXPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "txPr");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");
    
    
    /**
     * Gets the "showHorzBorder" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowHorzBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWHORZBORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showHorzBorder" element
     */
    public boolean isSetShowHorzBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWHORZBORDER$0) != 0;
        }
    }
    
    /**
     * Sets the "showHorzBorder" element
     */
    public void setShowHorzBorder(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showHorzBorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWHORZBORDER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWHORZBORDER$0);
            }
            target.set(showHorzBorder);
        }
    }
    
    /**
     * Appends and returns a new empty "showHorzBorder" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowHorzBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWHORZBORDER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "showHorzBorder" element
     */
    public void unsetShowHorzBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWHORZBORDER$0, 0);
        }
    }
    
    /**
     * Gets the "showVertBorder" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowVertBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWVERTBORDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showVertBorder" element
     */
    public boolean isSetShowVertBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWVERTBORDER$2) != 0;
        }
    }
    
    /**
     * Sets the "showVertBorder" element
     */
    public void setShowVertBorder(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showVertBorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWVERTBORDER$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWVERTBORDER$2);
            }
            target.set(showVertBorder);
        }
    }
    
    /**
     * Appends and returns a new empty "showVertBorder" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowVertBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWVERTBORDER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "showVertBorder" element
     */
    public void unsetShowVertBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWVERTBORDER$2, 0);
        }
    }
    
    /**
     * Gets the "showOutline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWOUTLINE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showOutline" element
     */
    public boolean isSetShowOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWOUTLINE$4) != 0;
        }
    }
    
    /**
     * Sets the "showOutline" element
     */
    public void setShowOutline(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showOutline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWOUTLINE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWOUTLINE$4);
            }
            target.set(showOutline);
        }
    }
    
    /**
     * Appends and returns a new empty "showOutline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWOUTLINE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "showOutline" element
     */
    public void unsetShowOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWOUTLINE$4, 0);
        }
    }
    
    /**
     * Gets the "showKeys" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean getShowKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWKEYS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showKeys" element
     */
    public boolean isSetShowKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWKEYS$6) != 0;
        }
    }
    
    /**
     * Sets the "showKeys" element
     */
    public void setShowKeys(org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean showKeys)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().find_element_user(SHOWKEYS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWKEYS$6);
            }
            target.set(showKeys);
        }
    }
    
    /**
     * Appends and returns a new empty "showKeys" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean addNewShowKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean)get_store().add_element_user(SHOWKEYS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "showKeys" element
     */
    public void unsetShowKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWKEYS$6, 0);
        }
    }
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spPr" element
     */
    public boolean isSetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPPR$8) != 0;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$8);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "spPr" element
     */
    public void unsetSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPPR$8, 0);
        }
    }
    
    /**
     * Gets the "txPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txPr" element
     */
    public boolean isSetTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXPR$10) != 0;
        }
    }
    
    /**
     * Sets the "txPr" element
     */
    public void setTxPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$10);
            }
            target.set(txPr);
        }
    }
    
    /**
     * Appends and returns a new empty "txPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "txPr" element
     */
    public void unsetTxPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXPR$10, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
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
            return get_store().count_elements(EXTLST$12) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$12);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            get_store().remove_element(EXTLST$12, 0);
        }
    }
}
