/*
 * An XML document type.
 * Localname: polyline
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.PolylineDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one polyline(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface PolylineDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PolylineDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("polylinee992doctype");
    
    /**
     * Gets the "polyline" element
     */
    schemasMicrosoftComVml.CTPolyLine getPolyline();
    
    /**
     * Sets the "polyline" element
     */
    void setPolyline(schemasMicrosoftComVml.CTPolyLine polyline);
    
    /**
     * Appends and returns a new empty "polyline" element
     */
    schemasMicrosoftComVml.CTPolyLine addNewPolyline();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
