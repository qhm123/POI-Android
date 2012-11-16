/*
 * XML Type:  CT_Rules
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRules
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Rules(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTRules
{
    
    public CTRulesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName R$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "r");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    
    
    /**
     * Gets a List of "r" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTR> getRList()
    {
        final class RList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTR>
        {
            public schemasMicrosoftComOfficeOffice.CTR get(int i)
                { return CTRulesImpl.this.getRArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTR set(int i, schemasMicrosoftComOfficeOffice.CTR o)
            {
                schemasMicrosoftComOfficeOffice.CTR old = CTRulesImpl.this.getRArray(i);
                CTRulesImpl.this.setRArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTR o)
                { CTRulesImpl.this.insertNewR(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTR remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTR old = CTRulesImpl.this.getRArray(i);
                CTRulesImpl.this.removeR(i);
                return old;
            }
            
            public int size()
                { return CTRulesImpl.this.sizeOfRArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RList();
        }
    }
    
    /**
     * Gets array of all "r" elements
     */
    public schemasMicrosoftComOfficeOffice.CTR[] getRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R$0, targetList);
            schemasMicrosoftComOfficeOffice.CTR[] result = new schemasMicrosoftComOfficeOffice.CTR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "r" element
     */
    public schemasMicrosoftComOfficeOffice.CTR getRArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTR target = null;
            target = (schemasMicrosoftComOfficeOffice.CTR)get_store().find_element_user(R$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "r" element
     */
    public int sizeOfRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R$0);
        }
    }
    
    /**
     * Sets array of all "r" element
     */
    public void setRArray(schemasMicrosoftComOfficeOffice.CTR[] rArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rArray, R$0);
        }
    }
    
    /**
     * Sets ith "r" element
     */
    public void setRArray(int i, schemasMicrosoftComOfficeOffice.CTR r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTR target = null;
            target = (schemasMicrosoftComOfficeOffice.CTR)get_store().find_element_user(R$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    public schemasMicrosoftComOfficeOffice.CTR insertNewR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTR target = null;
            target = (schemasMicrosoftComOfficeOffice.CTR)get_store().insert_element_user(R$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    public schemasMicrosoftComOfficeOffice.CTR addNewR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTR target = null;
            target = (schemasMicrosoftComOfficeOffice.CTR)get_store().add_element_user(R$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "r" element
     */
    public void removeR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R$0, i);
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
