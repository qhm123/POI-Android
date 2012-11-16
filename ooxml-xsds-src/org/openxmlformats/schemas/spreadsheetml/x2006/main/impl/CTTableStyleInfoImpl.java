/*
 * XML Type:  CT_TableStyleInfo
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableStyleInfo(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStyleInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo
{
    
    public CTTableStyleInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SHOWFIRSTCOLUMN$2 = 
        new javax.xml.namespace.QName("", "showFirstColumn");
    private static final javax.xml.namespace.QName SHOWLASTCOLUMN$4 = 
        new javax.xml.namespace.QName("", "showLastColumn");
    private static final javax.xml.namespace.QName SHOWROWSTRIPES$6 = 
        new javax.xml.namespace.QName("", "showRowStripes");
    private static final javax.xml.namespace.QName SHOWCOLUMNSTRIPES$8 = 
        new javax.xml.namespace.QName("", "showColumnStripes");
    
    
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
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
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$0);
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
     * Gets the "showFirstColumn" attribute
     */
    public boolean getShowFirstColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showFirstColumn" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowFirstColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
            return target;
        }
    }
    
    /**
     * True if has "showFirstColumn" attribute
     */
    public boolean isSetShowFirstColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWFIRSTCOLUMN$2) != null;
        }
    }
    
    /**
     * Sets the "showFirstColumn" attribute
     */
    public void setShowFirstColumn(boolean showFirstColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWFIRSTCOLUMN$2);
            }
            target.setBooleanValue(showFirstColumn);
        }
    }
    
    /**
     * Sets (as xml) the "showFirstColumn" attribute
     */
    public void xsetShowFirstColumn(org.apache.xmlbeans.XmlBoolean showFirstColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWFIRSTCOLUMN$2);
            }
            target.set(showFirstColumn);
        }
    }
    
    /**
     * Unsets the "showFirstColumn" attribute
     */
    public void unsetShowFirstColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWFIRSTCOLUMN$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWLASTCOLUMN$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWLASTCOLUMN$4);
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
            return get_store().find_attribute_user(SHOWLASTCOLUMN$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWLASTCOLUMN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWLASTCOLUMN$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWLASTCOLUMN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWLASTCOLUMN$4);
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
            get_store().remove_attribute(SHOWLASTCOLUMN$4);
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
     * Gets the "showColumnStripes" attribute
     */
    public boolean getShowColumnStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showColumnStripes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowColumnStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
            return target;
        }
    }
    
    /**
     * True if has "showColumnStripes" attribute
     */
    public boolean isSetShowColumnStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8) != null;
        }
    }
    
    /**
     * Sets the "showColumnStripes" attribute
     */
    public void setShowColumnStripes(boolean showColumnStripes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCOLUMNSTRIPES$8);
            }
            target.setBooleanValue(showColumnStripes);
        }
    }
    
    /**
     * Sets (as xml) the "showColumnStripes" attribute
     */
    public void xsetShowColumnStripes(org.apache.xmlbeans.XmlBoolean showColumnStripes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCOLUMNSTRIPES$8);
            }
            target.set(showColumnStripes);
        }
    }
    
    /**
     * Unsets the "showColumnStripes" attribute
     */
    public void unsetShowColumnStripes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCOLUMNSTRIPES$8);
        }
    }
}
