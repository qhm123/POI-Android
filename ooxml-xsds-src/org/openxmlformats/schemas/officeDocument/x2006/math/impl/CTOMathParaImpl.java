/*
 * XML Type:  CT_OMathPara
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * An XML CT_OMathPara(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public class CTOMathParaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara
{
    
    public CTOMathParaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMATHPARAPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMathParaPr");
    private static final javax.xml.namespace.QName OMATH$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMath");
    
    
    /**
     * Gets the "oMathParaPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr getOMathParaPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr)get_store().find_element_user(OMATHPARAPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oMathParaPr" element
     */
    public boolean isSetOMathParaPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OMATHPARAPR$0) != 0;
        }
    }
    
    /**
     * Sets the "oMathParaPr" element
     */
    public void setOMathParaPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr oMathParaPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr)get_store().find_element_user(OMATHPARAPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr)get_store().add_element_user(OMATHPARAPR$0);
            }
            target.set(oMathParaPr);
        }
    }
    
    /**
     * Appends and returns a new empty "oMathParaPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr addNewOMathParaPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathParaPr)get_store().add_element_user(OMATHPARAPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "oMathParaPr" element
     */
    public void unsetOMathParaPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OMATHPARAPR$0, 0);
        }
    }
    
    /**
     * Gets a List of "oMath" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath> getOMathList()
    {
        final class OMathList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath get(int i)
                { return CTOMathParaImpl.this.getOMathArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTOMathParaImpl.this.getOMathArray(i);
                CTOMathParaImpl.this.setOMathArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
                { CTOMathParaImpl.this.insertNewOMath(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTOMathParaImpl.this.getOMathArray(i);
                CTOMathParaImpl.this.removeOMath(i);
                return old;
            }
            
            public int size()
                { return CTOMathParaImpl.this.sizeOfOMathArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OMathList();
        }
    }
    
    /**
     * Gets array of all "oMath" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] getOMathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OMATH$2, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath getOMathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oMath" element
     */
    public int sizeOfOMathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OMATH$2);
        }
    }
    
    /**
     * Sets array of all "oMath" element
     */
    public void setOMathArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] oMathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oMathArray, OMATH$2);
        }
    }
    
    /**
     * Sets ith "oMath" element
     */
    public void setOMathArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath oMath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oMath);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath insertNewOMath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().insert_element_user(OMATH$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath addNewOMath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().add_element_user(OMATH$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "oMath" element
     */
    public void removeOMath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OMATH$2, i);
        }
    }
}
