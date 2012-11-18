/*
 * XML Type:  CT_TimeNodeList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TimeNodeList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTimeNodeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTimeNodeList
{
    
    public CTTimeNodeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "par");
    private static final javax.xml.namespace.QName SEQ$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "seq");
    private static final javax.xml.namespace.QName EXCL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "excl");
    private static final javax.xml.namespace.QName ANIM$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "anim");
    private static final javax.xml.namespace.QName ANIMCLR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "animClr");
    private static final javax.xml.namespace.QName ANIMEFFECT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "animEffect");
    private static final javax.xml.namespace.QName ANIMMOTION$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "animMotion");
    private static final javax.xml.namespace.QName ANIMROT$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "animRot");
    private static final javax.xml.namespace.QName ANIMSCALE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "animScale");
    private static final javax.xml.namespace.QName CMD$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmd");
    private static final javax.xml.namespace.QName SET$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "set");
    private static final javax.xml.namespace.QName AUDIO$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "audio");
    private static final javax.xml.namespace.QName VIDEO$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "video");
    
    
//    /**
//     * Gets a List of "par" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel> getParList()
//    {
//        final class ParList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel get(int i)
//                { return CTTimeNodeListImpl.this.getParArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel old = CTTimeNodeListImpl.this.getParArray(i);
//                CTTimeNodeListImpl.this.setParArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel o)
//                { CTTimeNodeListImpl.this.insertNewPar(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel old = CTTimeNodeListImpl.this.getParArray(i);
//                CTTimeNodeListImpl.this.removePar(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfParArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new ParList();
//        }
//    }
//    
//    /**
//     * Gets array of all "par" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel[] getParArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(PAR$0, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "par" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel getParArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel)get_store().find_element_user(PAR$0, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "par" element
     */
    public int sizeOfParArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAR$0);
        }
    }
//    
//    /**
//     * Sets array of all "par" element
//     */
//    public void setParArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel[] parArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(parArray, PAR$0);
//        }
//    }
//    
//    /**
//     * Sets ith "par" element
//     */
//    public void setParArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel par)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel)get_store().find_element_user(PAR$0, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(par);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "par" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel insertNewPar(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel)get_store().insert_element_user(PAR$0, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "par" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel addNewPar()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeParallel)get_store().add_element_user(PAR$0);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "par" element
     */
    public void removePar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAR$0, i);
        }
    }
    
//    /**
//     * Gets a List of "seq" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence> getSeqList()
//    {
//        final class SeqList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence get(int i)
//                { return CTTimeNodeListImpl.this.getSeqArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence old = CTTimeNodeListImpl.this.getSeqArray(i);
//                CTTimeNodeListImpl.this.setSeqArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence o)
//                { CTTimeNodeListImpl.this.insertNewSeq(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence old = CTTimeNodeListImpl.this.getSeqArray(i);
//                CTTimeNodeListImpl.this.removeSeq(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfSeqArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new SeqList();
//        }
//    }
//    
//    /**
//     * Gets array of all "seq" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence[] getSeqArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(SEQ$2, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "seq" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence getSeqArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence)get_store().find_element_user(SEQ$2, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "seq" element
     */
    public int sizeOfSeqArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQ$2);
        }
    }
    
//    /**
//     * Sets array of all "seq" element
//     */
//    public void setSeqArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence[] seqArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(seqArray, SEQ$2);
//        }
//    }
//    
//    /**
//     * Sets ith "seq" element
//     */
//    public void setSeqArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence seq)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence)get_store().find_element_user(SEQ$2, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(seq);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "seq" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence insertNewSeq(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence)get_store().insert_element_user(SEQ$2, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "seq" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence addNewSeq()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeSequence)get_store().add_element_user(SEQ$2);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "seq" element
     */
    public void removeSeq(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQ$2, i);
        }
    }
    
//    /**
//     * Gets a List of "excl" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive> getExclList()
//    {
//        final class ExclList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive get(int i)
//                { return CTTimeNodeListImpl.this.getExclArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive old = CTTimeNodeListImpl.this.getExclArray(i);
//                CTTimeNodeListImpl.this.setExclArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive o)
//                { CTTimeNodeListImpl.this.insertNewExcl(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive old = CTTimeNodeListImpl.this.getExclArray(i);
//                CTTimeNodeListImpl.this.removeExcl(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfExclArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new ExclList();
//        }
//    }
//    
//    /**
//     * Gets array of all "excl" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive[] getExclArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(EXCL$4, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "excl" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive getExclArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive)get_store().find_element_user(EXCL$4, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "excl" element
     */
    public int sizeOfExclArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCL$4);
        }
    }
    
