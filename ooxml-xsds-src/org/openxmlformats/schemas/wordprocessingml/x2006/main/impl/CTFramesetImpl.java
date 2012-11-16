/*
 * XML Type:  CT_Frameset
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Frameset(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFramesetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset
{
    
    public CTFramesetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SZ$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sz");
    private static final javax.xml.namespace.QName FRAMESETSPLITBAR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "framesetSplitbar");
    private static final javax.xml.namespace.QName FRAMELAYOUT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "frameLayout");
    private static final javax.xml.namespace.QName FRAMESET$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "frameset");
    private static final javax.xml.namespace.QName FRAME$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "frame");
    
    
    /**
     * Gets the "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(SZ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sz" element
     */
    public boolean isSetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SZ$0) != 0;
        }
    }
    
    /**
     * Sets the "sz" element
     */
    public void setSz(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(SZ$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(SZ$0);
            }
            target.set(sz);
        }
    }
    
    /**
     * Appends and returns a new empty "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(SZ$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sz" element
     */
    public void unsetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SZ$0, 0);
        }
    }
    
    /**
     * Gets the "framesetSplitbar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar getFramesetSplitbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar)get_store().find_element_user(FRAMESETSPLITBAR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "framesetSplitbar" element
     */
    public boolean isSetFramesetSplitbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMESETSPLITBAR$2) != 0;
        }
    }
    
    /**
     * Sets the "framesetSplitbar" element
     */
    public void setFramesetSplitbar(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar framesetSplitbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar)get_store().find_element_user(FRAMESETSPLITBAR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar)get_store().add_element_user(FRAMESETSPLITBAR$2);
            }
            target.set(framesetSplitbar);
        }
    }
    
    /**
     * Appends and returns a new empty "framesetSplitbar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar addNewFramesetSplitbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramesetSplitbar)get_store().add_element_user(FRAMESETSPLITBAR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "framesetSplitbar" element
     */
    public void unsetFramesetSplitbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMESETSPLITBAR$2, 0);
        }
    }
    
    /**
     * Gets the "frameLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout getFrameLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout)get_store().find_element_user(FRAMELAYOUT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "frameLayout" element
     */
    public boolean isSetFrameLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMELAYOUT$4) != 0;
        }
    }
    
    /**
     * Sets the "frameLayout" element
     */
    public void setFrameLayout(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout frameLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout)get_store().find_element_user(FRAMELAYOUT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout)get_store().add_element_user(FRAMELAYOUT$4);
            }
            target.set(frameLayout);
        }
    }
    
    /**
     * Appends and returns a new empty "frameLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout addNewFrameLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameLayout)get_store().add_element_user(FRAMELAYOUT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "frameLayout" element
     */
    public void unsetFrameLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMELAYOUT$4, 0);
        }
    }
    
    /**
     * Gets a List of "frameset" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset> getFramesetList()
    {
        final class FramesetList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset get(int i)
                { return CTFramesetImpl.this.getFramesetArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset old = CTFramesetImpl.this.getFramesetArray(i);
                CTFramesetImpl.this.setFramesetArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset o)
                { CTFramesetImpl.this.insertNewFrameset(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset old = CTFramesetImpl.this.getFramesetArray(i);
                CTFramesetImpl.this.removeFrameset(i);
                return old;
            }
            
            public int size()
                { return CTFramesetImpl.this.sizeOfFramesetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FramesetList();
        }
    }
    
    /**
     * Gets array of all "frameset" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset[] getFramesetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FRAMESET$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "frameset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset getFramesetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().find_element_user(FRAMESET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "frameset" element
     */
    public int sizeOfFramesetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMESET$6);
        }
    }
    
    /**
     * Sets array of all "frameset" element
     */
    public void setFramesetArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset[] framesetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(framesetArray, FRAMESET$6);
        }
    }
    
    /**
     * Sets ith "frameset" element
     */
    public void setFramesetArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset frameset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().find_element_user(FRAMESET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(frameset);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "frameset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset insertNewFrameset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().insert_element_user(FRAMESET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "frameset" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset addNewFrameset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameset)get_store().add_element_user(FRAMESET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "frameset" element
     */
    public void removeFrameset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMESET$6, i);
        }
    }
    
    /**
     * Gets a List of "frame" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame> getFrameList()
    {
        final class FrameList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame get(int i)
                { return CTFramesetImpl.this.getFrameArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame old = CTFramesetImpl.this.getFrameArray(i);
                CTFramesetImpl.this.setFrameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame o)
                { CTFramesetImpl.this.insertNewFrame(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame old = CTFramesetImpl.this.getFrameArray(i);
                CTFramesetImpl.this.removeFrame(i);
                return old;
            }
            
            public int size()
                { return CTFramesetImpl.this.sizeOfFrameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FrameList();
        }
    }
    
    /**
     * Gets array of all "frame" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame[] getFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FRAME$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "frame" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame getFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame)get_store().find_element_user(FRAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "frame" element
     */
    public int sizeOfFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAME$8);
        }
    }
    
    /**
     * Sets array of all "frame" element
     */
    public void setFrameArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame[] frameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(frameArray, FRAME$8);
        }
    }
    
    /**
     * Sets ith "frame" element
     */
    public void setFrameArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame)get_store().find_element_user(FRAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(frame);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "frame" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame insertNewFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame)get_store().insert_element_user(FRAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "frame" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame addNewFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame)get_store().add_element_user(FRAME$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "frame" element
     */
    public void removeFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAME$8, i);
        }
    }
}
