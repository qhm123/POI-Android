/*
 * An XML document type.
 * Localname: additionalCharacteristics
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/characteristics
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.characteristics.AdditionalCharacteristicsDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.characteristics.impl;
/**
 * A document containing one additionalCharacteristics(@http://schemas.openxmlformats.org/officeDocument/2006/characteristics) element.
 *
 * This is a complex type.
 */
public class AdditionalCharacteristicsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.characteristics.AdditionalCharacteristicsDocument
{
    
    public AdditionalCharacteristicsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDITIONALCHARACTERISTICS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/characteristics", "additionalCharacteristics");
    
    
    /**
     * Gets the "additionalCharacteristics" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics getAdditionalCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics)get_store().find_element_user(ADDITIONALCHARACTERISTICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "additionalCharacteristics" element
     */
    public void setAdditionalCharacteristics(org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics additionalCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics)get_store().find_element_user(ADDITIONALCHARACTERISTICS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics)get_store().add_element_user(ADDITIONALCHARACTERISTICS$0);
            }
            target.set(additionalCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "additionalCharacteristics" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics addNewAdditionalCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.characteristics.CTAdditionalCharacteristics)get_store().add_element_user(ADDITIONALCHARACTERISTICS$0);
            return target;
        }
    }
}
