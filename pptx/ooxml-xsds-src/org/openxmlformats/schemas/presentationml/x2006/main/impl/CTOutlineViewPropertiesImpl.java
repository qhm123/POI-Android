/*
 * XML Type:  CT_OutlineViewProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_OutlineViewProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTOutlineViewPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties
{
    
    public CTOutlineViewPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CVIEWPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cViewPr");
    private static final javax.xml.namespace.QName SLDLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldLst");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "cViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties getCViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().find_element_user(CVIEWPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cViewPr" element
     */
    public void setCViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties cViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().find_element_user(CVIEWPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().add_element_user(CVIEWPR$0);
            }
            target.set(cViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "cViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties addNewCViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonViewProperties)get_store().add_element_user(CVIEWPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "sldLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList getSldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList)get_store().find_element_user(SLDLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sldLst" element
     */
    public boolean isSetSldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLDLST$2) != 0;
        }
    }
    
    /**
     * Sets the "sldLst" element
     */
    public void setSldLst(org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList sldLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList)get_store().find_element_user(SLDLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList)get_store().add_element_user(SLDLST$2);
            }
            target.set(sldLst);
        }
    }
    
    /**
     * Appends and returns a new empty "sldLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList addNewSldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewSlideList)get_store().add_element_user(SLDLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sldLst" element
     */
    public void unsetSldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLDLST$2, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
}
