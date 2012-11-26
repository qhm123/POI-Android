/*
 * XML Type:  CT_IndexRange
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_IndexRange(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTIndexRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTIndexRange
{
    
    public CTIndexRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ST$0 = 
        new javax.xml.namespace.QName("", "st");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("", "end");
    
    
    /**
     * Gets the "st" attribute
     */
    public long getSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "st" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STIndex xgetSt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STIndex target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STIndex)get_store().find_attribute_user(ST$0);
            return target;
        }
    }
    
    /**
     * Sets the "st" attribute
     */
    public void setSt(long st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ST$0);
            }
            target.setLongValue(st);
        }
    }
    
    /**
     * Sets (as xml) the "st" attribute
     */
    public void xsetSt(org.openxmlformats.schemas.presentationml.x2006.main.STIndex st)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STIndex target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STIndex)get_store().find_attribute_user(ST$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STIndex)get_store().add_attribute_user(ST$0);
            }
            target.set(st);
        }
    }
    
    /**
     * Gets the "end" attribute
     */
    public long getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STIndex xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STIndex target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STIndex)get_store().find_attribute_user(END$2);
            return target;
        }
    }
    
    /**
     * Sets the "end" attribute
     */
    public void setEnd(long end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$2);
            }
            target.setLongValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" attribute
     */
    public void xsetEnd(org.openxmlformats.schemas.presentationml.x2006.main.STIndex end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STIndex target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STIndex)get_store().find_attribute_user(END$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STIndex)get_store().add_attribute_user(END$2);
            }
            target.set(end);
        }
    }
}
