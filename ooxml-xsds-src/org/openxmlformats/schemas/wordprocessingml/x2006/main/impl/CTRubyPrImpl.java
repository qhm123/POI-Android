/*
 * XML Type:  CT_RubyPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_RubyPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRubyPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr
{
    
    public CTRubyPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUBYALIGN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rubyAlign");
    private static final javax.xml.namespace.QName HPS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hps");
    private static final javax.xml.namespace.QName HPSRAISE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hpsRaise");
    private static final javax.xml.namespace.QName HPSBASETEXT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hpsBaseText");
    private static final javax.xml.namespace.QName LID$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lid");
    private static final javax.xml.namespace.QName DIRTY$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dirty");
    
    
    /**
     * Gets the "rubyAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign getRubyAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign)get_store().find_element_user(RUBYALIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rubyAlign" element
     */
    public void setRubyAlign(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign rubyAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign)get_store().find_element_user(RUBYALIGN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign)get_store().add_element_user(RUBYALIGN$0);
            }
            target.set(rubyAlign);
        }
    }
    
    /**
     * Appends and returns a new empty "rubyAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign addNewRubyAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyAlign)get_store().add_element_user(RUBYALIGN$0);
            return target;
        }
    }
    
    /**
     * Gets the "hps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getHps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(HPS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hps" element
     */
    public void setHps(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure hps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(HPS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(HPS$2);
            }
            target.set(hps);
        }
    }
    
    /**
     * Appends and returns a new empty "hps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewHps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(HPS$2);
            return target;
        }
    }
    
    /**
     * Gets the "hpsRaise" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getHpsRaise()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(HPSRAISE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hpsRaise" element
     */
    public void setHpsRaise(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure hpsRaise)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(HPSRAISE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(HPSRAISE$4);
            }
            target.set(hpsRaise);
        }
    }
    
    /**
     * Appends and returns a new empty "hpsRaise" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewHpsRaise()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(HPSRAISE$4);
            return target;
        }
    }
    
    /**
     * Gets the "hpsBaseText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getHpsBaseText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(HPSBASETEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hpsBaseText" element
     */
    public void setHpsBaseText(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure hpsBaseText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(HPSBASETEXT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(HPSBASETEXT$6);
            }
            target.set(hpsBaseText);
        }
    }
    
    /**
     * Appends and returns a new empty "hpsBaseText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewHpsBaseText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(HPSBASETEXT$6);
            return target;
        }
    }
    
    /**
     * Gets the "lid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang getLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().find_element_user(LID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lid" element
     */
    public void setLid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang lid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().find_element_user(LID$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().add_element_user(LID$8);
            }
            target.set(lid);
        }
    }
    
    /**
     * Appends and returns a new empty "lid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang addNewLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().add_element_user(LID$8);
            return target;
        }
    }
    
    /**
     * Gets the "dirty" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DIRTY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dirty" element
     */
    public boolean isSetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRTY$10) != 0;
        }
    }
    
    /**
     * Sets the "dirty" element
     */
    public void setDirty(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff dirty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DIRTY$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DIRTY$10);
            }
            target.set(dirty);
        }
    }
    
    /**
     * Appends and returns a new empty "dirty" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DIRTY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "dirty" element
     */
    public void unsetDirty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRTY$10, 0);
        }
    }
}
