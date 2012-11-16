/*
 * An XML document type.
 * Localname: textdata
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: schemasMicrosoftComOfficePowerpoint.TextdataDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficePowerpoint.impl;
/**
 * A document containing one textdata(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public class TextdataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficePowerpoint.TextdataDocument
{
    
    public TextdataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTDATA$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:powerpoint", "textdata");
    
    
    /**
     * Gets the "textdata" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTRel getTextdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().find_element_user(TEXTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textdata" element
     */
    public void setTextdata(schemasMicrosoftComOfficePowerpoint.CTRel textdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().find_element_user(TEXTDATA$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().add_element_user(TEXTDATA$0);
            }
            target.set(textdata);
        }
    }
    
    /**
     * Appends and returns a new empty "textdata" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTRel addNewTextdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().add_element_user(TEXTDATA$0);
            return target;
        }
    }
}
