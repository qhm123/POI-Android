/*
 * XML Type:  CT_StyleDefinitionHeader
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_StyleDefinitionHeader(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTStyleDefinitionHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader
{
    
    public CTStyleDefinitionHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "title");
    private static final javax.xml.namespace.QName DESC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "desc");
    private static final javax.xml.namespace.QName CATLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "catLst");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName UNIQUEID$8 = 
        new javax.xml.namespace.QName("", "uniqueId");
    private static final javax.xml.namespace.QName MINVER$10 = 
        new javax.xml.namespace.QName("", "minVer");
    private static final javax.xml.namespace.QName RESID$12 = 
        new javax.xml.namespace.QName("", "resId");
    
    
    /**
     * Gets a List of "title" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName> getTitleList()
    {
        final class TitleList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName get(int i)
                { return CTStyleDefinitionHeaderImpl.this.getTitleArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName old = CTStyleDefinitionHeaderImpl.this.getTitleArray(i);
                CTStyleDefinitionHeaderImpl.this.setTitleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName o)
                { CTStyleDefinitionHeaderImpl.this.insertNewTitle(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName old = CTStyleDefinitionHeaderImpl.this.getTitleArray(i);
                CTStyleDefinitionHeaderImpl.this.removeTitle(i);
                return old;
            }
            
            public int size()
                { return CTStyleDefinitionHeaderImpl.this.sizeOfTitleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TitleList();
        }
    }
    
    /**
     * Gets array of all "title" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName getTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName)get_store().find_element_user(TITLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "title" element
     */
    public int sizeOfTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$0);
        }
    }
    
    /**
     * Sets array of all "title" element
     */
    public void setTitleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName[] titleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(titleArray, TITLE$0);
        }
    }
    
    /**
     * Sets ith "title" element
     */
    public void setTitleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName)get_store().find_element_user(TITLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(title);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName insertNewTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName)get_store().insert_element_user(TITLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDName)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "title" element
     */
    public void removeTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$0, i);
        }
    }
    
    /**
     * Gets a List of "desc" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription> getDescList()
    {
        final class DescList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription get(int i)
                { return CTStyleDefinitionHeaderImpl.this.getDescArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription old = CTStyleDefinitionHeaderImpl.this.getDescArray(i);
                CTStyleDefinitionHeaderImpl.this.setDescArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription o)
                { CTStyleDefinitionHeaderImpl.this.insertNewDesc(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription old = CTStyleDefinitionHeaderImpl.this.getDescArray(i);
                CTStyleDefinitionHeaderImpl.this.removeDesc(i);
                return old;
            }
            
            public int size()
                { return CTStyleDefinitionHeaderImpl.this.sizeOfDescArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescList();
        }
    }
    
    /**
     * Gets array of all "desc" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription[] getDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESC$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription getDescArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription)get_store().find_element_user(DESC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "desc" element
     */
    public int sizeOfDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESC$2);
        }
    }
    
    /**
     * Sets array of all "desc" element
     */
    public void setDescArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription[] descArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descArray, DESC$2);
        }
    }
    
    /**
     * Sets ith "desc" element
     */
    public void setDescArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription)get_store().find_element_user(DESC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(desc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription insertNewDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription)get_store().insert_element_user(DESC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription addNewDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDDescription)get_store().add_element_user(DESC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "desc" element
     */
    public void removeDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESC$2, i);
        }
    }
    
    /**
     * Gets the "catLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories getCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories)get_store().find_element_user(CATLST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "catLst" element
     */
    public boolean isSetCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATLST$4) != 0;
        }
    }
    
    /**
     * Sets the "catLst" element
     */
    public void setCatLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories catLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories)get_store().find_element_user(CATLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories)get_store().add_element_user(CATLST$4);
            }
            target.set(catLst);
        }
    }
    
    /**
     * Appends and returns a new empty "catLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories addNewCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTSDCategories)get_store().add_element_user(CATLST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "catLst" element
     */
    public void unsetCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATLST$4, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
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
            return get_store().count_elements(EXTLST$6) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$6);
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
            get_store().remove_element(EXTLST$6, 0);
        }
    }
    
    /**
     * Gets the "uniqueId" attribute
     */
    public java.lang.String getUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIQUEID$8);
            return target;
        }
    }
    
    /**
     * Sets the "uniqueId" attribute
     */
    public void setUniqueId(java.lang.String uniqueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$8);
            }
            target.setStringValue(uniqueId);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueId" attribute
     */
    public void xsetUniqueId(org.apache.xmlbeans.XmlString uniqueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIQUEID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIQUEID$8);
            }
            target.set(uniqueId);
        }
    }
    
    /**
     * Gets the "minVer" attribute
     */
    public java.lang.String getMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINVER$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "minVer" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINVER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(MINVER$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "minVer" attribute
     */
    public boolean isSetMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINVER$10) != null;
        }
    }
    
    /**
     * Sets the "minVer" attribute
     */
    public void setMinVer(java.lang.String minVer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINVER$10);
            }
            target.setStringValue(minVer);
        }
    }
    
    /**
     * Sets (as xml) the "minVer" attribute
     */
    public void xsetMinVer(org.apache.xmlbeans.XmlString minVer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINVER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MINVER$10);
            }
            target.set(minVer);
        }
    }
    
    /**
     * Unsets the "minVer" attribute
     */
    public void unsetMinVer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINVER$10);
        }
    }
    
    /**
     * Gets the "resId" attribute
     */
    public int getResId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESID$12);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "resId" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetResId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RESID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(RESID$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "resId" attribute
     */
    public boolean isSetResId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESID$12) != null;
        }
    }
    
    /**
     * Sets the "resId" attribute
     */
    public void setResId(int resId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESID$12);
            }
            target.setIntValue(resId);
        }
    }
    
    /**
     * Sets (as xml) the "resId" attribute
     */
    public void xsetResId(org.apache.xmlbeans.XmlInt resId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RESID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(RESID$12);
            }
            target.set(resId);
        }
    }
    
    /**
     * Unsets the "resId" attribute
     */
    public void unsetResId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESID$12);
        }
    }
}
