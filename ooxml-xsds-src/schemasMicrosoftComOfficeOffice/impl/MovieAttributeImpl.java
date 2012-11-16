/*
 * An XML attribute type.
 * Localname: movie
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.MovieAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one movie(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class MovieAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.MovieAttribute
{
    
    public MovieAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVIE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "movie");
    
    
    /**
     * Gets the "movie" attribute
     */
    public float getMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOVIE$0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "movie" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(MOVIE$0);
            return target;
        }
    }
    
    /**
     * True if has "movie" attribute
     */
    public boolean isSetMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOVIE$0) != null;
        }
    }
    
    /**
     * Sets the "movie" attribute
     */
    public void setMovie(float movie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOVIE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOVIE$0);
            }
            target.setFloatValue(movie);
        }
    }
    
    /**
     * Sets (as xml) the "movie" attribute
     */
    public void xsetMovie(org.apache.xmlbeans.XmlFloat movie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(MOVIE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(MOVIE$0);
            }
            target.set(movie);
        }
    }
    
    /**
     * Unsets the "movie" attribute
     */
    public void unsetMovie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOVIE$0);
        }
    }
}
