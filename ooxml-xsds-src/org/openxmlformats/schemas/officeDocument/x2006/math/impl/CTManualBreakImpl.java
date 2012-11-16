/*
 * XML Type:  CT_ManualBreak
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_ManualBreak(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTManualBreakImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTManualBreak
{
    
    public CTManualBreakImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALNAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "alnAt");
    
    
    /**
     * Gets the "alnAt" attribute
     */
    public int getAlnAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALNAT$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "alnAt" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255 xgetAlnAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255)get_store().find_attribute_user(ALNAT$0);
            return target;
        }
    }
    
    /**
     * True if has "alnAt" attribute
     */
    public boolean isSetAlnAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALNAT$0) != null;
        }
    }
    
    /**
     * Sets the "alnAt" attribute
     */
    public void setAlnAt(int alnAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALNAT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALNAT$0);
            }
            target.setIntValue(alnAt);
        }
    }
    
    /**
     * Sets (as xml) the "alnAt" attribute
     */
    public void xsetAlnAt(org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255 alnAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255)get_store().find_attribute_user(ALNAT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.STInteger255)get_store().add_attribute_user(ALNAT$0);
            }
            target.set(alnAt);
        }
    }
    
    /**
     * Unsets the "alnAt" attribute
     */
    public void unsetAlnAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALNAT$0);
        }
    }
}