//    /**
//     * Sets array of all "excl" element
//     */
//    public void setExclArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive[] exclArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(exclArray, EXCL$4);
//        }
//    }
//    
//    /**
//     * Sets ith "excl" element
//     */
//    public void setExclArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive excl)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive)get_store().find_element_user(EXCL$4, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(excl);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "excl" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive insertNewExcl(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive)get_store().insert_element_user(EXCL$4, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "excl" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive addNewExcl()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive)get_store().add_element_user(EXCL$4);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "excl" element
     */
    public void removeExcl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCL$4, i);
        }
    }
    
//    /**
//     * Gets a List of "anim" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior> getAnimList()
//    {
//        final class AnimList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getAnimArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior old = CTTimeNodeListImpl.this.getAnimArray(i);
//                CTTimeNodeListImpl.this.setAnimArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior o)
//                { CTTimeNodeListImpl.this.insertNewAnim(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior old = CTTimeNodeListImpl.this.getAnimArray(i);
//                CTTimeNodeListImpl.this.removeAnim(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAnimArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AnimList();
//        }
//    }
//    
//    /**
//     * Gets array of all "anim" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior[] getAnimArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(ANIM$6, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "anim" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior getAnimArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior)get_store().find_element_user(ANIM$6, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "anim" element
     */
    public int sizeOfAnimArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIM$6);
        }
    }
    
//    /**
//     * Sets array of all "anim" element
//     */
//    public void setAnimArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior[] animArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(animArray, ANIM$6);
//        }
//    }
//    
//    /**
//     * Sets ith "anim" element
//     */
//    public void setAnimArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior anim)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior)get_store().find_element_user(ANIM$6, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(anim);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "anim" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior insertNewAnim(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior)get_store().insert_element_user(ANIM$6, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "anim" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior addNewAnim()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateBehavior)get_store().add_element_user(ANIM$6);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "anim" element
     */
    public void removeAnim(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIM$6, i);
        }
    }
    
//    /**
//     * Gets a List of "animClr" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior> getAnimClrList()
//    {
//        final class AnimClrList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getAnimClrArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior old = CTTimeNodeListImpl.this.getAnimClrArray(i);
//                CTTimeNodeListImpl.this.setAnimClrArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior o)
//                { CTTimeNodeListImpl.this.insertNewAnimClr(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior old = CTTimeNodeListImpl.this.getAnimClrArray(i);
//                CTTimeNodeListImpl.this.removeAnimClr(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAnimClrArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AnimClrList();
//        }
//    }
//    
//    /**
//     * Gets array of all "animClr" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior[] getAnimClrArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(ANIMCLR$8, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "animClr" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior getAnimClrArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior)get_store().find_element_user(ANIMCLR$8, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "animClr" element
     */
    public int sizeOfAnimClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMCLR$8);
        }
    }
    
//    /**
//     * Sets array of all "animClr" element
//     */
//    public void setAnimClrArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior[] animClrArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(animClrArray, ANIMCLR$8);
//        }
//    }
//    
//    /**
//     * Sets ith "animClr" element
//     */
//    public void setAnimClrArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior animClr)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior)get_store().find_element_user(ANIMCLR$8, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(animClr);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "animClr" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior insertNewAnimClr(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior)get_store().insert_element_user(ANIMCLR$8, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "animClr" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior addNewAnimClr()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateColorBehavior)get_store().add_element_user(ANIMCLR$8);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "animClr" element
     */
    public void removeAnimClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMCLR$8, i);
        }
    }
    
//    /**
//     * Gets a List of "animEffect" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior> getAnimEffectList()
//    {
//        final class AnimEffectList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getAnimEffectArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior old = CTTimeNodeListImpl.this.getAnimEffectArray(i);
//                CTTimeNodeListImpl.this.setAnimEffectArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior o)
//                { CTTimeNodeListImpl.this.insertNewAnimEffect(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior old = CTTimeNodeListImpl.this.getAnimEffectArray(i);
//                CTTimeNodeListImpl.this.removeAnimEffect(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAnimEffectArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AnimEffectList();
//        }
//    }
//    
//    /**
//     * Gets array of all "animEffect" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior[] getAnimEffectArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(ANIMEFFECT$10, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "animEffect" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior getAnimEffectArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior)get_store().find_element_user(ANIMEFFECT$10, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "animEffect" element
     */
    public int sizeOfAnimEffectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMEFFECT$10);
        }
    }
    
