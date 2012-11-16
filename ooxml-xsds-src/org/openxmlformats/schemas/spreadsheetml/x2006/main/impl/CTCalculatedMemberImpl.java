/*
 * XML Type:  CT_CalculatedMember
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CalculatedMember(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCalculatedMemberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMember
{
    
    public CTCalculatedMemberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTLST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName MDX$4 = 
        new javax.xml.namespace.QName("", "mdx");
    private static final javax.xml.namespace.QName MEMBERNAME$6 = 
        new javax.xml.namespace.QName("", "memberName");
    private static final javax.xml.namespace.QName HIERARCHY$8 = 
        new javax.xml.namespace.QName("", "hierarchy");
    private static final javax.xml.namespace.QName PARENT$10 = 
        new javax.xml.namespace.QName("", "parent");
    private static final javax.xml.namespace.QName SOLVEORDER$12 = 
        new javax.xml.namespace.QName("", "solveOrder");
    private static final javax.xml.namespace.QName SET$14 = 
        new javax.xml.namespace.QName("", "set");
    
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
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
            return get_store().count_elements(EXTLST$0) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$0);
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
            get_store().remove_element(EXTLST$0, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MDX$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MDX$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MDX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MDX$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MDX$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(MDX$4);
            }
            target.set(mdx);
        }
    }
    
    /**
     * Gets the "memberName" attribute
     */
    public java.lang.String getMemberName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERNAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "memberName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetMemberName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MEMBERNAME$6);
            return target;
        }
    }
    
    /**
     * True if has "memberName" attribute
     */
    public boolean isSetMemberName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEMBERNAME$6) != null;
        }
    }
    
    /**
     * Sets the "memberName" attribute
     */
    public void setMemberName(java.lang.String memberName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMBERNAME$6);
            }
            target.setStringValue(memberName);
        }
    }
    
    /**
     * Sets (as xml) the "memberName" attribute
     */
    public void xsetMemberName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring memberName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(MEMBERNAME$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(MEMBERNAME$6);
            }
            target.set(memberName);
        }
    }
    
    /**
     * Unsets the "memberName" attribute
     */
    public void unsetMemberName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEMBERNAME$6);
        }
    }
    
    /**
     * Gets the "hierarchy" attribute
     */
    public java.lang.String getHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIERARCHY$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hierarchy" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HIERARCHY$8);
            return target;
        }
    }
    
    /**
     * True if has "hierarchy" attribute
     */
    public boolean isSetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIERARCHY$8) != null;
        }
    }
    
    /**
     * Sets the "hierarchy" attribute
     */
    public void setHierarchy(java.lang.String hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIERARCHY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIERARCHY$8);
            }
            target.setStringValue(hierarchy);
        }
    }
    
    /**
     * Sets (as xml) the "hierarchy" attribute
     */
    public void xsetHierarchy(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HIERARCHY$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(HIERARCHY$8);
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Unsets the "hierarchy" attribute
     */
    public void unsetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIERARCHY$8);
        }
    }
    
    /**
     * Gets the "parent" attribute
     */
    public java.lang.String getParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parent" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PARENT$10);
            return target;
        }
    }
    
    /**
     * True if has "parent" attribute
     */
    public boolean isSetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARENT$10) != null;
        }
    }
    
    /**
     * Sets the "parent" attribute
     */
    public void setParent(java.lang.String parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENT$10);
            }
            target.setStringValue(parent);
        }
    }
    
    /**
     * Sets (as xml) the "parent" attribute
     */
    public void xsetParent(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PARENT$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PARENT$10);
            }
            target.set(parent);
        }
    }
    
    /**
     * Unsets the "parent" attribute
     */
    public void unsetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARENT$10);
        }
    }
    
    /**
     * Gets the "solveOrder" attribute
     */
    public int getSolveOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOLVEORDER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOLVEORDER$12);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "solveOrder" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetSolveOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SOLVEORDER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(SOLVEORDER$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "solveOrder" attribute
     */
    public boolean isSetSolveOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOLVEORDER$12) != null;
        }
    }
    
    /**
     * Sets the "solveOrder" attribute
     */
    public void setSolveOrder(int solveOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOLVEORDER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOLVEORDER$12);
            }
            target.setIntValue(solveOrder);
        }
    }
    
    /**
     * Sets (as xml) the "solveOrder" attribute
     */
    public void xsetSolveOrder(org.apache.xmlbeans.XmlInt solveOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SOLVEORDER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(SOLVEORDER$12);
            }
            target.set(solveOrder);
        }
    }
    
    /**
     * Unsets the "solveOrder" attribute
     */
    public void unsetSolveOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOLVEORDER$12);
        }
    }
    
    /**
     * Gets the "set" attribute
     */
    public boolean getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SET$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "set" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SET$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "set" attribute
     */
    public boolean isSetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SET$14) != null;
        }
    }
    
    /**
     * Sets the "set" attribute
     */
    public void setSet(boolean set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SET$14);
            }
            target.setBooleanValue(set);
        }
    }
    
    /**
     * Sets (as xml) the "set" attribute
     */
    public void xsetSet(org.apache.xmlbeans.XmlBoolean set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SET$14);
            }
            target.set(set);
        }
    }
    
    /**
     * Unsets the "set" attribute
     */
    public void unsetSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SET$14);
        }
    }
}
