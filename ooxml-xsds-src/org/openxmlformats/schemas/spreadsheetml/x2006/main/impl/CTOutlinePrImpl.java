/*
 * XML Type:  CT_OutlinePr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_OutlinePr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTOutlinePrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr
{
    
    public CTOutlinePrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYSTYLES$0 = 
        new javax.xml.namespace.QName("", "applyStyles");
    private static final javax.xml.namespace.QName SUMMARYBELOW$2 = 
        new javax.xml.namespace.QName("", "summaryBelow");
    private static final javax.xml.namespace.QName SUMMARYRIGHT$4 = 
        new javax.xml.namespace.QName("", "summaryRight");
    private static final javax.xml.namespace.QName SHOWOUTLINESYMBOLS$6 = 
        new javax.xml.namespace.QName("", "showOutlineSymbols");
    
    
    /**
     * Gets the "applyStyles" attribute
     */
    public boolean getApplyStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYSTYLES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(APPLYSTYLES$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "applyStyles" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYSTYLES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(APPLYSTYLES$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "applyStyles" attribute
     */
    public boolean isSetApplyStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPLYSTYLES$0) != null;
        }
    }
    
    /**
     * Sets the "applyStyles" attribute
     */
    public void setApplyStyles(boolean applyStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLYSTYLES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLYSTYLES$0);
            }
            target.setBooleanValue(applyStyles);
        }
    }
    
    /**
     * Sets (as xml) the "applyStyles" attribute
     */
    public void xsetApplyStyles(org.apache.xmlbeans.XmlBoolean applyStyles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPLYSTYLES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPLYSTYLES$0);
            }
            target.set(applyStyles);
        }
    }
    
    /**
     * Unsets the "applyStyles" attribute
     */
    public void unsetApplyStyles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPLYSTYLES$0);
        }
    }
    
    /**
     * Gets the "summaryBelow" attribute
     */
    public boolean getSummaryBelow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARYBELOW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUMMARYBELOW$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "summaryBelow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSummaryBelow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMMARYBELOW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUMMARYBELOW$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "summaryBelow" attribute
     */
    public boolean isSetSummaryBelow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUMMARYBELOW$2) != null;
        }
    }
    
    /**
     * Sets the "summaryBelow" attribute
     */
    public void setSummaryBelow(boolean summaryBelow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARYBELOW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMMARYBELOW$2);
            }
            target.setBooleanValue(summaryBelow);
        }
    }
    
    /**
     * Sets (as xml) the "summaryBelow" attribute
     */
    public void xsetSummaryBelow(org.apache.xmlbeans.XmlBoolean summaryBelow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMMARYBELOW$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUMMARYBELOW$2);
            }
            target.set(summaryBelow);
        }
    }
    
    /**
     * Unsets the "summaryBelow" attribute
     */
    public void unsetSummaryBelow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUMMARYBELOW$2);
        }
    }
    
    /**
     * Gets the "summaryRight" attribute
     */
    public boolean getSummaryRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUMMARYRIGHT$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "summaryRight" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSummaryRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMMARYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUMMARYRIGHT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "summaryRight" attribute
     */
    public boolean isSetSummaryRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUMMARYRIGHT$4) != null;
        }
    }
    
    /**
     * Sets the "summaryRight" attribute
     */
    public void setSummaryRight(boolean summaryRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMMARYRIGHT$4);
            }
            target.setBooleanValue(summaryRight);
        }
    }
    
    /**
     * Sets (as xml) the "summaryRight" attribute
     */
    public void xsetSummaryRight(org.apache.xmlbeans.XmlBoolean summaryRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMMARYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUMMARYRIGHT$4);
            }
            target.set(summaryRight);
        }
    }
    
    /**
     * Unsets the "summaryRight" attribute
     */
    public void unsetSummaryRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUMMARYRIGHT$4);
        }
    }
    
    /**
     * Gets the "showOutlineSymbols" attribute
     */
    public boolean getShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWOUTLINESYMBOLS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showOutlineSymbols" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWOUTLINESYMBOLS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "showOutlineSymbols" attribute
     */
    public boolean isSetShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6) != null;
        }
    }
    
    /**
     * Sets the "showOutlineSymbols" attribute
     */
    public void setShowOutlineSymbols(boolean showOutlineSymbols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWOUTLINESYMBOLS$6);
            }
            target.setBooleanValue(showOutlineSymbols);
        }
    }
    
    /**
     * Sets (as xml) the "showOutlineSymbols" attribute
     */
    public void xsetShowOutlineSymbols(org.apache.xmlbeans.XmlBoolean showOutlineSymbols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWOUTLINESYMBOLS$6);
            }
            target.set(showOutlineSymbols);
        }
    }
    
    /**
     * Unsets the "showOutlineSymbols" attribute
     */
    public void unsetShowOutlineSymbols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWOUTLINESYMBOLS$6);
        }
    }
}
