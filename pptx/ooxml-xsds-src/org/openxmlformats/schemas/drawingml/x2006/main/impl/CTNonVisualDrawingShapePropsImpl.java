/*
 * XML Type:  CT_NonVisualDrawingShapeProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingShapeProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_NonVisualDrawingShapeProps(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNonVisualDrawingShapePropsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingShapeProps
{
    
    public CTNonVisualDrawingShapePropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPLOCKS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spLocks");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName TXBOX$4 = 
        new javax.xml.namespace.QName("", "txBox");
    
    
    /**
     * Gets the "spLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking getSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking)get_store().find_element_user(SPLOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spLocks" element
     */
    public boolean isSetSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPLOCKS$0) != 0;
        }
    }
    
    /**
     * Sets the "spLocks" element
     */
    public void setSpLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking spLocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking)get_store().find_element_user(SPLOCKS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking)get_store().add_element_user(SPLOCKS$0);
            }
            target.set(spLocks);
        }
    }
    
    /**
     * Appends and returns a new empty "spLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking addNewSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking)get_store().add_element_user(SPLOCKS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "spLocks" element
     */
    public void unsetSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPLOCKS$0, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
            return get_store().count_elements(EXTLST$2) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "txBox" attribute
     */
    public boolean getTxBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TXBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TXBOX$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "txBox" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTxBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TXBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TXBOX$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "txBox" attribute
     */
    public boolean isSetTxBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TXBOX$4) != null;
        }
    }
    
    /**
     * Sets the "txBox" attribute
     */
    public void setTxBox(boolean txBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TXBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TXBOX$4);
            }
            target.setBooleanValue(txBox);
        }
    }
    
    /**
     * Sets (as xml) the "txBox" attribute
     */
    public void xsetTxBox(org.apache.xmlbeans.XmlBoolean txBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TXBOX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TXBOX$4);
            }
            target.set(txBox);
        }
    }
    
    /**
     * Unsets the "txBox" attribute
     */
    public void unsetTxBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TXBOX$4);
        }
    }
}
