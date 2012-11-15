/*
 * XML Type:  CT_CommonSlideData
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_CommonSlideData(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTCommonSlideDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData
{
    
    public CTCommonSlideDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BG$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bg");
    private static final javax.xml.namespace.QName SPTREE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "spTree");
    private static final javax.xml.namespace.QName CUSTDATALST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custDataLst");
    private static final javax.xml.namespace.QName CONTROLS$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "controls");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "bg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTBackground getBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBackground target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackground)get_store().find_element_user(BG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bg" element
     */
    public boolean isSetBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BG$0) != 0;
        }
    }
    
    /**
     * Sets the "bg" element
     */
    public void setBg(org.openxmlformats.schemas.presentationml.x2006.main.CTBackground bg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBackground target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackground)get_store().find_element_user(BG$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackground)get_store().add_element_user(BG$0);
            }
            target.set(bg);
        }
    }
    
    /**
     * Appends and returns a new empty "bg" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTBackground addNewBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTBackground target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTBackground)get_store().add_element_user(BG$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bg" element
     */
    public void unsetBg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BG$0, 0);
        }
    }
    
    /**
     * Gets the "spTree" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape getSpTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().find_element_user(SPTREE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "spTree" element
     */
    public void setSpTree(org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape spTree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().find_element_user(SPTREE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().add_element_user(SPTREE$2);
            }
            target.set(spTree);
        }
    }
    
    /**
     * Appends and returns a new empty "spTree" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape addNewSpTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape)get_store().add_element_user(SPTREE$2);
            return target;
        }
    }
    
    /**
     * Gets the "custDataLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList getCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().find_element_user(CUSTDATALST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custDataLst" element
     */
    public boolean isSetCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTDATALST$4) != 0;
        }
    }
    
    /**
     * Sets the "custDataLst" element
     */
    public void setCustDataLst(org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList custDataLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().find_element_user(CUSTDATALST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().add_element_user(CUSTDATALST$4);
            }
            target.set(custDataLst);
        }
    }
    
    /**
     * Appends and returns a new empty "custDataLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList addNewCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList)get_store().add_element_user(CUSTDATALST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "custDataLst" element
     */
    public void unsetCustDataLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTDATALST$4, 0);
        }
    }
    
    /**
     * Gets the "controls" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTControlList getControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTControlList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTControlList)get_store().find_element_user(CONTROLS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "controls" element
     */
    public boolean isSetControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROLS$6) != 0;
        }
    }
    
    /**
     * Sets the "controls" element
     */
    public void setControls(org.openxmlformats.schemas.presentationml.x2006.main.CTControlList controls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTControlList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTControlList)get_store().find_element_user(CONTROLS$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTControlList)get_store().add_element_user(CONTROLS$6);
            }
            target.set(controls);
        }
    }
    
    /**
     * Appends and returns a new empty "controls" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTControlList addNewControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTControlList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTControlList)get_store().add_element_user(CONTROLS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "controls" element
     */
    public void unsetControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROLS$6, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$10);
            }
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$10);
            }
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
            return get_store().find_attribute_user(NAME$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$10);
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
            get_store().remove_attribute(NAME$10);
        }
    }
}
