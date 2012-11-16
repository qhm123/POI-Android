/*
 * XML Type:  CT_Div
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Div(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDivImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDiv
{
    
    public CTDivImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKQUOTE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "blockQuote");
    private static final javax.xml.namespace.QName BODYDIV$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bodyDiv");
    private static final javax.xml.namespace.QName MARLEFT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "marLeft");
    private static final javax.xml.namespace.QName MARRIGHT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "marRight");
    private static final javax.xml.namespace.QName MARTOP$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "marTop");
    private static final javax.xml.namespace.QName MARBOTTOM$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "marBottom");
    private static final javax.xml.namespace.QName DIVBDR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "divBdr");
    private static final javax.xml.namespace.QName DIVSCHILD$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "divsChild");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "id");
    
    
    /**
     * Gets the "blockQuote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBlockQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BLOCKQUOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "blockQuote" element
     */
    public boolean isSetBlockQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKQUOTE$0) != 0;
        }
    }
    
    /**
     * Sets the "blockQuote" element
     */
    public void setBlockQuote(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff blockQuote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BLOCKQUOTE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BLOCKQUOTE$0);
            }
            target.set(blockQuote);
        }
    }
    
    /**
     * Appends and returns a new empty "blockQuote" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBlockQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BLOCKQUOTE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "blockQuote" element
     */
    public void unsetBlockQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKQUOTE$0, 0);
        }
    }
    
    /**
     * Gets the "bodyDiv" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBodyDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BODYDIV$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bodyDiv" element
     */
    public boolean isSetBodyDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYDIV$2) != 0;
        }
    }
    
    /**
     * Sets the "bodyDiv" element
     */
    public void setBodyDiv(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bodyDiv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BODYDIV$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BODYDIV$2);
            }
            target.set(bodyDiv);
        }
    }
    
    /**
     * Appends and returns a new empty "bodyDiv" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBodyDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BODYDIV$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bodyDiv" element
     */
    public void unsetBodyDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYDIV$2, 0);
        }
    }
    
    /**
     * Gets the "marLeft" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure getMarLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARLEFT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "marLeft" element
     */
    public void setMarLeft(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure marLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARLEFT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARLEFT$4);
            }
            target.set(marLeft);
        }
    }
    
    /**
     * Appends and returns a new empty "marLeft" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure addNewMarLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARLEFT$4);
            return target;
        }
    }
    
    /**
     * Gets the "marRight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure getMarRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARRIGHT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "marRight" element
     */
    public void setMarRight(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure marRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARRIGHT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARRIGHT$6);
            }
            target.set(marRight);
        }
    }
    
    /**
     * Appends and returns a new empty "marRight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure addNewMarRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARRIGHT$6);
            return target;
        }
    }
    
    /**
     * Gets the "marTop" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure getMarTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARTOP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "marTop" element
     */
    public void setMarTop(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure marTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARTOP$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARTOP$8);
            }
            target.set(marTop);
        }
    }
    
    /**
     * Appends and returns a new empty "marTop" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure addNewMarTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARTOP$8);
            return target;
        }
    }
    
    /**
     * Gets the "marBottom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure getMarBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARBOTTOM$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "marBottom" element
     */
    public void setMarBottom(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure marBottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(MARBOTTOM$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARBOTTOM$10);
            }
            target.set(marBottom);
        }
    }
    
    /**
     * Appends and returns a new empty "marBottom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure addNewMarBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(MARBOTTOM$10);
            return target;
        }
    }
    
    /**
     * Gets the "divBdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr getDivBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr)get_store().find_element_user(DIVBDR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "divBdr" element
     */
    public boolean isSetDivBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIVBDR$12) != 0;
        }
    }
    
    /**
     * Sets the "divBdr" element
     */
    public void setDivBdr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr divBdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr)get_store().find_element_user(DIVBDR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr)get_store().add_element_user(DIVBDR$12);
            }
            target.set(divBdr);
        }
    }
    
    /**
     * Appends and returns a new empty "divBdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr addNewDivBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivBdr)get_store().add_element_user(DIVBDR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "divBdr" element
     */
    public void unsetDivBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIVBDR$12, 0);
        }
    }
    
    /**
     * Gets a List of "divsChild" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs> getDivsChildList()
    {
        final class DivsChildList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs get(int i)
                { return CTDivImpl.this.getDivsChildArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs old = CTDivImpl.this.getDivsChildArray(i);
                CTDivImpl.this.setDivsChildArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs o)
                { CTDivImpl.this.insertNewDivsChild(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs old = CTDivImpl.this.getDivsChildArray(i);
                CTDivImpl.this.removeDivsChild(i);
                return old;
            }
            
            public int size()
                { return CTDivImpl.this.sizeOfDivsChildArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DivsChildList();
        }
    }
    
    /**
     * Gets array of all "divsChild" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs[] getDivsChildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIVSCHILD$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "divsChild" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs getDivsChildArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().find_element_user(DIVSCHILD$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "divsChild" element
     */
    public int sizeOfDivsChildArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIVSCHILD$14);
        }
    }
    
    /**
     * Sets array of all "divsChild" element
     */
    public void setDivsChildArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs[] divsChildArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(divsChildArray, DIVSCHILD$14);
        }
    }
    
    /**
     * Sets ith "divsChild" element
     */
    public void setDivsChildArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs divsChild)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().find_element_user(DIVSCHILD$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(divsChild);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "divsChild" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs insertNewDivsChild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().insert_element_user(DIVSCHILD$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "divsChild" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs addNewDivsChild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDivs)get_store().add_element_user(DIVSCHILD$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "divsChild" element
     */
    public void removeDivsChild(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIVSCHILD$14, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.math.BigInteger getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ID$16);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.math.BigInteger id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
            }
            target.setBigIntegerValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(ID$16);
            }
            target.set(id);
        }
    }
}
