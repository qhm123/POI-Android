/*
 * XML Type:  CT_AuthorType
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/bibliography
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTAuthorType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.bibliography.impl;
/**
 * An XML CT_AuthorType(@http://schemas.openxmlformats.org/officeDocument/2006/bibliography).
 *
 * This is a complex type.
 */
public class CTAuthorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTAuthorType
{
    
    public CTAuthorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTIST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Artist");
    private static final javax.xml.namespace.QName AUTHOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Author");
    private static final javax.xml.namespace.QName BOOKAUTHOR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "BookAuthor");
    private static final javax.xml.namespace.QName COMPILER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Compiler");
    private static final javax.xml.namespace.QName COMPOSER$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Composer");
    private static final javax.xml.namespace.QName CONDUCTOR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Conductor");
    private static final javax.xml.namespace.QName COUNSEL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Counsel");
    private static final javax.xml.namespace.QName DIRECTOR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Director");
    private static final javax.xml.namespace.QName EDITOR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Editor");
    private static final javax.xml.namespace.QName INTERVIEWEE$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Interviewee");
    private static final javax.xml.namespace.QName INTERVIEWER$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Interviewer");
    private static final javax.xml.namespace.QName INVENTOR$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Inventor");
    private static final javax.xml.namespace.QName PERFORMER$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Performer");
    private static final javax.xml.namespace.QName PRODUCERNAME$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "ProducerName");
    private static final javax.xml.namespace.QName TRANSLATOR$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Translator");
    private static final javax.xml.namespace.QName WRITER$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/bibliography", "Writer");
    
    
    /**
     * Gets a List of "Artist" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getArtistList()
    {
        final class ArtistList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getArtistArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getArtistArray(i);
                CTAuthorTypeImpl.this.setArtistArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewArtist(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getArtistArray(i);
                CTAuthorTypeImpl.this.removeArtist(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfArtistArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ArtistList();
        }
    }
    
    /**
     * Gets array of all "Artist" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getArtistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARTIST$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Artist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getArtistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(ARTIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Artist" element
     */
    public int sizeOfArtistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIST$0);
        }
    }
    
    /**
     * Sets array of all "Artist" element
     */
    public void setArtistArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] artistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(artistArray, ARTIST$0);
        }
    }
    
    /**
     * Sets ith "Artist" element
     */
    public void setArtistArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType artist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(ARTIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(artist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Artist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewArtist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(ARTIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Artist" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewArtist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(ARTIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Artist" element
     */
    public void removeArtist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIST$0, i);
        }
    }
    
    /**
     * Gets a List of "Author" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType> getAuthorList()
    {
        final class AuthorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType get(int i)
                { return CTAuthorTypeImpl.this.getAuthorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType old = CTAuthorTypeImpl.this.getAuthorArray(i);
                CTAuthorTypeImpl.this.setAuthorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType o)
                { CTAuthorTypeImpl.this.insertNewAuthor(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType old = CTAuthorTypeImpl.this.getAuthorArray(i);
                CTAuthorTypeImpl.this.removeAuthor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AuthorList();
        }
    }
    
    /**
     * Gets array of all "Author" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$2, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Author" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().find_element_user(AUTHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$2);
        }
    }
    
    /**
     * Sets array of all "Author" element
     */
    public void setAuthorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[] authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$2);
        }
    }
    
    /**
     * Sets ith "Author" element
     */
    public void setAuthorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().find_element_user(AUTHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Author" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().insert_element_user(AUTHOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Author" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().add_element_user(AUTHOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$2, i);
        }
    }
    
    /**
     * Gets a List of "BookAuthor" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getBookAuthorList()
    {
        final class BookAuthorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getBookAuthorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getBookAuthorArray(i);
                CTAuthorTypeImpl.this.setBookAuthorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewBookAuthor(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getBookAuthorArray(i);
                CTAuthorTypeImpl.this.removeBookAuthor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfBookAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BookAuthorList();
        }
    }
    
    /**
     * Gets array of all "BookAuthor" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getBookAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOKAUTHOR$4, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BookAuthor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getBookAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(BOOKAUTHOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BookAuthor" element
     */
    public int sizeOfBookAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKAUTHOR$4);
        }
    }
    
    /**
     * Sets array of all "BookAuthor" element
     */
    public void setBookAuthorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] bookAuthorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bookAuthorArray, BOOKAUTHOR$4);
        }
    }
    
    /**
     * Sets ith "BookAuthor" element
     */
    public void setBookAuthorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType bookAuthor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(BOOKAUTHOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bookAuthor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BookAuthor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewBookAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(BOOKAUTHOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BookAuthor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewBookAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(BOOKAUTHOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "BookAuthor" element
     */
    public void removeBookAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKAUTHOR$4, i);
        }
    }
    
    /**
     * Gets a List of "Compiler" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getCompilerList()
    {
        final class CompilerList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getCompilerArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getCompilerArray(i);
                CTAuthorTypeImpl.this.setCompilerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewCompiler(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getCompilerArray(i);
                CTAuthorTypeImpl.this.removeCompiler(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfCompilerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CompilerList();
        }
    }
    
    /**
     * Gets array of all "Compiler" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getCompilerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPILER$6, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Compiler" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getCompilerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(COMPILER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Compiler" element
     */
    public int sizeOfCompilerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPILER$6);
        }
    }
    
    /**
     * Sets array of all "Compiler" element
     */
    public void setCompilerArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] compilerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(compilerArray, COMPILER$6);
        }
    }
    
    /**
     * Sets ith "Compiler" element
     */
    public void setCompilerArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType compiler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(COMPILER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(compiler);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Compiler" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewCompiler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(COMPILER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Compiler" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewCompiler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(COMPILER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Compiler" element
     */
    public void removeCompiler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPILER$6, i);
        }
    }
    
    /**
     * Gets a List of "Composer" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getComposerList()
    {
        final class ComposerList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getComposerArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getComposerArray(i);
                CTAuthorTypeImpl.this.setComposerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewComposer(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getComposerArray(i);
                CTAuthorTypeImpl.this.removeComposer(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfComposerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ComposerList();
        }
    }
    
    /**
     * Gets array of all "Composer" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getComposerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPOSER$8, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Composer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getComposerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(COMPOSER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Composer" element
     */
    public int sizeOfComposerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOSER$8);
        }
    }
    
    /**
     * Sets array of all "Composer" element
     */
    public void setComposerArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] composerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(composerArray, COMPOSER$8);
        }
    }
    
    /**
     * Sets ith "Composer" element
     */
    public void setComposerArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType composer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(COMPOSER$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(composer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Composer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewComposer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(COMPOSER$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Composer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewComposer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(COMPOSER$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Composer" element
     */
    public void removeComposer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOSER$8, i);
        }
    }
    
    /**
     * Gets a List of "Conductor" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getConductorList()
    {
        final class ConductorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getConductorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getConductorArray(i);
                CTAuthorTypeImpl.this.setConductorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewConductor(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getConductorArray(i);
                CTAuthorTypeImpl.this.removeConductor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfConductorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConductorList();
        }
    }
    
    /**
     * Gets array of all "Conductor" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getConductorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDUCTOR$10, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Conductor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getConductorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(CONDUCTOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Conductor" element
     */
    public int sizeOfConductorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDUCTOR$10);
        }
    }
    
    /**
     * Sets array of all "Conductor" element
     */
    public void setConductorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] conductorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conductorArray, CONDUCTOR$10);
        }
    }
    
    /**
     * Sets ith "Conductor" element
     */
    public void setConductorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType conductor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(CONDUCTOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conductor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Conductor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewConductor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(CONDUCTOR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Conductor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewConductor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(CONDUCTOR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Conductor" element
     */
    public void removeConductor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDUCTOR$10, i);
        }
    }
    
    /**
     * Gets a List of "Counsel" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getCounselList()
    {
        final class CounselList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getCounselArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getCounselArray(i);
                CTAuthorTypeImpl.this.setCounselArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewCounsel(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getCounselArray(i);
                CTAuthorTypeImpl.this.removeCounsel(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfCounselArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CounselList();
        }
    }
    
    /**
     * Gets array of all "Counsel" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getCounselArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNSEL$12, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Counsel" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getCounselArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(COUNSEL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Counsel" element
     */
    public int sizeOfCounselArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNSEL$12);
        }
    }
    
    /**
     * Sets array of all "Counsel" element
     */
    public void setCounselArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] counselArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(counselArray, COUNSEL$12);
        }
    }
    
    /**
     * Sets ith "Counsel" element
     */
    public void setCounselArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType counsel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(COUNSEL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(counsel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Counsel" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewCounsel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(COUNSEL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Counsel" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewCounsel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(COUNSEL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Counsel" element
     */
    public void removeCounsel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNSEL$12, i);
        }
    }
    
    /**
     * Gets a List of "Director" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getDirectorList()
    {
        final class DirectorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getDirectorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getDirectorArray(i);
                CTAuthorTypeImpl.this.setDirectorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewDirector(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getDirectorArray(i);
                CTAuthorTypeImpl.this.removeDirector(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfDirectorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DirectorList();
        }
    }
    
    /**
     * Gets array of all "Director" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getDirectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTOR$14, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Director" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getDirectorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(DIRECTOR$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Director" element
     */
    public int sizeOfDirectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTOR$14);
        }
    }
    
    /**
     * Sets array of all "Director" element
     */
    public void setDirectorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] directorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(directorArray, DIRECTOR$14);
        }
    }
    
    /**
     * Sets ith "Director" element
     */
    public void setDirectorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType director)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(DIRECTOR$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(director);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Director" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewDirector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(DIRECTOR$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Director" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewDirector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(DIRECTOR$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Director" element
     */
    public void removeDirector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTOR$14, i);
        }
    }
    
    /**
     * Gets a List of "Editor" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getEditorList()
    {
        final class EditorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getEditorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getEditorArray(i);
                CTAuthorTypeImpl.this.setEditorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewEditor(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getEditorArray(i);
                CTAuthorTypeImpl.this.removeEditor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfEditorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EditorList();
        }
    }
    
    /**
     * Gets array of all "Editor" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getEditorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EDITOR$16, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Editor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getEditorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(EDITOR$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Editor" element
     */
    public int sizeOfEditorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDITOR$16);
        }
    }
    
    /**
     * Sets array of all "Editor" element
     */
    public void setEditorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] editorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(editorArray, EDITOR$16);
        }
    }
    
    /**
     * Sets ith "Editor" element
     */
    public void setEditorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType editor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(EDITOR$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(editor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Editor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewEditor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(EDITOR$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Editor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(EDITOR$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Editor" element
     */
    public void removeEditor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDITOR$16, i);
        }
    }
    
    /**
     * Gets a List of "Interviewee" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getIntervieweeList()
    {
        final class IntervieweeList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getIntervieweeArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getIntervieweeArray(i);
                CTAuthorTypeImpl.this.setIntervieweeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewInterviewee(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getIntervieweeArray(i);
                CTAuthorTypeImpl.this.removeInterviewee(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfIntervieweeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IntervieweeList();
        }
    }
    
    /**
     * Gets array of all "Interviewee" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getIntervieweeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERVIEWEE$18, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Interviewee" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getIntervieweeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(INTERVIEWEE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Interviewee" element
     */
    public int sizeOfIntervieweeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVIEWEE$18);
        }
    }
    
    /**
     * Sets array of all "Interviewee" element
     */
    public void setIntervieweeArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] intervieweeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(intervieweeArray, INTERVIEWEE$18);
        }
    }
    
    /**
     * Sets ith "Interviewee" element
     */
    public void setIntervieweeArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType interviewee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(INTERVIEWEE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interviewee);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Interviewee" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewInterviewee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(INTERVIEWEE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Interviewee" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewInterviewee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(INTERVIEWEE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Interviewee" element
     */
    public void removeInterviewee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVIEWEE$18, i);
        }
    }
    
    /**
     * Gets a List of "Interviewer" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getInterviewerList()
    {
        final class InterviewerList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getInterviewerArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getInterviewerArray(i);
                CTAuthorTypeImpl.this.setInterviewerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewInterviewer(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getInterviewerArray(i);
                CTAuthorTypeImpl.this.removeInterviewer(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfInterviewerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InterviewerList();
        }
    }
    
    /**
     * Gets array of all "Interviewer" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getInterviewerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERVIEWER$20, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Interviewer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getInterviewerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(INTERVIEWER$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Interviewer" element
     */
    public int sizeOfInterviewerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVIEWER$20);
        }
    }
    
    /**
     * Sets array of all "Interviewer" element
     */
    public void setInterviewerArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] interviewerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interviewerArray, INTERVIEWER$20);
        }
    }
    
    /**
     * Sets ith "Interviewer" element
     */
    public void setInterviewerArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType interviewer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(INTERVIEWER$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interviewer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Interviewer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewInterviewer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(INTERVIEWER$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Interviewer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewInterviewer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(INTERVIEWER$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "Interviewer" element
     */
    public void removeInterviewer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVIEWER$20, i);
        }
    }
    
    /**
     * Gets a List of "Inventor" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getInventorList()
    {
        final class InventorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getInventorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getInventorArray(i);
                CTAuthorTypeImpl.this.setInventorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewInventor(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getInventorArray(i);
                CTAuthorTypeImpl.this.removeInventor(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfInventorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InventorList();
        }
    }
    
    /**
     * Gets array of all "Inventor" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getInventorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INVENTOR$22, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Inventor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getInventorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(INVENTOR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Inventor" element
     */
    public int sizeOfInventorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVENTOR$22);
        }
    }
    
    /**
     * Sets array of all "Inventor" element
     */
    public void setInventorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] inventorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inventorArray, INVENTOR$22);
        }
    }
    
    /**
     * Sets ith "Inventor" element
     */
    public void setInventorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType inventor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(INVENTOR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inventor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Inventor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewInventor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(INVENTOR$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Inventor" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewInventor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(INVENTOR$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "Inventor" element
     */
    public void removeInventor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVENTOR$22, i);
        }
    }
    
    /**
     * Gets a List of "Performer" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType> getPerformerList()
    {
        final class PerformerList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType get(int i)
                { return CTAuthorTypeImpl.this.getPerformerArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType old = CTAuthorTypeImpl.this.getPerformerArray(i);
                CTAuthorTypeImpl.this.setPerformerArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType o)
                { CTAuthorTypeImpl.this.insertNewPerformer(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType old = CTAuthorTypeImpl.this.getPerformerArray(i);
                CTAuthorTypeImpl.this.removePerformer(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfPerformerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PerformerList();
        }
    }
    
    /**
     * Gets array of all "Performer" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$24, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Performer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().find_element_user(PERFORMER$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Performer" element
     */
    public int sizeOfPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$24);
        }
    }
    
    /**
     * Sets array of all "Performer" element
     */
    public void setPerformerArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType[] performerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(performerArray, PERFORMER$24);
        }
    }
    
    /**
     * Sets ith "Performer" element
     */
    public void setPerformerArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().find_element_user(PERFORMER$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(performer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Performer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().insert_element_user(PERFORMER$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Performer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameOrCorporateType)get_store().add_element_user(PERFORMER$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "Performer" element
     */
    public void removePerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$24, i);
        }
    }
    
    /**
     * Gets a List of "ProducerName" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getProducerNameList()
    {
        final class ProducerNameList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getProducerNameArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getProducerNameArray(i);
                CTAuthorTypeImpl.this.setProducerNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewProducerName(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getProducerNameArray(i);
                CTAuthorTypeImpl.this.removeProducerName(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfProducerNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProducerNameList();
        }
    }
    
    /**
     * Gets array of all "ProducerName" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getProducerNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCERNAME$26, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProducerName" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getProducerNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(PRODUCERNAME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProducerName" element
     */
    public int sizeOfProducerNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCERNAME$26);
        }
    }
    
    /**
     * Sets array of all "ProducerName" element
     */
    public void setProducerNameArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] producerNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(producerNameArray, PRODUCERNAME$26);
        }
    }
    
    /**
     * Sets ith "ProducerName" element
     */
    public void setProducerNameArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType producerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(PRODUCERNAME$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(producerName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProducerName" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewProducerName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(PRODUCERNAME$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProducerName" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewProducerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(PRODUCERNAME$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProducerName" element
     */
    public void removeProducerName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCERNAME$26, i);
        }
    }
    
    /**
     * Gets a List of "Translator" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getTranslatorList()
    {
        final class TranslatorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getTranslatorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getTranslatorArray(i);
                CTAuthorTypeImpl.this.setTranslatorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewTranslator(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getTranslatorArray(i);
                CTAuthorTypeImpl.this.removeTranslator(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfTranslatorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TranslatorList();
        }
    }
    
    /**
     * Gets array of all "Translator" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getTranslatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSLATOR$28, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Translator" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getTranslatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(TRANSLATOR$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Translator" element
     */
    public int sizeOfTranslatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSLATOR$28);
        }
    }
    
    /**
     * Sets array of all "Translator" element
     */
    public void setTranslatorArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] translatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(translatorArray, TRANSLATOR$28);
        }
    }
    
    /**
     * Sets ith "Translator" element
     */
    public void setTranslatorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType translator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(TRANSLATOR$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(translator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Translator" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewTranslator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(TRANSLATOR$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Translator" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewTranslator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(TRANSLATOR$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "Translator" element
     */
    public void removeTranslator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSLATOR$28, i);
        }
    }
    
    /**
     * Gets a List of "Writer" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType> getWriterList()
    {
        final class WriterList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType get(int i)
                { return CTAuthorTypeImpl.this.getWriterArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType set(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getWriterArray(i);
                CTAuthorTypeImpl.this.setWriterArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType o)
                { CTAuthorTypeImpl.this.insertNewWriter(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType old = CTAuthorTypeImpl.this.getWriterArray(i);
                CTAuthorTypeImpl.this.removeWriter(i);
                return old;
            }
            
            public int size()
                { return CTAuthorTypeImpl.this.sizeOfWriterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WriterList();
        }
    }
    
    /**
     * Gets array of all "Writer" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] getWriterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WRITER$30, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] result = new org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Writer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType getWriterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(WRITER$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Writer" element
     */
    public int sizeOfWriterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRITER$30);
        }
    }
    
    /**
     * Sets array of all "Writer" element
     */
    public void setWriterArray(org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType[] writerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(writerArray, WRITER$30);
        }
    }
    
    /**
     * Sets ith "Writer" element
     */
    public void setWriterArray(int i, org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType writer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().find_element_user(WRITER$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(writer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Writer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType insertNewWriter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().insert_element_user(WRITER$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Writer" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType addNewWriter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.bibliography.CTNameType)get_store().add_element_user(WRITER$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "Writer" element
     */
    public void removeWriter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRITER$30, i);
        }
    }
}
