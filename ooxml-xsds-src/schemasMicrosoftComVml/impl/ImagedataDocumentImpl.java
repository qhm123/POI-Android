/*
 * An XML document type.
 * Localname: imagedata
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ImagedataDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one imagedata(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ImagedataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.ImagedataDocument
{
    
    public ImagedataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEDATA$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "imagedata");
    
    
    /**
     * Gets the "imagedata" element
     */
    public schemasMicrosoftComVml.CTImageData getImagedata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().find_element_user(IMAGEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imagedata" element
     */
    public void setImagedata(schemasMicrosoftComVml.CTImageData imagedata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().find_element_user(IMAGEDATA$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTImageData)get_store().add_element_user(IMAGEDATA$0);
            }
            target.set(imagedata);
        }
    }
    
    /**
     * Appends and returns a new empty "imagedata" element
     */
    public schemasMicrosoftComVml.CTImageData addNewImagedata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().add_element_user(IMAGEDATA$0);
            return target;
        }
    }
}
