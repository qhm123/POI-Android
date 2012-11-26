/*
 * XML Type:  CT_ObjectStyleDefaults
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_ObjectStyleDefaults(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTObjectStyleDefaultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults
{
    
    public CTObjectStyleDefaultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPDEF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spDef");
    private static final javax.xml.namespace.QName LNDEF$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnDef");
    private static final javax.xml.namespace.QName TXDEF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "txDef");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "spDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition getSpDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().find_element_user(SPDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spDef" element
     */
    public boolean isSetSpDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPDEF$0) != 0;
        }
    }
    
    /**
     * Sets the "spDef" element
     */
    public void setSpDef(org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition spDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().find_element_user(SPDEF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().add_element_user(SPDEF$0);
            }
            target.set(spDef);
        }
    }
    
    /**
     * Appends and returns a new empty "spDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition addNewSpDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().add_element_user(SPDEF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "spDef" element
     */
    public void unsetSpDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPDEF$0, 0);
        }
    }
    
    /**
     * Gets the "lnDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition getLnDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().find_element_user(LNDEF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lnDef" element
     */
    public boolean isSetLnDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNDEF$2) != 0;
        }
    }
    
    /**
     * Sets the "lnDef" element
     */
    public void setLnDef(org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition lnDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().find_element_user(LNDEF$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().add_element_user(LNDEF$2);
            }
            target.set(lnDef);
        }
    }
    
    /**
     * Appends and returns a new empty "lnDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition addNewLnDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().add_element_user(LNDEF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lnDef" element
     */
    public void unsetLnDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNDEF$2, 0);
        }
    }
    
    /**
     * Gets the "txDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition getTxDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().find_element_user(TXDEF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txDef" element
     */
    public boolean isSetTxDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXDEF$4) != 0;
        }
    }
    
    /**
     * Sets the "txDef" element
     */
    public void setTxDef(org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition txDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().find_element_user(TXDEF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().add_element_user(TXDEF$4);
            }
            target.set(txDef);
        }
    }
    
    /**
     * Appends and returns a new empty "txDef" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition addNewTxDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition)get_store().add_element_user(TXDEF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "txDef" element
     */
    public void unsetTxDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXDEF$4, 0);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
}
