/*
 * An XML document type.
 * Localname: curve
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one curve(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface CurveDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurveDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("curvea3afdoctype");
    
    /**
     * Gets the "curve" element
     */
    schemasMicrosoftComVml.CTCurve getCurve();
    
    /**
     * Sets the "curve" element
     */
    void setCurve(schemasMicrosoftComVml.CTCurve curve);
    
    /**
     * Appends and returns a new empty "curve" element
     */
    schemasMicrosoftComVml.CTCurve addNewCurve();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
