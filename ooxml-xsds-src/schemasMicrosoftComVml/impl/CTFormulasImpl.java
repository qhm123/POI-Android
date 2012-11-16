/*
 * XML Type:  CT_Formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTFormulas
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Formulas(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTFormulasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTFormulas
{
    
    public CTFormulasImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName F$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "f");
    
    
    /**
     * Gets a List of "f" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTF> getFList()
    {
        final class FList extends java.util.AbstractList<schemasMicrosoftComVml.CTF>
        {
            public schemasMicrosoftComVml.CTF get(int i)
                { return CTFormulasImpl.this.getFArray(i); }
            
            public schemasMicrosoftComVml.CTF set(int i, schemasMicrosoftComVml.CTF o)
            {
                schemasMicrosoftComVml.CTF old = CTFormulasImpl.this.getFArray(i);
                CTFormulasImpl.this.setFArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTF o)
                { CTFormulasImpl.this.insertNewF(i).set(o); }
            
            public schemasMicrosoftComVml.CTF remove(int i)
            {
                schemasMicrosoftComVml.CTF old = CTFormulasImpl.this.getFArray(i);
                CTFormulasImpl.this.removeF(i);
                return old;
            }
            
            public int size()
                { return CTFormulasImpl.this.sizeOfFArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FList();
        }
    }
    
    /**
     * Gets array of all "f" elements
     */
    public schemasMicrosoftComVml.CTF[] getFArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(F$0, targetList);
            schemasMicrosoftComVml.CTF[] result = new schemasMicrosoftComVml.CTF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "f" element
     */
    public schemasMicrosoftComVml.CTF getFArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTF target = null;
            target = (schemasMicrosoftComVml.CTF)get_store().find_element_user(F$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "f" element
     */
    public int sizeOfFArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(F$0);
        }
    }
    
    /**
     * Sets array of all "f" element
     */
    public void setFArray(schemasMicrosoftComVml.CTF[] fArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fArray, F$0);
        }
    }
    
    /**
     * Sets ith "f" element
     */
    public void setFArray(int i, schemasMicrosoftComVml.CTF f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTF target = null;
            target = (schemasMicrosoftComVml.CTF)get_store().find_element_user(F$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(f);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "f" element
     */
    public schemasMicrosoftComVml.CTF insertNewF(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTF target = null;
            target = (schemasMicrosoftComVml.CTF)get_store().insert_element_user(F$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "f" element
     */
    public schemasMicrosoftComVml.CTF addNewF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTF target = null;
            target = (schemasMicrosoftComVml.CTF)get_store().add_element_user(F$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "f" element
     */
    public void removeF(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(F$0, i);
        }
    }
}
