/*
 * XML Type:  CT_NonVisualConnectorProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_NonVisualConnectorProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNonVisualConnectorPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties
{
    
    public CTNonVisualConnectorPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CXNSPLOCKS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxnSpLocks");
    private static final javax.xml.namespace.QName STCXN$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "stCxn");
    private static final javax.xml.namespace.QName ENDCXN$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "endCxn");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "cxnSpLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking getCxnSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking)get_store().find_element_user(CXNSPLOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cxnSpLocks" element
     */
    public boolean isSetCxnSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CXNSPLOCKS$0) != 0;
        }
    }
    
    /**
     * Sets the "cxnSpLocks" element
     */
    public void setCxnSpLocks(org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking cxnSpLocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking)get_store().find_element_user(CXNSPLOCKS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking)get_store().add_element_user(CXNSPLOCKS$0);
            }
            target.set(cxnSpLocks);
        }
    }
    
    /**
     * Appends and returns a new empty "cxnSpLocks" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking addNewCxnSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking)get_store().add_element_user(CXNSPLOCKS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "cxnSpLocks" element
     */
    public void unsetCxnSpLocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CXNSPLOCKS$0, 0);
        }
    }
    
    /**
     * Gets the "stCxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnection getStCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().find_element_user(STCXN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stCxn" element
     */
    public boolean isSetStCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STCXN$2) != 0;
        }
    }
    
    /**
     * Sets the "stCxn" element
     */
    public void setStCxn(org.openxmlformats.schemas.drawingml.x2006.main.CTConnection stCxn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().find_element_user(STCXN$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().add_element_user(STCXN$2);
            }
            target.set(stCxn);
        }
    }
    
    /**
     * Appends and returns a new empty "stCxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnection addNewStCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().add_element_user(STCXN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "stCxn" element
     */
    public void unsetStCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STCXN$2, 0);
        }
    }
    
    /**
     * Gets the "endCxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnection getEndCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().find_element_user(ENDCXN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endCxn" element
     */
    public boolean isSetEndCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDCXN$4) != 0;
        }
    }
    
    /**
     * Sets the "endCxn" element
     */
    public void setEndCxn(org.openxmlformats.schemas.drawingml.x2006.main.CTConnection endCxn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().find_element_user(ENDCXN$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().add_element_user(ENDCXN$4);
            }
            target.set(endCxn);
        }
    }
    
    /**
     * Appends and returns a new empty "endCxn" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTConnection addNewEndCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTConnection)get_store().add_element_user(ENDCXN$4);
            return target;
        }
    }
    
    /**
     * Unsets the "endCxn" element
     */
    public void unsetEndCxn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDCXN$4, 0);
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
