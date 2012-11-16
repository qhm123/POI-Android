/*
 * XML Type:  CT_StyleDefinitionHeaderLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_StyleDefinitionHeaderLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTStyleDefinitionHeaderLstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeaderLst
{
    
    public CTStyleDefinitionHeaderLstImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLEDEFHDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "styleDefHdr");
    
    
    /**
     * Gets a List of "styleDefHdr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader> getStyleDefHdrList()
    {
        final class StyleDefHdrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader get(int i)
                { return CTStyleDefinitionHeaderLstImpl.this.getStyleDefHdrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader old = CTStyleDefinitionHeaderLstImpl.this.getStyleDefHdrArray(i);
                CTStyleDefinitionHeaderLstImpl.this.setStyleDefHdrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader o)
                { CTStyleDefinitionHeaderLstImpl.this.insertNewStyleDefHdr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader old = CTStyleDefinitionHeaderLstImpl.this.getStyleDefHdrArray(i);
                CTStyleDefinitionHeaderLstImpl.this.removeStyleDefHdr(i);
                return old;
            }
            
            public int size()
                { return CTStyleDefinitionHeaderLstImpl.this.sizeOfStyleDefHdrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StyleDefHdrList();
        }
    }
    
    /**
     * Gets array of all "styleDefHdr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader[] getStyleDefHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLEDEFHDR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "styleDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader getStyleDefHdrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().find_element_user(STYLEDEFHDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "styleDefHdr" element
     */
    public int sizeOfStyleDefHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLEDEFHDR$0);
        }
    }
    
    /**
     * Sets array of all "styleDefHdr" element
     */
    public void setStyleDefHdrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader[] styleDefHdrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleDefHdrArray, STYLEDEFHDR$0);
        }
    }
    
    /**
     * Sets ith "styleDefHdr" element
     */
    public void setStyleDefHdrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader styleDefHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().find_element_user(STYLEDEFHDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(styleDefHdr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader insertNewStyleDefHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().insert_element_user(STYLEDEFHDR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader addNewStyleDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTStyleDefinitionHeader)get_store().add_element_user(STYLEDEFHDR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "styleDefHdr" element
     */
    public void removeStyleDefHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLEDEFHDR$0, i);
        }
    }
}
