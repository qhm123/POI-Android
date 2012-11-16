/*
 * An XML document type.
 * Localname: path
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.PathDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one path(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class PathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.PathDocument
{
    
    public PathDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "path");
    
    
    /**
     * Gets the "path" element
     */
    public schemasMicrosoftComVml.CTPath getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(schemasMicrosoftComVml.CTPath path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTPath)get_store().add_element_user(PATH$0);
            }
            target.set(path);
        }
    }
    
    /**
     * Appends and returns a new empty "path" element
     */
    public schemasMicrosoftComVml.CTPath addNewPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().add_element_user(PATH$0);
            return target;
        }
    }
}
