/*
 * XML Type:  CT_GroupLevel
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_GroupLevel(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTGroupLevelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroupLevel
{
    
    public CTGroupLevelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "groups");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName UNIQUENAME$4 = 
        new javax.xml.namespace.QName("", "uniqueName");
    private static final javax.xml.namespace.QName CAPTION$6 = 
        new javax.xml.namespace.QName("", "caption");
    private static final javax.xml.namespace.QName USER$8 = 
        new javax.xml.namespace.QName("", "user");
    private static final javax.xml.namespace.QName CUSTOMROLLUP$10 = 
        new javax.xml.namespace.QName("", "customRollUp");
    
    
    /**
     * Gets the "groups" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups getGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups)get_store().find_element_user(GROUPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "groups" element
     */
    public boolean isSetGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPS$0) != 0;
        }
    }
    
    /**
     * Sets the "groups" element
     */
    public void setGroups(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups groups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups)get_store().find_element_user(GROUPS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups)get_store().add_element_user(GROUPS$0);
            }
            target.set(groups);
        }
    }
    
    /**
     * Appends and returns a new empty "groups" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups addNewGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTGroups)get_store().add_element_user(GROUPS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "groups" element
     */
    public void unsetGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPS$0, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "uniqueName" attribute
     */
    public java.lang.String getUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$4);
            return target;
        }
    }
    
    /**
     * Sets the "uniqueName" attribute
     */
    public void setUniqueName(java.lang.String uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUENAME$4);
            }
            target.setStringValue(uniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueName" attribute
     */
    public void xsetUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(UNIQUENAME$4);
            }
            target.set(uniqueName);
        }
    }
    
    /**
     * Gets the "caption" attribute
     */
    public java.lang.String getCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$6);
            return target;
        }
    }
    
    /**
     * Sets the "caption" attribute
     */
    public void setCaption(java.lang.String caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPTION$6);
            }
            target.setStringValue(caption);
        }
    }
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    public void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CAPTION$6);
            }
            target.set(caption);
        }
    }
    
    /**
     * Gets the "user" attribute
     */
    public boolean getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USER$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "user" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USER$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "user" attribute
     */
    public boolean isSetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USER$8) != null;
        }
    }
    
    /**
     * Sets the "user" attribute
     */
    public void setUser(boolean user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USER$8);
            }
            target.setBooleanValue(user);
        }
    }
    
    /**
     * Sets (as xml) the "user" attribute
     */
    public void xsetUser(org.apache.xmlbeans.XmlBoolean user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USER$8);
            }
            target.set(user);
        }
    }
    
    /**
     * Unsets the "user" attribute
     */
    public void unsetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USER$8);
        }
    }
    
    /**
     * Gets the "customRollUp" attribute
     */
    public boolean getCustomRollUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMROLLUP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CUSTOMROLLUP$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "customRollUp" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCustomRollUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMROLLUP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CUSTOMROLLUP$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "customRollUp" attribute
     */
    public boolean isSetCustomRollUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMROLLUP$10) != null;
        }
    }
    
    /**
     * Sets the "customRollUp" attribute
     */
    public void setCustomRollUp(boolean customRollUp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMROLLUP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMROLLUP$10);
            }
            target.setBooleanValue(customRollUp);
        }
    }
    
    /**
     * Sets (as xml) the "customRollUp" attribute
     */
    public void xsetCustomRollUp(org.apache.xmlbeans.XmlBoolean customRollUp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CUSTOMROLLUP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CUSTOMROLLUP$10);
            }
            target.set(customRollUp);
        }
    }
    
    /**
     * Unsets the "customRollUp" attribute
     */
    public void unsetCustomRollUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMROLLUP$10);
        }
    }
}
