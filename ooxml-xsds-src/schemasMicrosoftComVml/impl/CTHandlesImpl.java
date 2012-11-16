/*
 * XML Type:  CT_Handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTHandles
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Handles(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTHandlesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTHandles
{
    
    public CTHandlesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName H$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "h");
    
    
    /**
     * Gets a List of "h" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTH> getHList()
    {
        final class HList extends java.util.AbstractList<schemasMicrosoftComVml.CTH>
        {
            public schemasMicrosoftComVml.CTH get(int i)
                { return CTHandlesImpl.this.getHArray(i); }
            
            public schemasMicrosoftComVml.CTH set(int i, schemasMicrosoftComVml.CTH o)
            {
                schemasMicrosoftComVml.CTH old = CTHandlesImpl.this.getHArray(i);
                CTHandlesImpl.this.setHArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTH o)
                { CTHandlesImpl.this.insertNewH(i).set(o); }
            
            public schemasMicrosoftComVml.CTH remove(int i)
            {
                schemasMicrosoftComVml.CTH old = CTHandlesImpl.this.getHArray(i);
                CTHandlesImpl.this.removeH(i);
                return old;
            }
            
            public int size()
                { return CTHandlesImpl.this.sizeOfHArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HList();
        }
    }
    
    /**
     * Gets array of all "h" elements
     */
    public schemasMicrosoftComVml.CTH[] getHArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(H$0, targetList);
            schemasMicrosoftComVml.CTH[] result = new schemasMicrosoftComVml.CTH[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "h" element
     */
    public schemasMicrosoftComVml.CTH getHArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTH target = null;
            target = (schemasMicrosoftComVml.CTH)get_store().find_element_user(H$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "h" element
     */
    public int sizeOfHArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H$0);
        }
    }
    
    /**
     * Sets array of all "h" element
     */
    public void setHArray(schemasMicrosoftComVml.CTH[] hArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hArray, H$0);
        }
    }
    
    /**
     * Sets ith "h" element
     */
    public void setHArray(int i, schemasMicrosoftComVml.CTH h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTH target = null;
            target = (schemasMicrosoftComVml.CTH)get_store().find_element_user(H$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(h);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h" element
     */
    public schemasMicrosoftComVml.CTH insertNewH(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTH target = null;
            target = (schemasMicrosoftComVml.CTH)get_store().insert_element_user(H$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h" element
     */
    public schemasMicrosoftComVml.CTH addNewH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTH target = null;
            target = (schemasMicrosoftComVml.CTH)get_store().add_element_user(H$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "h" element
     */
    public void removeH(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H$0, i);
        }
    }
}
