/*
 * XML Type:  CT_ColorTransform
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_ColorTransform(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTColorTransformImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransform
{
    
    public CTColorTransformImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "title");
    private static final javax.xml.namespace.QName DESC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "desc");
    private static final javax.xml.namespace.QName CATLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "catLst");
    private static final javax.xml.namespace.QName STYLELBL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "styleLbl");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName UNIQUEID$10 = 
        new javax.xml.namespace.QName("", "uniqueId");
    private static final javax.xml.namespace.QName MINVER$12 = 
        new javax.xml.namespace.QName("", "minVer");
    
    
    /**
     * Gets a List of "title" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName> getTitleList()
    {
        final class TitleList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName get(int i)
                { return CTColorTransformImpl.this.getTitleArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName old = CTColorTransformImpl.this.getTitleArray(i);
                CTColorTransformImpl.this.setTitleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName o)
                { CTColorTransformImpl.this.insertNewTitle(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName old = CTColorTransformImpl.this.getTitleArray(i);
                CTColorTransformImpl.this.removeTitle(i);
                return old;
            }
            
            public int size()
                { return CTColorTransformImpl.this.sizeOfTitleArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName getTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName)get_store().find_element_user(TITLE$0, i);
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
    public void setTitleArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName[] titleArray)
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
    public void setTitleArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName)get_store().find_element_user(TITLE$0, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName insertNewTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName)get_store().insert_element_user(TITLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTName)get_store().add_element_user(TITLE$0);
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
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription> getDescList()
    {
        final class DescList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription get(int i)
                { return CTColorTransformImpl.this.getDescArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription old = CTColorTransformImpl.this.getDescArray(i);
                CTColorTransformImpl.this.setDescArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription o)
                { CTColorTransformImpl.this.insertNewDesc(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription old = CTColorTransformImpl.this.getDescArray(i);
                CTColorTransformImpl.this.removeDesc(i);
                return old;
            }
            
            public int size()
                { return CTColorTransformImpl.this.sizeOfDescArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] getDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESC$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription getDescArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription)get_store().find_element_user(DESC$2, i);
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
    public void setDescArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription[] descArray)
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
    public void setDescArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription desc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription)get_store().find_element_user(DESC$2, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription insertNewDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription)get_store().insert_element_user(DESC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription addNewDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTDescription)get_store().add_element_user(DESC$2);
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories getCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories)get_store().find_element_user(CATLST$4, 0);
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
    public void setCatLst(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories catLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories)get_store().find_element_user(CATLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories)get_store().add_element_user(CATLST$4);
            }
            target.set(catLst);
        }
    }
    
    /**
     * Appends and returns a new empty "catLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories addNewCatLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories)get_store().add_element_user(CATLST$4);
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
     * Gets a List of "styleLbl" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel> getStyleLblList()
    {
        final class StyleLblList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel get(int i)
                { return CTColorTransformImpl.this.getStyleLblArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel old = CTColorTransformImpl.this.getStyleLblArray(i);
                CTColorTransformImpl.this.setStyleLblArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel o)
                { CTColorTransformImpl.this.insertNewStyleLbl(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel old = CTColorTransformImpl.this.getStyleLblArray(i);
                CTColorTransformImpl.this.removeStyleLbl(i);
                return old;
            }
            
            public int size()
                { return CTColorTransformImpl.this.sizeOfStyleLblArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StyleLblList();
        }
    }
    
    /**
     * Gets array of all "styleLbl" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel[] getStyleLblArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLELBL$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "styleLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel getStyleLblArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel)get_store().find_element_user(STYLELBL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "styleLbl" element
     */
    public int sizeOfStyleLblArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLELBL$6);
        }
    }
    
    /**
     * Sets array of all "styleLbl" element
     */
    public void setStyleLblArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel[] styleLblArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleLblArray, STYLELBL$6);
        }
    }
    
    /**
     * Sets ith "styleLbl" element
     */
    public void setStyleLblArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel styleLbl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel)get_store().find_element_user(STYLELBL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(styleLbl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel insertNewStyleLbl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel)get_store().insert_element_user(STYLELBL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleLbl" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel addNewStyleLbl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTStyleLabel)get_store().add_element_user(STYLELBL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "styleLbl" element
     */
    public void removeStyleLbl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLELBL$6, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
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
     * Gets the "uniqueId" attribute
     */
    public java.lang.String getUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIQUEID$10);
            }
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIQUEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(UNIQUEID$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueId" attribute
     */
    public boolean isSetUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIQUEID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUEID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIQUEID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIQUEID$10);
            }
            target.set(uniqueId);
        }
    }
    
    /**
     * Unsets the "uniqueId" attribute
     */
    public void unsetUniqueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIQUEID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINVER$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINVER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(MINVER$12);
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
            return get_store().find_attribute_user(MINVER$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINVER$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINVER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MINVER$12);
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
            get_store().remove_attribute(MINVER$12);
        }
    }
}
