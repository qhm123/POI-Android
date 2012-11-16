/*
 * XML Type:  CT_PivotTableStyle
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotTableStyle(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotTableStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle
{
    
    public CTPivotTableStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SHOWROWHEADERS$2 = 
        new javax.xml.namespace.QName("", "showRowHeaders");
    private static final javax.xml.namespace.QName SHOWCOLHEADERS$4 = 
        new javax.xml.namespace.QName("", "showColHeaders");
    private static final javax.xml.namespace.QName SHOWROWSTRIPES$6 = 
        new javax.xml.namespace.QName("", "showRowStripes");
    private static final javax.xml.namespace.QName SHOWCOLSTRIPES$8 = 
        new javax.xml.namespace.QName("", "showColStripes");
    private static final javax.xml.namespace.QName SHOWLASTCOLUMN$10 = 
        new javax.xml.namespace.QName("", "showLastColumn");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$0) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$0);
        }
    }
    
    /**
     * Gets the "showRowHeaders" attribute
     */
    public boolean getShowRowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWHEADERS$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showRowHeaders" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowRowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWHEADERS$2);
            return target;
        }
    }
    
    /**
     * True if has "showRowHeaders" attribute
     */
    public boolean isSetShowRowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWROWHEADERS$2) != null;
        }
    }
    
    /**
     * Sets the "showRowHeaders" attribute
     */
    public void setShowRowHeaders(boolean showRowHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWHEADERS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWROWHEADERS$2);
            }
            target.setBooleanValue(showRowHeaders);
        }
    }
    
    /**
     * Sets (as xml) the "showRowHeaders" attribute
     */
    public void xsetShowRowHeaders(org.apache.xmlbeans.XmlBoolean showRowHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWHEADERS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWROWHEADERS$2);
            }
            target.set(showRowHeaders);
        }
    }
    
    /**
     * Unsets the "showRowHeaders" attribute
     */
    public void unsetShowRowHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWROWHEADERS$2);
        }
    }
    
    /**
     * Gets the "showColHeaders" attribute
     */
    public boolean getShowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOLHEADERS$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showColHeaders" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOLHEADERS$4);
            return target;
        }
    }
    
    /**
     * True if has "showColHeaders" attribute
     */
    public boolean isSetShowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCOLHEADERS$4) != null;
        }
    }
    
    /**
     * Sets the "showColHeaders" attribute
     */
    public void setShowColHeaders(boolean showColHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOLHEADERS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCOLHEADERS$4);
            }
            target.setBooleanValue(showColHeaders);
        }
    }
    
    /**
     * Sets (as xml) the "showColHeaders" attribute
     */
    public void xsetShowColHeaders(org.apache.xmlbeans.XmlBoolean showColHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOLHEADERS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCOLHEADERS$4);
            }
            target.set(showColHeaders);
        }
    }
    
    /**
     * Unsets the "showColHeaders" attribute
     */
    public void unsetShowColHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCOLHEADERS$4);
        }
    }
    
    /**
     * Gets the "showRowStripes" attribute
     */
    public boolean getShowRowStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWSTRIPES$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showRowStripes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowRowStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWSTRIPES$6);
            return target;
        }
    }
    
    /**
     * True if has "showRowStripes" attribute
     */
    public boolean isSetShowRowStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWROWSTRIPES$6) != null;
        }
    }
    
    /**
     * Sets the "showRowStripes" attribute
     */
    public void setShowRowStripes(boolean showRowStripes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWROWSTRIPES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWROWSTRIPES$6);
            }
            target.setBooleanValue(showRowStripes);
        }
    }
    
    /**
     * Sets (as xml) the "showRowStripes" attribute
     */
    public void xsetShowRowStripes(org.apache.xmlbeans.XmlBoolean showRowStripes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWROWSTRIPES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWROWSTRIPES$6);
            }
            target.set(showRowStripes);
        }
    }
    
    /**
     * Unsets the "showRowStripes" attribute
     */
    public void unsetShowRowStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWROWSTRIPES$6);
        }
    }
    
    /**
     * Gets the "showColStripes" attribute
     */
    public boolean getShowColStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOLSTRIPES$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showColStripes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowColStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOLSTRIPES$8);
            return target;
        }
    }
    
    /**
     * True if has "showColStripes" attribute
     */
    public boolean isSetShowColStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCOLSTRIPES$8) != null;
        }
    }
    
    /**
     * Sets the "showColStripes" attribute
     */
    public void setShowColStripes(boolean showColStripes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOLSTRIPES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCOLSTRIPES$8);
            }
            target.setBooleanValue(showColStripes);
        }
    }
    
    /**
     * Sets (as xml) the "showColStripes" attribute
     */
    public void xsetShowColStripes(org.apache.xmlbeans.XmlBoolean showColStripes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOLSTRIPES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCOLSTRIPES$8);
            }
            target.set(showColStripes);
        }
    }
    
    /**
     * Unsets the "showColStripes" attribute
     */
    public void unsetShowColStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCOLSTRIPES$8);
        }
    }
    
    /**
     * Gets the "showLastColumn" attribute
     */
    public boolean getShowLastColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWLASTCOLUMN$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showLastColumn" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowLastColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWLASTCOLUMN$10);
            return target;
        }
    }
    
    /**
     * True if has "showLastColumn" attribute
     */
    public boolean isSetShowLastColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWLASTCOLUMN$10) != null;
        }
    }
    
    /**
     * Sets the "showLastColumn" attribute
     */
    public void setShowLastColumn(boolean showLastColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWLASTCOLUMN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWLASTCOLUMN$10);
            }
            target.setBooleanValue(showLastColumn);
        }
    }
    
    /**
     * Sets (as xml) the "showLastColumn" attribute
     */
    public void xsetShowLastColumn(org.apache.xmlbeans.XmlBoolean showLastColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWLASTCOLUMN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWLASTCOLUMN$10);
            }
            target.set(showLastColumn);
        }
    }
    
    /**
     * Unsets the "showLastColumn" attribute
     */
    public void unsetShowLastColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWLASTCOLUMN$10);
        }
    }
}
