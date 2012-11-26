/*
 * XML Type:  CT_NonVisualGraphicFrameProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_NonVisualGraphicFrameProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNonVisualGraphicFramePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties
{
    
    public CTNonVisualGraphicFramePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRAPHICFRAMELOCKS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphicFrameLocks");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "graphicFrameLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking getGraphicFrameLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking)get_store().find_element_user(GRAPHICFRAMELOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "graphicFrameLocks" element
     */
    public boolean isSetGraphicFrameLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHICFRAMELOCKS$0) != 0;
        }
    }
    
    /**
     * Sets the "graphicFrameLocks" element
     */
    public void setGraphicFrameLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking graphicFrameLocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking)get_store().find_element_user(GRAPHICFRAMELOCKS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking)get_store().add_element_user(GRAPHICFRAMELOCKS$0);
            }
            target.set(graphicFrameLocks);
        }
    }
    
    /**
     * Appends and returns a new empty "graphicFrameLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking addNewGraphicFrameLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking)get_store().add_element_user(GRAPHICFRAMELOCKS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "graphicFrameLocks" element
     */
    public void unsetGraphicFrameLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHICFRAMELOCKS$0, 0);
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
