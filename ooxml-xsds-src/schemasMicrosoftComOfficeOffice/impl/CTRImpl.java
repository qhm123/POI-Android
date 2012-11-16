/*
 * XML Type:  CT_R
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTR
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_R(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTR
{
    
    public CTRImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROXY$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "proxy");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName HOW$6 = 
        new javax.xml.namespace.QName("", "how");
    private static final javax.xml.namespace.QName IDREF$8 = 
        new javax.xml.namespace.QName("", "idref");
    
    
    /**
     * Gets a List of "proxy" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTProxy> getProxyList()
    {
        final class ProxyList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTProxy>
        {
            public schemasMicrosoftComOfficeOffice.CTProxy get(int i)
                { return CTRImpl.this.getProxyArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTProxy set(int i, schemasMicrosoftComOfficeOffice.CTProxy o)
            {
                schemasMicrosoftComOfficeOffice.CTProxy old = CTRImpl.this.getProxyArray(i);
                CTRImpl.this.setProxyArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTProxy o)
                { CTRImpl.this.insertNewProxy(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTProxy remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTProxy old = CTRImpl.this.getProxyArray(i);
                CTRImpl.this.removeProxy(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfProxyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProxyList();
        }
    }
    
    /**
     * Gets array of all "proxy" elements
     */
    public schemasMicrosoftComOfficeOffice.CTProxy[] getProxyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROXY$0, targetList);
            schemasMicrosoftComOfficeOffice.CTProxy[] result = new schemasMicrosoftComOfficeOffice.CTProxy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "proxy" element
     */
    public schemasMicrosoftComOfficeOffice.CTProxy getProxyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTProxy target = null;
            target = (schemasMicrosoftComOfficeOffice.CTProxy)get_store().find_element_user(PROXY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "proxy" element
     */
    public int sizeOfProxyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROXY$0);
        }
    }
    
    /**
     * Sets array of all "proxy" element
     */
    public void setProxyArray(schemasMicrosoftComOfficeOffice.CTProxy[] proxyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(proxyArray, PROXY$0);
        }
    }
    
    /**
     * Sets ith "proxy" element
     */
    public void setProxyArray(int i, schemasMicrosoftComOfficeOffice.CTProxy proxy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTProxy target = null;
            target = (schemasMicrosoftComOfficeOffice.CTProxy)get_store().find_element_user(PROXY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(proxy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "proxy" element
     */
    public schemasMicrosoftComOfficeOffice.CTProxy insertNewProxy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTProxy target = null;
            target = (schemasMicrosoftComOfficeOffice.CTProxy)get_store().insert_element_user(PROXY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "proxy" element
     */
    public schemasMicrosoftComOfficeOffice.CTProxy addNewProxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTProxy target = null;
            target = (schemasMicrosoftComOfficeOffice.CTProxy)get_store().add_element_user(PROXY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "proxy" element
     */
    public void removeProxy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROXY$0, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public schemasMicrosoftComOfficeOffice.STRType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STRType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public schemasMicrosoftComOfficeOffice.STRType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRType target = null;
            target = (schemasMicrosoftComOfficeOffice.STRType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(schemasMicrosoftComOfficeOffice.STRType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(schemasMicrosoftComOfficeOffice.STRType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STRType target = null;
            target = (schemasMicrosoftComOfficeOffice.STRType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STRType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "how" attribute
     */
    public schemasMicrosoftComOfficeOffice.STHow.Enum getHow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOW$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STHow.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "how" attribute
     */
    public schemasMicrosoftComOfficeOffice.STHow xgetHow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STHow target = null;
            target = (schemasMicrosoftComOfficeOffice.STHow)get_store().find_attribute_user(HOW$6);
            return target;
        }
    }
    
    /**
     * True if has "how" attribute
     */
    public boolean isSetHow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HOW$6) != null;
        }
    }
    
    /**
     * Sets the "how" attribute
     */
    public void setHow(schemasMicrosoftComOfficeOffice.STHow.Enum how)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOW$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOW$6);
            }
            target.setEnumValue(how);
        }
    }
    
    /**
     * Sets (as xml) the "how" attribute
     */
    public void xsetHow(schemasMicrosoftComOfficeOffice.STHow how)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STHow target = null;
            target = (schemasMicrosoftComOfficeOffice.STHow)get_store().find_attribute_user(HOW$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHow)get_store().add_attribute_user(HOW$6);
            }
            target.set(how);
        }
    }
    
    /**
     * Unsets the "how" attribute
     */
    public void unsetHow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HOW$6);
        }
    }
    
    /**
     * Gets the "idref" attribute
     */
    public java.lang.String getIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDREF$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDREF$8);
            return target;
        }
    }
    
    /**
     * True if has "idref" attribute
     */
    public boolean isSetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDREF$8) != null;
        }
    }
    
    /**
     * Sets the "idref" attribute
     */
    public void setIdref(java.lang.String idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDREF$8);
            }
            target.setStringValue(idref);
        }
    }
    
    /**
     * Sets (as xml) the "idref" attribute
     */
    public void xsetIdref(org.apache.xmlbeans.XmlString idref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDREF$8);
            }
            target.set(idref);
        }
    }
    
    /**
     * Unsets the "idref" attribute
     */
    public void unsetIdref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDREF$8);
        }
    }
}
