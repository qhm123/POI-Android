/*
 * XML Type:  CT_P
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_P(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP
{
    
    public CTPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
    private static final javax.xml.namespace.QName CUSTOMXML$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXml");
    private static final javax.xml.namespace.QName SMARTTAG$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "smartTag");
    private static final javax.xml.namespace.QName SDT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdt");
    private static final javax.xml.namespace.QName R$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "r");
    private static final javax.xml.namespace.QName PROOFERR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofErr");
    private static final javax.xml.namespace.QName PERMSTART$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permStart");
    private static final javax.xml.namespace.QName PERMEND$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permEnd");
    private static final javax.xml.namespace.QName BOOKMARKSTART$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkStart");
    private static final javax.xml.namespace.QName BOOKMARKEND$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkEnd");
    private static final javax.xml.namespace.QName MOVEFROMRANGESTART$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeStart");
    private static final javax.xml.namespace.QName MOVEFROMRANGEEND$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeEnd");
    private static final javax.xml.namespace.QName MOVETORANGESTART$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeStart");
    private static final javax.xml.namespace.QName MOVETORANGEEND$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeEnd");
    private static final javax.xml.namespace.QName COMMENTRANGESTART$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeStart");
    private static final javax.xml.namespace.QName COMMENTRANGEEND$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLINSRANGESTART$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLINSRANGEEND$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLDELRANGESTART$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLDELRANGEEND$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVEFROMRANGESTART$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVEFROMRANGEEND$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVETORANGESTART$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVETORANGEEND$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeEnd");
    private static final javax.xml.namespace.QName INS$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
    private static final javax.xml.namespace.QName DEL$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
    private static final javax.xml.namespace.QName MOVEFROM$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFrom");
    private static final javax.xml.namespace.QName MOVETO$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveTo");
    private static final javax.xml.namespace.QName OMATHPARA$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMathPara");
    private static final javax.xml.namespace.QName OMATH$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMath");
    private static final javax.xml.namespace.QName FLDSIMPLE$60 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldSimple");
    private static final javax.xml.namespace.QName HYPERLINK$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hyperlink");
    private static final javax.xml.namespace.QName SUBDOC$64 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "subDoc");
    private static final javax.xml.namespace.QName RSIDRPR$66 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRPr");
    private static final javax.xml.namespace.QName RSIDR$68 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidR");
    private static final javax.xml.namespace.QName RSIDDEL$70 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidDel");
    private static final javax.xml.namespace.QName RSIDP$72 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidP");
    private static final javax.xml.namespace.QName RSIDRDEFAULT$74 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRDefault");
    
    
    /**
     * Gets the "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr getPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$0, 0);
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
    public void setPPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr pPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().find_element_user(PPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$0);
            }
            target.set(pPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr addNewPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr)get_store().add_element_user(PPR$0);
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
     * Gets a List of "customXml" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun> getCustomXmlList()
    {
        final class CustomXmlList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun get(int i)
                { return CTPImpl.this.getCustomXmlArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun old = CTPImpl.this.getCustomXmlArray(i);
                CTPImpl.this.setCustomXmlArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun o)
                { CTPImpl.this.insertNewCustomXml(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun old = CTPImpl.this.getCustomXmlArray(i);
                CTPImpl.this.removeCustomXml(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlList();
        }
    }
    
    /**
     * Gets array of all "customXml" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun[] getCustomXmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXML$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun getCustomXmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun)get_store().find_element_user(CUSTOMXML$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXml" element
     */
    public int sizeOfCustomXmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXML$2);
        }
    }
    
    /**
     * Sets array of all "customXml" element
     */
    public void setCustomXmlArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun[] customXmlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlArray, CUSTOMXML$2);
        }
    }
    
    /**
     * Sets ith "customXml" element
     */
    public void setCustomXmlArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun customXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun)get_store().find_element_user(CUSTOMXML$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXml);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun insertNewCustomXml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun)get_store().insert_element_user(CUSTOMXML$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun addNewCustomXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRun)get_store().add_element_user(CUSTOMXML$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXml" element
     */
    public void removeCustomXml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXML$2, i);
        }
    }
    
    /**
     * Gets a List of "smartTag" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun> getSmartTagList()
    {
        final class SmartTagList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun get(int i)
                { return CTPImpl.this.getSmartTagArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun old = CTPImpl.this.getSmartTagArray(i);
                CTPImpl.this.setSmartTagArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun o)
                { CTPImpl.this.insertNewSmartTag(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun old = CTPImpl.this.getSmartTagArray(i);
                CTPImpl.this.removeSmartTag(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfSmartTagArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SmartTagList();
        }
    }
    
    /**
     * Gets array of all "smartTag" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun[] getSmartTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SMARTTAG$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "smartTag" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun getSmartTagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun)get_store().find_element_user(SMARTTAG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "smartTag" element
     */
    public int sizeOfSmartTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMARTTAG$4);
        }
    }
    
    /**
     * Sets array of all "smartTag" element
     */
    public void setSmartTagArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun[] smartTagArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(smartTagArray, SMARTTAG$4);
        }
    }
    
    /**
     * Sets ith "smartTag" element
     */
    public void setSmartTagArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun smartTag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun)get_store().find_element_user(SMARTTAG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(smartTag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "smartTag" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun insertNewSmartTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun)get_store().insert_element_user(SMARTTAG$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "smartTag" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun addNewSmartTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun)get_store().add_element_user(SMARTTAG$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "smartTag" element
     */
    public void removeSmartTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMARTTAG$4, i);
        }
    }
    
    /**
     * Gets a List of "sdt" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun> getSdtList()
    {
        final class SdtList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun get(int i)
                { return CTPImpl.this.getSdtArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun old = CTPImpl.this.getSdtArray(i);
                CTPImpl.this.setSdtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun o)
                { CTPImpl.this.insertNewSdt(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun old = CTPImpl.this.getSdtArray(i);
                CTPImpl.this.removeSdt(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfSdtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SdtList();
        }
    }
    
    /**
     * Gets array of all "sdt" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun[] getSdtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SDT$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sdt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun getSdtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun)get_store().find_element_user(SDT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sdt" element
     */
    public int sizeOfSdtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDT$6);
        }
    }
    
    /**
     * Sets array of all "sdt" element
     */
    public void setSdtArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun[] sdtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sdtArray, SDT$6);
        }
    }
    
    /**
     * Sets ith "sdt" element
     */
    public void setSdtArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun sdt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun)get_store().find_element_user(SDT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sdt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sdt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun insertNewSdt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun)get_store().insert_element_user(SDT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sdt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun addNewSdt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun)get_store().add_element_user(SDT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "sdt" element
     */
    public void removeSdt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDT$6, i);
        }
    }
    
    /**
     * Gets a List of "r" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR> getRList()
    {
        final class RList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR get(int i)
                { return CTPImpl.this.getRArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR old = CTPImpl.this.getRArray(i);
                CTPImpl.this.setRArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR o)
                { CTPImpl.this.insertNewR(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR old = CTPImpl.this.getRArray(i);
                CTPImpl.this.removeR(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfRArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[] getRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "r" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR getRArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().find_element_user(R$8, i);
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
            return get_store().count_elements(R$8);
        }
    }
    
    /**
     * Sets array of all "r" element
     */
    public void setRArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[] rArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rArray, R$8);
        }
    }
    
    /**
     * Sets ith "r" element
     */
    public void setRArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().find_element_user(R$8, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR insertNewR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().insert_element_user(R$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR addNewR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().add_element_user(R$8);
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
            get_store().remove_element(R$8, i);
        }
    }
    
    /**
     * Gets a List of "proofErr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr> getProofErrList()
    {
        final class ProofErrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr get(int i)
                { return CTPImpl.this.getProofErrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr old = CTPImpl.this.getProofErrArray(i);
                CTPImpl.this.setProofErrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr o)
                { CTPImpl.this.insertNewProofErr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr old = CTPImpl.this.getProofErrArray(i);
                CTPImpl.this.removeProofErr(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfProofErrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProofErrList();
        }
    }
    
    /**
     * Gets array of all "proofErr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[] getProofErrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROOFERR$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "proofErr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr getProofErrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().find_element_user(PROOFERR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "proofErr" element
     */
    public int sizeOfProofErrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROOFERR$10);
        }
    }
    
    /**
     * Sets array of all "proofErr" element
     */
    public void setProofErrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[] proofErrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(proofErrArray, PROOFERR$10);
        }
    }
    
    /**
     * Sets ith "proofErr" element
     */
    public void setProofErrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr proofErr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().find_element_user(PROOFERR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(proofErr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "proofErr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr insertNewProofErr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().insert_element_user(PROOFERR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "proofErr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr addNewProofErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().add_element_user(PROOFERR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "proofErr" element
     */
    public void removeProofErr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROOFERR$10, i);
        }
    }
    
    /**
     * Gets a List of "permStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart> getPermStartList()
    {
        final class PermStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart get(int i)
                { return CTPImpl.this.getPermStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart old = CTPImpl.this.getPermStartArray(i);
                CTPImpl.this.setPermStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart o)
                { CTPImpl.this.insertNewPermStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart old = CTPImpl.this.getPermStartArray(i);
                CTPImpl.this.removePermStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfPermStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PermStartList();
        }
    }
    
    /**
     * Gets array of all "permStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[] getPermStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERMSTART$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "permStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart getPermStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().find_element_user(PERMSTART$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "permStart" element
     */
    public int sizeOfPermStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMSTART$12);
        }
    }
    
    /**
     * Sets array of all "permStart" element
     */
    public void setPermStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[] permStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(permStartArray, PERMSTART$12);
        }
    }
    
    /**
     * Sets ith "permStart" element
     */
    public void setPermStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart permStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().find_element_user(PERMSTART$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(permStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "permStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart insertNewPermStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().insert_element_user(PERMSTART$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "permStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart addNewPermStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().add_element_user(PERMSTART$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "permStart" element
     */
    public void removePermStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMSTART$12, i);
        }
    }
    
    /**
     * Gets a List of "permEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm> getPermEndList()
    {
        final class PermEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm get(int i)
                { return CTPImpl.this.getPermEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm old = CTPImpl.this.getPermEndArray(i);
                CTPImpl.this.setPermEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm o)
                { CTPImpl.this.insertNewPermEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm old = CTPImpl.this.getPermEndArray(i);
                CTPImpl.this.removePermEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfPermEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PermEndList();
        }
    }
    
    /**
     * Gets array of all "permEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[] getPermEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERMEND$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "permEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm getPermEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().find_element_user(PERMEND$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "permEnd" element
     */
    public int sizeOfPermEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMEND$14);
        }
    }
    
    /**
     * Sets array of all "permEnd" element
     */
    public void setPermEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[] permEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(permEndArray, PERMEND$14);
        }
    }
    
    /**
     * Sets ith "permEnd" element
     */
    public void setPermEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm permEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().find_element_user(PERMEND$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(permEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "permEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm insertNewPermEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().insert_element_user(PERMEND$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "permEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm addNewPermEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().add_element_user(PERMEND$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "permEnd" element
     */
    public void removePermEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMEND$14, i);
        }
    }
    
    /**
     * Gets a List of "bookmarkStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark> getBookmarkStartList()
    {
        final class BookmarkStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark get(int i)
                { return CTPImpl.this.getBookmarkStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark old = CTPImpl.this.getBookmarkStartArray(i);
                CTPImpl.this.setBookmarkStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark o)
                { CTPImpl.this.insertNewBookmarkStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark old = CTPImpl.this.getBookmarkStartArray(i);
                CTPImpl.this.removeBookmarkStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfBookmarkStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BookmarkStartList();
        }
    }
    
    /**
     * Gets array of all "bookmarkStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[] getBookmarkStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOKMARKSTART$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bookmarkStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark getBookmarkStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().find_element_user(BOOKMARKSTART$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bookmarkStart" element
     */
    public int sizeOfBookmarkStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKMARKSTART$16);
        }
    }
    
    /**
     * Sets array of all "bookmarkStart" element
     */
    public void setBookmarkStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[] bookmarkStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bookmarkStartArray, BOOKMARKSTART$16);
        }
    }
    
    /**
     * Sets ith "bookmarkStart" element
     */
    public void setBookmarkStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark bookmarkStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().find_element_user(BOOKMARKSTART$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bookmarkStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bookmarkStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark insertNewBookmarkStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().insert_element_user(BOOKMARKSTART$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bookmarkStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark addNewBookmarkStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().add_element_user(BOOKMARKSTART$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "bookmarkStart" element
     */
    public void removeBookmarkStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKMARKSTART$16, i);
        }
    }
    
    /**
     * Gets a List of "bookmarkEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getBookmarkEndList()
    {
        final class BookmarkEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTPImpl.this.getBookmarkEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getBookmarkEndArray(i);
                CTPImpl.this.setBookmarkEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTPImpl.this.insertNewBookmarkEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getBookmarkEndArray(i);
                CTPImpl.this.removeBookmarkEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfBookmarkEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BookmarkEndList();
        }
    }
    
    /**
     * Gets array of all "bookmarkEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getBookmarkEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOKMARKEND$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bookmarkEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getBookmarkEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(BOOKMARKEND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bookmarkEnd" element
     */
    public int sizeOfBookmarkEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKMARKEND$18);
        }
    }
    
    /**
     * Sets array of all "bookmarkEnd" element
     */
    public void setBookmarkEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] bookmarkEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bookmarkEndArray, BOOKMARKEND$18);
        }
    }
    
    /**
     * Sets ith "bookmarkEnd" element
     */
    public void setBookmarkEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange bookmarkEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(BOOKMARKEND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bookmarkEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bookmarkEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewBookmarkEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(BOOKMARKEND$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bookmarkEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewBookmarkEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(BOOKMARKEND$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "bookmarkEnd" element
     */
    public void removeBookmarkEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKMARKEND$18, i);
        }
    }
    
    /**
     * Gets a List of "moveFromRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark> getMoveFromRangeStartList()
    {
        final class MoveFromRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark get(int i)
                { return CTPImpl.this.getMoveFromRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTPImpl.this.getMoveFromRangeStartArray(i);
                CTPImpl.this.setMoveFromRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
                { CTPImpl.this.insertNewMoveFromRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTPImpl.this.getMoveFromRangeStartArray(i);
                CTPImpl.this.removeMoveFromRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfMoveFromRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveFromRangeStartList();
        }
    }
    
    /**
     * Gets array of all "moveFromRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] getMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVEFROMRANGESTART$20, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark getMoveFromRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVEFROMRANGESTART$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveFromRangeStart" element
     */
    public int sizeOfMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROMRANGESTART$20);
        }
    }
    
    /**
     * Sets array of all "moveFromRangeStart" element
     */
    public void setMoveFromRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] moveFromRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveFromRangeStartArray, MOVEFROMRANGESTART$20);
        }
    }
    
    /**
     * Sets ith "moveFromRangeStart" element
     */
    public void setMoveFromRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark moveFromRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVEFROMRANGESTART$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveFromRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark insertNewMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().insert_element_user(MOVEFROMRANGESTART$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark addNewMoveFromRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().add_element_user(MOVEFROMRANGESTART$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveFromRangeStart" element
     */
    public void removeMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROMRANGESTART$20, i);
        }
    }
    
    /**
     * Gets a List of "moveFromRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getMoveFromRangeEndList()
    {
        final class MoveFromRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTPImpl.this.getMoveFromRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getMoveFromRangeEndArray(i);
                CTPImpl.this.setMoveFromRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTPImpl.this.insertNewMoveFromRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getMoveFromRangeEndArray(i);
                CTPImpl.this.removeMoveFromRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfMoveFromRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveFromRangeEndList();
        }
    }
    
    /**
     * Gets array of all "moveFromRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVEFROMRANGEEND$22, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getMoveFromRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVEFROMRANGEEND$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveFromRangeEnd" element
     */
    public int sizeOfMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROMRANGEEND$22);
        }
    }
    
    /**
     * Sets array of all "moveFromRangeEnd" element
     */
    public void setMoveFromRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] moveFromRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveFromRangeEndArray, MOVEFROMRANGEEND$22);
        }
    }
    
    /**
     * Sets ith "moveFromRangeEnd" element
     */
    public void setMoveFromRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange moveFromRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVEFROMRANGEEND$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveFromRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(MOVEFROMRANGEEND$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewMoveFromRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(MOVEFROMRANGEEND$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveFromRangeEnd" element
     */
    public void removeMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROMRANGEEND$22, i);
        }
    }
    
    /**
     * Gets a List of "moveToRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark> getMoveToRangeStartList()
    {
        final class MoveToRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark get(int i)
                { return CTPImpl.this.getMoveToRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTPImpl.this.getMoveToRangeStartArray(i);
                CTPImpl.this.setMoveToRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
                { CTPImpl.this.insertNewMoveToRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTPImpl.this.getMoveToRangeStartArray(i);
                CTPImpl.this.removeMoveToRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfMoveToRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToRangeStartList();
        }
    }
    
    /**
     * Gets array of all "moveToRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] getMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETORANGESTART$24, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark getMoveToRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVETORANGESTART$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveToRangeStart" element
     */
    public int sizeOfMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETORANGESTART$24);
        }
    }
    
    /**
     * Sets array of all "moveToRangeStart" element
     */
    public void setMoveToRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] moveToRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToRangeStartArray, MOVETORANGESTART$24);
        }
    }
    
    /**
     * Sets ith "moveToRangeStart" element
     */
    public void setMoveToRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark moveToRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVETORANGESTART$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveToRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark insertNewMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().insert_element_user(MOVETORANGESTART$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark addNewMoveToRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().add_element_user(MOVETORANGESTART$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveToRangeStart" element
     */
    public void removeMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETORANGESTART$24, i);
        }
    }
    
    /**
     * Gets a List of "moveToRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getMoveToRangeEndList()
    {
        final class MoveToRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTPImpl.this.getMoveToRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getMoveToRangeEndArray(i);
                CTPImpl.this.setMoveToRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTPImpl.this.insertNewMoveToRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getMoveToRangeEndArray(i);
                CTPImpl.this.removeMoveToRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfMoveToRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToRangeEndList();
        }
    }
    
    /**
     * Gets array of all "moveToRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETORANGEEND$26, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getMoveToRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVETORANGEEND$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveToRangeEnd" element
     */
    public int sizeOfMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETORANGEEND$26);
        }
    }
    
    /**
     * Sets array of all "moveToRangeEnd" element
     */
    public void setMoveToRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] moveToRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToRangeEndArray, MOVETORANGEEND$26);
        }
    }
    
    /**
     * Sets ith "moveToRangeEnd" element
     */
    public void setMoveToRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange moveToRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVETORANGEEND$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveToRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(MOVETORANGEEND$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewMoveToRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(MOVETORANGEEND$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveToRangeEnd" element
     */
    public void removeMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETORANGEEND$26, i);
        }
    }
    
    /**
     * Gets a List of "commentRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getCommentRangeStartList()
    {
        final class CommentRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTPImpl.this.getCommentRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getCommentRangeStartArray(i);
                CTPImpl.this.setCommentRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTPImpl.this.insertNewCommentRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getCommentRangeStartArray(i);
                CTPImpl.this.removeCommentRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCommentRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentRangeStartList();
        }
    }
    
    /**
     * Gets array of all "commentRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getCommentRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTRANGESTART$28, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "commentRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getCommentRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGESTART$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "commentRangeStart" element
     */
    public int sizeOfCommentRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTRANGESTART$28);
        }
    }
    
    /**
     * Sets array of all "commentRangeStart" element
     */
    public void setCommentRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] commentRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentRangeStartArray, COMMENTRANGESTART$28);
        }
    }
    
    /**
     * Sets ith "commentRangeStart" element
     */
    public void setCommentRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange commentRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGESTART$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(commentRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewCommentRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(COMMENTRANGESTART$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "commentRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewCommentRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(COMMENTRANGESTART$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "commentRangeStart" element
     */
    public void removeCommentRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTRANGESTART$28, i);
        }
    }
    
    /**
     * Gets a List of "commentRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getCommentRangeEndList()
    {
        final class CommentRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTPImpl.this.getCommentRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getCommentRangeEndArray(i);
                CTPImpl.this.setCommentRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTPImpl.this.insertNewCommentRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTPImpl.this.getCommentRangeEndArray(i);
                CTPImpl.this.removeCommentRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCommentRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentRangeEndList();
        }
    }
    
    /**
     * Gets array of all "commentRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getCommentRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTRANGEEND$30, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "commentRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getCommentRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGEEND$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "commentRangeEnd" element
     */
    public int sizeOfCommentRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTRANGEEND$30);
        }
    }
    
    /**
     * Sets array of all "commentRangeEnd" element
     */
    public void setCommentRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] commentRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentRangeEndArray, COMMENTRANGEEND$30);
        }
    }
    
    /**
     * Sets ith "commentRangeEnd" element
     */
    public void setCommentRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange commentRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGEEND$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(commentRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewCommentRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(COMMENTRANGEEND$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "commentRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewCommentRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(COMMENTRANGEEND$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "commentRangeEnd" element
     */
    public void removeCommentRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTRANGEEND$30, i);
        }
    }
    
    /**
     * Gets a List of "customXmlInsRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlInsRangeStartList()
    {
        final class CustomXmlInsRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTPImpl.this.getCustomXmlInsRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlInsRangeStartArray(i);
                CTPImpl.this.setCustomXmlInsRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTPImpl.this.insertNewCustomXmlInsRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlInsRangeStartArray(i);
                CTPImpl.this.removeCustomXmlInsRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlInsRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlInsRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlInsRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlInsRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLINSRANGESTART$32, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlInsRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlInsRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLINSRANGESTART$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlInsRangeStart" element
     */
    public int sizeOfCustomXmlInsRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLINSRANGESTART$32);
        }
    }
    
    /**
     * Sets array of all "customXmlInsRangeStart" element
     */
    public void setCustomXmlInsRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlInsRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlInsRangeStartArray, CUSTOMXMLINSRANGESTART$32);
        }
    }
    
    /**
     * Sets ith "customXmlInsRangeStart" element
     */
    public void setCustomXmlInsRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlInsRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLINSRANGESTART$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlInsRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlInsRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlInsRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLINSRANGESTART$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlInsRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlInsRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLINSRANGESTART$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlInsRangeStart" element
     */
    public void removeCustomXmlInsRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLINSRANGESTART$32, i);
        }
    }
    
    /**
     * Gets a List of "customXmlInsRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlInsRangeEndList()
    {
        final class CustomXmlInsRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTPImpl.this.getCustomXmlInsRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlInsRangeEndArray(i);
                CTPImpl.this.setCustomXmlInsRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTPImpl.this.insertNewCustomXmlInsRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlInsRangeEndArray(i);
                CTPImpl.this.removeCustomXmlInsRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlInsRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlInsRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlInsRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlInsRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLINSRANGEEND$34, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlInsRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlInsRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLINSRANGEEND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlInsRangeEnd" element
     */
    public int sizeOfCustomXmlInsRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLINSRANGEEND$34);
        }
    }
    
    /**
     * Sets array of all "customXmlInsRangeEnd" element
     */
    public void setCustomXmlInsRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlInsRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlInsRangeEndArray, CUSTOMXMLINSRANGEEND$34);
        }
    }
    
    /**
     * Sets ith "customXmlInsRangeEnd" element
     */
    public void setCustomXmlInsRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlInsRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLINSRANGEEND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlInsRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlInsRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlInsRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLINSRANGEEND$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlInsRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlInsRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLINSRANGEEND$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlInsRangeEnd" element
     */
    public void removeCustomXmlInsRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLINSRANGEEND$34, i);
        }
    }
    
    /**
     * Gets a List of "customXmlDelRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlDelRangeStartList()
    {
        final class CustomXmlDelRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTPImpl.this.getCustomXmlDelRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlDelRangeStartArray(i);
                CTPImpl.this.setCustomXmlDelRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTPImpl.this.insertNewCustomXmlDelRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlDelRangeStartArray(i);
                CTPImpl.this.removeCustomXmlDelRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlDelRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlDelRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlDelRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlDelRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLDELRANGESTART$36, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlDelRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlDelRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLDELRANGESTART$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlDelRangeStart" element
     */
    public int sizeOfCustomXmlDelRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLDELRANGESTART$36);
        }
    }
    
    /**
     * Sets array of all "customXmlDelRangeStart" element
     */
    public void setCustomXmlDelRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlDelRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlDelRangeStartArray, CUSTOMXMLDELRANGESTART$36);
        }
    }
    
    /**
     * Sets ith "customXmlDelRangeStart" element
     */
    public void setCustomXmlDelRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlDelRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLDELRANGESTART$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlDelRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlDelRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlDelRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLDELRANGESTART$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlDelRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlDelRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLDELRANGESTART$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlDelRangeStart" element
     */
    public void removeCustomXmlDelRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLDELRANGESTART$36, i);
        }
    }
    
    /**
     * Gets a List of "customXmlDelRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlDelRangeEndList()
    {
        final class CustomXmlDelRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTPImpl.this.getCustomXmlDelRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlDelRangeEndArray(i);
                CTPImpl.this.setCustomXmlDelRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTPImpl.this.insertNewCustomXmlDelRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlDelRangeEndArray(i);
                CTPImpl.this.removeCustomXmlDelRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlDelRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlDelRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlDelRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlDelRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLDELRANGEEND$38, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlDelRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlDelRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLDELRANGEEND$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlDelRangeEnd" element
     */
    public int sizeOfCustomXmlDelRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLDELRANGEEND$38);
        }
    }
    
    /**
     * Sets array of all "customXmlDelRangeEnd" element
     */
    public void setCustomXmlDelRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlDelRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlDelRangeEndArray, CUSTOMXMLDELRANGEEND$38);
        }
    }
    
    /**
     * Sets ith "customXmlDelRangeEnd" element
     */
    public void setCustomXmlDelRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlDelRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLDELRANGEEND$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlDelRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlDelRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlDelRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLDELRANGEEND$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlDelRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlDelRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLDELRANGEEND$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlDelRangeEnd" element
     */
    public void removeCustomXmlDelRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLDELRANGEEND$38, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveFromRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlMoveFromRangeStartList()
    {
        final class CustomXmlMoveFromRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTPImpl.this.getCustomXmlMoveFromRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlMoveFromRangeStartArray(i);
                CTPImpl.this.setCustomXmlMoveFromRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTPImpl.this.insertNewCustomXmlMoveFromRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlMoveFromRangeStartArray(i);
                CTPImpl.this.removeCustomXmlMoveFromRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlMoveFromRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveFromRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveFromRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGESTART$40, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlMoveFromRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveFromRangeStart" element
     */
    public int sizeOfCustomXmlMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVEFROMRANGESTART$40);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveFromRangeStart" element
     */
    public void setCustomXmlMoveFromRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlMoveFromRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveFromRangeStartArray, CUSTOMXMLMOVEFROMRANGESTART$40);
        }
    }
    
    /**
     * Sets ith "customXmlMoveFromRangeStart" element
     */
    public void setCustomXmlMoveFromRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlMoveFromRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveFromRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGESTART$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlMoveFromRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLMOVEFROMRANGESTART$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveFromRangeStart" element
     */
    public void removeCustomXmlMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVEFROMRANGESTART$40, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveFromRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlMoveFromRangeEndList()
    {
        final class CustomXmlMoveFromRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTPImpl.this.getCustomXmlMoveFromRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlMoveFromRangeEndArray(i);
                CTPImpl.this.setCustomXmlMoveFromRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTPImpl.this.insertNewCustomXmlMoveFromRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlMoveFromRangeEndArray(i);
                CTPImpl.this.removeCustomXmlMoveFromRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlMoveFromRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveFromRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveFromRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGEEND$42, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlMoveFromRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveFromRangeEnd" element
     */
    public int sizeOfCustomXmlMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVEFROMRANGEEND$42);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveFromRangeEnd" element
     */
    public void setCustomXmlMoveFromRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlMoveFromRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveFromRangeEndArray, CUSTOMXMLMOVEFROMRANGEEND$42);
        }
    }
    
    /**
     * Sets ith "customXmlMoveFromRangeEnd" element
     */
    public void setCustomXmlMoveFromRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlMoveFromRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveFromRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGEEND$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlMoveFromRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLMOVEFROMRANGEEND$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveFromRangeEnd" element
     */
    public void removeCustomXmlMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVEFROMRANGEEND$42, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveToRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlMoveToRangeStartList()
    {
        final class CustomXmlMoveToRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTPImpl.this.getCustomXmlMoveToRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlMoveToRangeStartArray(i);
                CTPImpl.this.setCustomXmlMoveToRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTPImpl.this.insertNewCustomXmlMoveToRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTPImpl.this.getCustomXmlMoveToRangeStartArray(i);
                CTPImpl.this.removeCustomXmlMoveToRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlMoveToRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveToRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveToRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVETORANGESTART$44, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlMoveToRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveToRangeStart" element
     */
    public int sizeOfCustomXmlMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVETORANGESTART$44);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveToRangeStart" element
     */
    public void setCustomXmlMoveToRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlMoveToRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveToRangeStartArray, CUSTOMXMLMOVETORANGESTART$44);
        }
    }
    
    /**
     * Sets ith "customXmlMoveToRangeStart" element
     */
    public void setCustomXmlMoveToRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlMoveToRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveToRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLMOVETORANGESTART$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlMoveToRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLMOVETORANGESTART$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveToRangeStart" element
     */
    public void removeCustomXmlMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVETORANGESTART$44, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveToRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlMoveToRangeEndList()
    {
        final class CustomXmlMoveToRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTPImpl.this.getCustomXmlMoveToRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlMoveToRangeEndArray(i);
                CTPImpl.this.setCustomXmlMoveToRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTPImpl.this.insertNewCustomXmlMoveToRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTPImpl.this.getCustomXmlMoveToRangeEndArray(i);
                CTPImpl.this.removeCustomXmlMoveToRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfCustomXmlMoveToRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveToRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveToRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVETORANGEEND$46, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlMoveToRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveToRangeEnd" element
     */
    public int sizeOfCustomXmlMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVETORANGEEND$46);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveToRangeEnd" element
     */
    public void setCustomXmlMoveToRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlMoveToRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveToRangeEndArray, CUSTOMXMLMOVETORANGEEND$46);
        }
    }
    
    /**
     * Sets ith "customXmlMoveToRangeEnd" element
     */
    public void setCustomXmlMoveToRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlMoveToRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveToRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLMOVETORANGEEND$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlMoveToRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLMOVETORANGEEND$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveToRangeEnd" element
     */
    public void removeCustomXmlMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVETORANGEEND$46, i);
        }
    }
    
    /**
     * Gets a List of "ins" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getInsList()
    {
        final class InsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTPImpl.this.getInsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getInsArray(i);
                CTPImpl.this.setInsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTPImpl.this.insertNewIns(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getInsArray(i);
                CTPImpl.this.removeIns(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfInsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InsList();
        }
    }
    
    /**
     * Gets array of all "ins" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getInsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INS$48, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getInsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(INS$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ins" element
     */
    public int sizeOfInsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INS$48);
        }
    }
    
    /**
     * Sets array of all "ins" element
     */
    public void setInsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] insArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(insArray, INS$48);
        }
    }
    
    /**
     * Sets ith "ins" element
     */
    public void setInsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange ins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(INS$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ins);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewIns(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(INS$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(INS$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "ins" element
     */
    public void removeIns(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INS$48, i);
        }
    }
    
    /**
     * Gets a List of "del" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getDelList()
    {
        final class DelList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTPImpl.this.getDelArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getDelArray(i);
                CTPImpl.this.setDelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTPImpl.this.insertNewDel(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getDelArray(i);
                CTPImpl.this.removeDel(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfDelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DelList();
        }
    }
    
    /**
     * Gets array of all "del" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getDelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEL$50, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getDelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(DEL$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "del" element
     */
    public int sizeOfDelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEL$50);
        }
    }
    
    /**
     * Sets array of all "del" element
     */
    public void setDelArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] delArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(delArray, DEL$50);
        }
    }
    
    /**
     * Sets ith "del" element
     */
    public void setDelArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange del)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(DEL$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(del);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewDel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(DEL$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(DEL$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "del" element
     */
    public void removeDel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEL$50, i);
        }
    }
    
    /**
     * Gets a List of "moveFrom" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getMoveFromList()
    {
        final class MoveFromList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTPImpl.this.getMoveFromArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getMoveFromArray(i);
                CTPImpl.this.setMoveFromArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTPImpl.this.insertNewMoveFrom(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getMoveFromArray(i);
                CTPImpl.this.removeMoveFrom(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfMoveFromArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveFromList();
        }
    }
    
    /**
     * Gets array of all "moveFrom" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getMoveFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVEFROM$52, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getMoveFromArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVEFROM$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveFrom" element
     */
    public int sizeOfMoveFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROM$52);
        }
    }
    
    /**
     * Sets array of all "moveFrom" element
     */
    public void setMoveFromArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] moveFromArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveFromArray, MOVEFROM$52);
        }
    }
    
    /**
     * Sets ith "moveFrom" element
     */
    public void setMoveFromArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange moveFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVEFROM$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveFrom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewMoveFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(MOVEFROM$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewMoveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(MOVEFROM$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveFrom" element
     */
    public void removeMoveFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROM$52, i);
        }
    }
    
    /**
     * Gets a List of "moveTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getMoveToList()
    {
        final class MoveToList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTPImpl.this.getMoveToArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getMoveToArray(i);
                CTPImpl.this.setMoveToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTPImpl.this.insertNewMoveTo(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTPImpl.this.getMoveToArray(i);
                CTPImpl.this.removeMoveTo(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfMoveToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToList();
        }
    }
    
    /**
     * Gets array of all "moveTo" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getMoveToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETO$54, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getMoveToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVETO$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveTo" element
     */
    public int sizeOfMoveToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETO$54);
        }
    }
    
    /**
     * Sets array of all "moveTo" element
     */
    public void setMoveToArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] moveToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToArray, MOVETO$54);
        }
    }
    
    /**
     * Sets ith "moveTo" element
     */
    public void setMoveToArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange moveTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVETO$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewMoveTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(MOVETO$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(MOVETO$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveTo" element
     */
    public void removeMoveTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETO$54, i);
        }
    }
    
    /**
     * Gets a List of "oMathPara" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara> getOMathParaList()
    {
        final class OMathParaList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara get(int i)
                { return CTPImpl.this.getOMathParaArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara old = CTPImpl.this.getOMathParaArray(i);
                CTPImpl.this.setOMathParaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara o)
                { CTPImpl.this.insertNewOMathPara(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara old = CTPImpl.this.getOMathParaArray(i);
                CTPImpl.this.removeOMathPara(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfOMathParaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OMathParaList();
        }
    }
    
    /**
     * Gets array of all "oMathPara" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[] getOMathParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OMATHPARA$56, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara getOMathParaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().find_element_user(OMATHPARA$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oMathPara" element
     */
    public int sizeOfOMathParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OMATHPARA$56);
        }
    }
    
    /**
     * Sets array of all "oMathPara" element
     */
    public void setOMathParaArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[] oMathParaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oMathParaArray, OMATHPARA$56);
        }
    }
    
    /**
     * Sets ith "oMathPara" element
     */
    public void setOMathParaArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara oMathPara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().find_element_user(OMATHPARA$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oMathPara);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara insertNewOMathPara(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().insert_element_user(OMATHPARA$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara addNewOMathPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().add_element_user(OMATHPARA$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "oMathPara" element
     */
    public void removeOMathPara(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OMATHPARA$56, i);
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
                { return CTPImpl.this.getOMathArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTPImpl.this.getOMathArray(i);
                CTPImpl.this.setOMathArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
                { CTPImpl.this.insertNewOMath(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTPImpl.this.getOMathArray(i);
                CTPImpl.this.removeOMath(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfOMathArray(); }
            
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
            get_store().find_all_element_users(OMATH$58, targetList);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$58, i);
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
            return get_store().count_elements(OMATH$58);
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
            arraySetterHelper(oMathArray, OMATH$58);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$58, i);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().insert_element_user(OMATH$58, i);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().add_element_user(OMATH$58);
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
            get_store().remove_element(OMATH$58, i);
        }
    }
    
    /**
     * Gets a List of "fldSimple" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField> getFldSimpleList()
    {
        final class FldSimpleList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField get(int i)
                { return CTPImpl.this.getFldSimpleArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField old = CTPImpl.this.getFldSimpleArray(i);
                CTPImpl.this.setFldSimpleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField o)
                { CTPImpl.this.insertNewFldSimple(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField old = CTPImpl.this.getFldSimpleArray(i);
                CTPImpl.this.removeFldSimple(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfFldSimpleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FldSimpleList();
        }
    }
    
    /**
     * Gets array of all "fldSimple" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField[] getFldSimpleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLDSIMPLE$60, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fldSimple" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField getFldSimpleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField)get_store().find_element_user(FLDSIMPLE$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fldSimple" element
     */
    public int sizeOfFldSimpleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLDSIMPLE$60);
        }
    }
    
    /**
     * Sets array of all "fldSimple" element
     */
    public void setFldSimpleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField[] fldSimpleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fldSimpleArray, FLDSIMPLE$60);
        }
    }
    
    /**
     * Sets ith "fldSimple" element
     */
    public void setFldSimpleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField fldSimple)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField)get_store().find_element_user(FLDSIMPLE$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fldSimple);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fldSimple" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField insertNewFldSimple(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField)get_store().insert_element_user(FLDSIMPLE$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fldSimple" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField addNewFldSimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField)get_store().add_element_user(FLDSIMPLE$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "fldSimple" element
     */
    public void removeFldSimple(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLDSIMPLE$60, i);
        }
    }
    
    /**
     * Gets a List of "hyperlink" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink> getHyperlinkList()
    {
        final class HyperlinkList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink get(int i)
                { return CTPImpl.this.getHyperlinkArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink old = CTPImpl.this.getHyperlinkArray(i);
                CTPImpl.this.setHyperlinkArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink o)
                { CTPImpl.this.insertNewHyperlink(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink old = CTPImpl.this.getHyperlinkArray(i);
                CTPImpl.this.removeHyperlink(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfHyperlinkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HyperlinkList();
        }
    }
    
    /**
     * Gets array of all "hyperlink" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink[] getHyperlinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HYPERLINK$62, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hyperlink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink getHyperlinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink)get_store().find_element_user(HYPERLINK$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hyperlink" element
     */
    public int sizeOfHyperlinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPERLINK$62);
        }
    }
    
    /**
     * Sets array of all "hyperlink" element
     */
    public void setHyperlinkArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink[] hyperlinkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hyperlinkArray, HYPERLINK$62);
        }
    }
    
    /**
     * Sets ith "hyperlink" element
     */
    public void setHyperlinkArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink hyperlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink)get_store().find_element_user(HYPERLINK$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hyperlink);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hyperlink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink insertNewHyperlink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink)get_store().insert_element_user(HYPERLINK$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hyperlink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink addNewHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink)get_store().add_element_user(HYPERLINK$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "hyperlink" element
     */
    public void removeHyperlink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPERLINK$62, i);
        }
    }
    
    /**
     * Gets a List of "subDoc" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel> getSubDocList()
    {
        final class SubDocList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel get(int i)
                { return CTPImpl.this.getSubDocArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel old = CTPImpl.this.getSubDocArray(i);
                CTPImpl.this.setSubDocArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel o)
                { CTPImpl.this.insertNewSubDoc(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel old = CTPImpl.this.getSubDocArray(i);
                CTPImpl.this.removeSubDoc(i);
                return old;
            }
            
            public int size()
                { return CTPImpl.this.sizeOfSubDocArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SubDocList();
        }
    }
    
    /**
     * Gets array of all "subDoc" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[] getSubDocArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBDOC$64, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subDoc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getSubDocArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(SUBDOC$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subDoc" element
     */
    public int sizeOfSubDocArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBDOC$64);
        }
    }
    
    /**
     * Sets array of all "subDoc" element
     */
    public void setSubDocArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[] subDocArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subDocArray, SUBDOC$64);
        }
    }
    
    /**
     * Sets ith "subDoc" element
     */
    public void setSubDocArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel subDoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(SUBDOC$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subDoc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subDoc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel insertNewSubDoc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().insert_element_user(SUBDOC$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subDoc" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewSubDoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(SUBDOC$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "subDoc" element
     */
    public void removeSubDoc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBDOC$64, i);
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
     * Gets the "rsidR" attribute
     */
    public byte[] getRsidR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$68);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$68);
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
            return get_store().find_attribute_user(RSIDR$68) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDR$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDR$68);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDR$68);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDR$68);
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
            get_store().remove_attribute(RSIDR$68);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$70);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$70);
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
            return get_store().find_attribute_user(RSIDDEL$70) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDDEL$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDDEL$70);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDDEL$70);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDDEL$70);
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
            get_store().remove_attribute(RSIDDEL$70);
        }
    }
    
    /**
     * Gets the "rsidP" attribute
     */
    public byte[] getRsidP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDP$72);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidP" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDP$72);
            return target;
        }
    }
    
    /**
     * True if has "rsidP" attribute
     */
    public boolean isSetRsidP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDP$72) != null;
        }
    }
    
    /**
     * Sets the "rsidP" attribute
     */
    public void setRsidP(byte[] rsidP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDP$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDP$72);
            }
            target.setByteArrayValue(rsidP);
        }
    }
    
    /**
     * Sets (as xml) the "rsidP" attribute
     */
    public void xsetRsidP(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDP$72);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDP$72);
            }
            target.set(rsidP);
        }
    }
    
    /**
     * Unsets the "rsidP" attribute
     */
    public void unsetRsidP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDP$72);
        }
    }
    
    /**
     * Gets the "rsidRDefault" attribute
     */
    public byte[] getRsidRDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRDEFAULT$74);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "rsidRDefault" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber xgetRsidRDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRDEFAULT$74);
            return target;
        }
    }
    
    /**
     * True if has "rsidRDefault" attribute
     */
    public boolean isSetRsidRDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RSIDRDEFAULT$74) != null;
        }
    }
    
    /**
     * Sets the "rsidRDefault" attribute
     */
    public void setRsidRDefault(byte[] rsidRDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RSIDRDEFAULT$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RSIDRDEFAULT$74);
            }
            target.setByteArrayValue(rsidRDefault);
        }
    }
    
    /**
     * Sets (as xml) the "rsidRDefault" attribute
     */
    public void xsetRsidRDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber rsidRDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().find_attribute_user(RSIDRDEFAULT$74);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber)get_store().add_attribute_user(RSIDRDEFAULT$74);
            }
            target.set(rsidRDefault);
        }
    }
    
    /**
     * Unsets the "rsidRDefault" attribute
     */
    public void unsetRsidRDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RSIDRDEFAULT$74);
        }
    }
}