//    /**
//     * Sets array of all "animEffect" element
//     */
//    public void setAnimEffectArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior[] animEffectArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(animEffectArray, ANIMEFFECT$10);
//        }
//    }
//    
//    /**
//     * Sets ith "animEffect" element
//     */
//    public void setAnimEffectArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior animEffect)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior)get_store().find_element_user(ANIMEFFECT$10, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(animEffect);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "animEffect" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior insertNewAnimEffect(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior)get_store().insert_element_user(ANIMEFFECT$10, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "animEffect" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior addNewAnimEffect()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateEffectBehavior)get_store().add_element_user(ANIMEFFECT$10);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "animEffect" element
     */
    public void removeAnimEffect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMEFFECT$10, i);
        }
    }
    
//    /**
//     * Gets a List of "animMotion" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior> getAnimMotionList()
//    {
//        final class AnimMotionList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getAnimMotionArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior old = CTTimeNodeListImpl.this.getAnimMotionArray(i);
//                CTTimeNodeListImpl.this.setAnimMotionArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior o)
//                { CTTimeNodeListImpl.this.insertNewAnimMotion(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior old = CTTimeNodeListImpl.this.getAnimMotionArray(i);
//                CTTimeNodeListImpl.this.removeAnimMotion(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAnimMotionArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AnimMotionList();
//        }
//    }
//    
//    /**
//     * Gets array of all "animMotion" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior[] getAnimMotionArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(ANIMMOTION$12, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "animMotion" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior getAnimMotionArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior)get_store().find_element_user(ANIMMOTION$12, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "animMotion" element
     */
    public int sizeOfAnimMotionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMMOTION$12);
        }
    }
    
//    /**
//     * Sets array of all "animMotion" element
//     */
//    public void setAnimMotionArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior[] animMotionArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(animMotionArray, ANIMMOTION$12);
//        }
//    }
//    
//    /**
//     * Sets ith "animMotion" element
//     */
//    public void setAnimMotionArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior animMotion)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior)get_store().find_element_user(ANIMMOTION$12, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(animMotion);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "animMotion" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior insertNewAnimMotion(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior)get_store().insert_element_user(ANIMMOTION$12, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "animMotion" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior addNewAnimMotion()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateMotionBehavior)get_store().add_element_user(ANIMMOTION$12);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "animMotion" element
     */
    public void removeAnimMotion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMMOTION$12, i);
        }
    }
    
//    /**
//     * Gets a List of "animRot" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior> getAnimRotList()
//    {
//        final class AnimRotList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getAnimRotArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior old = CTTimeNodeListImpl.this.getAnimRotArray(i);
//                CTTimeNodeListImpl.this.setAnimRotArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior o)
//                { CTTimeNodeListImpl.this.insertNewAnimRot(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior old = CTTimeNodeListImpl.this.getAnimRotArray(i);
//                CTTimeNodeListImpl.this.removeAnimRot(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAnimRotArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AnimRotList();
//        }
//    }
//    
//    /**
//     * Gets array of all "animRot" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior[] getAnimRotArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(ANIMROT$14, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "animRot" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior getAnimRotArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior)get_store().find_element_user(ANIMROT$14, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "animRot" element
     */
    public int sizeOfAnimRotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMROT$14);
        }
    }
    
//    /**
//     * Sets array of all "animRot" element
//     */
//    public void setAnimRotArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior[] animRotArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(animRotArray, ANIMROT$14);
//        }
//    }
//    
//    /**
//     * Sets ith "animRot" element
//     */
//    public void setAnimRotArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior animRot)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior)get_store().find_element_user(ANIMROT$14, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(animRot);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "animRot" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior insertNewAnimRot(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior)get_store().insert_element_user(ANIMROT$14, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "animRot" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior addNewAnimRot()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateRotationBehavior)get_store().add_element_user(ANIMROT$14);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "animRot" element
     */
    public void removeAnimRot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMROT$14, i);
        }
    }
    
