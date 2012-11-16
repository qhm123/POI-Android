/*
 * XML Type:  CT_ColorTransformHeaderLst
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_ColorTransformHeaderLst(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTColorTransformHeaderLstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeaderLst
{
    
    public CTColorTransformHeaderLstImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLORSDEFHDR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "colorsDefHdr");
    
    
    /**
     * Gets a List of "colorsDefHdr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader> getColorsDefHdrList()
    {
        final class ColorsDefHdrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader get(int i)
                { return CTColorTransformHeaderLstImpl.this.getColorsDefHdrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader old = CTColorTransformHeaderLstImpl.this.getColorsDefHdrArray(i);
                CTColorTransformHeaderLstImpl.this.setColorsDefHdrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader o)
                { CTColorTransformHeaderLstImpl.this.insertNewColorsDefHdr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader old = CTColorTransformHeaderLstImpl.this.getColorsDefHdrArray(i);
                CTColorTransformHeaderLstImpl.this.removeColorsDefHdr(i);
                return old;
            }
            
            public int size()
                { return CTColorTransformHeaderLstImpl.this.sizeOfColorsDefHdrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColorsDefHdrList();
        }
    }
    
    /**
     * Gets array of all "colorsDefHdr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader[] getColorsDefHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLORSDEFHDR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "colorsDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader getColorsDefHdrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().find_element_user(COLORSDEFHDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "colorsDefHdr" element
     */
    public int sizeOfColorsDefHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLORSDEFHDR$0);
        }
    }
    
    /**
     * Sets array of all "colorsDefHdr" element
     */
    public void setColorsDefHdrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader[] colorsDefHdrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colorsDefHdrArray, COLORSDEFHDR$0);
        }
    }
    
    /**
     * Sets ith "colorsDefHdr" element
     */
    public void setColorsDefHdrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader colorsDefHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().find_element_user(COLORSDEFHDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colorsDefHdr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colorsDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader insertNewColorsDefHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().insert_element_user(COLORSDEFHDR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colorsDefHdr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader addNewColorsDefHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTColorTransformHeader)get_store().add_element_user(COLORSDEFHDR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "colorsDefHdr" element
     */
    public void removeColorsDefHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLORSDEFHDR$0, i);
        }
    }
}
