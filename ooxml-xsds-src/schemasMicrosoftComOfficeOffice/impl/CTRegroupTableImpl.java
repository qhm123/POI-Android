/*
 * XML Type:  CT_RegroupTable
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRegroupTable
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_RegroupTable(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRegroupTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTRegroupTable
{
    
    public CTRegroupTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "entry");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    
    
    /**
     * Gets a List of "entry" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTEntry> getEntryList()
    {
        final class EntryList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTEntry>
        {
            public schemasMicrosoftComOfficeOffice.CTEntry get(int i)
                { return CTRegroupTableImpl.this.getEntryArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTEntry set(int i, schemasMicrosoftComOfficeOffice.CTEntry o)
            {
                schemasMicrosoftComOfficeOffice.CTEntry old = CTRegroupTableImpl.this.getEntryArray(i);
                CTRegroupTableImpl.this.setEntryArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTEntry o)
                { CTRegroupTableImpl.this.insertNewEntry(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTEntry remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTEntry old = CTRegroupTableImpl.this.getEntryArray(i);
                CTRegroupTableImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return CTRegroupTableImpl.this.sizeOfEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntryList();
        }
    }
    
    /**
     * Gets array of all "entry" elements
     */
    public schemasMicrosoftComOfficeOffice.CTEntry[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRY$0, targetList);
            schemasMicrosoftComOfficeOffice.CTEntry[] result = new schemasMicrosoftComOfficeOffice.CTEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public schemasMicrosoftComOfficeOffice.CTEntry getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTEntry target = null;
            target = (schemasMicrosoftComOfficeOffice.CTEntry)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$0);
        }
    }
    
    /**
     * Sets array of all "entry" element
     */
    public void setEntryArray(schemasMicrosoftComOfficeOffice.CTEntry[] entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$0);
        }
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, schemasMicrosoftComOfficeOffice.CTEntry entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTEntry target = null;
            target = (schemasMicrosoftComOfficeOffice.CTEntry)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public schemasMicrosoftComOfficeOffice.CTEntry insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTEntry target = null;
            target = (schemasMicrosoftComOfficeOffice.CTEntry)get_store().insert_element_user(ENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public schemasMicrosoftComOfficeOffice.CTEntry addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTEntry target = null;
            target = (schemasMicrosoftComOfficeOffice.CTEntry)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$0, i);
        }
    }
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$2);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STExt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt xgetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$2);
            return target;
        }
    }
    
    /**
     * True if has "ext" attribute
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXT$2) != null;
        }
    }
    
    /**
     * Sets the "ext" attribute
     */
    public void setExt(schemasMicrosoftComVml.STExt.Enum ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$2);
            }
            target.setEnumValue(ext);
        }
    }
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    public void xsetExt(schemasMicrosoftComVml.STExt ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$2);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$2);
            }
            target.set(ext);
        }
    }
    
    /**
     * Unsets the "ext" attribute
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXT$2);
        }
    }
}
