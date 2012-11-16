/*
 * XML Type:  CT_Formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTFormulas
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML CT_Formulas(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTFormulas extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFormulas.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctformulas808btype");
    
    /**
     * Gets a List of "f" elements
     */
    java.util.List<schemasMicrosoftComVml.CTF> getFList();
    
    /**
     * Gets array of all "f" elements
     * @deprecated
     */
    schemasMicrosoftComVml.CTF[] getFArray();
    
    /**
     * Gets ith "f" element
     */
    schemasMicrosoftComVml.CTF getFArray(int i);
    
    /**
     * Returns number of "f" element
     */
    int sizeOfFArray();
    
    /**
     * Sets array of all "f" element
     */
    void setFArray(schemasMicrosoftComVml.CTF[] fArray);
    
    /**
     * Sets ith "f" element
     */
    void setFArray(int i, schemasMicrosoftComVml.CTF f);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "f" element
     */
    schemasMicrosoftComVml.CTF insertNewF(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "f" element
     */
    schemasMicrosoftComVml.CTF addNewF();
    
    /**
     * Removes the ith "f" element
     */
    void removeF(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
