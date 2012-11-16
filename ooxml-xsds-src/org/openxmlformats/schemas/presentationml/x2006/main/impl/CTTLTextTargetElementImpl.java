/*
 * XML Type:  CT_TLTextTargetElement
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTextTargetElement(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTextTargetElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTextTargetElement
{
    
    public CTTLTextTargetElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARRG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "charRg");
    private static final javax.xml.namespace.QName PRG$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "pRg");
    
    
    /**
     * Gets the "charRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange getCharRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(CHARRG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "charRg" element
     */
    public boolean isSetCharRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARRG$0) != 0;
        }
    }
    
    /**
     * Sets the "charRg" element
     */
    public void setCharRg(org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange charRg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(CHARRG$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(CHARRG$0);
            }
            target.set(charRg);
        }
    }
    
    /**
     * Appends and returns a new empty "charRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange addNewCharRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(CHARRG$0);
            return target;
        }
    }
    
    /**
     * Unsets the "charRg" element
     */
    public void unsetCharRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARRG$0, 0);
        }
    }
    
    /**
     * Gets the "pRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange getPRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(PRG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pRg" element
     */
    public boolean isSetPRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRG$2) != 0;
        }
    }
    
    /**
     * Sets the "pRg" element
     */
    public void setPRg(org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange pRg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().find_element_user(PRG$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(PRG$2);
            }
            target.set(pRg);
        }
    }
    
    /**
     * Appends and returns a new empty "pRg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange addNewPRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange)get_store().add_element_user(PRG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pRg" element
     */
    public void unsetPRg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRG$2, 0);
        }
    }
}
