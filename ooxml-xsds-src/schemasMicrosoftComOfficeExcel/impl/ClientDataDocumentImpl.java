/*
 * An XML document type.
 * Localname: ClientData
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: schemasMicrosoftComOfficeExcel.ClientDataDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeExcel.impl;
/**
 * A document containing one ClientData(@urn:schemas-microsoft-com:office:excel) element.
 *
 * This is a complex type.
 */
public class ClientDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeExcel.ClientDataDocument
{
    
    public ClientDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTDATA$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:excel", "ClientData");
    
    
    /**
     * Gets the "ClientData" element
     */
    public schemasMicrosoftComOfficeExcel.CTClientData getClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().find_element_user(CLIENTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ClientData" element
     */
    public void setClientData(schemasMicrosoftComOfficeExcel.CTClientData clientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().find_element_user(CLIENTDATA$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().add_element_user(CLIENTDATA$0);
            }
            target.set(clientData);
        }
    }
    
    /**
     * Appends and returns a new empty "ClientData" element
     */
    public schemasMicrosoftComOfficeExcel.CTClientData addNewClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().add_element_user(CLIENTDATA$0);
            return target;
        }
    }
}
