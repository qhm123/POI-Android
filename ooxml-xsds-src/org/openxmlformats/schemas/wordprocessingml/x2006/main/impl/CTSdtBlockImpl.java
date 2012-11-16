/*
 * XML Type:  CT_SdtBlock
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SdtBlock(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSdtBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock
{
    
    public CTSdtBlockImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDTPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdtPr");
    private static final javax.xml.namespace.QName SDTENDPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdtEndPr");
    private static final javax.xml.namespace.QName SDTCONTENT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdtContent");
    
    
    /**
     * Gets the "sdtPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr getSdtPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr)get_store().find_element_user(SDTPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdtPr" element
     */
    public boolean isSetSdtPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDTPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sdtPr" element
     */
    public void setSdtPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr sdtPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr)get_store().find_element_user(SDTPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr)get_store().add_element_user(SDTPR$0);
            }
            target.set(sdtPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sdtPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr addNewSdtPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr)get_store().add_element_user(SDTPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sdtPr" element
     */
    public void unsetSdtPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDTPR$0, 0);
        }
    }
    
    /**
     * Gets the "sdtEndPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr getSdtEndPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr)get_store().find_element_user(SDTENDPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdtEndPr" element
     */
    public boolean isSetSdtEndPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDTENDPR$2) != 0;
        }
    }
    
    /**
     * Sets the "sdtEndPr" element
     */
    public void setSdtEndPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr sdtEndPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr)get_store().find_element_user(SDTENDPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr)get_store().add_element_user(SDTENDPR$2);
            }
            target.set(sdtEndPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sdtEndPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr addNewSdtEndPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr)get_store().add_element_user(SDTENDPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sdtEndPr" element
     */
    public void unsetSdtEndPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDTENDPR$2, 0);
        }
    }
    
    /**
     * Gets the "sdtContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock getSdtContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock)get_store().find_element_user(SDTCONTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdtContent" element
     */
    public boolean isSetSdtContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDTCONTENT$4) != 0;
        }
    }
    
    /**
     * Sets the "sdtContent" element
     */
    public void setSdtContent(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock sdtContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock)get_store().find_element_user(SDTCONTENT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock)get_store().add_element_user(SDTCONTENT$4);
            }
            target.set(sdtContent);
        }
    }
    
    /**
     * Appends and returns a new empty "sdtContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock addNewSdtContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock)get_store().add_element_user(SDTCONTENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sdtContent" element
     */
    public void unsetSdtContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDTCONTENT$4, 0);
        }
    }
}
