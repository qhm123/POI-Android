/*
 * XML Type:  CT_Query
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Query(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTQuery
{
    
    public CTQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TPLS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tpls");
    private static final javax.xml.namespace.QName MDX$2 = 
        new javax.xml.namespace.QName("", "mdx");
    
    
    /**
     * Gets the "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getTpls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(TPLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tpls" element
     */
    public boolean isSetTpls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TPLS$0) != 0;
        }
    }
    
    /**
     * Sets the "tpls" element
     */
    public void setTpls(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples tpls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().find_element_user(TPLS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().add_element_user(TPLS$0);
            }
            target.set(tpls);
        }
    }
    
    /**
     * Appends and returns a new empty "tpls" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewTpls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples)get_store().add_element_user(TPLS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tpls" element
     */
    public void unsetTpls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TPLS$0, 0);
        }
    }
    
    /**
     * Gets the "mdx" attribute
     */
    public java.lang.String getMdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MDX$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mdx" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetMdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MDX$2);
            return target;
        }
    }
    
    /**
     * Sets the "mdx" attribute
     */
    public void setMdx(java.lang.String mdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MDX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MDX$2);
            }
            target.setStringValue(mdx);
        }
    }
    
    /**
     * Sets (as xml) the "mdx" attribute
     */
    public void xsetMdx(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring mdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MDX$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(MDX$2);
            }
            target.set(mdx);
        }
    }
}
