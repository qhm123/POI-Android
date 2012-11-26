/*
 * XML Type:  CT_SlideTiming
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_SlideTiming(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTSlideTimingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming
{
    
    public CTSlideTimingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TNLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "tnLst");
    private static final javax.xml.namespace.QName BLDLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bldLst");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "tnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList getTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(TNLST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tnLst" element
     */
    public boolean isSetTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TNLST$0) != 0;
        }
    }
    
    /**
     * Sets the "tnLst" element
     */
    public void setTnLst(org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList tnLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().find_element_user(TNLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(TNLST$0);
            }
            target.set(tnLst);
        }
    }
    
    /**
     * Appends and returns a new empty "tnLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList addNewTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList)get_store().add_element_user(TNLST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tnLst" element
     */
    public void unsetTnLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TNLST$0, 0);
        }
    }
    
    /**
     * Gets the "bldLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList getBldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList)get_store().find_element_user(BLDLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bldLst" element
     */
    public boolean isSetBldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLDLST$2) != 0;
        }
    }
    
    /**
     * Sets the "bldLst" element
     */
    public void setBldLst(org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList bldLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList)get_store().find_element_user(BLDLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList)get_store().add_element_user(BLDLST$2);
            }
            target.set(bldLst);
        }
    }
    
    /**
     * Appends and returns a new empty "bldLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList addNewBldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBuildList)get_store().add_element_user(BLDLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bldLst" element
     */
    public void unsetBldLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLDLST$2, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$4, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$4);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$4);
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
