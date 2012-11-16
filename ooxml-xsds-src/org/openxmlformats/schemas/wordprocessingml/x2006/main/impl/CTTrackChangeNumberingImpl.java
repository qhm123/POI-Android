/*
 * XML Type:  CT_TrackChangeNumbering
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_TrackChangeNumbering(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTrackChangeNumberingImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering
{
    
    public CTTrackChangeNumberingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "original");
    
    
    /**
     * Gets the "original" attribute
     */
    public java.lang.String getOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINAL$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "original" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ORIGINAL$0);
            return target;
        }
    }
    
    /**
     * True if has "original" attribute
     */
    public boolean isSetOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGINAL$0) != null;
        }
    }
    
    /**
     * Sets the "original" attribute
     */
    public void setOriginal(java.lang.String original)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGINAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGINAL$0);
            }
            target.setStringValue(original);
        }
    }
    
    /**
     * Sets (as xml) the "original" attribute
     */
    public void xsetOriginal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString original)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ORIGINAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(ORIGINAL$0);
            }
            target.set(original);
        }
    }
    
    /**
     * Unsets the "original" attribute
     */
    public void unsetOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGINAL$0);
        }
    }
}
