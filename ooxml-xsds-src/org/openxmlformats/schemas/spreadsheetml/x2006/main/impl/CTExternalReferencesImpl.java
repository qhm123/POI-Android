/*
 * XML Type:  CT_ExternalReferences
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalReferences(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences
{
    
    public CTExternalReferencesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalReference");
    
    
    /**
     * Gets a List of "externalReference" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference> getExternalReferenceList()
    {
        final class ExternalReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference get(int i)
                { return CTExternalReferencesImpl.this.getExternalReferenceArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference old = CTExternalReferencesImpl.this.getExternalReferenceArray(i);
                CTExternalReferencesImpl.this.setExternalReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference o)
                { CTExternalReferencesImpl.this.insertNewExternalReference(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference old = CTExternalReferencesImpl.this.getExternalReferenceArray(i);
                CTExternalReferencesImpl.this.removeExternalReference(i);
                return old;
            }
            
            public int size()
                { return CTExternalReferencesImpl.this.sizeOfExternalReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExternalReferenceList();
        }
    }
    
    /**
     * Gets array of all "externalReference" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference[] getExternalReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTERNALREFERENCE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "externalReference" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference getExternalReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference)get_store().find_element_user(EXTERNALREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "externalReference" element
     */
    public int sizeOfExternalReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALREFERENCE$0);
        }
    }
    
    /**
     * Sets array of all "externalReference" element
     */
    public void setExternalReferenceArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference[] externalReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(externalReferenceArray, EXTERNALREFERENCE$0);
        }
    }
    
    /**
     * Sets ith "externalReference" element
     */
    public void setExternalReferenceArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference externalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference)get_store().find_element_user(EXTERNALREFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(externalReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "externalReference" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference insertNewExternalReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference)get_store().insert_element_user(EXTERNALREFERENCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "externalReference" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference addNewExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference)get_store().add_element_user(EXTERNALREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "externalReference" element
     */
    public void removeExternalReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALREFERENCE$0, i);
        }
    }
}
