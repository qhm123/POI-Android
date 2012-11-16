/*
 * XML Type:  CT_Parameters
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Parameters(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameters
{
    
    public CTParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "parameter");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "parameter" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter> getParameterList()
    {
        final class ParameterList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter get(int i)
                { return CTParametersImpl.this.getParameterArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter old = CTParametersImpl.this.getParameterArray(i);
                CTParametersImpl.this.setParameterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter o)
                { CTParametersImpl.this.insertNewParameter(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter old = CTParametersImpl.this.getParameterArray(i);
                CTParametersImpl.this.removeParameter(i);
                return old;
            }
            
            public int size()
                { return CTParametersImpl.this.sizeOfParameterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParameterList();
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "parameter" element
     */
    public void setParameterArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter)get_store().insert_element_user(PARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTParameter)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$0, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$2) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$2);
        }
    }
}
