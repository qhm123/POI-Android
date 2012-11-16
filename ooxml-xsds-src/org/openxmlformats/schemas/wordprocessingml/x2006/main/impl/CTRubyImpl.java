/*
 * XML Type:  CT_Ruby
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Ruby(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRubyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby
{
    
    public CTRubyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUBYPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rubyPr");
    private static final javax.xml.namespace.QName RT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rt");
    private static final javax.xml.namespace.QName RUBYBASE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rubyBase");
    
    
    /**
     * Gets the "rubyPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr getRubyPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr)get_store().find_element_user(RUBYPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rubyPr" element
     */
    public void setRubyPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr rubyPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr)get_store().find_element_user(RUBYPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr)get_store().add_element_user(RUBYPR$0);
            }
            target.set(rubyPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rubyPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr addNewRubyPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyPr)get_store().add_element_user(RUBYPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "rt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent getRt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().find_element_user(RT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rt" element
     */
    public void setRt(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent rt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().find_element_user(RT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().add_element_user(RT$2);
            }
            target.set(rt);
        }
    }
    
    /**
     * Appends and returns a new empty "rt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent addNewRt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().add_element_user(RT$2);
            return target;
        }
    }
    
    /**
     * Gets the "rubyBase" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent getRubyBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().find_element_user(RUBYBASE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rubyBase" element
     */
    public void setRubyBase(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent rubyBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().find_element_user(RUBYBASE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().add_element_user(RUBYBASE$4);
            }
            target.set(rubyBase);
        }
    }
    
    /**
     * Appends and returns a new empty "rubyBase" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent addNewRubyBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent)get_store().add_element_user(RUBYBASE$4);
            return target;
        }
    }
}
