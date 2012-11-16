/*
 * XML Type:  CT_ExternalLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalLinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink
{
    
    public CTExternalLinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALBOOK$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalBook");
    private static final javax.xml.namespace.QName DDELINK$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ddeLink");
    private static final javax.xml.namespace.QName OLELINK$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleLink");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "externalBook" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook getExternalBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook)get_store().find_element_user(EXTERNALBOOK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalBook" element
     */
    public boolean isSetExternalBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALBOOK$0) != 0;
        }
    }
    
    /**
     * Sets the "externalBook" element
     */
    public void setExternalBook(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook externalBook)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook)get_store().find_element_user(EXTERNALBOOK$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook)get_store().add_element_user(EXTERNALBOOK$0);
            }
            target.set(externalBook);
        }
    }
    
    /**
     * Appends and returns a new empty "externalBook" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook addNewExternalBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook)get_store().add_element_user(EXTERNALBOOK$0);
            return target;
        }
    }
    
    /**
     * Unsets the "externalBook" element
     */
    public void unsetExternalBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALBOOK$0, 0);
        }
    }
    
    /**
     * Gets the "ddeLink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink getDdeLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink)get_store().find_element_user(DDELINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ddeLink" element
     */
    public boolean isSetDdeLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DDELINK$2) != 0;
        }
    }
    
    /**
     * Sets the "ddeLink" element
     */
    public void setDdeLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink ddeLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink)get_store().find_element_user(DDELINK$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink)get_store().add_element_user(DDELINK$2);
            }
            target.set(ddeLink);
        }
    }
    
    /**
     * Appends and returns a new empty "ddeLink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink addNewDdeLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink)get_store().add_element_user(DDELINK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ddeLink" element
     */
    public void unsetDdeLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DDELINK$2, 0);
        }
    }
    
    /**
     * Gets the "oleLink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink getOleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink)get_store().find_element_user(OLELINK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oleLink" element
     */
    public boolean isSetOleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLELINK$4) != 0;
        }
    }
    
    /**
     * Sets the "oleLink" element
     */
    public void setOleLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink oleLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink)get_store().find_element_user(OLELINK$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink)get_store().add_element_user(OLELINK$4);
            }
            target.set(oleLink);
        }
    }
    
    /**
     * Appends and returns a new empty "oleLink" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink addNewOleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink)get_store().add_element_user(OLELINK$4);
            return target;
        }
    }
    
    /**
     * Unsets the "oleLink" element
     */
    public void unsetOleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLELINK$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
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
