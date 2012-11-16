/*
 * XML Type:  CT_Entry
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTEntry
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Entry(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTEntry
{
    
    public CTEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEW$0 = 
        new javax.xml.namespace.QName("", "new");
    private static final javax.xml.namespace.QName OLD$2 = 
        new javax.xml.namespace.QName("", "old");
    
    
    /**
     * Gets the "new" attribute
     */
    public int getNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEW$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "new" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NEW$0);
            return target;
        }
    }
    
    /**
     * True if has "new" attribute
     */
    public boolean isSetNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEW$0) != null;
        }
    }
    
    /**
     * Sets the "new" attribute
     */
    public void setNew(int xnew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEW$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEW$0);
            }
            target.setIntValue(xnew);
        }
    }
    
    /**
     * Sets (as xml) the "new" attribute
     */
    public void xsetNew(org.apache.xmlbeans.XmlInt xnew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NEW$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(NEW$0);
            }
            target.set(xnew);
        }
    }
    
    /**
     * Unsets the "new" attribute
     */
    public void unsetNew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEW$0);
        }
    }
    
    /**
     * Gets the "old" attribute
     */
    public int getOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLD$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "old" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(OLD$2);
            return target;
        }
    }
    
    /**
     * True if has "old" attribute
     */
    public boolean isSetOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLD$2) != null;
        }
    }
    
    /**
     * Sets the "old" attribute
     */
    public void setOld(int old)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLD$2);
            }
            target.setIntValue(old);
        }
    }
    
    /**
     * Sets (as xml) the "old" attribute
     */
    public void xsetOld(org.apache.xmlbeans.XmlInt old)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(OLD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(OLD$2);
            }
            target.set(old);
        }
    }
    
    /**
     * Unsets the "old" attribute
     */
    public void unsetOld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLD$2);
        }
    }
}
