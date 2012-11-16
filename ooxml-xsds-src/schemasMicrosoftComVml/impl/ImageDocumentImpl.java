/*
 * An XML document type.
 * Localname: image
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ImageDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one image(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ImageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.ImageDocument
{
    
    public ImageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "image");
    
    
    /**
     * Gets the "image" element
     */
    public schemasMicrosoftComVml.CTImage getImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().find_element_user(IMAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "image" element
     */
    public void setImage(schemasMicrosoftComVml.CTImage image)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().find_element_user(IMAGE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTImage)get_store().add_element_user(IMAGE$0);
            }
            target.set(image);
        }
    }
    
    /**
     * Appends and returns a new empty "image" element
     */
    public schemasMicrosoftComVml.CTImage addNewImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().add_element_user(IMAGE$0);
            return target;
        }
    }
}
