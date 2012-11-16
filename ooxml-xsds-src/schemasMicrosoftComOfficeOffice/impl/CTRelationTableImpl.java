/*
 * XML Type:  CT_RelationTable
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRelationTable
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_RelationTable(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRelationTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTRelationTable
{
    
    public CTRelationTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "rel");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    
    
    /**
     * Gets a List of "rel" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTRelation> getRelList()
    {
        final class RelList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTRelation>
        {
            public schemasMicrosoftComOfficeOffice.CTRelation get(int i)
                { return CTRelationTableImpl.this.getRelArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTRelation set(int i, schemasMicrosoftComOfficeOffice.CTRelation o)
            {
                schemasMicrosoftComOfficeOffice.CTRelation old = CTRelationTableImpl.this.getRelArray(i);
                CTRelationTableImpl.this.setRelArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTRelation o)
                { CTRelationTableImpl.this.insertNewRel(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTRelation remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTRelation old = CTRelationTableImpl.this.getRelArray(i);
                CTRelationTableImpl.this.removeRel(i);
                return old;
            }
            
            public int size()
                { return CTRelationTableImpl.this.sizeOfRelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RelList();
        }
    }
    
    /**
     * Gets array of all "rel" elements
     */
    public schemasMicrosoftComOfficeOffice.CTRelation[] getRelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REL$0, targetList);
            schemasMicrosoftComOfficeOffice.CTRelation[] result = new schemasMicrosoftComOfficeOffice.CTRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rel" element
     */
    public schemasMicrosoftComOfficeOffice.CTRelation getRelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelation target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelation)get_store().find_element_user(REL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rel" element
     */
    public int sizeOfRelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REL$0);
        }
    }
    
    /**
     * Sets array of all "rel" element
     */
    public void setRelArray(schemasMicrosoftComOfficeOffice.CTRelation[] relArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relArray, REL$0);
        }
    }
    
    /**
     * Sets ith "rel" element
     */
    public void setRelArray(int i, schemasMicrosoftComOfficeOffice.CTRelation rel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelation target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelation)get_store().find_element_user(REL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rel" element
     */
    public schemasMicrosoftComOfficeOffice.CTRelation insertNewRel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelation target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelation)get_store().insert_element_user(REL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rel" element
     */
    public schemasMicrosoftComOfficeOffice.CTRelation addNewRel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelation target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelation)get_store().add_element_user(REL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rel" element
     */
    public void removeRel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REL$0, i);
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
