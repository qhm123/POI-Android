/*
 * XML Type:  CT_Tbl
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Tbl(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTblImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl
{
    
    public CTTblImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOKMARKSTART$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkStart");
    private static final javax.xml.namespace.QName BOOKMARKEND$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkEnd");
    private static final javax.xml.namespace.QName MOVEFROMRANGESTART$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeStart");
    private static final javax.xml.namespace.QName MOVEFROMRANGEEND$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeEnd");
    private static final javax.xml.namespace.QName MOVETORANGESTART$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeStart");
    private static final javax.xml.namespace.QName MOVETORANGEEND$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeEnd");
    private static final javax.xml.namespace.QName COMMENTRANGESTART$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeStart");
    private static final javax.xml.namespace.QName COMMENTRANGEEND$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLINSRANGESTART$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLINSRANGEEND$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLDELRANGESTART$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLDELRANGEEND$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVEFROMRANGESTART$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVEFROMRANGEEND$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVETORANGESTART$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVETORANGEEND$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeEnd");
    private static final javax.xml.namespace.QName TBLPR$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPr");
    private static final javax.xml.namespace.QName TBLGRID$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblGrid");
    private static final javax.xml.namespace.QName TR$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tr");
    private static final javax.xml.namespace.QName CUSTOMXML$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXml");
    private static final javax.xml.namespace.QName SDT$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdt");
    private static final javax.xml.namespace.QName PROOFERR$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofErr");
    private static final javax.xml.namespace.QName PERMSTART$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permStart");
    private static final javax.xml.namespace.QName PERMEND$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permEnd");
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
    
    
    /**
     * Gets a List of "bookmarkStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark> getBookmarkStartList()
    {
        final class BookmarkStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark get(int i)
                { return CTTblImpl.this.getBookmarkStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark old = CTTblImpl.this.getBookmarkStartArray(i);
                CTTblImpl.this.setBookmarkStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark o)
                { CTTblImpl.this.insertNewBookmarkStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark old = CTTblImpl.this.getBookmarkStartArray(i);
                CTTblImpl.this.removeBookmarkStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfBookmarkStartArray(); }
            
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
            get_store().find_all_element_users(BOOKMARKSTART$0, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().find_element_user(BOOKMARKSTART$0, i);
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
            return get_store().count_elements(BOOKMARKSTART$0);
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
            arraySetterHelper(bookmarkStartArray, BOOKMARKSTART$0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().find_element_user(BOOKMARKSTART$0, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().insert_element_user(BOOKMARKSTART$0, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().add_element_user(BOOKMARKSTART$0);
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
            get_store().remove_element(BOOKMARKSTART$0, i);
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
                { return CTTblImpl.this.getBookmarkEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getBookmarkEndArray(i);
                CTTblImpl.this.setBookmarkEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTTblImpl.this.insertNewBookmarkEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getBookmarkEndArray(i);
                CTTblImpl.this.removeBookmarkEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfBookmarkEndArray(); }
            
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
            get_store().find_all_element_users(BOOKMARKEND$2, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(BOOKMARKEND$2, i);
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
            return get_store().count_elements(BOOKMARKEND$2);
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
            arraySetterHelper(bookmarkEndArray, BOOKMARKEND$2);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(BOOKMARKEND$2, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(BOOKMARKEND$2, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(BOOKMARKEND$2);
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
            get_store().remove_element(BOOKMARKEND$2, i);
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
                { return CTTblImpl.this.getMoveFromRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTTblImpl.this.getMoveFromRangeStartArray(i);
                CTTblImpl.this.setMoveFromRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
                { CTTblImpl.this.insertNewMoveFromRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTTblImpl.this.getMoveFromRangeStartArray(i);
                CTTblImpl.this.removeMoveFromRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfMoveFromRangeStartArray(); }
            
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
            get_store().find_all_element_users(MOVEFROMRANGESTART$4, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVEFROMRANGESTART$4, i);
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
            return get_store().count_elements(MOVEFROMRANGESTART$4);
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
            arraySetterHelper(moveFromRangeStartArray, MOVEFROMRANGESTART$4);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVEFROMRANGESTART$4, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().insert_element_user(MOVEFROMRANGESTART$4, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().add_element_user(MOVEFROMRANGESTART$4);
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
            get_store().remove_element(MOVEFROMRANGESTART$4, i);
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
                { return CTTblImpl.this.getMoveFromRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getMoveFromRangeEndArray(i);
                CTTblImpl.this.setMoveFromRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTTblImpl.this.insertNewMoveFromRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getMoveFromRangeEndArray(i);
                CTTblImpl.this.removeMoveFromRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfMoveFromRangeEndArray(); }
            
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
            get_store().find_all_element_users(MOVEFROMRANGEEND$6, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVEFROMRANGEEND$6, i);
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
            return get_store().count_elements(MOVEFROMRANGEEND$6);
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
            arraySetterHelper(moveFromRangeEndArray, MOVEFROMRANGEEND$6);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVEFROMRANGEEND$6, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(MOVEFROMRANGEEND$6, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(MOVEFROMRANGEEND$6);
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
            get_store().remove_element(MOVEFROMRANGEEND$6, i);
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
                { return CTTblImpl.this.getMoveToRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTTblImpl.this.getMoveToRangeStartArray(i);
                CTTblImpl.this.setMoveToRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
                { CTTblImpl.this.insertNewMoveToRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTTblImpl.this.getMoveToRangeStartArray(i);
                CTTblImpl.this.removeMoveToRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfMoveToRangeStartArray(); }
            
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
            get_store().find_all_element_users(MOVETORANGESTART$8, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVETORANGESTART$8, i);
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
            return get_store().count_elements(MOVETORANGESTART$8);
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
            arraySetterHelper(moveToRangeStartArray, MOVETORANGESTART$8);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVETORANGESTART$8, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().insert_element_user(MOVETORANGESTART$8, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().add_element_user(MOVETORANGESTART$8);
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
            get_store().remove_element(MOVETORANGESTART$8, i);
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
                { return CTTblImpl.this.getMoveToRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getMoveToRangeEndArray(i);
                CTTblImpl.this.setMoveToRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTTblImpl.this.insertNewMoveToRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getMoveToRangeEndArray(i);
                CTTblImpl.this.removeMoveToRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfMoveToRangeEndArray(); }
            
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
            get_store().find_all_element_users(MOVETORANGEEND$10, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVETORANGEEND$10, i);
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
            return get_store().count_elements(MOVETORANGEEND$10);
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
            arraySetterHelper(moveToRangeEndArray, MOVETORANGEEND$10);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVETORANGEEND$10, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(MOVETORANGEEND$10, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(MOVETORANGEEND$10);
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
            get_store().remove_element(MOVETORANGEEND$10, i);
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
                { return CTTblImpl.this.getCommentRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getCommentRangeStartArray(i);
                CTTblImpl.this.setCommentRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTTblImpl.this.insertNewCommentRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getCommentRangeStartArray(i);
                CTTblImpl.this.removeCommentRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCommentRangeStartArray(); }
            
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
            get_store().find_all_element_users(COMMENTRANGESTART$12, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGESTART$12, i);
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
            return get_store().count_elements(COMMENTRANGESTART$12);
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
            arraySetterHelper(commentRangeStartArray, COMMENTRANGESTART$12);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGESTART$12, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(COMMENTRANGESTART$12, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(COMMENTRANGESTART$12);
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
            get_store().remove_element(COMMENTRANGESTART$12, i);
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
                { return CTTblImpl.this.getCommentRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getCommentRangeEndArray(i);
                CTTblImpl.this.setCommentRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTTblImpl.this.insertNewCommentRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTTblImpl.this.getCommentRangeEndArray(i);
                CTTblImpl.this.removeCommentRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCommentRangeEndArray(); }
            
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
            get_store().find_all_element_users(COMMENTRANGEEND$14, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGEEND$14, i);
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
            return get_store().count_elements(COMMENTRANGEEND$14);
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
            arraySetterHelper(commentRangeEndArray, COMMENTRANGEEND$14);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGEEND$14, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(COMMENTRANGEEND$14, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(COMMENTRANGEEND$14);
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
            get_store().remove_element(COMMENTRANGEEND$14, i);
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
                { return CTTblImpl.this.getCustomXmlInsRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlInsRangeStartArray(i);
                CTTblImpl.this.setCustomXmlInsRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTTblImpl.this.insertNewCustomXmlInsRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlInsRangeStartArray(i);
                CTTblImpl.this.removeCustomXmlInsRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlInsRangeStartArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLINSRANGESTART$16, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLINSRANGESTART$16, i);
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
            return get_store().count_elements(CUSTOMXMLINSRANGESTART$16);
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
            arraySetterHelper(customXmlInsRangeStartArray, CUSTOMXMLINSRANGESTART$16);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLINSRANGESTART$16, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLINSRANGESTART$16, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLINSRANGESTART$16);
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
            get_store().remove_element(CUSTOMXMLINSRANGESTART$16, i);
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
                { return CTTblImpl.this.getCustomXmlInsRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlInsRangeEndArray(i);
                CTTblImpl.this.setCustomXmlInsRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTTblImpl.this.insertNewCustomXmlInsRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlInsRangeEndArray(i);
                CTTblImpl.this.removeCustomXmlInsRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlInsRangeEndArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLINSRANGEEND$18, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLINSRANGEEND$18, i);
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
            return get_store().count_elements(CUSTOMXMLINSRANGEEND$18);
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
            arraySetterHelper(customXmlInsRangeEndArray, CUSTOMXMLINSRANGEEND$18);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLINSRANGEEND$18, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLINSRANGEEND$18, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLINSRANGEEND$18);
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
            get_store().remove_element(CUSTOMXMLINSRANGEEND$18, i);
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
                { return CTTblImpl.this.getCustomXmlDelRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlDelRangeStartArray(i);
                CTTblImpl.this.setCustomXmlDelRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTTblImpl.this.insertNewCustomXmlDelRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlDelRangeStartArray(i);
                CTTblImpl.this.removeCustomXmlDelRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlDelRangeStartArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLDELRANGESTART$20, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLDELRANGESTART$20, i);
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
            return get_store().count_elements(CUSTOMXMLDELRANGESTART$20);
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
            arraySetterHelper(customXmlDelRangeStartArray, CUSTOMXMLDELRANGESTART$20);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLDELRANGESTART$20, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLDELRANGESTART$20, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLDELRANGESTART$20);
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
            get_store().remove_element(CUSTOMXMLDELRANGESTART$20, i);
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
                { return CTTblImpl.this.getCustomXmlDelRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlDelRangeEndArray(i);
                CTTblImpl.this.setCustomXmlDelRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTTblImpl.this.insertNewCustomXmlDelRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlDelRangeEndArray(i);
                CTTblImpl.this.removeCustomXmlDelRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlDelRangeEndArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLDELRANGEEND$22, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLDELRANGEEND$22, i);
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
            return get_store().count_elements(CUSTOMXMLDELRANGEEND$22);
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
            arraySetterHelper(customXmlDelRangeEndArray, CUSTOMXMLDELRANGEEND$22);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLDELRANGEEND$22, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLDELRANGEEND$22, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLDELRANGEEND$22);
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
            get_store().remove_element(CUSTOMXMLDELRANGEEND$22, i);
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
                { return CTTblImpl.this.getCustomXmlMoveFromRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlMoveFromRangeStartArray(i);
                CTTblImpl.this.setCustomXmlMoveFromRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTTblImpl.this.insertNewCustomXmlMoveFromRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlMoveFromRangeStartArray(i);
                CTTblImpl.this.removeCustomXmlMoveFromRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlMoveFromRangeStartArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGESTART$24, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$24, i);
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
            return get_store().count_elements(CUSTOMXMLMOVEFROMRANGESTART$24);
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
            arraySetterHelper(customXmlMoveFromRangeStartArray, CUSTOMXMLMOVEFROMRANGESTART$24);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$24, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGESTART$24, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLMOVEFROMRANGESTART$24);
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
            get_store().remove_element(CUSTOMXMLMOVEFROMRANGESTART$24, i);
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
                { return CTTblImpl.this.getCustomXmlMoveFromRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlMoveFromRangeEndArray(i);
                CTTblImpl.this.setCustomXmlMoveFromRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTTblImpl.this.insertNewCustomXmlMoveFromRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlMoveFromRangeEndArray(i);
                CTTblImpl.this.removeCustomXmlMoveFromRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlMoveFromRangeEndArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGEEND$26, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$26, i);
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
            return get_store().count_elements(CUSTOMXMLMOVEFROMRANGEEND$26);
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
            arraySetterHelper(customXmlMoveFromRangeEndArray, CUSTOMXMLMOVEFROMRANGEEND$26);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$26, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGEEND$26, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLMOVEFROMRANGEEND$26);
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
            get_store().remove_element(CUSTOMXMLMOVEFROMRANGEEND$26, i);
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
                { return CTTblImpl.this.getCustomXmlMoveToRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlMoveToRangeStartArray(i);
                CTTblImpl.this.setCustomXmlMoveToRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTTblImpl.this.insertNewCustomXmlMoveToRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTTblImpl.this.getCustomXmlMoveToRangeStartArray(i);
                CTTblImpl.this.removeCustomXmlMoveToRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlMoveToRangeStartArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLMOVETORANGESTART$28, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$28, i);
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
            return get_store().count_elements(CUSTOMXMLMOVETORANGESTART$28);
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
            arraySetterHelper(customXmlMoveToRangeStartArray, CUSTOMXMLMOVETORANGESTART$28);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$28, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLMOVETORANGESTART$28, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLMOVETORANGESTART$28);
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
            get_store().remove_element(CUSTOMXMLMOVETORANGESTART$28, i);
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
                { return CTTblImpl.this.getCustomXmlMoveToRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlMoveToRangeEndArray(i);
                CTTblImpl.this.setCustomXmlMoveToRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTTblImpl.this.insertNewCustomXmlMoveToRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTTblImpl.this.getCustomXmlMoveToRangeEndArray(i);
                CTTblImpl.this.removeCustomXmlMoveToRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlMoveToRangeEndArray(); }
            
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
            get_store().find_all_element_users(CUSTOMXMLMOVETORANGEEND$30, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$30, i);
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
            return get_store().count_elements(CUSTOMXMLMOVETORANGEEND$30);
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
            arraySetterHelper(customXmlMoveToRangeEndArray, CUSTOMXMLMOVETORANGEEND$30);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$30, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLMOVETORANGEEND$30, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLMOVETORANGEEND$30);
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
            get_store().remove_element(CUSTOMXMLMOVETORANGEEND$30, i);
        }
    }
    
    /**
     * Gets the "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr getTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr)get_store().find_element_user(TBLPR$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblPr" element
     */
    public void setTblPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr tblPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr)get_store().find_element_user(TBLPR$32, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr)get_store().add_element_user(TBLPR$32);
            }
            target.set(tblPr);
        }
    }
    
    /**
     * Appends and returns a new empty "tblPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr addNewTblPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr)get_store().add_element_user(TBLPR$32);
            return target;
        }
    }
    
    /**
     * Gets the "tblGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid getTblGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid)get_store().find_element_user(TBLGRID$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tblGrid" element
     */
    public void setTblGrid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid tblGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid)get_store().find_element_user(TBLGRID$34, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid)get_store().add_element_user(TBLGRID$34);
            }
            target.set(tblGrid);
        }
    }
    
    /**
     * Appends and returns a new empty "tblGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid addNewTblGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid)get_store().add_element_user(TBLGRID$34);
            return target;
        }
    }
    
    /**
     * Gets a List of "tr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow> getTrList()
    {
        final class TrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow get(int i)
                { return CTTblImpl.this.getTrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow old = CTTblImpl.this.getTrArray(i);
                CTTblImpl.this.setTrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow o)
                { CTTblImpl.this.insertNewTr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow old = CTTblImpl.this.getTrArray(i);
                CTTblImpl.this.removeTr(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfTrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TrList();
        }
    }
    
    /**
     * Gets array of all "tr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow[] getTrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TR$36, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow getTrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow)get_store().find_element_user(TR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tr" element
     */
    public int sizeOfTrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TR$36);
        }
    }
    
    /**
     * Sets array of all "tr" element
     */
    public void setTrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow[] trArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(trArray, TR$36);
        }
    }
    
    /**
     * Sets ith "tr" element
     */
    public void setTrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow tr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow)get_store().find_element_user(TR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow insertNewTr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow)get_store().insert_element_user(TR$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow addNewTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow)get_store().add_element_user(TR$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "tr" element
     */
    public void removeTr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TR$36, i);
        }
    }
    
    /**
     * Gets a List of "customXml" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow> getCustomXmlList()
    {
        final class CustomXmlList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow get(int i)
                { return CTTblImpl.this.getCustomXmlArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow old = CTTblImpl.this.getCustomXmlArray(i);
                CTTblImpl.this.setCustomXmlArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow o)
                { CTTblImpl.this.insertNewCustomXml(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow old = CTTblImpl.this.getCustomXmlArray(i);
                CTTblImpl.this.removeCustomXml(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfCustomXmlArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow[] getCustomXmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXML$38, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow getCustomXmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow)get_store().find_element_user(CUSTOMXML$38, i);
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
            return get_store().count_elements(CUSTOMXML$38);
        }
    }
    
    /**
     * Sets array of all "customXml" element
     */
    public void setCustomXmlArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow[] customXmlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlArray, CUSTOMXML$38);
        }
    }
    
    /**
     * Sets ith "customXml" element
     */
    public void setCustomXmlArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow customXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow)get_store().find_element_user(CUSTOMXML$38, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow insertNewCustomXml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow)get_store().insert_element_user(CUSTOMXML$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXml" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow addNewCustomXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCustomXmlRow)get_store().add_element_user(CUSTOMXML$38);
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
            get_store().remove_element(CUSTOMXML$38, i);
        }
    }
    
    /**
     * Gets a List of "sdt" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow> getSdtList()
    {
        final class SdtList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow get(int i)
                { return CTTblImpl.this.getSdtArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow old = CTTblImpl.this.getSdtArray(i);
                CTTblImpl.this.setSdtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow o)
                { CTTblImpl.this.insertNewSdt(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow old = CTTblImpl.this.getSdtArray(i);
                CTTblImpl.this.removeSdt(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfSdtArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow[] getSdtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SDT$40, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sdt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow getSdtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow)get_store().find_element_user(SDT$40, i);
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
            return get_store().count_elements(SDT$40);
        }
    }
    
    /**
     * Sets array of all "sdt" element
     */
    public void setSdtArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow[] sdtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sdtArray, SDT$40);
        }
    }
    
    /**
     * Sets ith "sdt" element
     */
    public void setSdtArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow sdt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow)get_store().find_element_user(SDT$40, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow insertNewSdt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow)get_store().insert_element_user(SDT$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sdt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow addNewSdt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRow)get_store().add_element_user(SDT$40);
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
            get_store().remove_element(SDT$40, i);
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
                { return CTTblImpl.this.getProofErrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr old = CTTblImpl.this.getProofErrArray(i);
                CTTblImpl.this.setProofErrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr o)
                { CTTblImpl.this.insertNewProofErr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr old = CTTblImpl.this.getProofErrArray(i);
                CTTblImpl.this.removeProofErr(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfProofErrArray(); }
            
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
            get_store().find_all_element_users(PROOFERR$42, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().find_element_user(PROOFERR$42, i);
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
            return get_store().count_elements(PROOFERR$42);
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
            arraySetterHelper(proofErrArray, PROOFERR$42);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().find_element_user(PROOFERR$42, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().insert_element_user(PROOFERR$42, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().add_element_user(PROOFERR$42);
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
            get_store().remove_element(PROOFERR$42, i);
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
                { return CTTblImpl.this.getPermStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart old = CTTblImpl.this.getPermStartArray(i);
                CTTblImpl.this.setPermStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart o)
                { CTTblImpl.this.insertNewPermStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart old = CTTblImpl.this.getPermStartArray(i);
                CTTblImpl.this.removePermStart(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfPermStartArray(); }
            
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
            get_store().find_all_element_users(PERMSTART$44, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().find_element_user(PERMSTART$44, i);
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
            return get_store().count_elements(PERMSTART$44);
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
            arraySetterHelper(permStartArray, PERMSTART$44);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().find_element_user(PERMSTART$44, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().insert_element_user(PERMSTART$44, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().add_element_user(PERMSTART$44);
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
            get_store().remove_element(PERMSTART$44, i);
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
                { return CTTblImpl.this.getPermEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm old = CTTblImpl.this.getPermEndArray(i);
                CTTblImpl.this.setPermEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm o)
                { CTTblImpl.this.insertNewPermEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm old = CTTblImpl.this.getPermEndArray(i);
                CTTblImpl.this.removePermEnd(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfPermEndArray(); }
            
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
            get_store().find_all_element_users(PERMEND$46, targetList);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().find_element_user(PERMEND$46, i);
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
            return get_store().count_elements(PERMEND$46);
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
            arraySetterHelper(permEndArray, PERMEND$46);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().find_element_user(PERMEND$46, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().insert_element_user(PERMEND$46, i);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().add_element_user(PERMEND$46);
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
            get_store().remove_element(PERMEND$46, i);
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
                { return CTTblImpl.this.getInsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getInsArray(i);
                CTTblImpl.this.setInsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTTblImpl.this.insertNewIns(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getInsArray(i);
                CTTblImpl.this.removeIns(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfInsArray(); }
            
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
                { return CTTblImpl.this.getDelArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getDelArray(i);
                CTTblImpl.this.setDelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTTblImpl.this.insertNewDel(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getDelArray(i);
                CTTblImpl.this.removeDel(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfDelArray(); }
            
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
                { return CTTblImpl.this.getMoveFromArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getMoveFromArray(i);
                CTTblImpl.this.setMoveFromArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTTblImpl.this.insertNewMoveFrom(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getMoveFromArray(i);
                CTTblImpl.this.removeMoveFrom(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfMoveFromArray(); }
            
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
                { return CTTblImpl.this.getMoveToArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getMoveToArray(i);
                CTTblImpl.this.setMoveToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTTblImpl.this.insertNewMoveTo(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTTblImpl.this.getMoveToArray(i);
                CTTblImpl.this.removeMoveTo(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfMoveToArray(); }
            
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
                { return CTTblImpl.this.getOMathParaArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara old = CTTblImpl.this.getOMathParaArray(i);
                CTTblImpl.this.setOMathParaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara o)
                { CTTblImpl.this.insertNewOMathPara(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara old = CTTblImpl.this.getOMathParaArray(i);
                CTTblImpl.this.removeOMathPara(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfOMathParaArray(); }
            
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
                { return CTTblImpl.this.getOMathArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTTblImpl.this.getOMathArray(i);
                CTTblImpl.this.setOMathArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
                { CTTblImpl.this.insertNewOMath(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTTblImpl.this.getOMathArray(i);
                CTTblImpl.this.removeOMath(i);
                return old;
            }
            
            public int size()
                { return CTTblImpl.this.sizeOfOMathArray(); }
            
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
}
