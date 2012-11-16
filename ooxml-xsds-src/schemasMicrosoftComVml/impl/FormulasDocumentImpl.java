/*
 * An XML document type.
 * Localname: formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.FormulasDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one formulas(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class FormulasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.FormulasDocument
{
    
    public FormulasDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMULAS$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "formulas");
    
    
    /**
     * Gets the "formulas" element
     */
    public schemasMicrosoftComVml.CTFormulas getFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().find_element_user(FORMULAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "formulas" element
     */
    public void setFormulas(schemasMicrosoftComVml.CTFormulas formulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().find_element_user(FORMULAS$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTFormulas)get_store().add_element_user(FORMULAS$0);
            }
            target.set(formulas);
        }
    }
    
    /**
     * Appends and returns a new empty "formulas" element
     */
    public schemasMicrosoftComVml.CTFormulas addNewFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().add_element_user(FORMULAS$0);
            return target;
        }
    }
}
