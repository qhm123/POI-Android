/*
 * An XML document type.
 * Localname: group
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one group(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.GroupDocument
{
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "group");
    
    
    /**
     * Gets the "group" element
     */
    public schemasMicrosoftComVml.CTGroup getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(schemasMicrosoftComVml.CTGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTGroup)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public schemasMicrosoftComVml.CTGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
