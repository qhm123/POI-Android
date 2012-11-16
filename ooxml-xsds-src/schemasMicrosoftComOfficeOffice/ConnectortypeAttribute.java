/*
 * An XML attribute type.
 * Localname: connectortype
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ConnectortypeAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one connectortype(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ConnectortypeAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConnectortypeAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("connectortype127aattrtypetype");
    
    /**
     * Gets the "connectortype" attribute
     */
    schemasMicrosoftComOfficeOffice.STConnectorType.Enum getConnectortype();
    
    /**
     * Gets (as xml) the "connectortype" attribute
     */
    schemasMicrosoftComOfficeOffice.STConnectorType xgetConnectortype();
    
    /**
     * True if has "connectortype" attribute
     */
    boolean isSetConnectortype();
    
    /**
     * Sets the "connectortype" attribute
     */
    void setConnectortype(schemasMicrosoftComOfficeOffice.STConnectorType.Enum connectortype);
    
    /**
     * Sets (as xml) the "connectortype" attribute
     */
    void xsetConnectortype(schemasMicrosoftComOfficeOffice.STConnectorType connectortype);
    
    /**
     * Unsets the "connectortype" attribute
     */
    void unsetConnectortype();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
