/*
 * XML Type:  CT_AltChunkPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunkPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_AltChunkPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAltChunkPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAltChunkPr
{
    
    public CTAltChunkPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATCHSRC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "matchSrc");
    
    
    /**
     * Gets the "matchSrc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getMatchSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(MATCHSRC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "matchSrc" element
     */
    public boolean isSetMatchSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHSRC$0) != 0;
        }
    }
    
    /**
     * Sets the "matchSrc" element
     */
    public void setMatchSrc(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff matchSrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(MATCHSRC$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(MATCHSRC$0);
            }
            target.set(matchSrc);
        }
    }
    
    /**
     * Appends and returns a new empty "matchSrc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewMatchSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(MATCHSRC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "matchSrc" element
     */
    public void unsetMatchSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHSRC$0, 0);
        }
    }
}
