/*
 * XML Type:  CT_HeaderFooter
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_HeaderFooter(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTHeaderFooterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter
{
    
    public CTHeaderFooterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SLDNUM$2 = 
        new javax.xml.namespace.QName("", "sldNum");
    private static final javax.xml.namespace.QName HDR$4 = 
        new javax.xml.namespace.QName("", "hdr");
    private static final javax.xml.namespace.QName FTR$6 = 
        new javax.xml.namespace.QName("", "ftr");
    private static final javax.xml.namespace.QName DT$8 = 
        new javax.xml.namespace.QName("", "dt");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$0);
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
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "sldNum" attribute
     */
    public boolean getSldNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLDNUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SLDNUM$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sldNum" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSldNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SLDNUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SLDNUM$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "sldNum" attribute
     */
    public boolean isSetSldNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SLDNUM$2) != null;
        }
    }
    
    /**
     * Sets the "sldNum" attribute
     */
    public void setSldNum(boolean sldNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SLDNUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SLDNUM$2);
            }
            target.setBooleanValue(sldNum);
        }
    }
    
    /**
     * Sets (as xml) the "sldNum" attribute
     */
    public void xsetSldNum(org.apache.xmlbeans.XmlBoolean sldNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SLDNUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SLDNUM$2);
            }
            target.set(sldNum);
        }
    }
    
    /**
     * Unsets the "sldNum" attribute
     */
    public void unsetSldNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SLDNUM$2);
        }
    }
    
    /**
     * Gets the "hdr" attribute
     */
    public boolean getHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HDR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HDR$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hdr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HDR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HDR$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "hdr" attribute
     */
    public boolean isSetHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HDR$4) != null;
        }
    }
    
    /**
     * Sets the "hdr" attribute
     */
    public void setHdr(boolean hdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HDR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HDR$4);
            }
            target.setBooleanValue(hdr);
        }
    }
    
    /**
     * Sets (as xml) the "hdr" attribute
     */
    public void xsetHdr(org.apache.xmlbeans.XmlBoolean hdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HDR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HDR$4);
            }
            target.set(hdr);
        }
    }
    
    /**
     * Unsets the "hdr" attribute
     */
    public void unsetHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HDR$4);
        }
    }
    
    /**
     * Gets the "ftr" attribute
     */
    public boolean getFtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FTR$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ftr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FTR$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "ftr" attribute
     */
    public boolean isSetFtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FTR$6) != null;
        }
    }
    
    /**
     * Sets the "ftr" attribute
     */
    public void setFtr(boolean ftr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FTR$6);
            }
            target.setBooleanValue(ftr);
        }
    }
    
    /**
     * Sets (as xml) the "ftr" attribute
     */
    public void xsetFtr(org.apache.xmlbeans.XmlBoolean ftr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FTR$6);
            }
            target.set(ftr);
        }
    }
    
    /**
     * Unsets the "ftr" attribute
     */
    public void unsetFtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FTR$6);
        }
    }
    
    /**
     * Gets the "dt" attribute
     */
    public boolean getDt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DT$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DT$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "dt" attribute
     */
    public boolean isSetDt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DT$8) != null;
        }
    }
    
    /**
     * Sets the "dt" attribute
     */
    public void setDt(boolean dt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DT$8);
            }
            target.setBooleanValue(dt);
        }
    }
    
    /**
     * Sets (as xml) the "dt" attribute
     */
    public void xsetDt(org.apache.xmlbeans.XmlBoolean dt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DT$8);
            }
            target.set(dt);
        }
    }
    
    /**
     * Unsets the "dt" attribute
     */
    public void unsetDt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DT$8);
        }
    }
}
