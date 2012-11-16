/*
 * XML Type:  CT_MdxKPI
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MdxKPI(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMdxKPIImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI
{
    
    public CTMdxKPIImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName N$0 = 
        new javax.xml.namespace.QName("", "n");
    private static final javax.xml.namespace.QName NP$2 = 
        new javax.xml.namespace.QName("", "np");
    private static final javax.xml.namespace.QName P$4 = 
        new javax.xml.namespace.QName("", "p");
    
    
    /**
     * Gets the "n" attribute
     */
    public long getN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "n" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(N$0);
            return target;
        }
    }
    
    /**
     * Sets the "n" attribute
     */
    public void setN(long n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(N$0);
            }
            target.setLongValue(n);
        }
    }
    
    /**
     * Sets (as xml) the "n" attribute
     */
    public void xsetN(org.apache.xmlbeans.XmlUnsignedInt n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(N$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(N$0);
            }
            target.set(n);
        }
    }
    
    /**
     * Gets the "np" attribute
     */
    public long getNp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NP$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "np" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetNp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NP$2);
            return target;
        }
    }
    
    /**
     * Sets the "np" attribute
     */
    public void setNp(long np)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NP$2);
            }
            target.setLongValue(np);
        }
    }
    
    /**
     * Sets (as xml) the "np" attribute
     */
    public void xsetNp(org.apache.xmlbeans.XmlUnsignedInt np)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(NP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(NP$2);
            }
            target.set(np);
        }
    }
    
    /**
     * Gets the "p" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty.Enum getP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(P$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "p" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty xgetP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty)get_store().find_attribute_user(P$4);
            return target;
        }
    }
    
    /**
     * Sets the "p" attribute
     */
    public void setP(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty.Enum p)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(P$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(P$4);
            }
            target.setEnumValue(p);
        }
    }
    
    /**
     * Sets (as xml) the "p" attribute
     */
    public void xsetP(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty p)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty)get_store().find_attribute_user(P$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxKPIProperty)get_store().add_attribute_user(P$4);
            }
            target.set(p);
        }
    }
}
