/*
 * XML Type:  CT_PPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPPrImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPPrBaseImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr
{
    
    public CTPPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName SECTPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sectPr");
    private static final javax.xml.namespace.QName PPRCHANGE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPrChange");
    
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr)get_store().find_element_user(RPR$0, 0);
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
            return get_store().count_elements(RPR$0) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr)get_store().add_element_user(RPR$0);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr)get_store().add_element_user(RPR$0);
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
            get_store().remove_element(RPR$0, 0);
        }
    }
    
    /**
     * Gets the "sectPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr getSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr)get_store().find_element_user(SECTPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sectPr" element
     */
    public boolean isSetSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTPR$2) != 0;
        }
    }
    
    /**
     * Sets the "sectPr" element
     */
    public void setSectPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr sectPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr)get_store().find_element_user(SECTPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr)get_store().add_element_user(SECTPR$2);
            }
            target.set(sectPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sectPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr addNewSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr)get_store().add_element_user(SECTPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sectPr" element
     */
    public void unsetSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTPR$2, 0);
        }
    }
    
    /**
     * Gets the "pPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange getPPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange)get_store().find_element_user(PPRCHANGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPrChange" element
     */
    public boolean isSetPPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPRCHANGE$4) != 0;
        }
    }
    
    /**
     * Sets the "pPrChange" element
     */
    public void setPPrChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange pPrChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange)get_store().find_element_user(PPRCHANGE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange)get_store().add_element_user(PPRCHANGE$4);
            }
            target.set(pPrChange);
        }
    }
    
    /**
     * Appends and returns a new empty "pPrChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange addNewPPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrChange)get_store().add_element_user(PPRCHANGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "pPrChange" element
     */
    public void unsetPPrChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPRCHANGE$4, 0);
        }
    }
}
