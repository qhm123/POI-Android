/*
 * XML Type:  CT_PresentationProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_PresentationProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTPresentationPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTPresentationProperties
{
    
    public CTPresentationPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTMLPUBPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "htmlPubPr");
    private static final javax.xml.namespace.QName WEBPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "webPr");
    private static final javax.xml.namespace.QName PRNPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "prnPr");
    private static final javax.xml.namespace.QName SHOWPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "showPr");
    private static final javax.xml.namespace.QName CLRMRU$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMru");
    private static final javax.xml.namespace.QName EXTLST$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    
    
    /**
     * Gets the "htmlPubPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties getHtmlPubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties)get_store().find_element_user(HTMLPUBPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "htmlPubPr" element
     */
    public boolean isSetHtmlPubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTMLPUBPR$0) != 0;
        }
    }
    
    /**
     * Sets the "htmlPubPr" element
     */
    public void setHtmlPubPr(org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties htmlPubPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties)get_store().find_element_user(HTMLPUBPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties)get_store().add_element_user(HTMLPUBPR$0);
            }
            target.set(htmlPubPr);
        }
    }
    
    /**
     * Appends and returns a new empty "htmlPubPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties addNewHtmlPubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTHtmlPublishProperties)get_store().add_element_user(HTMLPUBPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "htmlPubPr" element
     */
    public void unsetHtmlPubPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTMLPUBPR$0, 0);
        }
    }
    
    /**
     * Gets the "webPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties getWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties)get_store().find_element_user(WEBPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "webPr" element
     */
    public boolean isSetWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBPR$2) != 0;
        }
    }
    
    /**
     * Sets the "webPr" element
     */
    public void setWebPr(org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties webPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties)get_store().find_element_user(WEBPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties)get_store().add_element_user(WEBPR$2);
            }
            target.set(webPr);
        }
    }
    
    /**
     * Appends and returns a new empty "webPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties addNewWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTWebProperties)get_store().add_element_user(WEBPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "webPr" element
     */
    public void unsetWebPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBPR$2, 0);
        }
    }
    
    /**
     * Gets the "prnPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties getPrnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties)get_store().find_element_user(PRNPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prnPr" element
     */
    public boolean isSetPrnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRNPR$4) != 0;
        }
    }
    
    /**
     * Sets the "prnPr" element
     */
    public void setPrnPr(org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties prnPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties)get_store().find_element_user(PRNPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties)get_store().add_element_user(PRNPR$4);
            }
            target.set(prnPr);
        }
    }
    
    /**
     * Appends and returns a new empty "prnPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties addNewPrnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTPrintProperties)get_store().add_element_user(PRNPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "prnPr" element
     */
    public void unsetPrnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRNPR$4, 0);
        }
    }
    
    /**
     * Gets the "showPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties getShowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties)get_store().find_element_user(SHOWPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showPr" element
     */
    public boolean isSetShowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWPR$6) != 0;
        }
    }
    
    /**
     * Sets the "showPr" element
     */
    public void setShowPr(org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties showPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties)get_store().find_element_user(SHOWPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties)get_store().add_element_user(SHOWPR$6);
            }
            target.set(showPr);
        }
    }
    
    /**
     * Appends and returns a new empty "showPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties addNewShowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTShowProperties)get_store().add_element_user(SHOWPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "showPr" element
     */
    public void unsetShowPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWPR$6, 0);
        }
    }
    
    /**
     * Gets the "clrMru" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU getClrMru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU)get_store().find_element_user(CLRMRU$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrMru" element
     */
    public boolean isSetClrMru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRMRU$8) != 0;
        }
    }
    
    /**
     * Sets the "clrMru" element
     */
    public void setClrMru(org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU clrMru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU)get_store().find_element_user(CLRMRU$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU)get_store().add_element_user(CLRMRU$8);
            }
            target.set(clrMru);
        }
    }
    
    /**
     * Appends and returns a new empty "clrMru" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU addNewClrMru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColorMRU)get_store().add_element_user(CLRMRU$8);
            return target;
        }
    }
    
    /**
     * Unsets the "clrMru" element
     */
    public void unsetClrMru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRMRU$8, 0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$10, 0);
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
            return get_store().count_elements(EXTLST$10) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$10);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$10);
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
            get_store().remove_element(EXTLST$10, 0);
        }
    }
}
