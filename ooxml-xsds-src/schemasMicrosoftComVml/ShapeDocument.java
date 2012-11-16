/*
 * An XML document type.
 * Localname: shape
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ShapeDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one shape(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ShapeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShapeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("shapeaee1doctype");
    
    /**
     * Gets the "shape" element
     */
    schemasMicrosoftComVml.CTShape getShape();
    
    /**
     * Sets the "shape" element
     */
    void setShape(schemasMicrosoftComVml.CTShape shape);
    
    /**
     * Appends and returns a new empty "shape" element
     */
    schemasMicrosoftComVml.CTShape addNewShape();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
