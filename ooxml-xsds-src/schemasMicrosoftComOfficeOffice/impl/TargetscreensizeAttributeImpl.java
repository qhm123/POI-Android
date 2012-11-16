/*
 * An XML attribute type.
 * Localname: targetscreensize
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.TargetscreensizeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one targetscreensize(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class TargetscreensizeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.TargetscreensizeAttribute
{
    
    public TargetscreensizeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETSCREENSIZE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "targetscreensize");
    
    
    /**
     * Gets the "targetscreensize" attribute
     */
    public schemasMicrosoftComOfficeOffice.STScreenSize.Enum getTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSCREENSIZE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STScreenSize.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetscreensize" attribute
     */
    public schemasMicrosoftComOfficeOffice.STScreenSize xgetTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STScreenSize target = null;
            target = (schemasMicrosoftComOfficeOffice.STScreenSize)get_store().find_attribute_user(TARGETSCREENSIZE$0);
            return target;
        }
    }
    
    /**
     * True if has "targetscreensize" attribute
     */
    public boolean isSetTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETSCREENSIZE$0) != null;
        }
    }
    
    /**
     * Sets the "targetscreensize" attribute
     */
    public void setTargetscreensize(schemasMicrosoftComOfficeOffice.STScreenSize.Enum targetscreensize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETSCREENSIZE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETSCREENSIZE$0);
            }
            target.setEnumValue(targetscreensize);
        }
    }
    
    /**
     * Sets (as xml) the "targetscreensize" attribute
     */
    public void xsetTargetscreensize(schemasMicrosoftComOfficeOffice.STScreenSize targetscreensize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STScreenSize target = null;
            target = (schemasMicrosoftComOfficeOffice.STScreenSize)get_store().find_attribute_user(TARGETSCREENSIZE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STScreenSize)get_store().add_attribute_user(TARGETSCREENSIZE$0);
            }
            target.set(targetscreensize);
        }
    }
    
    /**
     * Unsets the "targetscreensize" attribute
     */
    public void unsetTargetscreensize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETSCREENSIZE$0);
        }
    }
}
