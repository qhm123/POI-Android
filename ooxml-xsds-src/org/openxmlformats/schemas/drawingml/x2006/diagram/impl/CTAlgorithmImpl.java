/*
 * XML Type:  CT_Algorithm
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Algorithm(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTAlgorithmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTAlgorithm
{
    
    public CTAlgorithmImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "param");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "extLst");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName REV$6 = 
        new javax.xml.namespace.QName("", "rev");
    
    
    /**
     * Gets a List of "param" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter> getParamList()
    {
        final class ParamList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter get(int i)
                { return CTAlgorithmImpl.this.getParamArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter old = CTAlgorithmImpl.this.getParamArray(i);
                CTAlgorithmImpl.this.setParamArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter o)
                { CTAlgorithmImpl.this.insertNewParam(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter old = CTAlgorithmImpl.this.getParamArray(i);
                CTAlgorithmImpl.this.removeParam(i);
                return old;
            }
            
            public int size()
                { return CTAlgorithmImpl.this.sizeOfParamArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParamList();
        }
    }
    
    /**
     * Gets array of all "param" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter[] getParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAM$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "param" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter getParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter)get_store().find_element_user(PARAM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "param" element
     */
    public int sizeOfParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAM$0);
        }
    }
    
    /**
     * Sets array of all "param" element
     */
    public void setParamArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter[] paramArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(paramArray, PARAM$0);
        }
    }
    
    /**
     * Sets ith "param" element
     */
    public void setParamArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter param)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter)get_store().find_element_user(PARAM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(param);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "param" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter insertNewParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter)get_store().insert_element_user(PARAM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "param" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter addNewParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTParameter)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "param" element
     */
    public void removeParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAM$0, i);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
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
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$2);
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
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.STAlgorithmType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "rev" attribute
     */
    public long getRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REV$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rev" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(REV$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(REV$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "rev" attribute
     */
    public boolean isSetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REV$6) != null;
        }
    }
    
    /**
     * Sets the "rev" attribute
     */
    public void setRev(long rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REV$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REV$6);
            }
            target.setLongValue(rev);
        }
    }
    
    /**
     * Sets (as xml) the "rev" attribute
     */
    public void xsetRev(org.apache.xmlbeans.XmlUnsignedInt rev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(REV$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(REV$6);
            }
            target.set(rev);
        }
    }
    
    /**
     * Unsets the "rev" attribute
     */
    public void unsetRev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REV$6);
        }
    }
}
