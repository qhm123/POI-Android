/*
 * An XML attribute type.
 * Localname: relid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.RelidAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one relid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class RelidAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.RelidAttribute
{
    
    public RelidAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELID$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "relid");
    
    
    /**
     * Gets the "relid" attribute
     */
    public java.lang.String getRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relid" attribute
     */
    public schemasMicrosoftComOfficeOffice.STRelationshipId xgetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRelationshipId target = null;
            target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().find_attribute_user(RELID$0);
            return target;
        }
    }
    
    /**
     * True if has "relid" attribute
     */
    public boolean isSetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELID$0) != null;
        }
    }
    
    /**
     * Sets the "relid" attribute
     */
    public void setRelid(java.lang.String relid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELID$0);
            }
            target.setStringValue(relid);
        }
    }
    
    /**
     * Sets (as xml) the "relid" attribute
     */
    public void xsetRelid(schemasMicrosoftComOfficeOffice.STRelationshipId relid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRelationshipId target = null;
            target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().find_attribute_user(RELID$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STRelationshipId)get_store().add_attribute_user(RELID$0);
            }
            target.set(relid);
        }
    }
    
    /**
     * Unsets the "relid" attribute
     */
    public void unsetRelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELID$0);
        }
    }
}