//    /**
//     * Gets a List of "animScale" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior> getAnimScaleList()
//    {
//        final class AnimScaleList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getAnimScaleArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior old = CTTimeNodeListImpl.this.getAnimScaleArray(i);
//                CTTimeNodeListImpl.this.setAnimScaleArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior o)
//                { CTTimeNodeListImpl.this.insertNewAnimScale(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior old = CTTimeNodeListImpl.this.getAnimScaleArray(i);
//                CTTimeNodeListImpl.this.removeAnimScale(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAnimScaleArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AnimScaleList();
//        }
//    }
//    
//    /**
//     * Gets array of all "animScale" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior[] getAnimScaleArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(ANIMSCALE$16, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "animScale" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior getAnimScaleArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior)get_store().find_element_user(ANIMSCALE$16, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "animScale" element
     */
    public int sizeOfAnimScaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMSCALE$16);
        }
    }
    
//    /**
//     * Sets array of all "animScale" element
//     */
//    public void setAnimScaleArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior[] animScaleArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(animScaleArray, ANIMSCALE$16);
//        }
//    }
//    
//    /**
//     * Sets ith "animScale" element
//     */
//    public void setAnimScaleArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior animScale)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior)get_store().find_element_user(ANIMSCALE$16, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(animScale);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "animScale" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior insertNewAnimScale(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior)get_store().insert_element_user(ANIMSCALE$16, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "animScale" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior addNewAnimScale()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimateScaleBehavior)get_store().add_element_user(ANIMSCALE$16);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "animScale" element
     */
    public void removeAnimScale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMSCALE$16, i);
        }
    }
    
//    /**
//     * Gets a List of "cmd" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior> getCmdList()
//    {
//        final class CmdList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getCmdArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior old = CTTimeNodeListImpl.this.getCmdArray(i);
//                CTTimeNodeListImpl.this.setCmdArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior o)
//                { CTTimeNodeListImpl.this.insertNewCmd(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior old = CTTimeNodeListImpl.this.getCmdArray(i);
//                CTTimeNodeListImpl.this.removeCmd(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfCmdArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new CmdList();
//        }
//    }
//    
//    /**
//     * Gets array of all "cmd" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior[] getCmdArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(CMD$18, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "cmd" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior getCmdArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior)get_store().find_element_user(CMD$18, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "cmd" element
     */
    public int sizeOfCmdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CMD$18);
        }
    }
    
//    /**
//     * Sets array of all "cmd" element
//     */
//    public void setCmdArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior[] cmdArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(cmdArray, CMD$18);
//        }
//    }
//    
//    /**
//     * Sets ith "cmd" element
//     */
//    public void setCmdArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior cmd)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior)get_store().find_element_user(CMD$18, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(cmd);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "cmd" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior insertNewCmd(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior)get_store().insert_element_user(CMD$18, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "cmd" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior addNewCmd()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommandBehavior)get_store().add_element_user(CMD$18);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "cmd" element
     */
    public void removeCmd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CMD$18, i);
        }
    }
    
//    /**
//     * Gets a List of "set" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior> getSetList()
//    {
//        final class SetList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior get(int i)
//                { return CTTimeNodeListImpl.this.getSetArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior old = CTTimeNodeListImpl.this.getSetArray(i);
//                CTTimeNodeListImpl.this.setSetArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior o)
//                { CTTimeNodeListImpl.this.insertNewSet(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior old = CTTimeNodeListImpl.this.getSetArray(i);
//                CTTimeNodeListImpl.this.removeSet(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfSetArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new SetList();
//        }
//    }
//    
//    /**
//     * Gets array of all "set" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior[] getSetArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(SET$20, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "set" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior getSetArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior)get_store().find_element_user(SET$20, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "set" element
     */
    public int sizeOfSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SET$20);
        }
    }
    
//    /**
//     * Sets array of all "set" element
//     */
//    public void setSetArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior[] setArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(setArray, SET$20);
//        }
//    }
//    
//    /**
//     * Sets ith "set" element
//     */
//    public void setSetArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior set)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior)get_store().find_element_user(SET$20, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(set);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "set" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior insertNewSet(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior)get_store().insert_element_user(SET$20, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "set" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior addNewSet()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLSetBehavior)get_store().add_element_user(SET$20);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "set" element
     */
    public void removeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SET$20, i);
        }
    }
    
