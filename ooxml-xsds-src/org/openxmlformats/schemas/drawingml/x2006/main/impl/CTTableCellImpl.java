/*
 * XML Type:  CT_TableCell
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableCell(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableCellImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell
{
    
    public CTTableCellImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TXBODY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "txBody");
    private static final javax.xml.namespace.QName TCPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcPr");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ROWSPAN$6 = 
        new javax.xml.namespace.QName("", "rowSpan");
    private static final javax.xml.namespace.QName GRIDSPAN$8 = 
        new javax.xml.namespace.QName("", "gridSpan");
    private static final javax.xml.namespace.QName HMERGE$10 = 
        new javax.xml.namespace.QName("", "hMerge");
    private static final javax.xml.namespace.QName VMERGE$12 = 
        new javax.xml.namespace.QName("", "vMerge");
    
    
    /**
     * Gets the "txBody" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody getTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXBODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txBody" element
     */
    public boolean isSetTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXBODY$0) != 0;
        }
    }
    
    /**
     * Sets the "txBody" element
     */
    public void setTxBody(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody txBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().find_element_user(TXBODY$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXBODY$0);
            }
            target.set(txBody);
        }
    }
    
    /**
     * Appends and returns a new empty "txBody" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody addNewTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody)get_store().add_element_user(TXBODY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "txBody" element
     */
    public void unsetTxBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXBODY$0, 0);
        }
    }
    
    /**
     * Gets the "tcPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties getTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties)get_store().find_element_user(TCPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcPr" element
     */
    public boolean isSetTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCPR$2) != 0;
        }
    }
    
    /**
     * Sets the "tcPr" element
     */
    public void setTcPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties tcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties)get_store().find_element_user(TCPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties)get_store().add_element_user(TCPR$2);
            }
            target.set(tcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tcPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties addNewTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties)get_store().add_element_user(TCPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tcPr" element
     */
    public void unsetTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCPR$2, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "rowSpan" attribute
     */
    public int getRowSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSPAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWSPAN$6);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowSpan" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetRowSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ROWSPAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(ROWSPAN$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "rowSpan" attribute
     */
    public boolean isSetRowSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWSPAN$6) != null;
        }
    }
    
    /**
     * Sets the "rowSpan" attribute
     */
    public void setRowSpan(int rowSpan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSPAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWSPAN$6);
            }
            target.setIntValue(rowSpan);
        }
    }
    
    /**
     * Sets (as xml) the "rowSpan" attribute
     */
    public void xsetRowSpan(org.apache.xmlbeans.XmlInt rowSpan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ROWSPAN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ROWSPAN$6);
            }
            target.set(rowSpan);
        }
    }
    
    /**
     * Unsets the "rowSpan" attribute
     */
    public void unsetRowSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWSPAN$6);
        }
    }
    
    /**
     * Gets the "gridSpan" attribute
     */
    public int getGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDSPAN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GRIDSPAN$8);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "gridSpan" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(GRIDSPAN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(GRIDSPAN$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "gridSpan" attribute
     */
    public boolean isSetGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GRIDSPAN$8) != null;
        }
    }
    
    /**
     * Sets the "gridSpan" attribute
     */
    public void setGridSpan(int gridSpan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GRIDSPAN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GRIDSPAN$8);
            }
            target.setIntValue(gridSpan);
        }
    }
    
    /**
     * Sets (as xml) the "gridSpan" attribute
     */
    public void xsetGridSpan(org.apache.xmlbeans.XmlInt gridSpan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(GRIDSPAN$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(GRIDSPAN$8);
            }
            target.set(gridSpan);
        }
    }
    
    /**
     * Unsets the "gridSpan" attribute
     */
    public void unsetGridSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GRIDSPAN$8);
        }
    }
    
    /**
     * Gets the "hMerge" attribute
     */
    public boolean getHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HMERGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HMERGE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hMerge" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HMERGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HMERGE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "hMerge" attribute
     */
    public boolean isSetHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HMERGE$10) != null;
        }
    }
    
    /**
     * Sets the "hMerge" attribute
     */
    public void setHMerge(boolean hMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HMERGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HMERGE$10);
            }
            target.setBooleanValue(hMerge);
        }
    }
    
    /**
     * Sets (as xml) the "hMerge" attribute
     */
    public void xsetHMerge(org.apache.xmlbeans.XmlBoolean hMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HMERGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HMERGE$10);
            }
            target.set(hMerge);
        }
    }
    
    /**
     * Unsets the "hMerge" attribute
     */
    public void unsetHMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HMERGE$10);
        }
    }
    
    /**
     * Gets the "vMerge" attribute
     */
    public boolean getVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VMERGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VMERGE$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "vMerge" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VMERGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VMERGE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "vMerge" attribute
     */
    public boolean isSetVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VMERGE$12) != null;
        }
    }
    
    /**
     * Sets the "vMerge" attribute
     */
    public void setVMerge(boolean vMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VMERGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VMERGE$12);
            }
            target.setBooleanValue(vMerge);
        }
    }
    
    /**
     * Sets (as xml) the "vMerge" attribute
     */
    public void xsetVMerge(org.apache.xmlbeans.XmlBoolean vMerge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VMERGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VMERGE$12);
            }
            target.set(vMerge);
        }
    }
    
    /**
     * Unsets the "vMerge" attribute
     */
    public void unsetVMerge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VMERGE$12);
        }
    }
}
