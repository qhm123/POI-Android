/*
 * An XML attribute type.
 * Localname: movie
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.MovieAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one movie(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface MovieAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MovieAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("movie24a3attrtypetype");
    
    /**
     * Gets the "movie" attribute
     */
    float getMovie();
    
    /**
     * Gets (as xml) the "movie" attribute
     */
    org.apache.xmlbeans.XmlFloat xgetMovie();
    
    /**
     * True if has "movie" attribute
     */
    boolean isSetMovie();
    
    /**
     * Sets the "movie" attribute
     */
    void setMovie(float movie);
    
    /**
     * Sets (as xml) the "movie" attribute
     */
    void xsetMovie(org.apache.xmlbeans.XmlFloat movie);
    
    /**
     * Unsets the "movie" attribute
     */
    void unsetMovie();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
