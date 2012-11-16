/*
 * XML Type:  CT_NonVisualGroupDrawingShapeProps
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_NonVisualGroupDrawingShapeProps(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNonVisualGroupDrawingShapePropsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps
{
    
    public CTNonVisualGroupDrawingShapePropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRPSPLOCKS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpSpLocks");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "grpSpLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking getGrpSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking)get_store().find_element_user(GRPSPLOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grpSpLocks" element
     */
    public boolean isSetGrpSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRPSPLOCKS$0) != 0;
        }
    }
    
    /**
     * Sets the "grpSpLocks" element
     */
    public void setGrpSpLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking grpSpLocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking)get_store().find_element_user(GRPSPLOCKS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking)get_store().add_element_user(GRPSPLOCKS$0);
            }
            target.set(grpSpLocks);
        }
    }
    
    /**
     * Appends and returns a new empty "grpSpLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking addNewGrpSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking)get_store().add_element_user(GRPSPLOCKS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "grpSpLocks" element
     */
    public void unsetGrpSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRPSPLOCKS$0, 0);
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
}
