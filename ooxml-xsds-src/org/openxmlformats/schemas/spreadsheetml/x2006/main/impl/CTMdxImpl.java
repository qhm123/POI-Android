/*
 * XML Type:  CT_Mdx
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Mdx(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMdxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx
{
    
    public CTMdxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName T$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "t");
    private static final javax.xml.namespace.QName MS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ms");
    private static final javax.xml.namespace.QName P$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "p");
    private static final javax.xml.namespace.QName K$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "k");
    private static final javax.xml.namespace.QName N$8 = 
        new javax.xml.namespace.QName("", "n");
    private static final javax.xml.namespace.QName F$10 = 
        new javax.xml.namespace.QName("", "f");
    
    
    /**
     * Gets the "t" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple)get_store().find_element_user(T$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "t" element
     */
    public boolean isSetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(T$0) != 0;
        }
    }
    
    /**
     * Sets the "t" element
     */
    public void setT(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple)get_store().find_element_user(T$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple)get_store().add_element_user(T$0);
            }
            target.set(t);
        }
    }
    
    /**
     * Appends and returns a new empty "t" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple addNewT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxTuple)get_store().add_element_user(T$0);
            return target;
        }
    }
    
    /**
     * Unsets the "t" element
     */
    public void unsetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(T$0, 0);
        }
    }
    
    /**
     * Gets the "ms" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet getMs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet)get_store().find_element_user(MS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ms" element
     */
    public boolean isSetMs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MS$2) != 0;
        }
    }
    
    /**
     * Sets the "ms" element
     */
    public void setMs(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet ms)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet)get_store().find_element_user(MS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet)get_store().add_element_user(MS$2);
            }
            target.set(ms);
        }
    }
    
    /**
     * Appends and returns a new empty "ms" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet addNewMs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxSet)get_store().add_element_user(MS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ms" element
     */
    public void unsetMs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MS$2, 0);
        }
    }
    
    /**
     * Gets the "p" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp getP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp)get_store().find_element_user(P$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "p" element
     */
    public boolean isSetP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(P$4) != 0;
        }
    }
    
    /**
     * Sets the "p" element
     */
    public void setP(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp p)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp)get_store().find_element_user(P$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp)get_store().add_element_user(P$4);
            }
            target.set(p);
        }
    }
    
    /**
     * Appends and returns a new empty "p" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMemeberProp)get_store().add_element_user(P$4);
            return target;
        }
    }
    
    /**
     * Unsets the "p" element
     */
    public void unsetP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(P$4, 0);
        }
    }
    
    /**
     * Gets the "k" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI getK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI)get_store().find_element_user(K$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "k" element
     */
    public boolean isSetK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(K$6) != 0;
        }
    }
    
    /**
     * Sets the "k" element
     */
    public void setK(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI k)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI)get_store().find_element_user(K$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI)get_store().add_element_user(K$6);
            }
            target.set(k);
        }
    }
    
    /**
     * Appends and returns a new empty "k" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI addNewK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxKPI)get_store().add_element_user(K$6);
            return target;
        }
    }
    
    /**
     * Unsets the "k" element
     */
    public void unsetK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(K$6, 0);
        }
    }
    
    /**
     * Gets the "n" attribute
     */
    public long getN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(N$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(N$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(N$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(N$8);
            }
            target.set(n);
        }
    }
    
    /**
     * Gets the "f" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType.Enum getF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "f" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType xgetF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType)get_store().find_attribute_user(F$10);
            return target;
        }
    }
    
    /**
     * Sets the "f" attribute
     */
    public void setF(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType.Enum f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(F$10);
            }
            target.setEnumValue(f);
        }
    }
    
    /**
     * Sets (as xml) the "f" attribute
     */
    public void xsetF(org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType f)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType)get_store().find_attribute_user(F$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STMdxFunctionType)get_store().add_attribute_user(F$10);
            }
            target.set(f);
        }
    }
}
