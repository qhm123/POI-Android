/*
 * XML Type:  CT_ExternalBook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ExternalBook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalBookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook
{
    
    public CTExternalBookImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEETNAMES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetNames");
    private static final javax.xml.namespace.QName DEFINEDNAMES$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedNames");
    private static final javax.xml.namespace.QName SHEETDATASET$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetDataSet");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
    
    
    /**
     * Gets the "sheetNames" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames getSheetNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames)get_store().find_element_user(SHEETNAMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetNames" element
     */
    public boolean isSetSheetNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETNAMES$0) != 0;
        }
    }
    
    /**
     * Sets the "sheetNames" element
     */
    public void setSheetNames(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames sheetNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames)get_store().find_element_user(SHEETNAMES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames)get_store().add_element_user(SHEETNAMES$0);
            }
            target.set(sheetNames);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetNames" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames addNewSheetNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames)get_store().add_element_user(SHEETNAMES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetNames" element
     */
    public void unsetSheetNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETNAMES$0, 0);
        }
    }
    
    /**
     * Gets the "definedNames" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames getDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames)get_store().find_element_user(DEFINEDNAMES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "definedNames" element
     */
    public boolean isSetDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINEDNAMES$2) != 0;
        }
    }
    
    /**
     * Sets the "definedNames" element
     */
    public void setDefinedNames(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames definedNames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames)get_store().find_element_user(DEFINEDNAMES$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames)get_store().add_element_user(DEFINEDNAMES$2);
            }
            target.set(definedNames);
        }
    }
    
    /**
     * Appends and returns a new empty "definedNames" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames addNewDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames)get_store().add_element_user(DEFINEDNAMES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "definedNames" element
     */
    public void unsetDefinedNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINEDNAMES$2, 0);
        }
    }
    
    /**
     * Gets the "sheetDataSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet getSheetDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet)get_store().find_element_user(SHEETDATASET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sheetDataSet" element
     */
    public boolean isSetSheetDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEETDATASET$4) != 0;
        }
    }
    
    /**
     * Sets the "sheetDataSet" element
     */
    public void setSheetDataSet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet sheetDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet)get_store().find_element_user(SHEETDATASET$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet)get_store().add_element_user(SHEETDATASET$4);
            }
            target.set(sheetDataSet);
        }
    }
    
    /**
     * Appends and returns a new empty "sheetDataSet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet addNewSheetDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet)get_store().add_element_user(SHEETDATASET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sheetDataSet" element
     */
    public void unsetSheetDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEETDATASET$4, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
}
