/*
 * XML Type:  CT_TblStylePr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TblStylePr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblStylePrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblStylePr
{
    
    public CTTblStylePrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
    private static final javax.xml.namespace.QName RPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName TBLPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPr");
    private static final javax.xml.namespace.QName TRPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trPr");
    private static final javax.xml.namespace.QName TCPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcPr");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPr" element
     */
    public boolean isSetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPR$0) != 0;
        }
    }
    
    /**
     * Sets the "pPr" element
     */
    public void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$0);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pPr" element
     */
    public void unsetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPR$0, 0);
        }
    }
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPr" element
     */
    public boolean isSetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$2) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$2);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "rPr" element
     */
    public void unsetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$2, 0);
        }
    }
    
    /**
     * Gets the "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase getTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().find_element_user(TBLPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tblPr" element
     */
    public boolean isSetTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLPR$4) != 0;
        }
    }
    
    /**
     * Sets the "tblPr" element
     */
    public void setTblPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase tblPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().find_element_user(TBLPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().add_element_user(TBLPR$4);
            }
            target.set(tblPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase addNewTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase)get_store().add_element_user(TBLPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tblPr" element
     */
    public void unsetTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLPR$4, 0);
        }
    }
    
    /**
     * Gets the "trPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr getTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().find_element_user(TRPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trPr" element
     */
    public boolean isSetTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRPR$6) != 0;
        }
    }
    
    /**
     * Sets the "trPr" element
     */
    public void setTrPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr trPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().find_element_user(TRPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().add_element_user(TRPR$6);
            }
            target.set(trPr);
        }
    }
    
    /**
     * Appends and returns a new empty "trPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr addNewTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr)get_store().add_element_user(TRPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "trPr" element
     */
    public void unsetTrPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRPR$6, 0);
        }
    }
    
    /**
     * Gets the "tcPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr getTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().find_element_user(TCPR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tcPr" element
     */
    public boolean isSetTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCPR$8) != 0;
        }
    }
    
    /**
     * Sets the "tcPr" element
     */
    public void setTcPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr tcPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().find_element_user(TCPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().add_element_user(TCPR$8);
            }
            target.set(tcPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tcPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr addNewTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr)get_store().add_element_user(TCPR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "tcPr" element
     */
    public void unsetTcPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCPR$8, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType)get_store().find_attribute_user(TYPE$10);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblStyleOverrideType)get_store().add_attribute_user(TYPE$10);
            }
            target.set(type);
        }
    }
}
