/*
 * XML Type:  CT_Rect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTRect
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Rect(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTRectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTRect
{
    
    public CTRectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "path");
    private static final javax.xml.namespace.QName FORMULAS$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "formulas");
    private static final javax.xml.namespace.QName HANDLES$4 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "handles");
    private static final javax.xml.namespace.QName FILL$6 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "fill");
    private static final javax.xml.namespace.QName STROKE$8 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "stroke");
    private static final javax.xml.namespace.QName SHADOW$10 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shadow");
    private static final javax.xml.namespace.QName TEXTBOX$12 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "textbox");
    private static final javax.xml.namespace.QName TEXTPATH$14 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "textpath");
    private static final javax.xml.namespace.QName IMAGEDATA$16 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "imagedata");
    private static final javax.xml.namespace.QName SKEW$18 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "skew");
    private static final javax.xml.namespace.QName EXTRUSION$20 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "extrusion");
    private static final javax.xml.namespace.QName CALLOUT$22 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "callout");
    private static final javax.xml.namespace.QName LOCK$24 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "lock");
    private static final javax.xml.namespace.QName CLIPPATH$26 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "clippath");
    private static final javax.xml.namespace.QName SIGNATURELINE$28 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "signatureline");
    private static final javax.xml.namespace.QName WRAP$30 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "wrap");
    private static final javax.xml.namespace.QName ANCHORLOCK$32 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "anchorlock");
    private static final javax.xml.namespace.QName BORDERTOP$34 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "bordertop");
    private static final javax.xml.namespace.QName BORDERBOTTOM$36 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "borderbottom");
    private static final javax.xml.namespace.QName BORDERLEFT$38 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "borderleft");
    private static final javax.xml.namespace.QName BORDERRIGHT$40 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "borderright");
    private static final javax.xml.namespace.QName CLIENTDATA$42 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:excel", "ClientData");
    private static final javax.xml.namespace.QName TEXTDATA$44 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:powerpoint", "textdata");
    private static final javax.xml.namespace.QName ID$46 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName STYLE$48 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName HREF$50 = 
        new javax.xml.namespace.QName("", "href");
    private static final javax.xml.namespace.QName TARGET$52 = 
        new javax.xml.namespace.QName("", "target");
    private static final javax.xml.namespace.QName CLASS1$54 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName TITLE$56 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName ALT$58 = 
        new javax.xml.namespace.QName("", "alt");
    private static final javax.xml.namespace.QName COORDSIZE$60 = 
        new javax.xml.namespace.QName("", "coordsize");
    private static final javax.xml.namespace.QName COORDORIGIN$62 = 
        new javax.xml.namespace.QName("", "coordorigin");
    private static final javax.xml.namespace.QName WRAPCOORDS$64 = 
        new javax.xml.namespace.QName("", "wrapcoords");
    private static final javax.xml.namespace.QName PRINT$66 = 
        new javax.xml.namespace.QName("", "print");
    private static final javax.xml.namespace.QName SPID$68 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "spid");
    private static final javax.xml.namespace.QName ONED$70 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "oned");
    private static final javax.xml.namespace.QName REGROUPID$72 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "regroupid");
    private static final javax.xml.namespace.QName DOUBLECLICKNOTIFY$74 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "doubleclicknotify");
    private static final javax.xml.namespace.QName BUTTON$76 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "button");
    private static final javax.xml.namespace.QName USERHIDDEN$78 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "userhidden");
    private static final javax.xml.namespace.QName BULLET$80 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bullet");
    private static final javax.xml.namespace.QName HR$82 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hr");
    private static final javax.xml.namespace.QName HRSTD$84 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrstd");
    private static final javax.xml.namespace.QName HRNOSHADE$86 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrnoshade");
    private static final javax.xml.namespace.QName HRPCT$88 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrpct");
    private static final javax.xml.namespace.QName HRALIGN$90 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hralign");
    private static final javax.xml.namespace.QName ALLOWINCELL$92 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowincell");
    private static final javax.xml.namespace.QName ALLOWOVERLAP$94 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowoverlap");
    private static final javax.xml.namespace.QName USERDRAWN$96 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "userdrawn");
    private static final javax.xml.namespace.QName BORDERTOPCOLOR$98 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bordertopcolor");
    private static final javax.xml.namespace.QName BORDERLEFTCOLOR$100 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderleftcolor");
    private static final javax.xml.namespace.QName BORDERBOTTOMCOLOR$102 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderbottomcolor");
    private static final javax.xml.namespace.QName BORDERRIGHTCOLOR$104 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderrightcolor");
    private static final javax.xml.namespace.QName DGMLAYOUT$106 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmlayout");
    private static final javax.xml.namespace.QName DGMNODEKIND$108 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmnodekind");
    private static final javax.xml.namespace.QName DGMLAYOUTMRU$110 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru");
    private static final javax.xml.namespace.QName INSETMODE$112 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "insetmode");
    private static final javax.xml.namespace.QName CHROMAKEY$114 = 
        new javax.xml.namespace.QName("", "chromakey");
    private static final javax.xml.namespace.QName FILLED$116 = 
        new javax.xml.namespace.QName("", "filled");
    private static final javax.xml.namespace.QName FILLCOLOR$118 = 
        new javax.xml.namespace.QName("", "fillcolor");
    private static final javax.xml.namespace.QName OPACITY$120 = 
        new javax.xml.namespace.QName("", "opacity");
    private static final javax.xml.namespace.QName STROKED$122 = 
        new javax.xml.namespace.QName("", "stroked");
    private static final javax.xml.namespace.QName STROKECOLOR$124 = 
        new javax.xml.namespace.QName("", "strokecolor");
    private static final javax.xml.namespace.QName STROKEWEIGHT$126 = 
        new javax.xml.namespace.QName("", "strokeweight");
    private static final javax.xml.namespace.QName INSETPEN$128 = 
        new javax.xml.namespace.QName("", "insetpen");
    private static final javax.xml.namespace.QName SPT$130 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "spt");
    private static final javax.xml.namespace.QName CONNECTORTYPE$132 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connectortype");
    private static final javax.xml.namespace.QName BWMODE$134 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwmode");
    private static final javax.xml.namespace.QName BWPURE$136 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwpure");
    private static final javax.xml.namespace.QName BWNORMAL$138 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bwnormal");
    private static final javax.xml.namespace.QName FORCEDASH$140 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "forcedash");
    private static final javax.xml.namespace.QName OLEICON$142 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "oleicon");
    private static final javax.xml.namespace.QName OLE$144 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "ole");
    private static final javax.xml.namespace.QName PREFERRELATIVE$146 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "preferrelative");
    private static final javax.xml.namespace.QName CLIPTOWRAP$148 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "cliptowrap");
    private static final javax.xml.namespace.QName CLIP$150 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "clip");
    
    
    /**
     * Gets a List of "path" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTPath> getPathList()
    {
        final class PathList extends java.util.AbstractList<schemasMicrosoftComVml.CTPath>
        {
            public schemasMicrosoftComVml.CTPath get(int i)
                { return CTRectImpl.this.getPathArray(i); }
            
            public schemasMicrosoftComVml.CTPath set(int i, schemasMicrosoftComVml.CTPath o)
            {
                schemasMicrosoftComVml.CTPath old = CTRectImpl.this.getPathArray(i);
                CTRectImpl.this.setPathArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTPath o)
                { CTRectImpl.this.insertNewPath(i).set(o); }
            
            public schemasMicrosoftComVml.CTPath remove(int i)
            {
                schemasMicrosoftComVml.CTPath old = CTRectImpl.this.getPathArray(i);
                CTRectImpl.this.removePath(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfPathArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PathList();
        }
    }
    
    /**
     * Gets array of all "path" elements
     */
    public schemasMicrosoftComVml.CTPath[] getPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATH$0, targetList);
            schemasMicrosoftComVml.CTPath[] result = new schemasMicrosoftComVml.CTPath[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "path" element
     */
    public schemasMicrosoftComVml.CTPath getPathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().find_element_user(PATH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "path" element
     */
    public int sizeOfPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$0);
        }
    }
    
    /**
     * Sets array of all "path" element
     */
    public void setPathArray(schemasMicrosoftComVml.CTPath[] pathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pathArray, PATH$0);
        }
    }
    
    /**
     * Sets ith "path" element
     */
    public void setPathArray(int i, schemasMicrosoftComVml.CTPath path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().find_element_user(PATH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(path);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "path" element
     */
    public schemasMicrosoftComVml.CTPath insertNewPath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().insert_element_user(PATH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "path" element
     */
    public schemasMicrosoftComVml.CTPath addNewPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPath target = null;
            target = (schemasMicrosoftComVml.CTPath)get_store().add_element_user(PATH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "path" element
     */
    public void removePath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$0, i);
        }
    }
    
    /**
     * Gets a List of "formulas" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTFormulas> getFormulasList()
    {
        final class FormulasList extends java.util.AbstractList<schemasMicrosoftComVml.CTFormulas>
        {
            public schemasMicrosoftComVml.CTFormulas get(int i)
                { return CTRectImpl.this.getFormulasArray(i); }
            
            public schemasMicrosoftComVml.CTFormulas set(int i, schemasMicrosoftComVml.CTFormulas o)
            {
                schemasMicrosoftComVml.CTFormulas old = CTRectImpl.this.getFormulasArray(i);
                CTRectImpl.this.setFormulasArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTFormulas o)
                { CTRectImpl.this.insertNewFormulas(i).set(o); }
            
            public schemasMicrosoftComVml.CTFormulas remove(int i)
            {
                schemasMicrosoftComVml.CTFormulas old = CTRectImpl.this.getFormulasArray(i);
                CTRectImpl.this.removeFormulas(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfFormulasArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FormulasList();
        }
    }
    
    /**
     * Gets array of all "formulas" elements
     */
    public schemasMicrosoftComVml.CTFormulas[] getFormulasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMULAS$2, targetList);
            schemasMicrosoftComVml.CTFormulas[] result = new schemasMicrosoftComVml.CTFormulas[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "formulas" element
     */
    public schemasMicrosoftComVml.CTFormulas getFormulasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().find_element_user(FORMULAS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "formulas" element
     */
    public int sizeOfFormulasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULAS$2);
        }
    }
    
    /**
     * Sets array of all "formulas" element
     */
    public void setFormulasArray(schemasMicrosoftComVml.CTFormulas[] formulasArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formulasArray, FORMULAS$2);
        }
    }
    
    /**
     * Sets ith "formulas" element
     */
    public void setFormulasArray(int i, schemasMicrosoftComVml.CTFormulas formulas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().find_element_user(FORMULAS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(formulas);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formulas" element
     */
    public schemasMicrosoftComVml.CTFormulas insertNewFormulas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().insert_element_user(FORMULAS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formulas" element
     */
    public schemasMicrosoftComVml.CTFormulas addNewFormulas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFormulas target = null;
            target = (schemasMicrosoftComVml.CTFormulas)get_store().add_element_user(FORMULAS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "formulas" element
     */
    public void removeFormulas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULAS$2, i);
        }
    }
    
    /**
     * Gets a List of "handles" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTHandles> getHandlesList()
    {
        final class HandlesList extends java.util.AbstractList<schemasMicrosoftComVml.CTHandles>
        {
            public schemasMicrosoftComVml.CTHandles get(int i)
                { return CTRectImpl.this.getHandlesArray(i); }
            
            public schemasMicrosoftComVml.CTHandles set(int i, schemasMicrosoftComVml.CTHandles o)
            {
                schemasMicrosoftComVml.CTHandles old = CTRectImpl.this.getHandlesArray(i);
                CTRectImpl.this.setHandlesArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTHandles o)
                { CTRectImpl.this.insertNewHandles(i).set(o); }
            
            public schemasMicrosoftComVml.CTHandles remove(int i)
            {
                schemasMicrosoftComVml.CTHandles old = CTRectImpl.this.getHandlesArray(i);
                CTRectImpl.this.removeHandles(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfHandlesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HandlesList();
        }
    }
    
    /**
     * Gets array of all "handles" elements
     */
    public schemasMicrosoftComVml.CTHandles[] getHandlesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HANDLES$4, targetList);
            schemasMicrosoftComVml.CTHandles[] result = new schemasMicrosoftComVml.CTHandles[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "handles" element
     */
    public schemasMicrosoftComVml.CTHandles getHandlesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().find_element_user(HANDLES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "handles" element
     */
    public int sizeOfHandlesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLES$4);
        }
    }
    
    /**
     * Sets array of all "handles" element
     */
    public void setHandlesArray(schemasMicrosoftComVml.CTHandles[] handlesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(handlesArray, HANDLES$4);
        }
    }
    
    /**
     * Sets ith "handles" element
     */
    public void setHandlesArray(int i, schemasMicrosoftComVml.CTHandles handles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().find_element_user(HANDLES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(handles);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handles" element
     */
    public schemasMicrosoftComVml.CTHandles insertNewHandles(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().insert_element_user(HANDLES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handles" element
     */
    public schemasMicrosoftComVml.CTHandles addNewHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().add_element_user(HANDLES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "handles" element
     */
    public void removeHandles(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLES$4, i);
        }
    }
    
    /**
     * Gets a List of "fill" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTFill> getFillList()
    {
        final class FillList extends java.util.AbstractList<schemasMicrosoftComVml.CTFill>
        {
            public schemasMicrosoftComVml.CTFill get(int i)
                { return CTRectImpl.this.getFillArray(i); }
            
            public schemasMicrosoftComVml.CTFill set(int i, schemasMicrosoftComVml.CTFill o)
            {
                schemasMicrosoftComVml.CTFill old = CTRectImpl.this.getFillArray(i);
                CTRectImpl.this.setFillArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTFill o)
                { CTRectImpl.this.insertNewFill(i).set(o); }
            
            public schemasMicrosoftComVml.CTFill remove(int i)
            {
                schemasMicrosoftComVml.CTFill old = CTRectImpl.this.getFillArray(i);
                CTRectImpl.this.removeFill(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfFillArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FillList();
        }
    }
    
    /**
     * Gets array of all "fill" elements
     */
    public schemasMicrosoftComVml.CTFill[] getFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILL$6, targetList);
            schemasMicrosoftComVml.CTFill[] result = new schemasMicrosoftComVml.CTFill[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fill" element
     */
    public schemasMicrosoftComVml.CTFill getFillArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().find_element_user(FILL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fill" element
     */
    public int sizeOfFillArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILL$6);
        }
    }
    
    /**
     * Sets array of all "fill" element
     */
    public void setFillArray(schemasMicrosoftComVml.CTFill[] fillArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fillArray, FILL$6);
        }
    }
    
    /**
     * Sets ith "fill" element
     */
    public void setFillArray(int i, schemasMicrosoftComVml.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().find_element_user(FILL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fill);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fill" element
     */
    public schemasMicrosoftComVml.CTFill insertNewFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().insert_element_user(FILL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fill" element
     */
    public schemasMicrosoftComVml.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().add_element_user(FILL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "fill" element
     */
    public void removeFill(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILL$6, i);
        }
    }
    
    /**
     * Gets a List of "stroke" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTStroke> getStrokeList()
    {
        final class StrokeList extends java.util.AbstractList<schemasMicrosoftComVml.CTStroke>
        {
            public schemasMicrosoftComVml.CTStroke get(int i)
                { return CTRectImpl.this.getStrokeArray(i); }
            
            public schemasMicrosoftComVml.CTStroke set(int i, schemasMicrosoftComVml.CTStroke o)
            {
                schemasMicrosoftComVml.CTStroke old = CTRectImpl.this.getStrokeArray(i);
                CTRectImpl.this.setStrokeArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTStroke o)
                { CTRectImpl.this.insertNewStroke(i).set(o); }
            
            public schemasMicrosoftComVml.CTStroke remove(int i)
            {
                schemasMicrosoftComVml.CTStroke old = CTRectImpl.this.getStrokeArray(i);
                CTRectImpl.this.removeStroke(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfStrokeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StrokeList();
        }
    }
    
    /**
     * Gets array of all "stroke" elements
     */
    public schemasMicrosoftComVml.CTStroke[] getStrokeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STROKE$8, targetList);
            schemasMicrosoftComVml.CTStroke[] result = new schemasMicrosoftComVml.CTStroke[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke getStrokeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().find_element_user(STROKE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stroke" element
     */
    public int sizeOfStrokeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STROKE$8);
        }
    }
    
    /**
     * Sets array of all "stroke" element
     */
    public void setStrokeArray(schemasMicrosoftComVml.CTStroke[] strokeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(strokeArray, STROKE$8);
        }
    }
    
    /**
     * Sets ith "stroke" element
     */
    public void setStrokeArray(int i, schemasMicrosoftComVml.CTStroke stroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().find_element_user(STROKE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stroke);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke insertNewStroke(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().insert_element_user(STROKE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke addNewStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().add_element_user(STROKE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "stroke" element
     */
    public void removeStroke(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STROKE$8, i);
        }
    }
    
    /**
     * Gets a List of "shadow" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTShadow> getShadowList()
    {
        final class ShadowList extends java.util.AbstractList<schemasMicrosoftComVml.CTShadow>
        {
            public schemasMicrosoftComVml.CTShadow get(int i)
                { return CTRectImpl.this.getShadowArray(i); }
            
            public schemasMicrosoftComVml.CTShadow set(int i, schemasMicrosoftComVml.CTShadow o)
            {
                schemasMicrosoftComVml.CTShadow old = CTRectImpl.this.getShadowArray(i);
                CTRectImpl.this.setShadowArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTShadow o)
                { CTRectImpl.this.insertNewShadow(i).set(o); }
            
            public schemasMicrosoftComVml.CTShadow remove(int i)
            {
                schemasMicrosoftComVml.CTShadow old = CTRectImpl.this.getShadowArray(i);
                CTRectImpl.this.removeShadow(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfShadowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShadowList();
        }
    }
    
    /**
     * Gets array of all "shadow" elements
     */
    public schemasMicrosoftComVml.CTShadow[] getShadowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHADOW$10, targetList);
            schemasMicrosoftComVml.CTShadow[] result = new schemasMicrosoftComVml.CTShadow[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow getShadowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().find_element_user(SHADOW$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shadow" element
     */
    public int sizeOfShadowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHADOW$10);
        }
    }
    
    /**
     * Sets array of all "shadow" element
     */
    public void setShadowArray(schemasMicrosoftComVml.CTShadow[] shadowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shadowArray, SHADOW$10);
        }
    }
    
    /**
     * Sets ith "shadow" element
     */
    public void setShadowArray(int i, schemasMicrosoftComVml.CTShadow shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().find_element_user(SHADOW$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shadow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow insertNewShadow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().insert_element_user(SHADOW$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow addNewShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().add_element_user(SHADOW$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "shadow" element
     */
    public void removeShadow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHADOW$10, i);
        }
    }
    
    /**
     * Gets a List of "textbox" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTTextbox> getTextboxList()
    {
        final class TextboxList extends java.util.AbstractList<schemasMicrosoftComVml.CTTextbox>
        {
            public schemasMicrosoftComVml.CTTextbox get(int i)
                { return CTRectImpl.this.getTextboxArray(i); }
            
            public schemasMicrosoftComVml.CTTextbox set(int i, schemasMicrosoftComVml.CTTextbox o)
            {
                schemasMicrosoftComVml.CTTextbox old = CTRectImpl.this.getTextboxArray(i);
                CTRectImpl.this.setTextboxArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTTextbox o)
                { CTRectImpl.this.insertNewTextbox(i).set(o); }
            
            public schemasMicrosoftComVml.CTTextbox remove(int i)
            {
                schemasMicrosoftComVml.CTTextbox old = CTRectImpl.this.getTextboxArray(i);
                CTRectImpl.this.removeTextbox(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfTextboxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextboxList();
        }
    }
    
    /**
     * Gets array of all "textbox" elements
     */
    public schemasMicrosoftComVml.CTTextbox[] getTextboxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTBOX$12, targetList);
            schemasMicrosoftComVml.CTTextbox[] result = new schemasMicrosoftComVml.CTTextbox[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox getTextboxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().find_element_user(TEXTBOX$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textbox" element
     */
    public int sizeOfTextboxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTBOX$12);
        }
    }
    
    /**
     * Sets array of all "textbox" element
     */
    public void setTextboxArray(schemasMicrosoftComVml.CTTextbox[] textboxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textboxArray, TEXTBOX$12);
        }
    }
    
    /**
     * Sets ith "textbox" element
     */
    public void setTextboxArray(int i, schemasMicrosoftComVml.CTTextbox textbox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().find_element_user(TEXTBOX$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textbox);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox insertNewTextbox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().insert_element_user(TEXTBOX$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox addNewTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().add_element_user(TEXTBOX$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "textbox" element
     */
    public void removeTextbox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTBOX$12, i);
        }
    }
    
    /**
     * Gets a List of "textpath" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTTextPath> getTextpathList()
    {
        final class TextpathList extends java.util.AbstractList<schemasMicrosoftComVml.CTTextPath>
        {
            public schemasMicrosoftComVml.CTTextPath get(int i)
                { return CTRectImpl.this.getTextpathArray(i); }
            
            public schemasMicrosoftComVml.CTTextPath set(int i, schemasMicrosoftComVml.CTTextPath o)
            {
                schemasMicrosoftComVml.CTTextPath old = CTRectImpl.this.getTextpathArray(i);
                CTRectImpl.this.setTextpathArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTTextPath o)
                { CTRectImpl.this.insertNewTextpath(i).set(o); }
            
            public schemasMicrosoftComVml.CTTextPath remove(int i)
            {
                schemasMicrosoftComVml.CTTextPath old = CTRectImpl.this.getTextpathArray(i);
                CTRectImpl.this.removeTextpath(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfTextpathArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextpathList();
        }
    }
    
    /**
     * Gets array of all "textpath" elements
     */
    public schemasMicrosoftComVml.CTTextPath[] getTextpathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTPATH$14, targetList);
            schemasMicrosoftComVml.CTTextPath[] result = new schemasMicrosoftComVml.CTTextPath[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textpath" element
     */
    public schemasMicrosoftComVml.CTTextPath getTextpathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().find_element_user(TEXTPATH$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textpath" element
     */
    public int sizeOfTextpathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTPATH$14);
        }
    }
    
    /**
     * Sets array of all "textpath" element
     */
    public void setTextpathArray(schemasMicrosoftComVml.CTTextPath[] textpathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textpathArray, TEXTPATH$14);
        }
    }
    
    /**
     * Sets ith "textpath" element
     */
    public void setTextpathArray(int i, schemasMicrosoftComVml.CTTextPath textpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().find_element_user(TEXTPATH$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textpath);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textpath" element
     */
    public schemasMicrosoftComVml.CTTextPath insertNewTextpath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().insert_element_user(TEXTPATH$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textpath" element
     */
    public schemasMicrosoftComVml.CTTextPath addNewTextpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().add_element_user(TEXTPATH$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "textpath" element
     */
    public void removeTextpath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTPATH$14, i);
        }
    }
    
    /**
     * Gets a List of "imagedata" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTImageData> getImagedataList()
    {
        final class ImagedataList extends java.util.AbstractList<schemasMicrosoftComVml.CTImageData>
        {
            public schemasMicrosoftComVml.CTImageData get(int i)
                { return CTRectImpl.this.getImagedataArray(i); }
            
            public schemasMicrosoftComVml.CTImageData set(int i, schemasMicrosoftComVml.CTImageData o)
            {
                schemasMicrosoftComVml.CTImageData old = CTRectImpl.this.getImagedataArray(i);
                CTRectImpl.this.setImagedataArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTImageData o)
                { CTRectImpl.this.insertNewImagedata(i).set(o); }
            
            public schemasMicrosoftComVml.CTImageData remove(int i)
            {
                schemasMicrosoftComVml.CTImageData old = CTRectImpl.this.getImagedataArray(i);
                CTRectImpl.this.removeImagedata(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfImagedataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ImagedataList();
        }
    }
    
    /**
     * Gets array of all "imagedata" elements
     */
    public schemasMicrosoftComVml.CTImageData[] getImagedataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMAGEDATA$16, targetList);
            schemasMicrosoftComVml.CTImageData[] result = new schemasMicrosoftComVml.CTImageData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "imagedata" element
     */
    public schemasMicrosoftComVml.CTImageData getImagedataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().find_element_user(IMAGEDATA$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "imagedata" element
     */
    public int sizeOfImagedataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGEDATA$16);
        }
    }
    
    /**
     * Sets array of all "imagedata" element
     */
    public void setImagedataArray(schemasMicrosoftComVml.CTImageData[] imagedataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(imagedataArray, IMAGEDATA$16);
        }
    }
    
    /**
     * Sets ith "imagedata" element
     */
    public void setImagedataArray(int i, schemasMicrosoftComVml.CTImageData imagedata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().find_element_user(IMAGEDATA$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(imagedata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "imagedata" element
     */
    public schemasMicrosoftComVml.CTImageData insertNewImagedata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().insert_element_user(IMAGEDATA$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "imagedata" element
     */
    public schemasMicrosoftComVml.CTImageData addNewImagedata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImageData target = null;
            target = (schemasMicrosoftComVml.CTImageData)get_store().add_element_user(IMAGEDATA$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "imagedata" element
     */
    public void removeImagedata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGEDATA$16, i);
        }
    }
    
    /**
     * Gets a List of "skew" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTSkew> getSkewList()
    {
        final class SkewList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTSkew>
        {
            public schemasMicrosoftComOfficeOffice.CTSkew get(int i)
                { return CTRectImpl.this.getSkewArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTSkew set(int i, schemasMicrosoftComOfficeOffice.CTSkew o)
            {
                schemasMicrosoftComOfficeOffice.CTSkew old = CTRectImpl.this.getSkewArray(i);
                CTRectImpl.this.setSkewArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTSkew o)
                { CTRectImpl.this.insertNewSkew(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTSkew remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTSkew old = CTRectImpl.this.getSkewArray(i);
                CTRectImpl.this.removeSkew(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfSkewArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SkewList();
        }
    }
    
    /**
     * Gets array of all "skew" elements
     */
    public schemasMicrosoftComOfficeOffice.CTSkew[] getSkewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SKEW$18, targetList);
            schemasMicrosoftComOfficeOffice.CTSkew[] result = new schemasMicrosoftComOfficeOffice.CTSkew[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew getSkewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().find_element_user(SKEW$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "skew" element
     */
    public int sizeOfSkewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKEW$18);
        }
    }
    
    /**
     * Sets array of all "skew" element
     */
    public void setSkewArray(schemasMicrosoftComOfficeOffice.CTSkew[] skewArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(skewArray, SKEW$18);
        }
    }
    
    /**
     * Sets ith "skew" element
     */
    public void setSkewArray(int i, schemasMicrosoftComOfficeOffice.CTSkew skew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().find_element_user(SKEW$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(skew);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew insertNewSkew(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().insert_element_user(SKEW$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew addNewSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().add_element_user(SKEW$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "skew" element
     */
    public void removeSkew(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKEW$18, i);
        }
    }
    
    /**
     * Gets a List of "extrusion" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTExtrusion> getExtrusionList()
    {
        final class ExtrusionList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTExtrusion>
        {
            public schemasMicrosoftComOfficeOffice.CTExtrusion get(int i)
                { return CTRectImpl.this.getExtrusionArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTExtrusion set(int i, schemasMicrosoftComOfficeOffice.CTExtrusion o)
            {
                schemasMicrosoftComOfficeOffice.CTExtrusion old = CTRectImpl.this.getExtrusionArray(i);
                CTRectImpl.this.setExtrusionArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTExtrusion o)
                { CTRectImpl.this.insertNewExtrusion(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTExtrusion remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTExtrusion old = CTRectImpl.this.getExtrusionArray(i);
                CTRectImpl.this.removeExtrusion(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfExtrusionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtrusionList();
        }
    }
    
    /**
     * Gets array of all "extrusion" elements
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion[] getExtrusionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTRUSION$20, targetList);
            schemasMicrosoftComOfficeOffice.CTExtrusion[] result = new schemasMicrosoftComOfficeOffice.CTExtrusion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion getExtrusionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().find_element_user(EXTRUSION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extrusion" element
     */
    public int sizeOfExtrusionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRUSION$20);
        }
    }
    
    /**
     * Sets array of all "extrusion" element
     */
    public void setExtrusionArray(schemasMicrosoftComOfficeOffice.CTExtrusion[] extrusionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extrusionArray, EXTRUSION$20);
        }
    }
    
    /**
     * Sets ith "extrusion" element
     */
    public void setExtrusionArray(int i, schemasMicrosoftComOfficeOffice.CTExtrusion extrusion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().find_element_user(EXTRUSION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extrusion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion insertNewExtrusion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().insert_element_user(EXTRUSION$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion addNewExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().add_element_user(EXTRUSION$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "extrusion" element
     */
    public void removeExtrusion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRUSION$20, i);
        }
    }
    
    /**
     * Gets a List of "callout" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTCallout> getCalloutList()
    {
        final class CalloutList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTCallout>
        {
            public schemasMicrosoftComOfficeOffice.CTCallout get(int i)
                { return CTRectImpl.this.getCalloutArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTCallout set(int i, schemasMicrosoftComOfficeOffice.CTCallout o)
            {
                schemasMicrosoftComOfficeOffice.CTCallout old = CTRectImpl.this.getCalloutArray(i);
                CTRectImpl.this.setCalloutArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTCallout o)
                { CTRectImpl.this.insertNewCallout(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTCallout remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTCallout old = CTRectImpl.this.getCalloutArray(i);
                CTRectImpl.this.removeCallout(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfCalloutArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CalloutList();
        }
    }
    
    /**
     * Gets array of all "callout" elements
     */
    public schemasMicrosoftComOfficeOffice.CTCallout[] getCalloutArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CALLOUT$22, targetList);
            schemasMicrosoftComOfficeOffice.CTCallout[] result = new schemasMicrosoftComOfficeOffice.CTCallout[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout getCalloutArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().find_element_user(CALLOUT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "callout" element
     */
    public int sizeOfCalloutArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLOUT$22);
        }
    }
    
    /**
     * Sets array of all "callout" element
     */
    public void setCalloutArray(schemasMicrosoftComOfficeOffice.CTCallout[] calloutArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(calloutArray, CALLOUT$22);
        }
    }
    
    /**
     * Sets ith "callout" element
     */
    public void setCalloutArray(int i, schemasMicrosoftComOfficeOffice.CTCallout callout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().find_element_user(CALLOUT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(callout);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout insertNewCallout(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().insert_element_user(CALLOUT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout addNewCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().add_element_user(CALLOUT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "callout" element
     */
    public void removeCallout(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLOUT$22, i);
        }
    }
    
    /**
     * Gets a List of "lock" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTLock> getLockList()
    {
        final class LockList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTLock>
        {
            public schemasMicrosoftComOfficeOffice.CTLock get(int i)
                { return CTRectImpl.this.getLockArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTLock set(int i, schemasMicrosoftComOfficeOffice.CTLock o)
            {
                schemasMicrosoftComOfficeOffice.CTLock old = CTRectImpl.this.getLockArray(i);
                CTRectImpl.this.setLockArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTLock o)
                { CTRectImpl.this.insertNewLock(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTLock remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTLock old = CTRectImpl.this.getLockArray(i);
                CTRectImpl.this.removeLock(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfLockArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LockList();
        }
    }
    
    /**
     * Gets array of all "lock" elements
     */
    public schemasMicrosoftComOfficeOffice.CTLock[] getLockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCK$24, targetList);
            schemasMicrosoftComOfficeOffice.CTLock[] result = new schemasMicrosoftComOfficeOffice.CTLock[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock getLockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().find_element_user(LOCK$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lock" element
     */
    public int sizeOfLockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCK$24);
        }
    }
    
    /**
     * Sets array of all "lock" element
     */
    public void setLockArray(schemasMicrosoftComOfficeOffice.CTLock[] lockArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lockArray, LOCK$24);
        }
    }
    
    /**
     * Sets ith "lock" element
     */
    public void setLockArray(int i, schemasMicrosoftComOfficeOffice.CTLock lock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().find_element_user(LOCK$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lock);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock insertNewLock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().insert_element_user(LOCK$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock addNewLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().add_element_user(LOCK$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "lock" element
     */
    public void removeLock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCK$24, i);
        }
    }
    
    /**
     * Gets a List of "clippath" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTClipPath> getClippathList()
    {
        final class ClippathList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTClipPath>
        {
            public schemasMicrosoftComOfficeOffice.CTClipPath get(int i)
                { return CTRectImpl.this.getClippathArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTClipPath set(int i, schemasMicrosoftComOfficeOffice.CTClipPath o)
            {
                schemasMicrosoftComOfficeOffice.CTClipPath old = CTRectImpl.this.getClippathArray(i);
                CTRectImpl.this.setClippathArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTClipPath o)
                { CTRectImpl.this.insertNewClippath(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTClipPath remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTClipPath old = CTRectImpl.this.getClippathArray(i);
                CTRectImpl.this.removeClippath(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfClippathArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ClippathList();
        }
    }
    
    /**
     * Gets array of all "clippath" elements
     */
    public schemasMicrosoftComOfficeOffice.CTClipPath[] getClippathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIPPATH$26, targetList);
            schemasMicrosoftComOfficeOffice.CTClipPath[] result = new schemasMicrosoftComOfficeOffice.CTClipPath[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "clippath" element
     */
    public schemasMicrosoftComOfficeOffice.CTClipPath getClippathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().find_element_user(CLIPPATH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "clippath" element
     */
    public int sizeOfClippathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIPPATH$26);
        }
    }
    
    /**
     * Sets array of all "clippath" element
     */
    public void setClippathArray(schemasMicrosoftComOfficeOffice.CTClipPath[] clippathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clippathArray, CLIPPATH$26);
        }
    }
    
    /**
     * Sets ith "clippath" element
     */
    public void setClippathArray(int i, schemasMicrosoftComOfficeOffice.CTClipPath clippath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().find_element_user(CLIPPATH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clippath);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clippath" element
     */
    public schemasMicrosoftComOfficeOffice.CTClipPath insertNewClippath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().insert_element_user(CLIPPATH$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clippath" element
     */
    public schemasMicrosoftComOfficeOffice.CTClipPath addNewClippath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().add_element_user(CLIPPATH$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "clippath" element
     */
    public void removeClippath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIPPATH$26, i);
        }
    }
    
    /**
     * Gets a List of "signatureline" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTSignatureLine> getSignaturelineList()
    {
        final class SignaturelineList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTSignatureLine>
        {
            public schemasMicrosoftComOfficeOffice.CTSignatureLine get(int i)
                { return CTRectImpl.this.getSignaturelineArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTSignatureLine set(int i, schemasMicrosoftComOfficeOffice.CTSignatureLine o)
            {
                schemasMicrosoftComOfficeOffice.CTSignatureLine old = CTRectImpl.this.getSignaturelineArray(i);
                CTRectImpl.this.setSignaturelineArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTSignatureLine o)
                { CTRectImpl.this.insertNewSignatureline(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTSignatureLine remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTSignatureLine old = CTRectImpl.this.getSignaturelineArray(i);
                CTRectImpl.this.removeSignatureline(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfSignaturelineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SignaturelineList();
        }
    }
    
    /**
     * Gets array of all "signatureline" elements
     */
    public schemasMicrosoftComOfficeOffice.CTSignatureLine[] getSignaturelineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIGNATURELINE$28, targetList);
            schemasMicrosoftComOfficeOffice.CTSignatureLine[] result = new schemasMicrosoftComOfficeOffice.CTSignatureLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "signatureline" element
     */
    public schemasMicrosoftComOfficeOffice.CTSignatureLine getSignaturelineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().find_element_user(SIGNATURELINE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "signatureline" element
     */
    public int sizeOfSignaturelineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATURELINE$28);
        }
    }
    
    /**
     * Sets array of all "signatureline" element
     */
    public void setSignaturelineArray(schemasMicrosoftComOfficeOffice.CTSignatureLine[] signaturelineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(signaturelineArray, SIGNATURELINE$28);
        }
    }
    
    /**
     * Sets ith "signatureline" element
     */
    public void setSignaturelineArray(int i, schemasMicrosoftComOfficeOffice.CTSignatureLine signatureline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().find_element_user(SIGNATURELINE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(signatureline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "signatureline" element
     */
    public schemasMicrosoftComOfficeOffice.CTSignatureLine insertNewSignatureline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().insert_element_user(SIGNATURELINE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "signatureline" element
     */
    public schemasMicrosoftComOfficeOffice.CTSignatureLine addNewSignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().add_element_user(SIGNATURELINE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "signatureline" element
     */
    public void removeSignatureline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATURELINE$28, i);
        }
    }
    
    /**
     * Gets a List of "wrap" elements
     */
    public java.util.List<schemasMicrosoftComOfficeWord.CTWrap> getWrapList()
    {
        final class WrapList extends java.util.AbstractList<schemasMicrosoftComOfficeWord.CTWrap>
        {
            public schemasMicrosoftComOfficeWord.CTWrap get(int i)
                { return CTRectImpl.this.getWrapArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTWrap set(int i, schemasMicrosoftComOfficeWord.CTWrap o)
            {
                schemasMicrosoftComOfficeWord.CTWrap old = CTRectImpl.this.getWrapArray(i);
                CTRectImpl.this.setWrapArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTWrap o)
                { CTRectImpl.this.insertNewWrap(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTWrap remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTWrap old = CTRectImpl.this.getWrapArray(i);
                CTRectImpl.this.removeWrap(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfWrapArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WrapList();
        }
    }
    
    /**
     * Gets array of all "wrap" elements
     */
    public schemasMicrosoftComOfficeWord.CTWrap[] getWrapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WRAP$30, targetList);
            schemasMicrosoftComOfficeWord.CTWrap[] result = new schemasMicrosoftComOfficeWord.CTWrap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "wrap" element
     */
    public schemasMicrosoftComOfficeWord.CTWrap getWrapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().find_element_user(WRAP$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "wrap" element
     */
    public int sizeOfWrapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WRAP$30);
        }
    }
    
    /**
     * Sets array of all "wrap" element
     */
    public void setWrapArray(schemasMicrosoftComOfficeWord.CTWrap[] wrapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wrapArray, WRAP$30);
        }
    }
    
    /**
     * Sets ith "wrap" element
     */
    public void setWrapArray(int i, schemasMicrosoftComOfficeWord.CTWrap wrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().find_element_user(WRAP$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wrap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wrap" element
     */
    public schemasMicrosoftComOfficeWord.CTWrap insertNewWrap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().insert_element_user(WRAP$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wrap" element
     */
    public schemasMicrosoftComOfficeWord.CTWrap addNewWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().add_element_user(WRAP$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "wrap" element
     */
    public void removeWrap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WRAP$30, i);
        }
    }
    
    /**
     * Gets a List of "anchorlock" elements
     */
    public java.util.List<schemasMicrosoftComOfficeWord.CTAnchorLock> getAnchorlockList()
    {
        final class AnchorlockList extends java.util.AbstractList<schemasMicrosoftComOfficeWord.CTAnchorLock>
        {
            public schemasMicrosoftComOfficeWord.CTAnchorLock get(int i)
                { return CTRectImpl.this.getAnchorlockArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTAnchorLock set(int i, schemasMicrosoftComOfficeWord.CTAnchorLock o)
            {
                schemasMicrosoftComOfficeWord.CTAnchorLock old = CTRectImpl.this.getAnchorlockArray(i);
                CTRectImpl.this.setAnchorlockArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTAnchorLock o)
                { CTRectImpl.this.insertNewAnchorlock(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTAnchorLock remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTAnchorLock old = CTRectImpl.this.getAnchorlockArray(i);
                CTRectImpl.this.removeAnchorlock(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfAnchorlockArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnchorlockList();
        }
    }
    
    /**
     * Gets array of all "anchorlock" elements
     */
    public schemasMicrosoftComOfficeWord.CTAnchorLock[] getAnchorlockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANCHORLOCK$32, targetList);
            schemasMicrosoftComOfficeWord.CTAnchorLock[] result = new schemasMicrosoftComOfficeWord.CTAnchorLock[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "anchorlock" element
     */
    public schemasMicrosoftComOfficeWord.CTAnchorLock getAnchorlockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().find_element_user(ANCHORLOCK$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "anchorlock" element
     */
    public int sizeOfAnchorlockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHORLOCK$32);
        }
    }
    
    /**
     * Sets array of all "anchorlock" element
     */
    public void setAnchorlockArray(schemasMicrosoftComOfficeWord.CTAnchorLock[] anchorlockArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anchorlockArray, ANCHORLOCK$32);
        }
    }
    
    /**
     * Sets ith "anchorlock" element
     */
    public void setAnchorlockArray(int i, schemasMicrosoftComOfficeWord.CTAnchorLock anchorlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().find_element_user(ANCHORLOCK$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anchorlock);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchorlock" element
     */
    public schemasMicrosoftComOfficeWord.CTAnchorLock insertNewAnchorlock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().insert_element_user(ANCHORLOCK$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anchorlock" element
     */
    public schemasMicrosoftComOfficeWord.CTAnchorLock addNewAnchorlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().add_element_user(ANCHORLOCK$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "anchorlock" element
     */
    public void removeAnchorlock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHORLOCK$32, i);
        }
    }
    
    /**
     * Gets a List of "bordertop" elements
     */
    public java.util.List<schemasMicrosoftComOfficeWord.CTBorder> getBordertopList()
    {
        final class BordertopList extends java.util.AbstractList<schemasMicrosoftComOfficeWord.CTBorder>
        {
            public schemasMicrosoftComOfficeWord.CTBorder get(int i)
                { return CTRectImpl.this.getBordertopArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBordertopArray(i);
                CTRectImpl.this.setBordertopArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTRectImpl.this.insertNewBordertop(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBordertopArray(i);
                CTRectImpl.this.removeBordertop(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfBordertopArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BordertopList();
        }
    }
    
    /**
     * Gets array of all "bordertop" elements
     */
    public schemasMicrosoftComOfficeWord.CTBorder[] getBordertopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BORDERTOP$34, targetList);
            schemasMicrosoftComOfficeWord.CTBorder[] result = new schemasMicrosoftComOfficeWord.CTBorder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bordertop" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBordertopArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERTOP$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bordertop" element
     */
    public int sizeOfBordertopArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERTOP$34);
        }
    }
    
    /**
     * Sets array of all "bordertop" element
     */
    public void setBordertopArray(schemasMicrosoftComOfficeWord.CTBorder[] bordertopArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bordertopArray, BORDERTOP$34);
        }
    }
    
    /**
     * Sets ith "bordertop" element
     */
    public void setBordertopArray(int i, schemasMicrosoftComOfficeWord.CTBorder bordertop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERTOP$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bordertop);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bordertop" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder insertNewBordertop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().insert_element_user(BORDERTOP$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bordertop" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBordertop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERTOP$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "bordertop" element
     */
    public void removeBordertop(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERTOP$34, i);
        }
    }
    
    /**
     * Gets a List of "borderbottom" elements
     */
    public java.util.List<schemasMicrosoftComOfficeWord.CTBorder> getBorderbottomList()
    {
        final class BorderbottomList extends java.util.AbstractList<schemasMicrosoftComOfficeWord.CTBorder>
        {
            public schemasMicrosoftComOfficeWord.CTBorder get(int i)
                { return CTRectImpl.this.getBorderbottomArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBorderbottomArray(i);
                CTRectImpl.this.setBorderbottomArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTRectImpl.this.insertNewBorderbottom(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBorderbottomArray(i);
                CTRectImpl.this.removeBorderbottom(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfBorderbottomArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BorderbottomList();
        }
    }
    
    /**
     * Gets array of all "borderbottom" elements
     */
    public schemasMicrosoftComOfficeWord.CTBorder[] getBorderbottomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BORDERBOTTOM$36, targetList);
            schemasMicrosoftComOfficeWord.CTBorder[] result = new schemasMicrosoftComOfficeWord.CTBorder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "borderbottom" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBorderbottomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERBOTTOM$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "borderbottom" element
     */
    public int sizeOfBorderbottomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERBOTTOM$36);
        }
    }
    
    /**
     * Sets array of all "borderbottom" element
     */
    public void setBorderbottomArray(schemasMicrosoftComOfficeWord.CTBorder[] borderbottomArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(borderbottomArray, BORDERBOTTOM$36);
        }
    }
    
    /**
     * Sets ith "borderbottom" element
     */
    public void setBorderbottomArray(int i, schemasMicrosoftComOfficeWord.CTBorder borderbottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERBOTTOM$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(borderbottom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderbottom" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder insertNewBorderbottom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().insert_element_user(BORDERBOTTOM$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "borderbottom" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBorderbottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERBOTTOM$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "borderbottom" element
     */
    public void removeBorderbottom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERBOTTOM$36, i);
        }
    }
    
    /**
     * Gets a List of "borderleft" elements
     */
    public java.util.List<schemasMicrosoftComOfficeWord.CTBorder> getBorderleftList()
    {
        final class BorderleftList extends java.util.AbstractList<schemasMicrosoftComOfficeWord.CTBorder>
        {
            public schemasMicrosoftComOfficeWord.CTBorder get(int i)
                { return CTRectImpl.this.getBorderleftArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBorderleftArray(i);
                CTRectImpl.this.setBorderleftArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTRectImpl.this.insertNewBorderleft(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBorderleftArray(i);
                CTRectImpl.this.removeBorderleft(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfBorderleftArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BorderleftList();
        }
    }
    
    /**
     * Gets array of all "borderleft" elements
     */
    public schemasMicrosoftComOfficeWord.CTBorder[] getBorderleftArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BORDERLEFT$38, targetList);
            schemasMicrosoftComOfficeWord.CTBorder[] result = new schemasMicrosoftComOfficeWord.CTBorder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "borderleft" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBorderleftArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERLEFT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "borderleft" element
     */
    public int sizeOfBorderleftArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERLEFT$38);
        }
    }
    
    /**
     * Sets array of all "borderleft" element
     */
    public void setBorderleftArray(schemasMicrosoftComOfficeWord.CTBorder[] borderleftArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(borderleftArray, BORDERLEFT$38);
        }
    }
    
    /**
     * Sets ith "borderleft" element
     */
    public void setBorderleftArray(int i, schemasMicrosoftComOfficeWord.CTBorder borderleft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERLEFT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(borderleft);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderleft" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder insertNewBorderleft(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().insert_element_user(BORDERLEFT$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "borderleft" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBorderleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERLEFT$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "borderleft" element
     */
    public void removeBorderleft(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERLEFT$38, i);
        }
    }
    
    /**
     * Gets a List of "borderright" elements
     */
    public java.util.List<schemasMicrosoftComOfficeWord.CTBorder> getBorderrightList()
    {
        final class BorderrightList extends java.util.AbstractList<schemasMicrosoftComOfficeWord.CTBorder>
        {
            public schemasMicrosoftComOfficeWord.CTBorder get(int i)
                { return CTRectImpl.this.getBorderrightArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBorderrightArray(i);
                CTRectImpl.this.setBorderrightArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTRectImpl.this.insertNewBorderright(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTRectImpl.this.getBorderrightArray(i);
                CTRectImpl.this.removeBorderright(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfBorderrightArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BorderrightList();
        }
    }
    
    /**
     * Gets array of all "borderright" elements
     */
    public schemasMicrosoftComOfficeWord.CTBorder[] getBorderrightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BORDERRIGHT$40, targetList);
            schemasMicrosoftComOfficeWord.CTBorder[] result = new schemasMicrosoftComOfficeWord.CTBorder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "borderright" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBorderrightArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERRIGHT$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "borderright" element
     */
    public int sizeOfBorderrightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORDERRIGHT$40);
        }
    }
    
    /**
     * Sets array of all "borderright" element
     */
    public void setBorderrightArray(schemasMicrosoftComOfficeWord.CTBorder[] borderrightArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(borderrightArray, BORDERRIGHT$40);
        }
    }
    
    /**
     * Sets ith "borderright" element
     */
    public void setBorderrightArray(int i, schemasMicrosoftComOfficeWord.CTBorder borderright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERRIGHT$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(borderright);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "borderright" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder insertNewBorderright(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().insert_element_user(BORDERRIGHT$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "borderright" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBorderright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERRIGHT$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "borderright" element
     */
    public void removeBorderright(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORDERRIGHT$40, i);
        }
    }
    
    /**
     * Gets a List of "ClientData" elements
     */
    public java.util.List<schemasMicrosoftComOfficeExcel.CTClientData> getClientDataList()
    {
        final class ClientDataList extends java.util.AbstractList<schemasMicrosoftComOfficeExcel.CTClientData>
        {
            public schemasMicrosoftComOfficeExcel.CTClientData get(int i)
                { return CTRectImpl.this.getClientDataArray(i); }
            
            public schemasMicrosoftComOfficeExcel.CTClientData set(int i, schemasMicrosoftComOfficeExcel.CTClientData o)
            {
                schemasMicrosoftComOfficeExcel.CTClientData old = CTRectImpl.this.getClientDataArray(i);
                CTRectImpl.this.setClientDataArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeExcel.CTClientData o)
                { CTRectImpl.this.insertNewClientData(i).set(o); }
            
            public schemasMicrosoftComOfficeExcel.CTClientData remove(int i)
            {
                schemasMicrosoftComOfficeExcel.CTClientData old = CTRectImpl.this.getClientDataArray(i);
                CTRectImpl.this.removeClientData(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfClientDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ClientDataList();
        }
    }
    
    /**
     * Gets array of all "ClientData" elements
     */
    public schemasMicrosoftComOfficeExcel.CTClientData[] getClientDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTDATA$42, targetList);
            schemasMicrosoftComOfficeExcel.CTClientData[] result = new schemasMicrosoftComOfficeExcel.CTClientData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ClientData" element
     */
    public schemasMicrosoftComOfficeExcel.CTClientData getClientDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().find_element_user(CLIENTDATA$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ClientData" element
     */
    public int sizeOfClientDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTDATA$42);
        }
    }
    
    /**
     * Sets array of all "ClientData" element
     */
    public void setClientDataArray(schemasMicrosoftComOfficeExcel.CTClientData[] clientDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientDataArray, CLIENTDATA$42);
        }
    }
    
    /**
     * Sets ith "ClientData" element
     */
    public void setClientDataArray(int i, schemasMicrosoftComOfficeExcel.CTClientData clientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().find_element_user(CLIENTDATA$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientData" element
     */
    public schemasMicrosoftComOfficeExcel.CTClientData insertNewClientData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().insert_element_user(CLIENTDATA$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClientData" element
     */
    public schemasMicrosoftComOfficeExcel.CTClientData addNewClientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeExcel.CTClientData target = null;
            target = (schemasMicrosoftComOfficeExcel.CTClientData)get_store().add_element_user(CLIENTDATA$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "ClientData" element
     */
    public void removeClientData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTDATA$42, i);
        }
    }
    
    /**
     * Gets a List of "textdata" elements
     */
    public java.util.List<schemasMicrosoftComOfficePowerpoint.CTRel> getTextdataList()
    {
        final class TextdataList extends java.util.AbstractList<schemasMicrosoftComOfficePowerpoint.CTRel>
        {
            public schemasMicrosoftComOfficePowerpoint.CTRel get(int i)
                { return CTRectImpl.this.getTextdataArray(i); }
            
            public schemasMicrosoftComOfficePowerpoint.CTRel set(int i, schemasMicrosoftComOfficePowerpoint.CTRel o)
            {
                schemasMicrosoftComOfficePowerpoint.CTRel old = CTRectImpl.this.getTextdataArray(i);
                CTRectImpl.this.setTextdataArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficePowerpoint.CTRel o)
                { CTRectImpl.this.insertNewTextdata(i).set(o); }
            
            public schemasMicrosoftComOfficePowerpoint.CTRel remove(int i)
            {
                schemasMicrosoftComOfficePowerpoint.CTRel old = CTRectImpl.this.getTextdataArray(i);
                CTRectImpl.this.removeTextdata(i);
                return old;
            }
            
            public int size()
                { return CTRectImpl.this.sizeOfTextdataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextdataList();
        }
    }
    
    /**
     * Gets array of all "textdata" elements
     */
    public schemasMicrosoftComOfficePowerpoint.CTRel[] getTextdataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTDATA$44, targetList);
            schemasMicrosoftComOfficePowerpoint.CTRel[] result = new schemasMicrosoftComOfficePowerpoint.CTRel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textdata" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTRel getTextdataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().find_element_user(TEXTDATA$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textdata" element
     */
    public int sizeOfTextdataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTDATA$44);
        }
    }
    
    /**
     * Sets array of all "textdata" element
     */
    public void setTextdataArray(schemasMicrosoftComOfficePowerpoint.CTRel[] textdataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textdataArray, TEXTDATA$44);
        }
    }
    
    /**
     * Sets ith "textdata" element
     */
    public void setTextdataArray(int i, schemasMicrosoftComOfficePowerpoint.CTRel textdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().find_element_user(TEXTDATA$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textdata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textdata" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTRel insertNewTextdata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().insert_element_user(TEXTDATA$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textdata" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTRel addNewTextdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTRel target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTRel)get_store().add_element_user(TEXTDATA$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "textdata" element
     */
    public void removeTextdata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTDATA$44, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$46);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$46) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$46);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$46);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$46);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public java.lang.String getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$48);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$48) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$48);
            }
            target.setStringValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.apache.xmlbeans.XmlString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$48);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$48);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlString xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$50);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$50) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$50);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlString href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HREF$50);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$50);
        }
    }
    
    /**
     * Gets the "target" attribute
     */
    public java.lang.String getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$52);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "target" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$52);
            return target;
        }
    }
    
    /**
     * True if has "target" attribute
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGET$52) != null;
        }
    }
    
    /**
     * Sets the "target" attribute
     */
    public void setTarget(java.lang.String targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$52);
            }
            target.setStringValue(targetValue);
        }
    }
    
    /**
     * Sets (as xml) the "target" attribute
     */
    public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$52);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Unsets the "target" attribute
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGET$52);
        }
    }
    
    /**
     * Gets the "class" attribute
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$54);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$54);
            return target;
        }
    }
    
    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$54) != null;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$54);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$54);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$54);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$56);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$56) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$56);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$56);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$56);
        }
    }
    
    /**
     * Gets the "alt" attribute
     */
    public java.lang.String getAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALT$58);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alt" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALT$58);
            return target;
        }
    }
    
    /**
     * True if has "alt" attribute
     */
    public boolean isSetAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALT$58) != null;
        }
    }
    
    /**
     * Sets the "alt" attribute
     */
    public void setAlt(java.lang.String alt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALT$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALT$58);
            }
            target.setStringValue(alt);
        }
    }
    
    /**
     * Sets (as xml) the "alt" attribute
     */
    public void xsetAlt(org.apache.xmlbeans.XmlString alt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALT$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALT$58);
            }
            target.set(alt);
        }
    }
    
    /**
     * Unsets the "alt" attribute
     */
    public void unsetAlt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALT$58);
        }
    }
    
    /**
     * Gets the "coordsize" attribute
     */
    public java.lang.String getCoordsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDSIZE$60);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coordsize" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCoordsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDSIZE$60);
            return target;
        }
    }
    
    /**
     * True if has "coordsize" attribute
     */
    public boolean isSetCoordsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COORDSIZE$60) != null;
        }
    }
    
    /**
     * Sets the "coordsize" attribute
     */
    public void setCoordsize(java.lang.String coordsize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDSIZE$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDSIZE$60);
            }
            target.setStringValue(coordsize);
        }
    }
    
    /**
     * Sets (as xml) the "coordsize" attribute
     */
    public void xsetCoordsize(org.apache.xmlbeans.XmlString coordsize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDSIZE$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COORDSIZE$60);
            }
            target.set(coordsize);
        }
    }
    
    /**
     * Unsets the "coordsize" attribute
     */
    public void unsetCoordsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COORDSIZE$60);
        }
    }
    
    /**
     * Gets the "coordorigin" attribute
     */
    public java.lang.String getCoordorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDORIGIN$62);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coordorigin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCoordorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDORIGIN$62);
            return target;
        }
    }
    
    /**
     * True if has "coordorigin" attribute
     */
    public boolean isSetCoordorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COORDORIGIN$62) != null;
        }
    }
    
    /**
     * Sets the "coordorigin" attribute
     */
    public void setCoordorigin(java.lang.String coordorigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDORIGIN$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDORIGIN$62);
            }
            target.setStringValue(coordorigin);
        }
    }
    
    /**
     * Sets (as xml) the "coordorigin" attribute
     */
    public void xsetCoordorigin(org.apache.xmlbeans.XmlString coordorigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDORIGIN$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COORDORIGIN$62);
            }
            target.set(coordorigin);
        }
    }
    
    /**
     * Unsets the "coordorigin" attribute
     */
    public void unsetCoordorigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COORDORIGIN$62);
        }
    }
    
    /**
     * Gets the "wrapcoords" attribute
     */
    public java.lang.String getWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPCOORDS$64);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrapcoords" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WRAPCOORDS$64);
            return target;
        }
    }
    
    /**
     * True if has "wrapcoords" attribute
     */
    public boolean isSetWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRAPCOORDS$64) != null;
        }
    }
    
    /**
     * Sets the "wrapcoords" attribute
     */
    public void setWrapcoords(java.lang.String wrapcoords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPCOORDS$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPCOORDS$64);
            }
            target.setStringValue(wrapcoords);
        }
    }
    
    /**
     * Sets (as xml) the "wrapcoords" attribute
     */
    public void xsetWrapcoords(org.apache.xmlbeans.XmlString wrapcoords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WRAPCOORDS$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WRAPCOORDS$64);
            }
            target.set(wrapcoords);
        }
    }
    
    /**
     * Unsets the "wrapcoords" attribute
     */
    public void unsetWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRAPCOORDS$64);
        }
    }
    
    /**
     * Gets the "print" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getPrint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINT$66);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "print" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetPrint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(PRINT$66);
            return target;
        }
    }
    
    /**
     * True if has "print" attribute
     */
    public boolean isSetPrint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRINT$66) != null;
        }
    }
    
    /**
     * Sets the "print" attribute
     */
    public void setPrint(schemasMicrosoftComVml.STTrueFalse.Enum print)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRINT$66);
            }
            target.setEnumValue(print);
        }
    }
    
    /**
     * Sets (as xml) the "print" attribute
     */
    public void xsetPrint(schemasMicrosoftComVml.STTrueFalse print)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(PRINT$66);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(PRINT$66);
            }
            target.set(print);
        }
    }
    
    /**
     * Unsets the "print" attribute
     */
    public void unsetPrint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRINT$66);
        }
    }
    
    /**
     * Gets the "spid" attribute
     */
    public java.lang.String getSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$68);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPID$68);
            return target;
        }
    }
    
    /**
     * True if has "spid" attribute
     */
    public boolean isSetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPID$68) != null;
        }
    }
    
    /**
     * Sets the "spid" attribute
     */
    public void setSpid(java.lang.String spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$68);
            }
            target.setStringValue(spid);
        }
    }
    
    /**
     * Sets (as xml) the "spid" attribute
     */
    public void xsetSpid(org.apache.xmlbeans.XmlString spid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPID$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPID$68);
            }
            target.set(spid);
        }
    }
    
    /**
     * Unsets the "spid" attribute
     */
    public void unsetSpid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPID$68);
        }
    }
    
    /**
     * Gets the "oned" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONED$70);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "oned" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ONED$70);
            return target;
        }
    }
    
    /**
     * True if has "oned" attribute
     */
    public boolean isSetOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ONED$70) != null;
        }
    }
    
    /**
     * Sets the "oned" attribute
     */
    public void setOned(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum oned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONED$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONED$70);
            }
            target.setEnumValue(oned);
        }
    }
    
    /**
     * Sets (as xml) the "oned" attribute
     */
    public void xsetOned(schemasMicrosoftComOfficeOffice.STTrueFalse oned)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ONED$70);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ONED$70);
            }
            target.set(oned);
        }
    }
    
    /**
     * Unsets the "oned" attribute
     */
    public void unsetOned()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ONED$70);
        }
    }
    
    /**
     * Gets the "regroupid" attribute
     */
    public java.math.BigInteger getRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGROUPID$72);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "regroupid" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REGROUPID$72);
            return target;
        }
    }
    
    /**
     * True if has "regroupid" attribute
     */
    public boolean isSetRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REGROUPID$72) != null;
        }
    }
    
    /**
     * Sets the "regroupid" attribute
     */
    public void setRegroupid(java.math.BigInteger regroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGROUPID$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGROUPID$72);
            }
            target.setBigIntegerValue(regroupid);
        }
    }
    
    /**
     * Sets (as xml) the "regroupid" attribute
     */
    public void xsetRegroupid(org.apache.xmlbeans.XmlInteger regroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REGROUPID$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REGROUPID$72);
            }
            target.set(regroupid);
        }
    }
    
    /**
     * Unsets the "regroupid" attribute
     */
    public void unsetRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REGROUPID$72);
        }
    }
    
    /**
     * Gets the "doubleclicknotify" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLECLICKNOTIFY$74);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleclicknotify" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DOUBLECLICKNOTIFY$74);
            return target;
        }
    }
    
    /**
     * True if has "doubleclicknotify" attribute
     */
    public boolean isSetDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOUBLECLICKNOTIFY$74) != null;
        }
    }
    
    /**
     * Sets the "doubleclicknotify" attribute
     */
    public void setDoubleclicknotify(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum doubleclicknotify)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLECLICKNOTIFY$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOUBLECLICKNOTIFY$74);
            }
            target.setEnumValue(doubleclicknotify);
        }
    }
    
    /**
     * Sets (as xml) the "doubleclicknotify" attribute
     */
    public void xsetDoubleclicknotify(schemasMicrosoftComOfficeOffice.STTrueFalse doubleclicknotify)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DOUBLECLICKNOTIFY$74);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(DOUBLECLICKNOTIFY$74);
            }
            target.set(doubleclicknotify);
        }
    }
    
    /**
     * Unsets the "doubleclicknotify" attribute
     */
    public void unsetDoubleclicknotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOUBLECLICKNOTIFY$74);
        }
    }
    
    /**
     * Gets the "button" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUTTON$76);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "button" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BUTTON$76);
            return target;
        }
    }
    
    /**
     * True if has "button" attribute
     */
    public boolean isSetButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BUTTON$76) != null;
        }
    }
    
    /**
     * Sets the "button" attribute
     */
    public void setButton(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum button)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUTTON$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUTTON$76);
            }
            target.setEnumValue(button);
        }
    }
    
    /**
     * Sets (as xml) the "button" attribute
     */
    public void xsetButton(schemasMicrosoftComOfficeOffice.STTrueFalse button)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BUTTON$76);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(BUTTON$76);
            }
            target.set(button);
        }
    }
    
    /**
     * Unsets the "button" attribute
     */
    public void unsetButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BUTTON$76);
        }
    }
    
    /**
     * Gets the "userhidden" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERHIDDEN$78);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "userhidden" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERHIDDEN$78);
            return target;
        }
    }
    
    /**
     * True if has "userhidden" attribute
     */
    public boolean isSetUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERHIDDEN$78) != null;
        }
    }
    
    /**
     * Sets the "userhidden" attribute
     */
    public void setUserhidden(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum userhidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERHIDDEN$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERHIDDEN$78);
            }
            target.setEnumValue(userhidden);
        }
    }
    
    /**
     * Sets (as xml) the "userhidden" attribute
     */
    public void xsetUserhidden(schemasMicrosoftComOfficeOffice.STTrueFalse userhidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERHIDDEN$78);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(USERHIDDEN$78);
            }
            target.set(userhidden);
        }
    }
    
    /**
     * Unsets the "userhidden" attribute
     */
    public void unsetUserhidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERHIDDEN$78);
        }
    }
    
    /**
     * Gets the "bullet" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BULLET$80);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bullet" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BULLET$80);
            return target;
        }
    }
    
    /**
     * True if has "bullet" attribute
     */
    public boolean isSetBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BULLET$80) != null;
        }
    }
    
    /**
     * Sets the "bullet" attribute
     */
    public void setBullet(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum bullet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BULLET$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BULLET$80);
            }
            target.setEnumValue(bullet);
        }
    }
    
    /**
     * Sets (as xml) the "bullet" attribute
     */
    public void xsetBullet(schemasMicrosoftComOfficeOffice.STTrueFalse bullet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BULLET$80);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(BULLET$80);
            }
            target.set(bullet);
        }
    }
    
    /**
     * Unsets the "bullet" attribute
     */
    public void unsetBullet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BULLET$80);
        }
    }
    
    /**
     * Gets the "hr" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HR$82);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hr" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HR$82);
            return target;
        }
    }
    
    /**
     * True if has "hr" attribute
     */
    public boolean isSetHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HR$82) != null;
        }
    }
    
    /**
     * Sets the "hr" attribute
     */
    public void setHr(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HR$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HR$82);
            }
            target.setEnumValue(hr);
        }
    }
    
    /**
     * Sets (as xml) the "hr" attribute
     */
    public void xsetHr(schemasMicrosoftComOfficeOffice.STTrueFalse hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HR$82);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HR$82);
            }
            target.set(hr);
        }
    }
    
    /**
     * Unsets the "hr" attribute
     */
    public void unsetHr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HR$82);
        }
    }
    
    /**
     * Gets the "hrstd" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRSTD$84);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hrstd" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRSTD$84);
            return target;
        }
    }
    
    /**
     * True if has "hrstd" attribute
     */
    public boolean isSetHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRSTD$84) != null;
        }
    }
    
    /**
     * Sets the "hrstd" attribute
     */
    public void setHrstd(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hrstd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRSTD$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRSTD$84);
            }
            target.setEnumValue(hrstd);
        }
    }
    
    /**
     * Sets (as xml) the "hrstd" attribute
     */
    public void xsetHrstd(schemasMicrosoftComOfficeOffice.STTrueFalse hrstd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRSTD$84);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HRSTD$84);
            }
            target.set(hrstd);
        }
    }
    
    /**
     * Unsets the "hrstd" attribute
     */
    public void unsetHrstd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRSTD$84);
        }
    }
    
    /**
     * Gets the "hrnoshade" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRNOSHADE$86);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hrnoshade" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRNOSHADE$86);
            return target;
        }
    }
    
    /**
     * True if has "hrnoshade" attribute
     */
    public boolean isSetHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRNOSHADE$86) != null;
        }
    }
    
    /**
     * Sets the "hrnoshade" attribute
     */
    public void setHrnoshade(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum hrnoshade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRNOSHADE$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRNOSHADE$86);
            }
            target.setEnumValue(hrnoshade);
        }
    }
    
    /**
     * Sets (as xml) the "hrnoshade" attribute
     */
    public void xsetHrnoshade(schemasMicrosoftComOfficeOffice.STTrueFalse hrnoshade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRNOSHADE$86);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HRNOSHADE$86);
            }
            target.set(hrnoshade);
        }
    }
    
    /**
     * Unsets the "hrnoshade" attribute
     */
    public void unsetHrnoshade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRNOSHADE$86);
        }
    }
    
    /**
     * Gets the "hrpct" attribute
     */
    public float getHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRPCT$88);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "hrpct" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(HRPCT$88);
            return target;
        }
    }
    
    /**
     * True if has "hrpct" attribute
     */
    public boolean isSetHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRPCT$88) != null;
        }
    }
    
    /**
     * Sets the "hrpct" attribute
     */
    public void setHrpct(float hrpct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRPCT$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRPCT$88);
            }
            target.setFloatValue(hrpct);
        }
    }
    
    /**
     * Sets (as xml) the "hrpct" attribute
     */
    public void xsetHrpct(org.apache.xmlbeans.XmlFloat hrpct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(HRPCT$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(HRPCT$88);
            }
            target.set(hrpct);
        }
    }
    
    /**
     * Unsets the "hrpct" attribute
     */
    public void unsetHrpct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRPCT$88);
        }
    }
    
    /**
     * Gets the "hralign" attribute
     */
    public schemasMicrosoftComOfficeOffice.STHrAlign.Enum getHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRALIGN$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HRALIGN$90);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STHrAlign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hralign" attribute
     */
    public schemasMicrosoftComOfficeOffice.STHrAlign xgetHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STHrAlign target = null;
            target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().find_attribute_user(HRALIGN$90);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_default_attribute_value(HRALIGN$90);
            }
            return target;
        }
    }
    
    /**
     * True if has "hralign" attribute
     */
    public boolean isSetHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HRALIGN$90) != null;
        }
    }
    
    /**
     * Sets the "hralign" attribute
     */
    public void setHralign(schemasMicrosoftComOfficeOffice.STHrAlign.Enum hralign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRALIGN$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRALIGN$90);
            }
            target.setEnumValue(hralign);
        }
    }
    
    /**
     * Sets (as xml) the "hralign" attribute
     */
    public void xsetHralign(schemasMicrosoftComOfficeOffice.STHrAlign hralign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STHrAlign target = null;
            target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().find_attribute_user(HRALIGN$90);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().add_attribute_user(HRALIGN$90);
            }
            target.set(hralign);
        }
    }
    
    /**
     * Unsets the "hralign" attribute
     */
    public void unsetHralign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HRALIGN$90);
        }
    }
    
    /**
     * Gets the "allowincell" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$92);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowincell" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$92);
            return target;
        }
    }
    
    /**
     * True if has "allowincell" attribute
     */
    public boolean isSetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWINCELL$92) != null;
        }
    }
    
    /**
     * Sets the "allowincell" attribute
     */
    public void setAllowincell(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowincell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWINCELL$92);
            }
            target.setEnumValue(allowincell);
        }
    }
    
    /**
     * Sets (as xml) the "allowincell" attribute
     */
    public void xsetAllowincell(schemasMicrosoftComOfficeOffice.STTrueFalse allowincell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$92);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWINCELL$92);
            }
            target.set(allowincell);
        }
    }
    
    /**
     * Unsets the "allowincell" attribute
     */
    public void unsetAllowincell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWINCELL$92);
        }
    }
    
    /**
     * Gets the "allowoverlap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$94);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowoverlap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWOVERLAP$94);
            return target;
        }
    }
    
    /**
     * True if has "allowoverlap" attribute
     */
    public boolean isSetAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWOVERLAP$94) != null;
        }
    }
    
    /**
     * Sets the "allowoverlap" attribute
     */
    public void setAllowoverlap(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum allowoverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWOVERLAP$94);
            }
            target.setEnumValue(allowoverlap);
        }
    }
    
    /**
     * Sets (as xml) the "allowoverlap" attribute
     */
    public void xsetAllowoverlap(schemasMicrosoftComOfficeOffice.STTrueFalse allowoverlap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWOVERLAP$94);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWOVERLAP$94);
            }
            target.set(allowoverlap);
        }
    }
    
    /**
     * Unsets the "allowoverlap" attribute
     */
    public void unsetAllowoverlap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWOVERLAP$94);
        }
    }
    
    /**
     * Gets the "userdrawn" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$96);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "userdrawn" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERDRAWN$96);
            return target;
        }
    }
    
    /**
     * True if has "userdrawn" attribute
     */
    public boolean isSetUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERDRAWN$96) != null;
        }
    }
    
    /**
     * Sets the "userdrawn" attribute
     */
    public void setUserdrawn(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum userdrawn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERDRAWN$96);
            }
            target.setEnumValue(userdrawn);
        }
    }
    
    /**
     * Sets (as xml) the "userdrawn" attribute
     */
    public void xsetUserdrawn(schemasMicrosoftComOfficeOffice.STTrueFalse userdrawn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERDRAWN$96);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(USERDRAWN$96);
            }
            target.set(userdrawn);
        }
    }
    
    /**
     * Unsets the "userdrawn" attribute
     */
    public void unsetUserdrawn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERDRAWN$96);
        }
    }
    
    /**
     * Gets the "bordertopcolor" attribute
     */
    public java.lang.String getBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOPCOLOR$98);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bordertopcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERTOPCOLOR$98);
            return target;
        }
    }
    
    /**
     * True if has "bordertopcolor" attribute
     */
    public boolean isSetBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERTOPCOLOR$98) != null;
        }
    }
    
    /**
     * Sets the "bordertopcolor" attribute
     */
    public void setBordertopcolor(java.lang.String bordertopcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOPCOLOR$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERTOPCOLOR$98);
            }
            target.setStringValue(bordertopcolor);
        }
    }
    
    /**
     * Sets (as xml) the "bordertopcolor" attribute
     */
    public void xsetBordertopcolor(org.apache.xmlbeans.XmlString bordertopcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERTOPCOLOR$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERTOPCOLOR$98);
            }
            target.set(bordertopcolor);
        }
    }
    
    /**
     * Unsets the "bordertopcolor" attribute
     */
    public void unsetBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERTOPCOLOR$98);
        }
    }
    
    /**
     * Gets the "borderleftcolor" attribute
     */
    public java.lang.String getBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFTCOLOR$100);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderleftcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERLEFTCOLOR$100);
            return target;
        }
    }
    
    /**
     * True if has "borderleftcolor" attribute
     */
    public boolean isSetBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERLEFTCOLOR$100) != null;
        }
    }
    
    /**
     * Sets the "borderleftcolor" attribute
     */
    public void setBorderleftcolor(java.lang.String borderleftcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFTCOLOR$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERLEFTCOLOR$100);
            }
            target.setStringValue(borderleftcolor);
        }
    }
    
    /**
     * Sets (as xml) the "borderleftcolor" attribute
     */
    public void xsetBorderleftcolor(org.apache.xmlbeans.XmlString borderleftcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERLEFTCOLOR$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERLEFTCOLOR$100);
            }
            target.set(borderleftcolor);
        }
    }
    
    /**
     * Unsets the "borderleftcolor" attribute
     */
    public void unsetBorderleftcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERLEFTCOLOR$100);
        }
    }
    
    /**
     * Gets the "borderbottomcolor" attribute
     */
    public java.lang.String getBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOMCOLOR$102);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderbottomcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERBOTTOMCOLOR$102);
            return target;
        }
    }
    
    /**
     * True if has "borderbottomcolor" attribute
     */
    public boolean isSetBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERBOTTOMCOLOR$102) != null;
        }
    }
    
    /**
     * Sets the "borderbottomcolor" attribute
     */
    public void setBorderbottomcolor(java.lang.String borderbottomcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOMCOLOR$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERBOTTOMCOLOR$102);
            }
            target.setStringValue(borderbottomcolor);
        }
    }
    
    /**
     * Sets (as xml) the "borderbottomcolor" attribute
     */
    public void xsetBorderbottomcolor(org.apache.xmlbeans.XmlString borderbottomcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERBOTTOMCOLOR$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERBOTTOMCOLOR$102);
            }
            target.set(borderbottomcolor);
        }
    }
    
    /**
     * Unsets the "borderbottomcolor" attribute
     */
    public void unsetBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERBOTTOMCOLOR$102);
        }
    }
    
    /**
     * Gets the "borderrightcolor" attribute
     */
    public java.lang.String getBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHTCOLOR$104);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderrightcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERRIGHTCOLOR$104);
            return target;
        }
    }
    
    /**
     * True if has "borderrightcolor" attribute
     */
    public boolean isSetBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERRIGHTCOLOR$104) != null;
        }
    }
    
    /**
     * Sets the "borderrightcolor" attribute
     */
    public void setBorderrightcolor(java.lang.String borderrightcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHTCOLOR$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERRIGHTCOLOR$104);
            }
            target.setStringValue(borderrightcolor);
        }
    }
    
    /**
     * Sets (as xml) the "borderrightcolor" attribute
     */
    public void xsetBorderrightcolor(org.apache.xmlbeans.XmlString borderrightcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERRIGHTCOLOR$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERRIGHTCOLOR$104);
            }
            target.set(borderrightcolor);
        }
    }
    
    /**
     * Unsets the "borderrightcolor" attribute
     */
    public void unsetBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERRIGHTCOLOR$104);
        }
    }
    
    /**
     * Gets the "dgmlayout" attribute
     */
    public java.math.BigInteger getDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUT$106);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmlayout" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUT$106);
            return target;
        }
    }
    
    /**
     * True if has "dgmlayout" attribute
     */
    public boolean isSetDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMLAYOUT$106) != null;
        }
    }
    
    /**
     * Sets the "dgmlayout" attribute
     */
    public void setDgmlayout(java.math.BigInteger dgmlayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUT$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMLAYOUT$106);
            }
            target.setBigIntegerValue(dgmlayout);
        }
    }
    
    /**
     * Sets (as xml) the "dgmlayout" attribute
     */
    public void xsetDgmlayout(org.apache.xmlbeans.XmlInteger dgmlayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUT$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMLAYOUT$106);
            }
            target.set(dgmlayout);
        }
    }
    
    /**
     * Unsets the "dgmlayout" attribute
     */
    public void unsetDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMLAYOUT$106);
        }
    }
    
    /**
     * Gets the "dgmnodekind" attribute
     */
    public java.math.BigInteger getDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMNODEKIND$108);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmnodekind" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMNODEKIND$108);
            return target;
        }
    }
    
    /**
     * True if has "dgmnodekind" attribute
     */
    public boolean isSetDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMNODEKIND$108) != null;
        }
    }
    
    /**
     * Sets the "dgmnodekind" attribute
     */
    public void setDgmnodekind(java.math.BigInteger dgmnodekind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMNODEKIND$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMNODEKIND$108);
            }
            target.setBigIntegerValue(dgmnodekind);
        }
    }
    
    /**
     * Sets (as xml) the "dgmnodekind" attribute
     */
    public void xsetDgmnodekind(org.apache.xmlbeans.XmlInteger dgmnodekind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMNODEKIND$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMNODEKIND$108);
            }
            target.set(dgmnodekind);
        }
    }
    
    /**
     * Unsets the "dgmnodekind" attribute
     */
    public void unsetDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMNODEKIND$108);
        }
    }
    
    /**
     * Gets the "dgmlayoutmru" attribute
     */
    public java.math.BigInteger getDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUTMRU$110);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmlayoutmru" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUTMRU$110);
            return target;
        }
    }
    
    /**
     * True if has "dgmlayoutmru" attribute
     */
    public boolean isSetDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMLAYOUTMRU$110) != null;
        }
    }
    
    /**
     * Sets the "dgmlayoutmru" attribute
     */
    public void setDgmlayoutmru(java.math.BigInteger dgmlayoutmru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUTMRU$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMLAYOUTMRU$110);
            }
            target.setBigIntegerValue(dgmlayoutmru);
        }
    }
    
    /**
     * Sets (as xml) the "dgmlayoutmru" attribute
     */
    public void xsetDgmlayoutmru(org.apache.xmlbeans.XmlInteger dgmlayoutmru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUTMRU$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMLAYOUTMRU$110);
            }
            target.set(dgmlayoutmru);
        }
    }
    
    /**
     * Unsets the "dgmlayoutmru" attribute
     */
    public void unsetDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMLAYOUTMRU$110);
        }
    }
    
    /**
     * Gets the "insetmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STInsetMode.Enum getInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSETMODE$112);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STInsetMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insetmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STInsetMode xgetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STInsetMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$112);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_default_attribute_value(INSETMODE$112);
            }
            return target;
        }
    }
    
    /**
     * True if has "insetmode" attribute
     */
    public boolean isSetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSETMODE$112) != null;
        }
    }
    
    /**
     * Sets the "insetmode" attribute
     */
    public void setInsetmode(schemasMicrosoftComOfficeOffice.STInsetMode.Enum insetmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETMODE$112);
            }
            target.setEnumValue(insetmode);
        }
    }
    
    /**
     * Sets (as xml) the "insetmode" attribute
     */
    public void xsetInsetmode(schemasMicrosoftComOfficeOffice.STInsetMode insetmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STInsetMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$112);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().add_attribute_user(INSETMODE$112);
            }
            target.set(insetmode);
        }
    }
    
    /**
     * Unsets the "insetmode" attribute
     */
    public void unsetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSETMODE$112);
        }
    }
    
    /**
     * Gets the "chromakey" attribute
     */
    public java.lang.String getChromakey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHROMAKEY$114);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chromakey" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetChromakey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(CHROMAKEY$114);
            return target;
        }
    }
    
    /**
     * True if has "chromakey" attribute
     */
    public boolean isSetChromakey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHROMAKEY$114) != null;
        }
    }
    
    /**
     * Sets the "chromakey" attribute
     */
    public void setChromakey(java.lang.String chromakey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHROMAKEY$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHROMAKEY$114);
            }
            target.setStringValue(chromakey);
        }
    }
    
    /**
     * Sets (as xml) the "chromakey" attribute
     */
    public void xsetChromakey(schemasMicrosoftComVml.STColorType chromakey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(CHROMAKEY$114);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(CHROMAKEY$114);
            }
            target.set(chromakey);
        }
    }
    
    /**
     * Unsets the "chromakey" attribute
     */
    public void unsetChromakey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHROMAKEY$114);
        }
    }
    
    /**
     * Gets the "filled" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLED$116);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "filled" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLED$116);
            return target;
        }
    }
    
    /**
     * True if has "filled" attribute
     */
    public boolean isSetFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLED$116) != null;
        }
    }
    
    /**
     * Sets the "filled" attribute
     */
    public void setFilled(schemasMicrosoftComVml.STTrueFalse.Enum filled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLED$116);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLED$116);
            }
            target.setEnumValue(filled);
        }
    }
    
    /**
     * Sets (as xml) the "filled" attribute
     */
    public void xsetFilled(schemasMicrosoftComVml.STTrueFalse filled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLED$116);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(FILLED$116);
            }
            target.set(filled);
        }
    }
    
    /**
     * Unsets the "filled" attribute
     */
    public void unsetFilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLED$116);
        }
    }
    
    /**
     * Gets the "fillcolor" attribute
     */
    public java.lang.String getFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$118);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(FILLCOLOR$118);
            return target;
        }
    }
    
    /**
     * True if has "fillcolor" attribute
     */
    public boolean isSetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILLCOLOR$118) != null;
        }
    }
    
    /**
     * Sets the "fillcolor" attribute
     */
    public void setFillcolor(java.lang.String fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$118);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLCOLOR$118);
            }
            target.setStringValue(fillcolor);
        }
    }
    
    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    public void xsetFillcolor(schemasMicrosoftComVml.STColorType fillcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(FILLCOLOR$118);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(FILLCOLOR$118);
            }
            target.set(fillcolor);
        }
    }
    
    /**
     * Unsets the "fillcolor" attribute
     */
    public void unsetFillcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILLCOLOR$118);
        }
    }
    
    /**
     * Gets the "opacity" attribute
     */
    public java.lang.String getOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY$120);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "opacity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY$120);
            return target;
        }
    }
    
    /**
     * True if has "opacity" attribute
     */
    public boolean isSetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPACITY$120) != null;
        }
    }
    
    /**
     * Sets the "opacity" attribute
     */
    public void setOpacity(java.lang.String opacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPACITY$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPACITY$120);
            }
            target.setStringValue(opacity);
        }
    }
    
    /**
     * Sets (as xml) the "opacity" attribute
     */
    public void xsetOpacity(org.apache.xmlbeans.XmlString opacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPACITY$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPACITY$120);
            }
            target.set(opacity);
        }
    }
    
    /**
     * Unsets the "opacity" attribute
     */
    public void unsetOpacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPACITY$120);
        }
    }
    
    /**
     * Gets the "stroked" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getStroked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKED$122);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "stroked" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetStroked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(STROKED$122);
            return target;
        }
    }
    
    /**
     * True if has "stroked" attribute
     */
    public boolean isSetStroked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKED$122) != null;
        }
    }
    
    /**
     * Sets the "stroked" attribute
     */
    public void setStroked(schemasMicrosoftComVml.STTrueFalse.Enum stroked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKED$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKED$122);
            }
            target.setEnumValue(stroked);
        }
    }
    
    /**
     * Sets (as xml) the "stroked" attribute
     */
    public void xsetStroked(schemasMicrosoftComVml.STTrueFalse stroked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(STROKED$122);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(STROKED$122);
            }
            target.set(stroked);
        }
    }
    
    /**
     * Unsets the "stroked" attribute
     */
    public void unsetStroked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKED$122);
        }
    }
    
    /**
     * Gets the "strokecolor" attribute
     */
    public java.lang.String getStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKECOLOR$124);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "strokecolor" attribute
     */
    public schemasMicrosoftComVml.STColorType xgetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(STROKECOLOR$124);
            return target;
        }
    }
    
    /**
     * True if has "strokecolor" attribute
     */
    public boolean isSetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKECOLOR$124) != null;
        }
    }
    
    /**
     * Sets the "strokecolor" attribute
     */
    public void setStrokecolor(java.lang.String strokecolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKECOLOR$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKECOLOR$124);
            }
            target.setStringValue(strokecolor);
        }
    }
    
    /**
     * Sets (as xml) the "strokecolor" attribute
     */
    public void xsetStrokecolor(schemasMicrosoftComVml.STColorType strokecolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STColorType target = null;
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(STROKECOLOR$124);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(STROKECOLOR$124);
            }
            target.set(strokecolor);
        }
    }
    
    /**
     * Unsets the "strokecolor" attribute
     */
    public void unsetStrokecolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKECOLOR$124);
        }
    }
    
    /**
     * Gets the "strokeweight" attribute
     */
    public java.lang.String getStrokeweight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKEWEIGHT$126);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "strokeweight" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStrokeweight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STROKEWEIGHT$126);
            return target;
        }
    }
    
    /**
     * True if has "strokeweight" attribute
     */
    public boolean isSetStrokeweight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKEWEIGHT$126) != null;
        }
    }
    
    /**
     * Sets the "strokeweight" attribute
     */
    public void setStrokeweight(java.lang.String strokeweight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKEWEIGHT$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKEWEIGHT$126);
            }
            target.setStringValue(strokeweight);
        }
    }
    
    /**
     * Sets (as xml) the "strokeweight" attribute
     */
    public void xsetStrokeweight(org.apache.xmlbeans.XmlString strokeweight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STROKEWEIGHT$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STROKEWEIGHT$126);
            }
            target.set(strokeweight);
        }
    }
    
    /**
     * Unsets the "strokeweight" attribute
     */
    public void unsetStrokeweight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKEWEIGHT$126);
        }
    }
    
    /**
     * Gets the "insetpen" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse.Enum getInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETPEN$128);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insetpen" attribute
     */
    public schemasMicrosoftComVml.STTrueFalse xgetInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INSETPEN$128);
            return target;
        }
    }
    
    /**
     * True if has "insetpen" attribute
     */
    public boolean isSetInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSETPEN$128) != null;
        }
    }
    
    /**
     * Sets the "insetpen" attribute
     */
    public void setInsetpen(schemasMicrosoftComVml.STTrueFalse.Enum insetpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETPEN$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETPEN$128);
            }
            target.setEnumValue(insetpen);
        }
    }
    
    /**
     * Sets (as xml) the "insetpen" attribute
     */
    public void xsetInsetpen(schemasMicrosoftComVml.STTrueFalse insetpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STTrueFalse target = null;
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(INSETPEN$128);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(INSETPEN$128);
            }
            target.set(insetpen);
        }
    }
    
    /**
     * Unsets the "insetpen" attribute
     */
    public void unsetInsetpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSETPEN$128);
        }
    }
    
    /**
     * Gets the "spt" attribute
     */
    public float getSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPT$130);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "spt" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SPT$130);
            return target;
        }
    }
    
    /**
     * True if has "spt" attribute
     */
    public boolean isSetSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPT$130) != null;
        }
    }
    
    /**
     * Sets the "spt" attribute
     */
    public void setSpt(float spt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPT$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPT$130);
            }
            target.setFloatValue(spt);
        }
    }
    
    /**
     * Sets (as xml) the "spt" attribute
     */
    public void xsetSpt(org.apache.xmlbeans.XmlFloat spt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SPT$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(SPT$130);
            }
            target.set(spt);
        }
    }
    
    /**
     * Unsets the "spt" attribute
     */
    public void unsetSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPT$130);
        }
    }
    
    /**
     * Gets the "connectortype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectorType.Enum getConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTORTYPE$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONNECTORTYPE$132);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STConnectorType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectortype" attribute
     */
    public schemasMicrosoftComOfficeOffice.STConnectorType xgetConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_store().find_attribute_user(CONNECTORTYPE$132);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_default_attribute_value(CONNECTORTYPE$132);
            }
            return target;
        }
    }
    
    /**
     * True if has "connectortype" attribute
     */
    public boolean isSetConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTORTYPE$132) != null;
        }
    }
    
    /**
     * Sets the "connectortype" attribute
     */
    public void setConnectortype(schemasMicrosoftComOfficeOffice.STConnectorType.Enum connectortype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTORTYPE$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTORTYPE$132);
            }
            target.setEnumValue(connectortype);
        }
    }
    
    /**
     * Sets (as xml) the "connectortype" attribute
     */
    public void xsetConnectortype(schemasMicrosoftComOfficeOffice.STConnectorType connectortype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STConnectorType target = null;
            target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_store().find_attribute_user(CONNECTORTYPE$132);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STConnectorType)get_store().add_attribute_user(CONNECTORTYPE$132);
            }
            target.set(connectortype);
        }
    }
    
    /**
     * Unsets the "connectortype" attribute
     */
    public void unsetConnectortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTORTYPE$132);
        }
    }
    
    /**
     * Gets the "bwmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$134);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWMODE$134);
            return target;
        }
    }
    
    /**
     * True if has "bwmode" attribute
     */
    public boolean isSetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWMODE$134) != null;
        }
    }
    
    /**
     * Sets the "bwmode" attribute
     */
    public void setBwmode(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWMODE$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWMODE$134);
            }
            target.setEnumValue(bwmode);
        }
    }
    
    /**
     * Sets (as xml) the "bwmode" attribute
     */
    public void xsetBwmode(schemasMicrosoftComOfficeOffice.STBWMode bwmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWMODE$134);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWMODE$134);
            }
            target.set(bwmode);
        }
    }
    
    /**
     * Unsets the "bwmode" attribute
     */
    public void unsetBwmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWMODE$134);
        }
    }
    
    /**
     * Gets the "bwpure" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWPURE$136);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwpure" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWPURE$136);
            return target;
        }
    }
    
    /**
     * True if has "bwpure" attribute
     */
    public boolean isSetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWPURE$136) != null;
        }
    }
    
    /**
     * Sets the "bwpure" attribute
     */
    public void setBwpure(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwpure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWPURE$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWPURE$136);
            }
            target.setEnumValue(bwpure);
        }
    }
    
    /**
     * Sets (as xml) the "bwpure" attribute
     */
    public void xsetBwpure(schemasMicrosoftComOfficeOffice.STBWMode bwpure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWPURE$136);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWPURE$136);
            }
            target.set(bwpure);
        }
    }
    
    /**
     * Unsets the "bwpure" attribute
     */
    public void unsetBwpure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWPURE$136);
        }
    }
    
    /**
     * Gets the "bwnormal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode.Enum getBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWNORMAL$138);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STBWMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    public schemasMicrosoftComOfficeOffice.STBWMode xgetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWNORMAL$138);
            return target;
        }
    }
    
    /**
     * True if has "bwnormal" attribute
     */
    public boolean isSetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BWNORMAL$138) != null;
        }
    }
    
    /**
     * Sets the "bwnormal" attribute
     */
    public void setBwnormal(schemasMicrosoftComOfficeOffice.STBWMode.Enum bwnormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BWNORMAL$138);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BWNORMAL$138);
            }
            target.setEnumValue(bwnormal);
        }
    }
    
    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    public void xsetBwnormal(schemasMicrosoftComOfficeOffice.STBWMode bwnormal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STBWMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().find_attribute_user(BWNORMAL$138);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STBWMode)get_store().add_attribute_user(BWNORMAL$138);
            }
            target.set(bwnormal);
        }
    }
    
    /**
     * Unsets the "bwnormal" attribute
     */
    public void unsetBwnormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BWNORMAL$138);
        }
    }
    
    /**
     * Gets the "forcedash" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEDASH$140);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "forcedash" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FORCEDASH$140);
            return target;
        }
    }
    
    /**
     * True if has "forcedash" attribute
     */
    public boolean isSetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORCEDASH$140) != null;
        }
    }
    
    /**
     * Sets the "forcedash" attribute
     */
    public void setForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum forcedash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEDASH$140);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORCEDASH$140);
            }
            target.setEnumValue(forcedash);
        }
    }
    
    /**
     * Sets (as xml) the "forcedash" attribute
     */
    public void xsetForcedash(schemasMicrosoftComOfficeOffice.STTrueFalse forcedash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(FORCEDASH$140);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(FORCEDASH$140);
            }
            target.set(forcedash);
        }
    }
    
    /**
     * Unsets the "forcedash" attribute
     */
    public void unsetForcedash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORCEDASH$140);
        }
    }
    
    /**
     * Gets the "oleicon" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEICON$142);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "oleicon" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(OLEICON$142);
            return target;
        }
    }
    
    /**
     * True if has "oleicon" attribute
     */
    public boolean isSetOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLEICON$142) != null;
        }
    }
    
    /**
     * Sets the "oleicon" attribute
     */
    public void setOleicon(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum oleicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEICON$142);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLEICON$142);
            }
            target.setEnumValue(oleicon);
        }
    }
    
    /**
     * Sets (as xml) the "oleicon" attribute
     */
    public void xsetOleicon(schemasMicrosoftComOfficeOffice.STTrueFalse oleicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(OLEICON$142);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(OLEICON$142);
            }
            target.set(oleicon);
        }
    }
    
    /**
     * Unsets the "oleicon" attribute
     */
    public void unsetOleicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLEICON$142);
        }
    }
    
    /**
     * Gets the "ole" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum getOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLE$144);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ole" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank xgetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(OLE$144);
            return target;
        }
    }
    
    /**
     * True if has "ole" attribute
     */
    public boolean isSetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLE$144) != null;
        }
    }
    
    /**
     * Sets the "ole" attribute
     */
    public void setOle(schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum ole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLE$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLE$144);
            }
            target.setEnumValue(ole);
        }
    }
    
    /**
     * Sets (as xml) the "ole" attribute
     */
    public void xsetOle(schemasMicrosoftComOfficeOffice.STTrueFalseBlank ole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(OLE$144);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().add_attribute_user(OLE$144);
            }
            target.set(ole);
        }
    }
    
    /**
     * Unsets the "ole" attribute
     */
    public void unsetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLE$144);
        }
    }
    
    /**
     * Gets the "preferrelative" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERRELATIVE$146);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferrelative" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(PREFERRELATIVE$146);
            return target;
        }
    }
    
    /**
     * True if has "preferrelative" attribute
     */
    public boolean isSetPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREFERRELATIVE$146) != null;
        }
    }
    
    /**
     * Sets the "preferrelative" attribute
     */
    public void setPreferrelative(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum preferrelative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERRELATIVE$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERRELATIVE$146);
            }
            target.setEnumValue(preferrelative);
        }
    }
    
    /**
     * Sets (as xml) the "preferrelative" attribute
     */
    public void xsetPreferrelative(schemasMicrosoftComOfficeOffice.STTrueFalse preferrelative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(PREFERRELATIVE$146);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(PREFERRELATIVE$146);
            }
            target.set(preferrelative);
        }
    }
    
    /**
     * Unsets the "preferrelative" attribute
     */
    public void unsetPreferrelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREFERRELATIVE$146);
        }
    }
    
    /**
     * Gets the "cliptowrap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIPTOWRAP$148);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cliptowrap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIPTOWRAP$148);
            return target;
        }
    }
    
    /**
     * True if has "cliptowrap" attribute
     */
    public boolean isSetCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIPTOWRAP$148) != null;
        }
    }
    
    /**
     * Sets the "cliptowrap" attribute
     */
    public void setCliptowrap(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum cliptowrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIPTOWRAP$148);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIPTOWRAP$148);
            }
            target.setEnumValue(cliptowrap);
        }
    }
    
    /**
     * Sets (as xml) the "cliptowrap" attribute
     */
    public void xsetCliptowrap(schemasMicrosoftComOfficeOffice.STTrueFalse cliptowrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIPTOWRAP$148);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(CLIPTOWRAP$148);
            }
            target.set(cliptowrap);
        }
    }
    
    /**
     * Unsets the "cliptowrap" attribute
     */
    public void unsetCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIPTOWRAP$148);
        }
    }
    
    /**
     * Gets the "clip" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIP$150);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "clip" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIP$150);
            return target;
        }
    }
    
    /**
     * True if has "clip" attribute
     */
    public boolean isSetClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIP$150) != null;
        }
    }
    
    /**
     * Sets the "clip" attribute
     */
    public void setClip(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum clip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIP$150);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIP$150);
            }
            target.setEnumValue(clip);
        }
    }
    
    /**
     * Sets (as xml) the "clip" attribute
     */
    public void xsetClip(schemasMicrosoftComOfficeOffice.STTrueFalse clip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIP$150);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(CLIP$150);
            }
            target.set(clip);
        }
    }
    
    /**
     * Unsets the "clip" attribute
     */
    public void unsetClip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIP$150);
        }
    }
}
