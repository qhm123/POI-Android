/*
 * XML Type:  CT_R
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_R(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR
{
    
    public CTRImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName BR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "br");
    private static final javax.xml.namespace.QName T$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "t");
    private static final javax.xml.namespace.QName DELTEXT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "delText");
    private static final javax.xml.namespace.QName INSTRTEXT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "instrText");
    private static final javax.xml.namespace.QName DELINSTRTEXT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "delInstrText");
    private static final javax.xml.namespace.QName NOBREAKHYPHEN$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noBreakHyphen");
    private static final javax.xml.namespace.QName SOFTHYPHEN$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "softHyphen");
    private static final javax.xml.namespace.QName DAYSHORT$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dayShort");
    private static final javax.xml.namespace.QName MONTHSHORT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "monthShort");
    private static final javax.xml.namespace.QName YEARSHORT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "yearShort");
    private static final javax.xml.namespace.QName DAYLONG$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dayLong");
    private static final javax.xml.namespace.QName MONTHLONG$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "monthLong");
    private static final javax.xml.namespace.QName YEARLONG$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "yearLong");
    private static final javax.xml.namespace.QName ANNOTATIONREF$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "annotationRef");
    private static final javax.xml.namespace.QName FOOTNOTEREF$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnoteRef");
    private static final javax.xml.namespace.QName ENDNOTEREF$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnoteRef");
    private static final javax.xml.namespace.QName SEPARATOR$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "separator");
    private static final javax.xml.namespace.QName CONTINUATIONSEPARATOR$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "continuationSeparator");
    private static final javax.xml.namespace.QName SYM$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sym");
    private static final javax.xml.namespace.QName PGNUM$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgNum");
    private static final javax.xml.namespace.QName CR$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cr");
    private static final javax.xml.namespace.QName TAB$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tab");
    private static final javax.xml.namespace.QName OBJECT$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "object");
    private static final javax.xml.namespace.QName PICT$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pict");
    private static final javax.xml.namespace.QName FLDCHAR$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldChar");
    private static final javax.xml.namespace.QName RUBY$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ruby");
    private static final javax.xml.namespace.QName FOOTNOTEREFERENCE$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnoteReference");
    private static final javax.xml.namespace.QName ENDNOTEREFERENCE$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnoteReference");
    private static final javax.xml.namespace.QName COMMENTREFERENCE$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentReference");
    private static final javax.xml.namespace.QName DRAWING$60 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawing");
    private static final javax.xml.namespace.QName PTAB$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ptab");
    private static final javax.xml.namespace.QName LASTRENDEREDPAGEBREAK$64 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lastRenderedPageBreak");
    private static final javax.xml.namespace.QName RSIDRPR$66 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRPr");
    private static final javax.xml.namespace.QName RSIDDEL$68 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidDel");
    private static final javax.xml.namespace.QName RSIDR$70 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidR");
    
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPr" element
     */
    public boolean isSetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$0) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$0);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rPr" element
     */
    public void unsetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$0, 0);
        }
    }
    
    /**
     * Gets a List of "br" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr> getBrList()
    {
        final class BrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr get(int i)
                { return CTRImpl.this.getBrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr old = CTRImpl.this.getBrArray(i);
                CTRImpl.this.setBrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr o)
                { CTRImpl.this.insertNewBr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr old = CTRImpl.this.getBrArray(i);
                CTRImpl.this.removeBr(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfBrArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr)get_store().find_element_user(BR$2, i);
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
            return get_store().count_elements(BR$2);
        }
    }
    
    /**
     * Sets array of all "br" element
     */
    public void setBrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr[] brArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brArray, BR$2);
        }
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr br)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr)get_store().find_element_user(BR$2, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr)get_store().insert_element_user(BR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr)get_store().add_element_user(BR$2);
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
            get_store().remove_element(BR$2, i);
        }
    }
    
    /**
     * Gets a List of "t" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText> getTList()
    {
        final class TList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText get(int i)
                { return CTRImpl.this.getTArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getTArray(i);
                CTRImpl.this.setTArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
                { CTRImpl.this.insertNewT(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getTArray(i);
                CTRImpl.this.removeT(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfTArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TList();
        }
    }
    
    /**
     * Gets array of all "t" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] getTArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(T$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "t" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText getTArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(T$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "t" element
     */
    public int sizeOfTArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(T$4);
        }
    }
    
    /**
     * Sets array of all "t" element
     */
    public void setTArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] tArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tArray, T$4);
        }
    }
    
    /**
     * Sets ith "t" element
     */
    public void setTArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(T$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(t);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "t" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText insertNewT(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().insert_element_user(T$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "t" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText addNewT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().add_element_user(T$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "t" element
     */
    public void removeT(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(T$4, i);
        }
    }
    
    /**
     * Gets a List of "delText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText> getDelTextList()
    {
        final class DelTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText get(int i)
                { return CTRImpl.this.getDelTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getDelTextArray(i);
                CTRImpl.this.setDelTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
                { CTRImpl.this.insertNewDelText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getDelTextArray(i);
                CTRImpl.this.removeDelText(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfDelTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DelTextList();
        }
    }
    
    /**
     * Gets array of all "delText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] getDelTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELTEXT$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText getDelTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(DELTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "delText" element
     */
    public int sizeOfDelTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELTEXT$6);
        }
    }
    
    /**
     * Sets array of all "delText" element
     */
    public void setDelTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] delTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(delTextArray, DELTEXT$6);
        }
    }
    
    /**
     * Sets ith "delText" element
     */
    public void setDelTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText delText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(DELTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(delText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText insertNewDelText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().insert_element_user(DELTEXT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText addNewDelText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().add_element_user(DELTEXT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "delText" element
     */
    public void removeDelText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELTEXT$6, i);
        }
    }
    
    /**
     * Gets a List of "instrText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText> getInstrTextList()
    {
        final class InstrTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText get(int i)
                { return CTRImpl.this.getInstrTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getInstrTextArray(i);
                CTRImpl.this.setInstrTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
                { CTRImpl.this.insertNewInstrText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getInstrTextArray(i);
                CTRImpl.this.removeInstrText(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfInstrTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InstrTextList();
        }
    }
    
    /**
     * Gets array of all "instrText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] getInstrTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTRTEXT$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instrText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText getInstrTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(INSTRTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instrText" element
     */
    public int sizeOfInstrTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTRTEXT$8);
        }
    }
    
    /**
     * Sets array of all "instrText" element
     */
    public void setInstrTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] instrTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(instrTextArray, INSTRTEXT$8);
        }
    }
    
    /**
     * Sets ith "instrText" element
     */
    public void setInstrTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText instrText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(INSTRTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instrText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instrText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText insertNewInstrText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().insert_element_user(INSTRTEXT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instrText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText addNewInstrText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().add_element_user(INSTRTEXT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "instrText" element
     */
    public void removeInstrText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTRTEXT$8, i);
        }
    }
    
    /**
     * Gets a List of "delInstrText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText> getDelInstrTextList()
    {
        final class DelInstrTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText get(int i)
                { return CTRImpl.this.getDelInstrTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getDelInstrTextArray(i);
                CTRImpl.this.setDelInstrTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText o)
                { CTRImpl.this.insertNewDelInstrText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText old = CTRImpl.this.getDelInstrTextArray(i);
                CTRImpl.this.removeDelInstrText(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfDelInstrTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DelInstrTextList();
        }
    }
    
    /**
     * Gets array of all "delInstrText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] getDelInstrTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELINSTRTEXT$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delInstrText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText getDelInstrTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(DELINSTRTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "delInstrText" element
     */
    public int sizeOfDelInstrTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELINSTRTEXT$10);
        }
    }
    
    /**
     * Sets array of all "delInstrText" element
     */
    public void setDelInstrTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText[] delInstrTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(delInstrTextArray, DELINSTRTEXT$10);
        }
    }
    
    /**
     * Sets ith "delInstrText" element
     */
    public void setDelInstrTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText delInstrText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().find_element_user(DELINSTRTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(delInstrText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delInstrText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText insertNewDelInstrText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().insert_element_user(DELINSTRTEXT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delInstrText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText addNewDelInstrText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText)get_store().add_element_user(DELINSTRTEXT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "delInstrText" element
     */
    public void removeDelInstrText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELINSTRTEXT$10, i);
        }
    }
    
    /**
     * Gets a List of "noBreakHyphen" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getNoBreakHyphenList()
    {
        final class NoBreakHyphenList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getNoBreakHyphenArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getNoBreakHyphenArray(i);
                CTRImpl.this.setNoBreakHyphenArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewNoBreakHyphen(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getNoBreakHyphenArray(i);
                CTRImpl.this.removeNoBreakHyphen(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfNoBreakHyphenArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NoBreakHyphenList();
        }
    }
    
    /**
     * Gets array of all "noBreakHyphen" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getNoBreakHyphenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOBREAKHYPHEN$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "noBreakHyphen" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getNoBreakHyphenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(NOBREAKHYPHEN$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "noBreakHyphen" element
     */
    public int sizeOfNoBreakHyphenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOBREAKHYPHEN$12);
        }
    }
    
    /**
     * Sets array of all "noBreakHyphen" element
     */
    public void setNoBreakHyphenArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] noBreakHyphenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noBreakHyphenArray, NOBREAKHYPHEN$12);
        }
    }
    
    /**
     * Sets ith "noBreakHyphen" element
     */
    public void setNoBreakHyphenArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty noBreakHyphen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(NOBREAKHYPHEN$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(noBreakHyphen);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "noBreakHyphen" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewNoBreakHyphen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(NOBREAKHYPHEN$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "noBreakHyphen" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewNoBreakHyphen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(NOBREAKHYPHEN$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "noBreakHyphen" element
     */
    public void removeNoBreakHyphen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOBREAKHYPHEN$12, i);
        }
    }
    
    /**
     * Gets a List of "softHyphen" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getSoftHyphenList()
    {
        final class SoftHyphenList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getSoftHyphenArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getSoftHyphenArray(i);
                CTRImpl.this.setSoftHyphenArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewSoftHyphen(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getSoftHyphenArray(i);
                CTRImpl.this.removeSoftHyphen(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfSoftHyphenArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SoftHyphenList();
        }
    }
    
    /**
     * Gets array of all "softHyphen" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getSoftHyphenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTHYPHEN$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "softHyphen" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getSoftHyphenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(SOFTHYPHEN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "softHyphen" element
     */
    public int sizeOfSoftHyphenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTHYPHEN$14);
        }
    }
    
    /**
     * Sets array of all "softHyphen" element
     */
    public void setSoftHyphenArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] softHyphenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softHyphenArray, SOFTHYPHEN$14);
        }
    }
    
    /**
     * Sets ith "softHyphen" element
     */
    public void setSoftHyphenArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty softHyphen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(SOFTHYPHEN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(softHyphen);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "softHyphen" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewSoftHyphen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(SOFTHYPHEN$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "softHyphen" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewSoftHyphen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(SOFTHYPHEN$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "softHyphen" element
     */
    public void removeSoftHyphen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTHYPHEN$14, i);
        }
    }
    
    /**
     * Gets a List of "dayShort" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getDayShortList()
    {
        final class DayShortList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getDayShortArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getDayShortArray(i);
                CTRImpl.this.setDayShortArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewDayShort(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getDayShortArray(i);
                CTRImpl.this.removeDayShort(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfDayShortArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DayShortList();
        }
    }
    
    /**
     * Gets array of all "dayShort" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getDayShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DAYSHORT$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dayShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getDayShortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(DAYSHORT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dayShort" element
     */
    public int sizeOfDayShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYSHORT$16);
        }
    }
    
    /**
     * Sets array of all "dayShort" element
     */
    public void setDayShortArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] dayShortArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dayShortArray, DAYSHORT$16);
        }
    }
    
    /**
     * Sets ith "dayShort" element
     */
    public void setDayShortArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty dayShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(DAYSHORT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dayShort);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dayShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewDayShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(DAYSHORT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dayShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewDayShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(DAYSHORT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "dayShort" element
     */
    public void removeDayShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYSHORT$16, i);
        }
    }
    
    /**
     * Gets a List of "monthShort" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getMonthShortList()
    {
        final class MonthShortList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getMonthShortArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getMonthShortArray(i);
                CTRImpl.this.setMonthShortArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewMonthShort(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getMonthShortArray(i);
                CTRImpl.this.removeMonthShort(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfMonthShortArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MonthShortList();
        }
    }
    
    /**
     * Gets array of all "monthShort" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getMonthShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MONTHSHORT$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "monthShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getMonthShortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(MONTHSHORT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "monthShort" element
     */
    public int sizeOfMonthShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONTHSHORT$18);
        }
    }
    
    /**
     * Sets array of all "monthShort" element
     */
    public void setMonthShortArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] monthShortArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(monthShortArray, MONTHSHORT$18);
        }
    }
    
    /**
     * Sets ith "monthShort" element
     */
    public void setMonthShortArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty monthShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(MONTHSHORT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(monthShort);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "monthShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewMonthShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(MONTHSHORT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "monthShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewMonthShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(MONTHSHORT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "monthShort" element
     */
    public void removeMonthShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONTHSHORT$18, i);
        }
    }
    
    /**
     * Gets a List of "yearShort" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getYearShortList()
    {
        final class YearShortList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getYearShortArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getYearShortArray(i);
                CTRImpl.this.setYearShortArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewYearShort(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getYearShortArray(i);
                CTRImpl.this.removeYearShort(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfYearShortArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new YearShortList();
        }
    }
    
    /**
     * Gets array of all "yearShort" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getYearShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(YEARSHORT$20, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "yearShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getYearShortArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(YEARSHORT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "yearShort" element
     */
    public int sizeOfYearShortArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YEARSHORT$20);
        }
    }
    
    /**
     * Sets array of all "yearShort" element
     */
    public void setYearShortArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] yearShortArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(yearShortArray, YEARSHORT$20);
        }
    }
    
    /**
     * Sets ith "yearShort" element
     */
    public void setYearShortArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty yearShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(YEARSHORT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(yearShort);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "yearShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewYearShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(YEARSHORT$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "yearShort" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewYearShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(YEARSHORT$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "yearShort" element
     */
    public void removeYearShort(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YEARSHORT$20, i);
        }
    }
    
    /**
     * Gets a List of "dayLong" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getDayLongList()
    {
        final class DayLongList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getDayLongArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getDayLongArray(i);
                CTRImpl.this.setDayLongArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewDayLong(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getDayLongArray(i);
                CTRImpl.this.removeDayLong(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfDayLongArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DayLongList();
        }
    }
    
    /**
     * Gets array of all "dayLong" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getDayLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DAYLONG$22, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dayLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getDayLongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(DAYLONG$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dayLong" element
     */
    public int sizeOfDayLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLONG$22);
        }
    }
    
    /**
     * Sets array of all "dayLong" element
     */
    public void setDayLongArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] dayLongArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dayLongArray, DAYLONG$22);
        }
    }
    
    /**
     * Sets ith "dayLong" element
     */
    public void setDayLongArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty dayLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(DAYLONG$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dayLong);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dayLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewDayLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(DAYLONG$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dayLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewDayLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(DAYLONG$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "dayLong" element
     */
    public void removeDayLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLONG$22, i);
        }
    }
    
    /**
     * Gets a List of "monthLong" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getMonthLongList()
    {
        final class MonthLongList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getMonthLongArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getMonthLongArray(i);
                CTRImpl.this.setMonthLongArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewMonthLong(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getMonthLongArray(i);
                CTRImpl.this.removeMonthLong(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfMonthLongArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MonthLongList();
        }
    }
    
    /**
     * Gets array of all "monthLong" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getMonthLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MONTHLONG$24, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "monthLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getMonthLongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(MONTHLONG$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "monthLong" element
     */
    public int sizeOfMonthLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONTHLONG$24);
        }
    }
    
    /**
     * Sets array of all "monthLong" element
     */
    public void setMonthLongArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] monthLongArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(monthLongArray, MONTHLONG$24);
        }
    }
    
    /**
     * Sets ith "monthLong" element
     */
    public void setMonthLongArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty monthLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(MONTHLONG$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(monthLong);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "monthLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewMonthLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(MONTHLONG$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "monthLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewMonthLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(MONTHLONG$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "monthLong" element
     */
    public void removeMonthLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONTHLONG$24, i);
        }
    }
    
    /**
     * Gets a List of "yearLong" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getYearLongList()
    {
        final class YearLongList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getYearLongArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getYearLongArray(i);
                CTRImpl.this.setYearLongArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewYearLong(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getYearLongArray(i);
                CTRImpl.this.removeYearLong(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfYearLongArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new YearLongList();
        }
    }
    
    /**
     * Gets array of all "yearLong" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getYearLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(YEARLONG$26, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "yearLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getYearLongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(YEARLONG$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "yearLong" element
     */
    public int sizeOfYearLongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YEARLONG$26);
        }
    }
    
    /**
     * Sets array of all "yearLong" element
     */
    public void setYearLongArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] yearLongArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(yearLongArray, YEARLONG$26);
        }
    }
    
    /**
     * Sets ith "yearLong" element
     */
    public void setYearLongArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty yearLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(YEARLONG$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(yearLong);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "yearLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewYearLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(YEARLONG$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "yearLong" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewYearLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(YEARLONG$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "yearLong" element
     */
    public void removeYearLong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YEARLONG$26, i);
        }
    }
    
    /**
     * Gets a List of "annotationRef" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getAnnotationRefList()
    {
        final class AnnotationRefList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getAnnotationRefArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getAnnotationRefArray(i);
                CTRImpl.this.setAnnotationRefArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewAnnotationRef(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getAnnotationRefArray(i);
                CTRImpl.this.removeAnnotationRef(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfAnnotationRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnnotationRefList();
        }
    }
    
    /**
     * Gets array of all "annotationRef" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getAnnotationRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANNOTATIONREF$28, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "annotationRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getAnnotationRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(ANNOTATIONREF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "annotationRef" element
     */
    public int sizeOfAnnotationRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONREF$28);
        }
    }
    
    /**
     * Sets array of all "annotationRef" element
     */
    public void setAnnotationRefArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] annotationRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(annotationRefArray, ANNOTATIONREF$28);
        }
    }
    
    /**
     * Sets ith "annotationRef" element
     */
    public void setAnnotationRefArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty annotationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(ANNOTATIONREF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(annotationRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "annotationRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewAnnotationRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(ANNOTATIONREF$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "annotationRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewAnnotationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(ANNOTATIONREF$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "annotationRef" element
     */
    public void removeAnnotationRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONREF$28, i);
        }
    }
    
    /**
     * Gets a List of "footnoteRef" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getFootnoteRefList()
    {
        final class FootnoteRefList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getFootnoteRefArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getFootnoteRefArray(i);
                CTRImpl.this.setFootnoteRefArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewFootnoteRef(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getFootnoteRefArray(i);
                CTRImpl.this.removeFootnoteRef(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfFootnoteRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FootnoteRefList();
        }
    }
    
    /**
     * Gets array of all "footnoteRef" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getFootnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTEREF$30, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnoteRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getFootnoteRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(FOOTNOTEREF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnoteRef" element
     */
    public int sizeOfFootnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTEREF$30);
        }
    }
    
    /**
     * Sets array of all "footnoteRef" element
     */
    public void setFootnoteRefArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] footnoteRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(footnoteRefArray, FOOTNOTEREF$30);
        }
    }
    
    /**
     * Sets ith "footnoteRef" element
     */
    public void setFootnoteRefArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty footnoteRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(FOOTNOTEREF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(footnoteRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewFootnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(FOOTNOTEREF$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewFootnoteRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(FOOTNOTEREF$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnoteRef" element
     */
    public void removeFootnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTEREF$30, i);
        }
    }
    
    /**
     * Gets a List of "endnoteRef" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getEndnoteRefList()
    {
        final class EndnoteRefList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getEndnoteRefArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getEndnoteRefArray(i);
                CTRImpl.this.setEndnoteRefArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewEndnoteRef(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getEndnoteRefArray(i);
                CTRImpl.this.removeEndnoteRef(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfEndnoteRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndnoteRefList();
        }
    }
    
    /**
     * Gets array of all "endnoteRef" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getEndnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDNOTEREF$32, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endnoteRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getEndnoteRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(ENDNOTEREF$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "endnoteRef" element
     */
    public int sizeOfEndnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDNOTEREF$32);
        }
    }
    
    /**
     * Sets array of all "endnoteRef" element
     */
    public void setEndnoteRefArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] endnoteRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endnoteRefArray, ENDNOTEREF$32);
        }
    }
    
    /**
     * Sets ith "endnoteRef" element
     */
    public void setEndnoteRefArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty endnoteRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(ENDNOTEREF$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endnoteRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endnoteRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewEndnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(ENDNOTEREF$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endnoteRef" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewEndnoteRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(ENDNOTEREF$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "endnoteRef" element
     */
    public void removeEndnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDNOTEREF$32, i);
        }
    }
    
    /**
     * Gets a List of "separator" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getSeparatorList()
    {
        final class SeparatorList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getSeparatorArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getSeparatorArray(i);
                CTRImpl.this.setSeparatorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewSeparator(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getSeparatorArray(i);
                CTRImpl.this.removeSeparator(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfSeparatorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SeparatorList();
        }
    }
    
    /**
     * Gets array of all "separator" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getSeparatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEPARATOR$34, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "separator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getSeparatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(SEPARATOR$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "separator" element
     */
    public int sizeOfSeparatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEPARATOR$34);
        }
    }
    
    /**
     * Sets array of all "separator" element
     */
    public void setSeparatorArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] separatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(separatorArray, SEPARATOR$34);
        }
    }
    
    /**
     * Sets ith "separator" element
     */
    public void setSeparatorArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty separator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(SEPARATOR$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(separator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "separator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewSeparator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(SEPARATOR$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "separator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(SEPARATOR$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "separator" element
     */
    public void removeSeparator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEPARATOR$34, i);
        }
    }
    
    /**
     * Gets a List of "continuationSeparator" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getContinuationSeparatorList()
    {
        final class ContinuationSeparatorList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getContinuationSeparatorArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getContinuationSeparatorArray(i);
                CTRImpl.this.setContinuationSeparatorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewContinuationSeparator(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getContinuationSeparatorArray(i);
                CTRImpl.this.removeContinuationSeparator(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfContinuationSeparatorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContinuationSeparatorList();
        }
    }
    
    /**
     * Gets array of all "continuationSeparator" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getContinuationSeparatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTINUATIONSEPARATOR$36, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "continuationSeparator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getContinuationSeparatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(CONTINUATIONSEPARATOR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "continuationSeparator" element
     */
    public int sizeOfContinuationSeparatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTINUATIONSEPARATOR$36);
        }
    }
    
    /**
     * Sets array of all "continuationSeparator" element
     */
    public void setContinuationSeparatorArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] continuationSeparatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(continuationSeparatorArray, CONTINUATIONSEPARATOR$36);
        }
    }
    
    /**
     * Sets ith "continuationSeparator" element
     */
    public void setContinuationSeparatorArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty continuationSeparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(CONTINUATIONSEPARATOR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(continuationSeparator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "continuationSeparator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewContinuationSeparator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(CONTINUATIONSEPARATOR$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "continuationSeparator" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewContinuationSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(CONTINUATIONSEPARATOR$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "continuationSeparator" element
     */
    public void removeContinuationSeparator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTINUATIONSEPARATOR$36, i);
        }
    }
    
    /**
     * Gets a List of "sym" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym> getSymList()
    {
        final class SymList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym get(int i)
                { return CTRImpl.this.getSymArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym old = CTRImpl.this.getSymArray(i);
                CTRImpl.this.setSymArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym o)
                { CTRImpl.this.insertNewSym(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym old = CTRImpl.this.getSymArray(i);
                CTRImpl.this.removeSym(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfSymArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SymList();
        }
    }
    
    /**
     * Gets array of all "sym" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym[] getSymArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYM$38, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sym" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym getSymArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym)get_store().find_element_user(SYM$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sym" element
     */
    public int sizeOfSymArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYM$38);
        }
    }
    
    /**
     * Sets array of all "sym" element
     */
    public void setSymArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym[] symArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(symArray, SYM$38);
        }
    }
    
    /**
     * Sets ith "sym" element
     */
    public void setSymArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym sym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym)get_store().find_element_user(SYM$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sym);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sym" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym insertNewSym(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym)get_store().insert_element_user(SYM$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sym" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym addNewSym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym)get_store().add_element_user(SYM$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "sym" element
     */
    public void removeSym(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYM$38, i);
        }
    }
    
    /**
     * Gets a List of "pgNum" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getPgNumList()
    {
        final class PgNumList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getPgNumArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getPgNumArray(i);
                CTRImpl.this.setPgNumArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewPgNum(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getPgNumArray(i);
                CTRImpl.this.removePgNum(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfPgNumArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PgNumList();
        }
    }
    
    /**
     * Gets array of all "pgNum" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getPgNumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PGNUM$40, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pgNum" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getPgNumArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PGNUM$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pgNum" element
     */
    public int sizeOfPgNumArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PGNUM$40);
        }
    }
    
    /**
     * Sets array of all "pgNum" element
     */
    public void setPgNumArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] pgNumArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pgNumArray, PGNUM$40);
        }
    }
    
    /**
     * Sets ith "pgNum" element
     */
    public void setPgNumArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty pgNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PGNUM$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pgNum);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pgNum" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewPgNum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(PGNUM$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pgNum" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewPgNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PGNUM$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "pgNum" element
     */
    public void removePgNum(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PGNUM$40, i);
        }
    }
    
    /**
     * Gets a List of "cr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getCrList()
    {
        final class CrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getCrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getCrArray(i);
                CTRImpl.this.setCrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewCr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getCrArray(i);
                CTRImpl.this.removeCr(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfCrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CrList();
        }
    }
    
    /**
     * Gets array of all "cr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getCrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CR$42, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getCrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(CR$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cr" element
     */
    public int sizeOfCrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CR$42);
        }
    }
    
    /**
     * Sets array of all "cr" element
     */
    public void setCrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] crArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(crArray, CR$42);
        }
    }
    
    /**
     * Sets ith "cr" element
     */
    public void setCrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty cr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(CR$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewCr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(CR$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewCr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(CR$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "cr" element
     */
    public void removeCr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CR$42, i);
        }
    }
    
    /**
     * Gets a List of "tab" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getTabList()
    {
        final class TabList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getTabArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getTabArray(i);
                CTRImpl.this.setTabArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewTab(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getTabArray(i);
                CTRImpl.this.removeTab(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfTabArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TabList();
        }
    }
    
    /**
     * Gets array of all "tab" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getTabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAB$44, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getTabArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(TAB$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tab" element
     */
    public int sizeOfTabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAB$44);
        }
    }
    
    /**
     * Sets array of all "tab" element
     */
    public void setTabArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] tabArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tabArray, TAB$44);
        }
    }
    
    /**
     * Sets ith "tab" element
     */
    public void setTabArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty tab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(TAB$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tab);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewTab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(TAB$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewTab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(TAB$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "tab" element
     */
    public void removeTab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAB$44, i);
        }
    }
    
    /**
     * Gets a List of "object" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject> getObjectList()
    {
        final class ObjectList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject get(int i)
                { return CTRImpl.this.getObjectArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject old = CTRImpl.this.getObjectArray(i);
                CTRImpl.this.setObjectArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject o)
                { CTRImpl.this.insertNewObject(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject old = CTRImpl.this.getObjectArray(i);
                CTRImpl.this.removeObject(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfObjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ObjectList();
        }
    }
    
    /**
     * Gets array of all "object" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject[] getObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECT$46, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "object" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject getObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject)get_store().find_element_user(OBJECT$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "object" element
     */
    public int sizeOfObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$46);
        }
    }
    
    /**
     * Sets array of all "object" element
     */
    public void setObjectArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject[] objectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectArray, OBJECT$46);
        }
    }
    
    /**
     * Sets ith "object" element
     */
    public void setObjectArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject)get_store().find_element_user(OBJECT$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(object);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "object" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject insertNewObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject)get_store().insert_element_user(OBJECT$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "object" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject)get_store().add_element_user(OBJECT$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "object" element
     */
    public void removeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$46, i);
        }
    }
    
    /**
     * Gets a List of "pict" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture> getPictList()
    {
        final class PictList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture get(int i)
                { return CTRImpl.this.getPictArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture old = CTRImpl.this.getPictArray(i);
                CTRImpl.this.setPictArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture o)
                { CTRImpl.this.insertNewPict(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture old = CTRImpl.this.getPictArray(i);
                CTRImpl.this.removePict(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfPictArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PictList();
        }
    }
    
    /**
     * Gets array of all "pict" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture[] getPictArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PICT$48, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pict" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture getPictArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().find_element_user(PICT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pict" element
     */
    public int sizeOfPictArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICT$48);
        }
    }
    
    /**
     * Sets array of all "pict" element
     */
    public void setPictArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture[] pictArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pictArray, PICT$48);
        }
    }
    
    /**
     * Sets ith "pict" element
     */
    public void setPictArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture pict)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().find_element_user(PICT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pict);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pict" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture insertNewPict(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().insert_element_user(PICT$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pict" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture addNewPict()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture)get_store().add_element_user(PICT$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "pict" element
     */
    public void removePict(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICT$48, i);
        }
    }
    
    /**
     * Gets a List of "fldChar" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar> getFldCharList()
    {
        final class FldCharList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar get(int i)
                { return CTRImpl.this.getFldCharArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar old = CTRImpl.this.getFldCharArray(i);
                CTRImpl.this.setFldCharArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar o)
                { CTRImpl.this.insertNewFldChar(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar old = CTRImpl.this.getFldCharArray(i);
                CTRImpl.this.removeFldChar(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfFldCharArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FldCharList();
        }
    }
    
    /**
     * Gets array of all "fldChar" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar[] getFldCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLDCHAR$50, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fldChar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar getFldCharArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar)get_store().find_element_user(FLDCHAR$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fldChar" element
     */
    public int sizeOfFldCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLDCHAR$50);
        }
    }
    
    /**
     * Sets array of all "fldChar" element
     */
    public void setFldCharArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar[] fldCharArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fldCharArray, FLDCHAR$50);
        }
    }
    
    /**
     * Sets ith "fldChar" element
     */
    public void setFldCharArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar fldChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar)get_store().find_element_user(FLDCHAR$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fldChar);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fldChar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar insertNewFldChar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar)get_store().insert_element_user(FLDCHAR$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fldChar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar addNewFldChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar)get_store().add_element_user(FLDCHAR$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "fldChar" element
     */
    public void removeFldChar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLDCHAR$50, i);
        }
    }
    
    /**
     * Gets a List of "ruby" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby> getRubyList()
    {
        final class RubyList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby get(int i)
                { return CTRImpl.this.getRubyArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby old = CTRImpl.this.getRubyArray(i);
                CTRImpl.this.setRubyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby o)
                { CTRImpl.this.insertNewRuby(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby old = CTRImpl.this.getRubyArray(i);
                CTRImpl.this.removeRuby(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfRubyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RubyList();
        }
    }
    
    /**
     * Gets array of all "ruby" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby[] getRubyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RUBY$52, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ruby" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby getRubyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby)get_store().find_element_user(RUBY$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ruby" element
     */
    public int sizeOfRubyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUBY$52);
        }
    }
    
    /**
     * Sets array of all "ruby" element
     */
    public void setRubyArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby[] rubyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rubyArray, RUBY$52);
        }
    }
    
    /**
     * Sets ith "ruby" element
     */
    public void setRubyArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby ruby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby)get_store().find_element_user(RUBY$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ruby);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ruby" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby insertNewRuby(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby)get_store().insert_element_user(RUBY$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ruby" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby addNewRuby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby)get_store().add_element_user(RUBY$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "ruby" element
     */
    public void removeRuby(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUBY$52, i);
        }
    }
    
    /**
     * Gets a List of "footnoteReference" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef> getFootnoteReferenceList()
    {
        final class FootnoteReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef get(int i)
                { return CTRImpl.this.getFootnoteReferenceArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef old = CTRImpl.this.getFootnoteReferenceArray(i);
                CTRImpl.this.setFootnoteReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef o)
                { CTRImpl.this.insertNewFootnoteReference(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef old = CTRImpl.this.getFootnoteReferenceArray(i);
                CTRImpl.this.removeFootnoteReference(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfFootnoteReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FootnoteReferenceList();
        }
    }
    
    /**
     * Gets array of all "footnoteReference" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[] getFootnoteReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTEREFERENCE$54, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnoteReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef getFootnoteReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().find_element_user(FOOTNOTEREFERENCE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnoteReference" element
     */
    public int sizeOfFootnoteReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTEREFERENCE$54);
        }
    }
    
    /**
     * Sets array of all "footnoteReference" element
     */
    public void setFootnoteReferenceArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[] footnoteReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(footnoteReferenceArray, FOOTNOTEREFERENCE$54);
        }
    }
    
    /**
     * Sets ith "footnoteReference" element
     */
    public void setFootnoteReferenceArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef footnoteReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().find_element_user(FOOTNOTEREFERENCE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(footnoteReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef insertNewFootnoteReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().insert_element_user(FOOTNOTEREFERENCE$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef addNewFootnoteReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().add_element_user(FOOTNOTEREFERENCE$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnoteReference" element
     */
    public void removeFootnoteReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTEREFERENCE$54, i);
        }
    }
    
    /**
     * Gets a List of "endnoteReference" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef> getEndnoteReferenceList()
    {
        final class EndnoteReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef get(int i)
                { return CTRImpl.this.getEndnoteReferenceArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef old = CTRImpl.this.getEndnoteReferenceArray(i);
                CTRImpl.this.setEndnoteReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef o)
                { CTRImpl.this.insertNewEndnoteReference(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef old = CTRImpl.this.getEndnoteReferenceArray(i);
                CTRImpl.this.removeEndnoteReference(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfEndnoteReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndnoteReferenceList();
        }
    }
    
    /**
     * Gets array of all "endnoteReference" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[] getEndnoteReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDNOTEREFERENCE$56, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endnoteReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef getEndnoteReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().find_element_user(ENDNOTEREFERENCE$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "endnoteReference" element
     */
    public int sizeOfEndnoteReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDNOTEREFERENCE$56);
        }
    }
    
    /**
     * Sets array of all "endnoteReference" element
     */
    public void setEndnoteReferenceArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef[] endnoteReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endnoteReferenceArray, ENDNOTEREFERENCE$56);
        }
    }
    
    /**
     * Sets ith "endnoteReference" element
     */
    public void setEndnoteReferenceArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef endnoteReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().find_element_user(ENDNOTEREFERENCE$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endnoteReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endnoteReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef insertNewEndnoteReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().insert_element_user(ENDNOTEREFERENCE$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endnoteReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef addNewEndnoteReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef)get_store().add_element_user(ENDNOTEREFERENCE$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "endnoteReference" element
     */
    public void removeEndnoteReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDNOTEREFERENCE$56, i);
        }
    }
    
    /**
     * Gets a List of "commentReference" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCommentReferenceList()
    {
        final class CommentReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTRImpl.this.getCommentReferenceArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRImpl.this.getCommentReferenceArray(i);
                CTRImpl.this.setCommentReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTRImpl.this.insertNewCommentReference(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRImpl.this.getCommentReferenceArray(i);
                CTRImpl.this.removeCommentReference(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfCommentReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentReferenceList();
        }
    }
    
    /**
     * Gets array of all "commentReference" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCommentReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTREFERENCE$58, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "commentReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCommentReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(COMMENTREFERENCE$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "commentReference" element
     */
    public int sizeOfCommentReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTREFERENCE$58);
        }
    }
    
    /**
     * Sets array of all "commentReference" element
     */
    public void setCommentReferenceArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] commentReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentReferenceArray, COMMENTREFERENCE$58);
        }
    }
    
    /**
     * Sets ith "commentReference" element
     */
    public void setCommentReferenceArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup commentReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(COMMENTREFERENCE$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(commentReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCommentReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(COMMENTREFERENCE$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "commentReference" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCommentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(COMMENTREFERENCE$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "commentReference" element
     */
    public void removeCommentReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTREFERENCE$58, i);
        }
    }
    
    /**
     * Gets a List of "drawing" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing> getDrawingList()
    {
        final class DrawingList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing get(int i)
                { return CTRImpl.this.getDrawingArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing old = CTRImpl.this.getDrawingArray(i);
                CTRImpl.this.setDrawingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing o)
                { CTRImpl.this.insertNewDrawing(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing old = CTRImpl.this.getDrawingArray(i);
                CTRImpl.this.removeDrawing(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfDrawingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DrawingList();
        }
    }
    
    /**
     * Gets array of all "drawing" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing[] getDrawingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DRAWING$60, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "drawing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing getDrawingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "drawing" element
     */
    public int sizeOfDrawingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWING$60);
        }
    }
    
    /**
     * Sets array of all "drawing" element
     */
    public void setDrawingArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing[] drawingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(drawingArray, DRAWING$60);
        }
    }
    
    /**
     * Sets ith "drawing" element
     */
    public void setDrawingArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing drawing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing)get_store().find_element_user(DRAWING$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(drawing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "drawing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing insertNewDrawing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing)get_store().insert_element_user(DRAWING$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "drawing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing addNewDrawing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing)get_store().add_element_user(DRAWING$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "drawing" element
     */
    public void removeDrawing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWING$60, i);
        }
    }
    
    /**
     * Gets a List of "ptab" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab> getPtabList()
    {
        final class PtabList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab get(int i)
                { return CTRImpl.this.getPtabArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab old = CTRImpl.this.getPtabArray(i);
                CTRImpl.this.setPtabArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab o)
                { CTRImpl.this.insertNewPtab(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab old = CTRImpl.this.getPtabArray(i);
                CTRImpl.this.removePtab(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfPtabArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PtabList();
        }
    }
    
    /**
     * Gets array of all "ptab" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab[] getPtabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PTAB$62, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ptab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab getPtabArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab)get_store().find_element_user(PTAB$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ptab" element
     */
    public int sizeOfPtabArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PTAB$62);
        }
    }
    
    /**
     * Sets array of all "ptab" element
     */
    public void setPtabArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab[] ptabArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ptabArray, PTAB$62);
        }
    }
    
    /**
     * Sets ith "ptab" element
     */
    public void setPtabArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab ptab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab)get_store().find_element_user(PTAB$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ptab);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ptab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab insertNewPtab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab)get_store().insert_element_user(PTAB$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ptab" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab addNewPtab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab)get_store().add_element_user(PTAB$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "ptab" element
     */
    public void removePtab(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PTAB$62, i);
        }
    }
    
    /**
     * Gets a List of "lastRenderedPageBreak" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getLastRenderedPageBreakList()
    {
        final class LastRenderedPageBreakList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTRImpl.this.getLastRenderedPageBreakArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getLastRenderedPageBreakArray(i);
                CTRImpl.this.setLastRenderedPageBreakArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTRImpl.this.insertNewLastRenderedPageBreak(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTRImpl.this.getLastRenderedPageBreakArray(i);
                CTRImpl.this.removeLastRenderedPageBreak(i);
                return old;
            }
            
            public int size()
                { return CTRImpl.this.sizeOfLastRenderedPageBreakArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LastRenderedPageBreakList();
        }
    }
    
    /**
     * Gets array of all "lastRenderedPageBreak" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getLastRenderedPageBreakArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LASTRENDEREDPAGEBREAK$64, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lastRenderedPageBreak" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getLastRenderedPageBreakArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(LASTRENDEREDPAGEBREAK$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lastRenderedPageBreak" element
     */
    public int sizeOfLastRenderedPageBreakArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTRENDEREDPAGEBREAK$64);
        }
    }
    
    /**
     * Sets array of all "lastRenderedPageBreak" element
     */
    public void setLastRenderedPageBreakArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] lastRenderedPageBreakArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lastRenderedPageBreakArray, LASTRENDEREDPAGEBREAK$64);
        }
    }
    
    /**
     * Sets ith "lastRenderedPageBreak" element
     */
    public void setLastRenderedPageBreakArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty lastRenderedPageBreak)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(LASTRENDEREDPAGEBREAK$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lastRenderedPageBreak);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lastRenderedPageBreak" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewLastRenderedPageBreak(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(LASTRENDEREDPAGEBREAK$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lastRenderedPageBreak" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewLastRenderedPageBreak()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(LASTRENDEREDPAGEBREAK$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "lastRenderedPageBreak" element
     */
    public void removeLastRenderedPageBreak(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTRENDEREDPAGEBREAK$64, i);
        }
    }
    
    /**
     * Gets the "rsidRPr" attribute
     */
    public byte[] getRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRPR$66);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidRPr" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRPR$66);
            return target;
        }
    }
    
    /**
     * True if has "rsidRPr" attribute
     */
    public boolean isSetRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDRPR$66) != null;
        }
    }
    
    /**
     * Sets the "rsidRPr" attribute
     */
    public void setRsidRPr(byte[] rsidRPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRPR$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDRPR$66);
            }
            target.setByteArrayValue(rsidRPr);
        }
    }
    
    /**
     * Sets (as xml) the "rsidRPr" attribute
     */
    public void xsetRsidRPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidRPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRPR$66);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDRPR$66);
            }
            target.set(rsidRPr);
        }
    }
    
    /**
     * Unsets the "rsidRPr" attribute
     */
    public void unsetRsidRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDRPR$66);
        }
    }
    
    /**
     * Gets the "rsidDel" attribute
     */
    public byte[] getRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$68);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidDel" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$68);
            return target;
        }
    }
    
    /**
     * True if has "rsidDel" attribute
     */
    public boolean isSetRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDDEL$68) != null;
        }
    }
    
    /**
     * Sets the "rsidDel" attribute
     */
    public void setRsidDel(byte[] rsidDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDDEL$68);
            }
            target.setByteArrayValue(rsidDel);
        }
    }
    
    /**
     * Sets (as xml) the "rsidDel" attribute
     */
    public void xsetRsidDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidDel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$68);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDDEL$68);
            }
            target.set(rsidDel);
        }
    }
    
    /**
     * Unsets the "rsidDel" attribute
     */
    public void unsetRsidDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDDEL$68);
        }
    }
    
    /**
     * Gets the "rsidR" attribute
     */
    public byte[] getRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$70);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidR" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$70);
            return target;
        }
    }
    
    /**
     * True if has "rsidR" attribute
     */
    public boolean isSetRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDR$70) != null;
        }
    }
    
    /**
     * Sets the "rsidR" attribute
     */
    public void setRsidR(byte[] rsidR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDR$70);
            }
            target.setByteArrayValue(rsidR);
        }
    }
    
    /**
     * Sets (as xml) the "rsidR" attribute
     */
    public void xsetRsidR(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$70);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDR$70);
            }
            target.set(rsidR);
        }
    }
    
    /**
     * Unsets the "rsidR" attribute
     */
    public void unsetRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDR$70);
        }
    }
}
