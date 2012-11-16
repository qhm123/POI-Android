/*
 * XML Type:  CT_Metadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Metadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadata
{
    
    public CTMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "metadataTypes");
    private static final javax.xml.namespace.QName METADATASTRINGS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "metadataStrings");
    private static final javax.xml.namespace.QName MDXMETADATA$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mdxMetadata");
    private static final javax.xml.namespace.QName FUTUREMETADATA$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "futureMetadata");
    private static final javax.xml.namespace.QName CELLMETADATA$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellMetadata");
    private static final javax.xml.namespace.QName VALUEMETADATA$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "valueMetadata");
    private static final javax.xml.namespace.QName EXTLST$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    
    
    /**
     * Gets the "metadataTypes" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes getMetadataTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes)get_store().find_element_user(METADATATYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "metadataTypes" element
     */
    public boolean isSetMetadataTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATYPES$0) != 0;
        }
    }
    
    /**
     * Sets the "metadataTypes" element
     */
    public void setMetadataTypes(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes metadataTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes)get_store().find_element_user(METADATATYPES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes)get_store().add_element_user(METADATATYPES$0);
            }
            target.set(metadataTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "metadataTypes" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes addNewMetadataTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes)get_store().add_element_user(METADATATYPES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "metadataTypes" element
     */
    public void unsetMetadataTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATYPES$0, 0);
        }
    }
    
    /**
     * Gets the "metadataStrings" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings getMetadataStrings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings)get_store().find_element_user(METADATASTRINGS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "metadataStrings" element
     */
    public boolean isSetMetadataStrings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRINGS$2) != 0;
        }
    }
    
    /**
     * Sets the "metadataStrings" element
     */
    public void setMetadataStrings(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings metadataStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings)get_store().find_element_user(METADATASTRINGS$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings)get_store().add_element_user(METADATASTRINGS$2);
            }
            target.set(metadataStrings);
        }
    }
    
    /**
     * Appends and returns a new empty "metadataStrings" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings addNewMetadataStrings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings)get_store().add_element_user(METADATASTRINGS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "metadataStrings" element
     */
    public void unsetMetadataStrings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRINGS$2, 0);
        }
    }
    
    /**
     * Gets the "mdxMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata getMdxMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata)get_store().find_element_user(MDXMETADATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mdxMetadata" element
     */
    public boolean isSetMdxMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MDXMETADATA$4) != 0;
        }
    }
    
    /**
     * Sets the "mdxMetadata" element
     */
    public void setMdxMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata mdxMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata)get_store().find_element_user(MDXMETADATA$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata)get_store().add_element_user(MDXMETADATA$4);
            }
            target.set(mdxMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "mdxMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata addNewMdxMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata)get_store().add_element_user(MDXMETADATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "mdxMetadata" element
     */
    public void unsetMdxMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MDXMETADATA$4, 0);
        }
    }
    
    /**
     * Gets a List of "futureMetadata" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata> getFutureMetadataList()
    {
        final class FutureMetadataList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata get(int i)
                { return CTMetadataImpl.this.getFutureMetadataArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata old = CTMetadataImpl.this.getFutureMetadataArray(i);
                CTMetadataImpl.this.setFutureMetadataArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata o)
                { CTMetadataImpl.this.insertNewFutureMetadata(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata old = CTMetadataImpl.this.getFutureMetadataArray(i);
                CTMetadataImpl.this.removeFutureMetadata(i);
                return old;
            }
            
            public int size()
                { return CTMetadataImpl.this.sizeOfFutureMetadataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FutureMetadataList();
        }
    }
    
    /**
     * Gets array of all "futureMetadata" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata[] getFutureMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FUTUREMETADATA$6, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "futureMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata getFutureMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata)get_store().find_element_user(FUTUREMETADATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "futureMetadata" element
     */
    public int sizeOfFutureMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUTUREMETADATA$6);
        }
    }
    
    /**
     * Sets array of all "futureMetadata" element
     */
    public void setFutureMetadataArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata[] futureMetadataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(futureMetadataArray, FUTUREMETADATA$6);
        }
    }
    
    /**
     * Sets ith "futureMetadata" element
     */
    public void setFutureMetadataArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata futureMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata)get_store().find_element_user(FUTUREMETADATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(futureMetadata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "futureMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata insertNewFutureMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata)get_store().insert_element_user(FUTUREMETADATA$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "futureMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata addNewFutureMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFutureMetadata)get_store().add_element_user(FUTUREMETADATA$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "futureMetadata" element
     */
    public void removeFutureMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUTUREMETADATA$6, i);
        }
    }
    
    /**
     * Gets the "cellMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks getCellMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().find_element_user(CELLMETADATA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cellMetadata" element
     */
    public boolean isSetCellMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELLMETADATA$8) != 0;
        }
    }
    
    /**
     * Sets the "cellMetadata" element
     */
    public void setCellMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks cellMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().find_element_user(CELLMETADATA$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().add_element_user(CELLMETADATA$8);
            }
            target.set(cellMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "cellMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks addNewCellMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().add_element_user(CELLMETADATA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "cellMetadata" element
     */
    public void unsetCellMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELLMETADATA$8, 0);
        }
    }
    
    /**
     * Gets the "valueMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks getValueMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().find_element_user(VALUEMETADATA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueMetadata" element
     */
    public boolean isSetValueMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEMETADATA$10) != 0;
        }
    }
    
    /**
     * Sets the "valueMetadata" element
     */
    public void setValueMetadata(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks valueMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().find_element_user(VALUEMETADATA$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().add_element_user(VALUEMETADATA$10);
            }
            target.set(valueMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "valueMetadata" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks addNewValueMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlocks)get_store().add_element_user(VALUEMETADATA$10);
            return target;
        }
    }
    
    /**
     * Unsets the "valueMetadata" element
     */
    public void unsetValueMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEMETADATA$10, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
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
            return get_store().count_elements(EXTLST$12) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$12);
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
            get_store().remove_element(EXTLST$12, 0);
        }
    }
}
