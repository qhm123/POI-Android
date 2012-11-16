/*
 * XML Type:  CT_Handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTHandles
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML CT_Handles(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTHandles extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTHandles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cthandles5c1ftype");
    
    /**
     * Gets a List of "h" elements
     */
    java.util.List<schemasMicrosoftComVml.CTH> getHList();
    
    /**
     * Gets array of all "h" elements
     * @deprecated
     */
    schemasMicrosoftComVml.CTH[] getHArray();
    
    /**
     * Gets ith "h" element
     */
    schemasMicrosoftComVml.CTH getHArray(int i);
    
    /**
     * Returns number of "h" element
     */
    int sizeOfHArray();
    
    /**
     * Sets array of all "h" element
     */
    void setHArray(schemasMicrosoftComVml.CTH[] hArray);
    
    /**
     * Sets ith "h" element
     */
    void setHArray(int i, schemasMicrosoftComVml.CTH h);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h" element
     */
    schemasMicrosoftComVml.CTH insertNewH(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h" element
     */
    schemasMicrosoftComVml.CTH addNewH();
    
    /**
     * Removes the ith "h" element
     */
    void removeH(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
