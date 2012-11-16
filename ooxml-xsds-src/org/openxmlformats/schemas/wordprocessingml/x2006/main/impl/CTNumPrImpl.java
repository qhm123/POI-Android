/*
 * XML Type:  CT_NumPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_NumPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTNumPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr
{
    
    public CTNumPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ILVL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ilvl");
    private static final javax.xml.namespace.QName NUMID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numId");
    private static final javax.xml.namespace.QName NUMBERINGCHANGE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numberingChange");
    private static final javax.xml.namespace.QName INS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
    
    
    /**
     * Gets the "ilvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ILVL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ilvl" element
     */
    public boolean isSetIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ILVL$0) != 0;
        }
    }
    
    /**
     * Sets the "ilvl" element
     */
    public void setIlvl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber ilvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ILVL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ILVL$0);
            }
            target.set(ilvl);
        }
    }
    
    /**
     * Appends and returns a new empty "ilvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ILVL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ilvl" element
     */
    public void unsetIlvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ILVL$0, 0);
        }
    }
    
    /**
     * Gets the "numId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(NUMID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numId" element
     */
    public boolean isSetNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMID$2) != 0;
        }
    }
    
    /**
     * Sets the "numId" element
     */
    public void setNumId(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber numId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(NUMID$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(NUMID$2);
            }
            target.set(numId);
        }
    }
    
    /**
     * Appends and returns a new empty "numId" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(NUMID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "numId" element
     */
    public void unsetNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMID$2, 0);
        }
    }
    
    /**
     * Gets the "numberingChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering getNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().find_element_user(NUMBERINGCHANGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numberingChange" element
     */
    public boolean isSetNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERINGCHANGE$4) != 0;
        }
    }
    
    /**
     * Sets the "numberingChange" element
     */
    public void setNumberingChange(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering numberingChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().find_element_user(NUMBERINGCHANGE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().add_element_user(NUMBERINGCHANGE$4);
            }
            target.set(numberingChange);
        }
    }
    
    /**
     * Appends and returns a new empty "numberingChange" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering addNewNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering)get_store().add_element_user(NUMBERINGCHANGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "numberingChange" element
     */
    public void unsetNumberingChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERINGCHANGE$4, 0);
        }
    }
    
    /**
     * Gets the "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(INS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ins" element
     */
    public boolean isSetIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INS$6) != 0;
        }
    }
    
    /**
     * Sets the "ins" element
     */
    public void setIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange ins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(INS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(INS$6);
            }
            target.set(ins);
        }
    }
    
    /**
     * Appends and returns a new empty "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(INS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ins" element
     */
    public void unsetIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INS$6, 0);
        }
    }
}
