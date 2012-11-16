/*
 * XML Type:  CT_DiagramDefinitionHeaderLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_DiagramDefinitionHeaderLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTDiagramDefinitionHeaderLstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeaderLst
{
    
    public CTDiagramDefinitionHeaderLstImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYOUTDEFHDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "layoutDefHdr");
    
    
    /**
     * Gets a List of "layoutDefHdr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader> getLayoutDefHdrList()
    {
        final class LayoutDefHdrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader get(int i)
                { return CTDiagramDefinitionHeaderLstImpl.this.getLayoutDefHdrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader old = CTDiagramDefinitionHeaderLstImpl.this.getLayoutDefHdrArray(i);
                CTDiagramDefinitionHeaderLstImpl.this.setLayoutDefHdrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader o)
                { CTDiagramDefinitionHeaderLstImpl.this.insertNewLayoutDefHdr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader old = CTDiagramDefinitionHeaderLstImpl.this.getLayoutDefHdrArray(i);
                CTDiagramDefinitionHeaderLstImpl.this.removeLayoutDefHdr(i);
                return old;
            }
            
            public int size()
                { return CTDiagramDefinitionHeaderLstImpl.this.sizeOfLayoutDefHdrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LayoutDefHdrList();
        }
    }
    
    /**
     * Gets array of all "layoutDefHdr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader[] getLayoutDefHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAYOUTDEFHDR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "layoutDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader getLayoutDefHdrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().find_element_user(LAYOUTDEFHDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "layoutDefHdr" element
     */
    public int sizeOfLayoutDefHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUTDEFHDR$0);
        }
    }
    
    /**
     * Sets array of all "layoutDefHdr" element
     */
    public void setLayoutDefHdrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader[] layoutDefHdrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(layoutDefHdrArray, LAYOUTDEFHDR$0);
        }
    }
    
    /**
     * Sets ith "layoutDefHdr" element
     */
    public void setLayoutDefHdrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader layoutDefHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().find_element_user(LAYOUTDEFHDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(layoutDefHdr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "layoutDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader insertNewLayoutDefHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().insert_element_user(LAYOUTDEFHDR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "layoutDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader addNewLayoutDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTDiagramDefinitionHeader)get_store().add_element_user(LAYOUTDEFHDR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "layoutDefHdr" element
     */
    public void removeLayoutDefHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUTDEFHDR$0, i);
        }
    }
}
