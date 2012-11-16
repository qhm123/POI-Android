/*
 * An XML document type.
 * Localname: formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.FormulasDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one formulas(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface FormulasDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormulasDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("formulaseedfdoctype");
    
    /**
     * Gets the "formulas" element
     */
    schemasMicrosoftComVml.CTFormulas getFormulas();
    
    /**
     * Sets the "formulas" element
     */
    void setFormulas(schemasMicrosoftComVml.CTFormulas formulas);
    
    /**
     * Appends and returns a new empty "formulas" element
     */
    schemasMicrosoftComVml.CTFormulas addNewFormulas();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
