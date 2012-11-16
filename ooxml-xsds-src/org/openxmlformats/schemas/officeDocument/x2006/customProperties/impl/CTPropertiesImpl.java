/*
 * XML Type:  CT_Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;
/**
 * An XML CT_Properties(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties).
 *
 * This is a complex type.
 */
public class CTPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties
{
    
    public CTPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/custom-properties", "property");
    
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty get(int i)
                { return CTPropertiesImpl.this.getPropertyArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty set(int i, org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty old = CTPropertiesImpl.this.getPropertyArray(i);
                CTPropertiesImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty o)
                { CTPropertiesImpl.this.insertNewProperty(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty old = CTPropertiesImpl.this.getPropertyArray(i);
                CTPropertiesImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return CTPropertiesImpl.this.sizeOfPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PropertyList();
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty[] result = new org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
}
