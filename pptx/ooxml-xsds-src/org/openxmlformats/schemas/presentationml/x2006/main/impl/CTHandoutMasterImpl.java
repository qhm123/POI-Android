/*
 * XML Type:  CT_HandoutMaster
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_HandoutMaster(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTHandoutMasterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMaster
{
    
    public CTHandoutMasterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSLD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
    private static final javax.xml.namespace.QName CLRMAP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMap");
    private static final javax.xml.namespace.QName HF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hf");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "cSld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData getCSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().find_element_user(CSLD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cSld" element
     */
    public void setCSld(org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData cSld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().find_element_user(CSLD$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().add_element_user(CSLD$0);
            }
            target.set(cSld);
        }
    }
    
    /**
     * Appends and returns a new empty "cSld" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData addNewCSld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData)get_store().add_element_user(CSLD$0);
            return target;
        }
    }
    
    /**
     * Gets the "clrMap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping getClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clrMap" element
     */
    public void setClrMap(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping clrMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().find_element_user(CLRMAP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAP$2);
            }
            target.set(clrMap);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMap" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping addNewClrMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping)get_store().add_element_user(CLRMAP$2);
            return target;
        }
    }
    
    /**
     * Gets the "hf" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter getHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().find_element_user(HF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hf" element
     */
    public boolean isSetHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HF$4) != 0;
        }
    }
    
    /**
     * Sets the "hf" element
     */
    public void setHf(org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter hf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().find_element_user(HF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().add_element_user(HF$4);
            }
            target.set(hf);
        }
    }
    
    /**
     * Appends and returns a new empty "hf" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter addNewHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter)get_store().add_element_user(HF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "hf" element
     */
    public void unsetHf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HF$4, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$6, 0);
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
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$6);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$6);
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
