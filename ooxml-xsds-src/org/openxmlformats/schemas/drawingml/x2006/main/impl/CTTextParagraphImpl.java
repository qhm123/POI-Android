/*
 * XML Type:  CT_TextParagraph
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextParagraph(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextParagraphImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph
{
    
    public CTTextParagraphImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pPr");
    private static final javax.xml.namespace.QName R$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "r");
    private static final javax.xml.namespace.QName BR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "br");
    private static final javax.xml.namespace.QName FLD$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fld");
    private static final javax.xml.namespace.QName ENDPARARPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "endParaRPr");
    
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pPr" element
     */
    public boolean isSetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PPR$0) != 0;
        }
    }
    
    /**
     * Sets the "pPr" element
     */
    public void setPPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(PPR$0);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(PPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pPr" element
     */
    public void unsetPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PPR$0, 0);
        }
    }
    
    /**
     * Gets a List of "r" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun> getRList()
    {
        final class RList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun get(int i)
                { return CTTextParagraphImpl.this.getRArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun old = CTTextParagraphImpl.this.getRArray(i);
                CTTextParagraphImpl.this.setRArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun o)
                { CTTextParagraphImpl.this.insertNewR(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun old = CTTextParagraphImpl.this.getRArray(i);
                CTTextParagraphImpl.this.removeR(i);
                return old;
            }
            
            public int size()
                { return CTTextParagraphImpl.this.sizeOfRArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RList();
        }
    }
    
    /**
     * Gets array of all "r" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun[] getRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "r" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun getRArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun)get_store().find_element_user(R$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "r" element
     */
    public int sizeOfRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R$2);
        }
    }
    
    /**
     * Sets array of all "r" element
     */
    public void setRArray(org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun[] rArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rArray, R$2);
        }
    }
    
    /**
     * Sets ith "r" element
     */
    public void setRArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun)get_store().find_element_user(R$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun insertNewR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun)get_store().insert_element_user(R$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun addNewR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun)get_store().add_element_user(R$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "r" element
     */
    public void removeR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R$2, i);
        }
    }
    
    /**
     * Gets a List of "br" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak> getBrList()
    {
        final class BrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak get(int i)
                { return CTTextParagraphImpl.this.getBrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak old = CTTextParagraphImpl.this.getBrArray(i);
                CTTextParagraphImpl.this.setBrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak o)
                { CTTextParagraphImpl.this.insertNewBr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak old = CTTextParagraphImpl.this.getBrArray(i);
                CTTextParagraphImpl.this.removeBr(i);
                return old;
            }
            
            public int size()
                { return CTTextParagraphImpl.this.sizeOfBrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BrList();
        }
    }
    
    /**
     * Gets array of all "br" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak)get_store().find_element_user(BR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "br" element
     */
    public int sizeOfBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BR$4);
        }
    }
    
    /**
     * Sets array of all "br" element
     */
    public void setBrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak[] brArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brArray, BR$4);
        }
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak br)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak)get_store().find_element_user(BR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(br);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak)get_store().insert_element_user(BR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak)get_store().add_element_user(BR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "br" element
     */
    public void removeBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BR$4, i);
        }
    }
    
    /**
     * Gets a List of "fld" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTextField> getFldList()
    {
        final class FldList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTextField>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField get(int i)
                { return CTTextParagraphImpl.this.getFldArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextField o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextField old = CTTextParagraphImpl.this.getFldArray(i);
                CTTextParagraphImpl.this.setFldArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextField o)
                { CTTextParagraphImpl.this.insertNewFld(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextField old = CTTextParagraphImpl.this.getFldArray(i);
                CTTextParagraphImpl.this.removeFld(i);
                return old;
            }
            
            public int size()
                { return CTTextParagraphImpl.this.sizeOfFldArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FldList();
        }
    }
    
    /**
     * Gets array of all "fld" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField[] getFldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLD$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextField[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTextField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fld" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField getFldArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextField)get_store().find_element_user(FLD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fld" element
     */
    public int sizeOfFldArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLD$6);
        }
    }
    
    /**
     * Sets array of all "fld" element
     */
    public void setFldArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTextField[] fldArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fldArray, FLD$6);
        }
    }
    
    /**
     * Sets ith "fld" element
     */
    public void setFldArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextField fld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextField)get_store().find_element_user(FLD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fld);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fld" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField insertNewFld(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextField)get_store().insert_element_user(FLD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fld" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextField addNewFld()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextField target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextField)get_store().add_element_user(FLD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "fld" element
     */
    public void removeFld(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLD$6, i);
        }
    }
    
    /**
     * Gets the "endParaRPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties getEndParaRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().find_element_user(ENDPARARPR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endParaRPr" element
     */
    public boolean isSetEndParaRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPARARPR$8) != 0;
        }
    }
    
    /**
     * Sets the "endParaRPr" element
     */
    public void setEndParaRPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties endParaRPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().find_element_user(ENDPARARPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().add_element_user(ENDPARARPR$8);
            }
            target.set(endParaRPr);
        }
    }
    
    /**
     * Appends and returns a new empty "endParaRPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties addNewEndParaRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().add_element_user(ENDPARARPR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "endParaRPr" element
     */
    public void unsetEndParaRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPARARPR$8, 0);
        }
    }
}
