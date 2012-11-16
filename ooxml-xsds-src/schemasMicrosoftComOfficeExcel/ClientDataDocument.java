/*
 * An XML document type.
 * Localname: ClientData
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: schemasMicrosoftComOfficeExcel.ClientDataDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeExcel;


/**
 * A document containing one ClientData(@urn:schemas-microsoft-com:office:excel) element.
 *
 * This is a complex type.
 */
public interface ClientDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClientDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("clientdata1847doctype");
    
    /**
     * Gets the "ClientData" element
     */
    schemasMicrosoftComOfficeExcel.CTClientData getClientData();
    
    /**
     * Sets the "ClientData" element
     */
    void setClientData(schemasMicrosoftComOfficeExcel.CTClientData clientData);
    
    /**
     * Appends and returns a new empty "ClientData" element
     */
    schemasMicrosoftComOfficeExcel.CTClientData addNewClientData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
