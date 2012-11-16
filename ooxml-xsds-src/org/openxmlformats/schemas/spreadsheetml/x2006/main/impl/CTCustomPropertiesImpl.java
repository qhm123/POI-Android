/*
 * XML Type:  CT_CustomProperties
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CustomProperties(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties
{
    
    public CTCustomPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customPr");
    
    
    /**
     * Gets a List of "customPr" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty> getCustomPrList()
    {
        final class CustomPrList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty get(int i)
                { return CTCustomPropertiesImpl.this.getCustomPrArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty old = CTCustomPropertiesImpl.this.getCustomPrArray(i);
                CTCustomPropertiesImpl.this.setCustomPrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty o)
                { CTCustomPropertiesImpl.this.insertNewCustomPr(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty old = CTCustomPropertiesImpl.this.getCustomPrArray(i);
                CTCustomPropertiesImpl.this.removeCustomPr(i);
                return old;
            }
            
            public int size()
                { return CTCustomPropertiesImpl.this.sizeOfCustomPrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomPrList();
        }
    }
    
    /**
     * Gets array of all "customPr" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty[] getCustomPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMPR$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty getCustomPrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty)get_store().find_element_user(CUSTOMPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customPr" element
     */
    public int sizeOfCustomPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMPR$0);
        }
    }
    
    /**
     * Sets array of all "customPr" element
     */
    public void setCustomPrArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty[] customPrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customPrArray, CUSTOMPR$0);
        }
    }
    
    /**
     * Sets ith "customPr" element
     */
    public void setCustomPrArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty customPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty)get_store().find_element_user(CUSTOMPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customPr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty insertNewCustomPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty)get_store().insert_element_user(CUSTOMPR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty addNewCustomPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperty)get_store().add_element_user(CUSTOMPR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "customPr" element
     */
    public void removeCustomPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMPR$0, i);
        }
    }
}
