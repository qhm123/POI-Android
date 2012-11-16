/*
 * XML Type:  CT_Sources
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * An XML CT_Sources(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public class CTSourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSources
{
    
    public CTSourcesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Source");
    private static final javax.xml.namespace.QName SELECTEDSTYLE$2 = 
        new javax.xml.namespace.QName("", "SelectedStyle");
    private static final javax.xml.namespace.QName STYLENAME$4 = 
        new javax.xml.namespace.QName("", "StyleName");
    private static final javax.xml.namespace.QName URI$6 = 
        new javax.xml.namespace.QName("", "URI");
    
    
    /**
     * Gets a List of "Source" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType> getSourceList()
    {
        final class SourceList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType get(int i)
                { return CTSourcesImpl.this.getSourceArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType old = CTSourcesImpl.this.getSourceArray(i);
                CTSourcesImpl.this.setSourceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType o)
                { CTSourcesImpl.this.insertNewSource(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType old = CTSourcesImpl.this.getSourceArray(i);
                CTSourcesImpl.this.removeSource(i);
                return old;
            }
            
            public int size()
                { return CTSourcesImpl.this.sizeOfSourceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SourceList();
        }
    }
    
    /**
     * Gets array of all "Source" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Source" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0);
        }
    }
    
    /**
     * Sets array of all "Source" element
     */
    public void setSourceArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType[] sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$0);
        }
    }
    
    /**
     * Sets ith "Source" element
     */
    public void setSourceArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType)get_store().insert_element_user(SOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTSourceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, i);
        }
    }
    
    /**
     * Gets the "SelectedStyle" attribute
     */
    public java.lang.String getSelectedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTEDSTYLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SelectedStyle" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetSelectedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_attribute_user(SELECTEDSTYLE$2);
            return target;
        }
    }
    
    /**
     * True if has "SelectedStyle" attribute
     */
    public boolean isSetSelectedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SELECTEDSTYLE$2) != null;
        }
    }
    
    /**
     * Sets the "SelectedStyle" attribute
     */
    public void setSelectedStyle(java.lang.String selectedStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTEDSTYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTEDSTYLE$2);
            }
            target.setStringValue(selectedStyle);
        }
    }
    
    /**
     * Sets (as xml) the "SelectedStyle" attribute
     */
    public void xsetSelectedStyle(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 selectedStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_attribute_user(SELECTEDSTYLE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_attribute_user(SELECTEDSTYLE$2);
            }
            target.set(selectedStyle);
        }
    }
    
    /**
     * Unsets the "SelectedStyle" attribute
     */
    public void unsetSelectedStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SELECTEDSTYLE$2);
        }
    }
    
    /**
     * Gets the "StyleName" attribute
     */
    public java.lang.String getStyleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLENAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StyleName" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetStyleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_attribute_user(STYLENAME$4);
            return target;
        }
    }
    
    /**
     * True if has "StyleName" attribute
     */
    public boolean isSetStyleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLENAME$4) != null;
        }
    }
    
    /**
     * Sets the "StyleName" attribute
     */
    public void setStyleName(java.lang.String styleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLENAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLENAME$4);
            }
            target.setStringValue(styleName);
        }
    }
    
    /**
     * Sets (as xml) the "StyleName" attribute
     */
    public void xsetStyleName(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 styleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_attribute_user(STYLENAME$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_attribute_user(STYLENAME$4);
            }
            target.set(styleName);
        }
    }
    
    /**
     * Unsets the "StyleName" attribute
     */
    public void unsetStyleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLENAME$4);
        }
    }
    
    /**
     * Gets the "URI" attribute
     */
    public java.lang.String getURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URI" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 xgetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_attribute_user(URI$6);
            return target;
        }
    }
    
    /**
     * True if has "URI" attribute
     */
    public boolean isSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$6) != null;
        }
    }
    
    /**
     * Sets the "URI" attribute
     */
    public void setURI(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$6);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "URI" attribute
     */
    public void xsetURI(org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255 target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().find_attribute_user(URI$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.STString255)get_store().add_attribute_user(URI$6);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "URI" attribute
     */
    public void unsetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$6);
        }
    }
}