//    /**
//     * Gets a List of "audio" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio> getAudioList()
//    {
//        final class AudioList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio get(int i)
//                { return CTTimeNodeListImpl.this.getAudioArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio old = CTTimeNodeListImpl.this.getAudioArray(i);
//                CTTimeNodeListImpl.this.setAudioArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio o)
//                { CTTimeNodeListImpl.this.insertNewAudio(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio old = CTTimeNodeListImpl.this.getAudioArray(i);
//                CTTimeNodeListImpl.this.removeAudio(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfAudioArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new AudioList();
//        }
//    }
//    
//    /**
//     * Gets array of all "audio" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio[] getAudioArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(AUDIO$22, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "audio" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio getAudioArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio)get_store().find_element_user(AUDIO$22, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "audio" element
     */
    public int sizeOfAudioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDIO$22);
        }
    }
    
//    /**
//     * Sets array of all "audio" element
//     */
//    public void setAudioArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio[] audioArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(audioArray, AUDIO$22);
//        }
//    }
//    
//    /**
//     * Sets ith "audio" element
//     */
//    public void setAudioArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio audio)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio)get_store().find_element_user(AUDIO$22, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(audio);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "audio" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio insertNewAudio(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio)get_store().insert_element_user(AUDIO$22, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "audio" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio addNewAudio()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio)get_store().add_element_user(AUDIO$22);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "audio" element
     */
    public void removeAudio(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDIO$22, i);
        }
    }
    
//    /**
//     * Gets a List of "video" elements
//     */
//    public java.util.List<org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo> getVideoList()
//    {
//        final class VideoList extends java.util.AbstractList<org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo>
//        {
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo get(int i)
//                { return CTTimeNodeListImpl.this.getVideoArray(i); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo set(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo o)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo old = CTTimeNodeListImpl.this.getVideoArray(i);
//                CTTimeNodeListImpl.this.setVideoArray(i, o);
//                return old;
//            }
//            
//            public void add(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo o)
//                { CTTimeNodeListImpl.this.insertNewVideo(i).set(o); }
//            
//            public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo remove(int i)
//            {
//                org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo old = CTTimeNodeListImpl.this.getVideoArray(i);
//                CTTimeNodeListImpl.this.removeVideo(i);
//                return old;
//            }
//            
//            public int size()
//                { return CTTimeNodeListImpl.this.sizeOfVideoArray(); }
//            
//        }
//        
//        synchronized (monitor())
//        {
//            check_orphaned();
//            return new VideoList();
//        }
//    }
//    
//    /**
//     * Gets array of all "video" elements
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo[] getVideoArray()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            java.util.List targetList = new java.util.ArrayList();
//            get_store().find_all_element_users(VIDEO$24, targetList);
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo[] result = new org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo[targetList.size()];
//            targetList.toArray(result);
//            return result;
//        }
//    }
//    
//    /**
//     * Gets ith "video" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo getVideoArray(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo)get_store().find_element_user(VIDEO$24, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            return target;
//        }
//    }
    
    /**
     * Returns number of "video" element
     */
    public int sizeOfVideoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIDEO$24);
        }
    }
    
//    /**
//     * Sets array of all "video" element
//     */
//    public void setVideoArray(org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo[] videoArray)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            arraySetterHelper(videoArray, VIDEO$24);
//        }
//    }
//    
//    /**
//     * Sets ith "video" element
//     */
//    public void setVideoArray(int i, org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo video)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo)get_store().find_element_user(VIDEO$24, i);
//            if (target == null)
//            {
//                throw new IndexOutOfBoundsException();
//            }
//            target.set(video);
//        }
//    }
//    
//    /**
//     * Inserts and returns a new empty value (as xml) as the ith "video" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo insertNewVideo(int i)
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo)get_store().insert_element_user(VIDEO$24, i);
//            return target;
//        }
//    }
//    
//    /**
//     * Appends and returns a new empty value (as xml) as the last "video" element
//     */
//    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo addNewVideo()
//    {
//        synchronized (monitor())
//        {
//            check_orphaned();
//            org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo target = null;
//            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo)get_store().add_element_user(VIDEO$24);
//            return target;
//        }
//    }
    
    /**
     * Removes the ith "video" element
     */
    public void removeVideo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIDEO$24, i);
        }
    }

}
