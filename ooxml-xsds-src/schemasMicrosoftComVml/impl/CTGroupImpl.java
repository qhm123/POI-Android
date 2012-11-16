/*
 * XML Type:  CT_Group
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTGroup
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Group(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTGroup
{
    
    public CTGroupImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName GROUP$46 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "group");
    private static final javax.xml.namespace.QName SHAPE$48 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shape");
    private static final javax.xml.namespace.QName SHAPETYPE$50 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shapetype");
    private static final javax.xml.namespace.QName ARC$52 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "arc");
    private static final javax.xml.namespace.QName CURVE$54 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "curve");
    private static final javax.xml.namespace.QName IMAGE$56 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "image");
    private static final javax.xml.namespace.QName LINE$58 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "line");
    private static final javax.xml.namespace.QName OVAL$60 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "oval");
    private static final javax.xml.namespace.QName POLYLINE$62 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "polyline");
    private static final javax.xml.namespace.QName RECT$64 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "rect");
    private static final javax.xml.namespace.QName ROUNDRECT$66 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "roundrect");
    private static final javax.xml.namespace.QName DIAGRAM$68 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "diagram");
    private static final javax.xml.namespace.QName ID$70 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName STYLE$72 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName HREF$74 = 
        new javax.xml.namespace.QName("", "href");
    private static final javax.xml.namespace.QName TARGET$76 = 
        new javax.xml.namespace.QName("", "target");
    private static final javax.xml.namespace.QName CLASS1$78 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName TITLE$80 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName ALT$82 = 
        new javax.xml.namespace.QName("", "alt");
    private static final javax.xml.namespace.QName COORDSIZE$84 = 
        new javax.xml.namespace.QName("", "coordsize");
    private static final javax.xml.namespace.QName COORDORIGIN$86 = 
        new javax.xml.namespace.QName("", "coordorigin");
    private static final javax.xml.namespace.QName WRAPCOORDS$88 = 
        new javax.xml.namespace.QName("", "wrapcoords");
    private static final javax.xml.namespace.QName PRINT$90 = 
        new javax.xml.namespace.QName("", "print");
    private static final javax.xml.namespace.QName SPID$92 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "spid");
    private static final javax.xml.namespace.QName ONED$94 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "oned");
    private static final javax.xml.namespace.QName REGROUPID$96 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "regroupid");
    private static final javax.xml.namespace.QName DOUBLECLICKNOTIFY$98 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "doubleclicknotify");
    private static final javax.xml.namespace.QName BUTTON$100 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "button");
    private static final javax.xml.namespace.QName USERHIDDEN$102 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "userhidden");
    private static final javax.xml.namespace.QName BULLET$104 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bullet");
    private static final javax.xml.namespace.QName HR$106 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hr");
    private static final javax.xml.namespace.QName HRSTD$108 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrstd");
    private static final javax.xml.namespace.QName HRNOSHADE$110 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrnoshade");
    private static final javax.xml.namespace.QName HRPCT$112 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hrpct");
    private static final javax.xml.namespace.QName HRALIGN$114 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "hralign");
    private static final javax.xml.namespace.QName ALLOWINCELL$116 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowincell");
    private static final javax.xml.namespace.QName ALLOWOVERLAP$118 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "allowoverlap");
    private static final javax.xml.namespace.QName USERDRAWN$120 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "userdrawn");
    private static final javax.xml.namespace.QName BORDERTOPCOLOR$122 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bordertopcolor");
    private static final javax.xml.namespace.QName BORDERLEFTCOLOR$124 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderleftcolor");
    private static final javax.xml.namespace.QName BORDERBOTTOMCOLOR$126 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderbottomcolor");
    private static final javax.xml.namespace.QName BORDERRIGHTCOLOR$128 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderrightcolor");
    private static final javax.xml.namespace.QName DGMLAYOUT$130 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmlayout");
    private static final javax.xml.namespace.QName DGMNODEKIND$132 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmnodekind");
    private static final javax.xml.namespace.QName DGMLAYOUTMRU$134 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru");
    private static final javax.xml.namespace.QName INSETMODE$136 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "insetmode");
    private static final javax.xml.namespace.QName FILLED$138 = 
        new javax.xml.namespace.QName("", "filled");
    private static final javax.xml.namespace.QName FILLCOLOR$140 = 
        new javax.xml.namespace.QName("", "fillcolor");
    private static final javax.xml.namespace.QName EDITAS$142 = 
        new javax.xml.namespace.QName("", "editas");
    private static final javax.xml.namespace.QName TABLEPROPERTIES$144 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "tableproperties");
    private static final javax.xml.namespace.QName TABLELIMITS$146 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "tablelimits");
    
    
    /**
     * Gets a List of "path" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTPath> getPathList()
    {
        final class PathList extends java.util.AbstractList<schemasMicrosoftComVml.CTPath>
        {
            public schemasMicrosoftComVml.CTPath get(int i)
                { return CTGroupImpl.this.getPathArray(i); }
            
            public schemasMicrosoftComVml.CTPath set(int i, schemasMicrosoftComVml.CTPath o)
            {
                schemasMicrosoftComVml.CTPath old = CTGroupImpl.this.getPathArray(i);
                CTGroupImpl.this.setPathArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTPath o)
                { CTGroupImpl.this.insertNewPath(i).set(o); }
            
            public schemasMicrosoftComVml.CTPath remove(int i)
            {
                schemasMicrosoftComVml.CTPath old = CTGroupImpl.this.getPathArray(i);
                CTGroupImpl.this.removePath(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfPathArray(); }
            
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
                { return CTGroupImpl.this.getFormulasArray(i); }
            
            public schemasMicrosoftComVml.CTFormulas set(int i, schemasMicrosoftComVml.CTFormulas o)
            {
                schemasMicrosoftComVml.CTFormulas old = CTGroupImpl.this.getFormulasArray(i);
                CTGroupImpl.this.setFormulasArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTFormulas o)
                { CTGroupImpl.this.insertNewFormulas(i).set(o); }
            
            public schemasMicrosoftComVml.CTFormulas remove(int i)
            {
                schemasMicrosoftComVml.CTFormulas old = CTGroupImpl.this.getFormulasArray(i);
                CTGroupImpl.this.removeFormulas(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfFormulasArray(); }
            
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
                { return CTGroupImpl.this.getHandlesArray(i); }
            
            public schemasMicrosoftComVml.CTHandles set(int i, schemasMicrosoftComVml.CTHandles o)
            {
                schemasMicrosoftComVml.CTHandles old = CTGroupImpl.this.getHandlesArray(i);
                CTGroupImpl.this.setHandlesArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTHandles o)
                { CTGroupImpl.this.insertNewHandles(i).set(o); }
            
            public schemasMicrosoftComVml.CTHandles remove(int i)
            {
                schemasMicrosoftComVml.CTHandles old = CTGroupImpl.this.getHandlesArray(i);
                CTGroupImpl.this.removeHandles(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfHandlesArray(); }
            
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
                { return CTGroupImpl.this.getFillArray(i); }
            
            public schemasMicrosoftComVml.CTFill set(int i, schemasMicrosoftComVml.CTFill o)
            {
                schemasMicrosoftComVml.CTFill old = CTGroupImpl.this.getFillArray(i);
                CTGroupImpl.this.setFillArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTFill o)
                { CTGroupImpl.this.insertNewFill(i).set(o); }
            
            public schemasMicrosoftComVml.CTFill remove(int i)
            {
                schemasMicrosoftComVml.CTFill old = CTGroupImpl.this.getFillArray(i);
                CTGroupImpl.this.removeFill(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfFillArray(); }
            
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
                { return CTGroupImpl.this.getStrokeArray(i); }
            
            public schemasMicrosoftComVml.CTStroke set(int i, schemasMicrosoftComVml.CTStroke o)
            {
                schemasMicrosoftComVml.CTStroke old = CTGroupImpl.this.getStrokeArray(i);
                CTGroupImpl.this.setStrokeArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTStroke o)
                { CTGroupImpl.this.insertNewStroke(i).set(o); }
            
            public schemasMicrosoftComVml.CTStroke remove(int i)
            {
                schemasMicrosoftComVml.CTStroke old = CTGroupImpl.this.getStrokeArray(i);
                CTGroupImpl.this.removeStroke(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfStrokeArray(); }
            
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
                { return CTGroupImpl.this.getShadowArray(i); }
            
            public schemasMicrosoftComVml.CTShadow set(int i, schemasMicrosoftComVml.CTShadow o)
            {
                schemasMicrosoftComVml.CTShadow old = CTGroupImpl.this.getShadowArray(i);
                CTGroupImpl.this.setShadowArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTShadow o)
                { CTGroupImpl.this.insertNewShadow(i).set(o); }
            
            public schemasMicrosoftComVml.CTShadow remove(int i)
            {
                schemasMicrosoftComVml.CTShadow old = CTGroupImpl.this.getShadowArray(i);
                CTGroupImpl.this.removeShadow(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfShadowArray(); }
            
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
                { return CTGroupImpl.this.getTextboxArray(i); }
            
            public schemasMicrosoftComVml.CTTextbox set(int i, schemasMicrosoftComVml.CTTextbox o)
            {
                schemasMicrosoftComVml.CTTextbox old = CTGroupImpl.this.getTextboxArray(i);
                CTGroupImpl.this.setTextboxArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTTextbox o)
                { CTGroupImpl.this.insertNewTextbox(i).set(o); }
            
            public schemasMicrosoftComVml.CTTextbox remove(int i)
            {
                schemasMicrosoftComVml.CTTextbox old = CTGroupImpl.this.getTextboxArray(i);
                CTGroupImpl.this.removeTextbox(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfTextboxArray(); }
            
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
                { return CTGroupImpl.this.getTextpathArray(i); }
            
            public schemasMicrosoftComVml.CTTextPath set(int i, schemasMicrosoftComVml.CTTextPath o)
            {
                schemasMicrosoftComVml.CTTextPath old = CTGroupImpl.this.getTextpathArray(i);
                CTGroupImpl.this.setTextpathArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTTextPath o)
                { CTGroupImpl.this.insertNewTextpath(i).set(o); }
            
            public schemasMicrosoftComVml.CTTextPath remove(int i)
            {
                schemasMicrosoftComVml.CTTextPath old = CTGroupImpl.this.getTextpathArray(i);
                CTGroupImpl.this.removeTextpath(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfTextpathArray(); }
            
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
                { return CTGroupImpl.this.getImagedataArray(i); }
            
            public schemasMicrosoftComVml.CTImageData set(int i, schemasMicrosoftComVml.CTImageData o)
            {
                schemasMicrosoftComVml.CTImageData old = CTGroupImpl.this.getImagedataArray(i);
                CTGroupImpl.this.setImagedataArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTImageData o)
                { CTGroupImpl.this.insertNewImagedata(i).set(o); }
            
            public schemasMicrosoftComVml.CTImageData remove(int i)
            {
                schemasMicrosoftComVml.CTImageData old = CTGroupImpl.this.getImagedataArray(i);
                CTGroupImpl.this.removeImagedata(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfImagedataArray(); }
            
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
                { return CTGroupImpl.this.getSkewArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTSkew set(int i, schemasMicrosoftComOfficeOffice.CTSkew o)
            {
                schemasMicrosoftComOfficeOffice.CTSkew old = CTGroupImpl.this.getSkewArray(i);
                CTGroupImpl.this.setSkewArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTSkew o)
                { CTGroupImpl.this.insertNewSkew(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTSkew remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTSkew old = CTGroupImpl.this.getSkewArray(i);
                CTGroupImpl.this.removeSkew(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfSkewArray(); }
            
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
                { return CTGroupImpl.this.getExtrusionArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTExtrusion set(int i, schemasMicrosoftComOfficeOffice.CTExtrusion o)
            {
                schemasMicrosoftComOfficeOffice.CTExtrusion old = CTGroupImpl.this.getExtrusionArray(i);
                CTGroupImpl.this.setExtrusionArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTExtrusion o)
                { CTGroupImpl.this.insertNewExtrusion(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTExtrusion remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTExtrusion old = CTGroupImpl.this.getExtrusionArray(i);
                CTGroupImpl.this.removeExtrusion(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfExtrusionArray(); }
            
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
                { return CTGroupImpl.this.getCalloutArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTCallout set(int i, schemasMicrosoftComOfficeOffice.CTCallout o)
            {
                schemasMicrosoftComOfficeOffice.CTCallout old = CTGroupImpl.this.getCalloutArray(i);
                CTGroupImpl.this.setCalloutArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTCallout o)
                { CTGroupImpl.this.insertNewCallout(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTCallout remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTCallout old = CTGroupImpl.this.getCalloutArray(i);
                CTGroupImpl.this.removeCallout(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfCalloutArray(); }
            
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
                { return CTGroupImpl.this.getLockArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTLock set(int i, schemasMicrosoftComOfficeOffice.CTLock o)
            {
                schemasMicrosoftComOfficeOffice.CTLock old = CTGroupImpl.this.getLockArray(i);
                CTGroupImpl.this.setLockArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTLock o)
                { CTGroupImpl.this.insertNewLock(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTLock remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTLock old = CTGroupImpl.this.getLockArray(i);
                CTGroupImpl.this.removeLock(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfLockArray(); }
            
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
                { return CTGroupImpl.this.getClippathArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTClipPath set(int i, schemasMicrosoftComOfficeOffice.CTClipPath o)
            {
                schemasMicrosoftComOfficeOffice.CTClipPath old = CTGroupImpl.this.getClippathArray(i);
                CTGroupImpl.this.setClippathArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTClipPath o)
                { CTGroupImpl.this.insertNewClippath(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTClipPath remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTClipPath old = CTGroupImpl.this.getClippathArray(i);
                CTGroupImpl.this.removeClippath(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfClippathArray(); }
            
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
                { return CTGroupImpl.this.getSignaturelineArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTSignatureLine set(int i, schemasMicrosoftComOfficeOffice.CTSignatureLine o)
            {
                schemasMicrosoftComOfficeOffice.CTSignatureLine old = CTGroupImpl.this.getSignaturelineArray(i);
                CTGroupImpl.this.setSignaturelineArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTSignatureLine o)
                { CTGroupImpl.this.insertNewSignatureline(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTSignatureLine remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTSignatureLine old = CTGroupImpl.this.getSignaturelineArray(i);
                CTGroupImpl.this.removeSignatureline(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfSignaturelineArray(); }
            
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
                { return CTGroupImpl.this.getWrapArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTWrap set(int i, schemasMicrosoftComOfficeWord.CTWrap o)
            {
                schemasMicrosoftComOfficeWord.CTWrap old = CTGroupImpl.this.getWrapArray(i);
                CTGroupImpl.this.setWrapArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTWrap o)
                { CTGroupImpl.this.insertNewWrap(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTWrap remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTWrap old = CTGroupImpl.this.getWrapArray(i);
                CTGroupImpl.this.removeWrap(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfWrapArray(); }
            
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
                { return CTGroupImpl.this.getAnchorlockArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTAnchorLock set(int i, schemasMicrosoftComOfficeWord.CTAnchorLock o)
            {
                schemasMicrosoftComOfficeWord.CTAnchorLock old = CTGroupImpl.this.getAnchorlockArray(i);
                CTGroupImpl.this.setAnchorlockArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTAnchorLock o)
                { CTGroupImpl.this.insertNewAnchorlock(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTAnchorLock remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTAnchorLock old = CTGroupImpl.this.getAnchorlockArray(i);
                CTGroupImpl.this.removeAnchorlock(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfAnchorlockArray(); }
            
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
                { return CTGroupImpl.this.getBordertopArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBordertopArray(i);
                CTGroupImpl.this.setBordertopArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTGroupImpl.this.insertNewBordertop(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBordertopArray(i);
                CTGroupImpl.this.removeBordertop(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfBordertopArray(); }
            
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
                { return CTGroupImpl.this.getBorderbottomArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBorderbottomArray(i);
                CTGroupImpl.this.setBorderbottomArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTGroupImpl.this.insertNewBorderbottom(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBorderbottomArray(i);
                CTGroupImpl.this.removeBorderbottom(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfBorderbottomArray(); }
            
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
                { return CTGroupImpl.this.getBorderleftArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBorderleftArray(i);
                CTGroupImpl.this.setBorderleftArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTGroupImpl.this.insertNewBorderleft(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBorderleftArray(i);
                CTGroupImpl.this.removeBorderleft(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfBorderleftArray(); }
            
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
                { return CTGroupImpl.this.getBorderrightArray(i); }
            
            public schemasMicrosoftComOfficeWord.CTBorder set(int i, schemasMicrosoftComOfficeWord.CTBorder o)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBorderrightArray(i);
                CTGroupImpl.this.setBorderrightArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeWord.CTBorder o)
                { CTGroupImpl.this.insertNewBorderright(i).set(o); }
            
            public schemasMicrosoftComOfficeWord.CTBorder remove(int i)
            {
                schemasMicrosoftComOfficeWord.CTBorder old = CTGroupImpl.this.getBorderrightArray(i);
                CTGroupImpl.this.removeBorderright(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfBorderrightArray(); }
            
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
                { return CTGroupImpl.this.getClientDataArray(i); }
            
            public schemasMicrosoftComOfficeExcel.CTClientData set(int i, schemasMicrosoftComOfficeExcel.CTClientData o)
            {
                schemasMicrosoftComOfficeExcel.CTClientData old = CTGroupImpl.this.getClientDataArray(i);
                CTGroupImpl.this.setClientDataArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeExcel.CTClientData o)
                { CTGroupImpl.this.insertNewClientData(i).set(o); }
            
            public schemasMicrosoftComOfficeExcel.CTClientData remove(int i)
            {
                schemasMicrosoftComOfficeExcel.CTClientData old = CTGroupImpl.this.getClientDataArray(i);
                CTGroupImpl.this.removeClientData(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfClientDataArray(); }
            
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
                { return CTGroupImpl.this.getTextdataArray(i); }
            
            public schemasMicrosoftComOfficePowerpoint.CTRel set(int i, schemasMicrosoftComOfficePowerpoint.CTRel o)
            {
                schemasMicrosoftComOfficePowerpoint.CTRel old = CTGroupImpl.this.getTextdataArray(i);
                CTGroupImpl.this.setTextdataArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficePowerpoint.CTRel o)
                { CTGroupImpl.this.insertNewTextdata(i).set(o); }
            
            public schemasMicrosoftComOfficePowerpoint.CTRel remove(int i)
            {
                schemasMicrosoftComOfficePowerpoint.CTRel old = CTGroupImpl.this.getTextdataArray(i);
                CTGroupImpl.this.removeTextdata(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfTextdataArray(); }
            
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
     * Gets a List of "group" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTGroup> getGroupList()
    {
        final class GroupList extends java.util.AbstractList<schemasMicrosoftComVml.CTGroup>
        {
            public schemasMicrosoftComVml.CTGroup get(int i)
                { return CTGroupImpl.this.getGroupArray(i); }
            
            public schemasMicrosoftComVml.CTGroup set(int i, schemasMicrosoftComVml.CTGroup o)
            {
                schemasMicrosoftComVml.CTGroup old = CTGroupImpl.this.getGroupArray(i);
                CTGroupImpl.this.setGroupArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTGroup o)
                { CTGroupImpl.this.insertNewGroup(i).set(o); }
            
            public schemasMicrosoftComVml.CTGroup remove(int i)
            {
                schemasMicrosoftComVml.CTGroup old = CTGroupImpl.this.getGroupArray(i);
                CTGroupImpl.this.removeGroup(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupList();
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public schemasMicrosoftComVml.CTGroup[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$46, targetList);
            schemasMicrosoftComVml.CTGroup[] result = new schemasMicrosoftComVml.CTGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public schemasMicrosoftComVml.CTGroup getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().find_element_user(GROUP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$46);
        }
    }
    
    /**
     * Sets array of all "group" element
     */
    public void setGroupArray(schemasMicrosoftComVml.CTGroup[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$46);
        }
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, schemasMicrosoftComVml.CTGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().find_element_user(GROUP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public schemasMicrosoftComVml.CTGroup insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().insert_element_user(GROUP$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public schemasMicrosoftComVml.CTGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTGroup target = null;
            target = (schemasMicrosoftComVml.CTGroup)get_store().add_element_user(GROUP$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$46, i);
        }
    }
    
    /**
     * Gets a List of "shape" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTShape> getShapeList()
    {
        final class ShapeList extends java.util.AbstractList<schemasMicrosoftComVml.CTShape>
        {
            public schemasMicrosoftComVml.CTShape get(int i)
                { return CTGroupImpl.this.getShapeArray(i); }
            
            public schemasMicrosoftComVml.CTShape set(int i, schemasMicrosoftComVml.CTShape o)
            {
                schemasMicrosoftComVml.CTShape old = CTGroupImpl.this.getShapeArray(i);
                CTGroupImpl.this.setShapeArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTShape o)
                { CTGroupImpl.this.insertNewShape(i).set(o); }
            
            public schemasMicrosoftComVml.CTShape remove(int i)
            {
                schemasMicrosoftComVml.CTShape old = CTGroupImpl.this.getShapeArray(i);
                CTGroupImpl.this.removeShape(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfShapeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShapeList();
        }
    }
    
    /**
     * Gets array of all "shape" elements
     */
    public schemasMicrosoftComVml.CTShape[] getShapeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAPE$48, targetList);
            schemasMicrosoftComVml.CTShape[] result = new schemasMicrosoftComVml.CTShape[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shape" element
     */
    public schemasMicrosoftComVml.CTShape getShapeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().find_element_user(SHAPE$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shape" element
     */
    public int sizeOfShapeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPE$48);
        }
    }
    
    /**
     * Sets array of all "shape" element
     */
    public void setShapeArray(schemasMicrosoftComVml.CTShape[] shapeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shapeArray, SHAPE$48);
        }
    }
    
    /**
     * Sets ith "shape" element
     */
    public void setShapeArray(int i, schemasMicrosoftComVml.CTShape shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().find_element_user(SHAPE$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shape);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shape" element
     */
    public schemasMicrosoftComVml.CTShape insertNewShape(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().insert_element_user(SHAPE$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shape" element
     */
    public schemasMicrosoftComVml.CTShape addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().add_element_user(SHAPE$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "shape" element
     */
    public void removeShape(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPE$48, i);
        }
    }
    
    /**
     * Gets a List of "shapetype" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTShapetype> getShapetypeList()
    {
        final class ShapetypeList extends java.util.AbstractList<schemasMicrosoftComVml.CTShapetype>
        {
            public schemasMicrosoftComVml.CTShapetype get(int i)
                { return CTGroupImpl.this.getShapetypeArray(i); }
            
            public schemasMicrosoftComVml.CTShapetype set(int i, schemasMicrosoftComVml.CTShapetype o)
            {
                schemasMicrosoftComVml.CTShapetype old = CTGroupImpl.this.getShapetypeArray(i);
                CTGroupImpl.this.setShapetypeArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTShapetype o)
                { CTGroupImpl.this.insertNewShapetype(i).set(o); }
            
            public schemasMicrosoftComVml.CTShapetype remove(int i)
            {
                schemasMicrosoftComVml.CTShapetype old = CTGroupImpl.this.getShapetypeArray(i);
                CTGroupImpl.this.removeShapetype(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfShapetypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShapetypeList();
        }
    }
    
    /**
     * Gets array of all "shapetype" elements
     */
    public schemasMicrosoftComVml.CTShapetype[] getShapetypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAPETYPE$50, targetList);
            schemasMicrosoftComVml.CTShapetype[] result = new schemasMicrosoftComVml.CTShapetype[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shapetype" element
     */
    public schemasMicrosoftComVml.CTShapetype getShapetypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().find_element_user(SHAPETYPE$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shapetype" element
     */
    public int sizeOfShapetypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPETYPE$50);
        }
    }
    
    /**
     * Sets array of all "shapetype" element
     */
    public void setShapetypeArray(schemasMicrosoftComVml.CTShapetype[] shapetypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shapetypeArray, SHAPETYPE$50);
        }
    }
    
    /**
     * Sets ith "shapetype" element
     */
    public void setShapetypeArray(int i, schemasMicrosoftComVml.CTShapetype shapetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().find_element_user(SHAPETYPE$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shapetype);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shapetype" element
     */
    public schemasMicrosoftComVml.CTShapetype insertNewShapetype(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().insert_element_user(SHAPETYPE$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shapetype" element
     */
    public schemasMicrosoftComVml.CTShapetype addNewShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().add_element_user(SHAPETYPE$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "shapetype" element
     */
    public void removeShapetype(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPETYPE$50, i);
        }
    }
    
    /**
     * Gets a List of "arc" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTArc> getArcList()
    {
        final class ArcList extends java.util.AbstractList<schemasMicrosoftComVml.CTArc>
        {
            public schemasMicrosoftComVml.CTArc get(int i)
                { return CTGroupImpl.this.getArcArray(i); }
            
            public schemasMicrosoftComVml.CTArc set(int i, schemasMicrosoftComVml.CTArc o)
            {
                schemasMicrosoftComVml.CTArc old = CTGroupImpl.this.getArcArray(i);
                CTGroupImpl.this.setArcArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTArc o)
                { CTGroupImpl.this.insertNewArc(i).set(o); }
            
            public schemasMicrosoftComVml.CTArc remove(int i)
            {
                schemasMicrosoftComVml.CTArc old = CTGroupImpl.this.getArcArray(i);
                CTGroupImpl.this.removeArc(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfArcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ArcList();
        }
    }
    
    /**
     * Gets array of all "arc" elements
     */
    public schemasMicrosoftComVml.CTArc[] getArcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARC$52, targetList);
            schemasMicrosoftComVml.CTArc[] result = new schemasMicrosoftComVml.CTArc[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "arc" element
     */
    public schemasMicrosoftComVml.CTArc getArcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().find_element_user(ARC$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "arc" element
     */
    public int sizeOfArcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARC$52);
        }
    }
    
    /**
     * Sets array of all "arc" element
     */
    public void setArcArray(schemasMicrosoftComVml.CTArc[] arcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arcArray, ARC$52);
        }
    }
    
    /**
     * Sets ith "arc" element
     */
    public void setArcArray(int i, schemasMicrosoftComVml.CTArc arc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().find_element_user(ARC$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arc" element
     */
    public schemasMicrosoftComVml.CTArc insertNewArc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().insert_element_user(ARC$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arc" element
     */
    public schemasMicrosoftComVml.CTArc addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().add_element_user(ARC$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "arc" element
     */
    public void removeArc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARC$52, i);
        }
    }
    
    /**
     * Gets a List of "curve" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTCurve> getCurveList()
    {
        final class CurveList extends java.util.AbstractList<schemasMicrosoftComVml.CTCurve>
        {
            public schemasMicrosoftComVml.CTCurve get(int i)
                { return CTGroupImpl.this.getCurveArray(i); }
            
            public schemasMicrosoftComVml.CTCurve set(int i, schemasMicrosoftComVml.CTCurve o)
            {
                schemasMicrosoftComVml.CTCurve old = CTGroupImpl.this.getCurveArray(i);
                CTGroupImpl.this.setCurveArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTCurve o)
                { CTGroupImpl.this.insertNewCurve(i).set(o); }
            
            public schemasMicrosoftComVml.CTCurve remove(int i)
            {
                schemasMicrosoftComVml.CTCurve old = CTGroupImpl.this.getCurveArray(i);
                CTGroupImpl.this.removeCurve(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfCurveArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CurveList();
        }
    }
    
    /**
     * Gets array of all "curve" elements
     */
    public schemasMicrosoftComVml.CTCurve[] getCurveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CURVE$54, targetList);
            schemasMicrosoftComVml.CTCurve[] result = new schemasMicrosoftComVml.CTCurve[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "curve" element
     */
    public schemasMicrosoftComVml.CTCurve getCurveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().find_element_user(CURVE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "curve" element
     */
    public int sizeOfCurveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVE$54);
        }
    }
    
    /**
     * Sets array of all "curve" element
     */
    public void setCurveArray(schemasMicrosoftComVml.CTCurve[] curveArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(curveArray, CURVE$54);
        }
    }
    
    /**
     * Sets ith "curve" element
     */
    public void setCurveArray(int i, schemasMicrosoftComVml.CTCurve curve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().find_element_user(CURVE$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(curve);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "curve" element
     */
    public schemasMicrosoftComVml.CTCurve insertNewCurve(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().insert_element_user(CURVE$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "curve" element
     */
    public schemasMicrosoftComVml.CTCurve addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().add_element_user(CURVE$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "curve" element
     */
    public void removeCurve(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVE$54, i);
        }
    }
    
    /**
     * Gets a List of "image" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTImage> getImageList()
    {
        final class ImageList extends java.util.AbstractList<schemasMicrosoftComVml.CTImage>
        {
            public schemasMicrosoftComVml.CTImage get(int i)
                { return CTGroupImpl.this.getImageArray(i); }
            
            public schemasMicrosoftComVml.CTImage set(int i, schemasMicrosoftComVml.CTImage o)
            {
                schemasMicrosoftComVml.CTImage old = CTGroupImpl.this.getImageArray(i);
                CTGroupImpl.this.setImageArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTImage o)
                { CTGroupImpl.this.insertNewImage(i).set(o); }
            
            public schemasMicrosoftComVml.CTImage remove(int i)
            {
                schemasMicrosoftComVml.CTImage old = CTGroupImpl.this.getImageArray(i);
                CTGroupImpl.this.removeImage(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfImageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ImageList();
        }
    }
    
    /**
     * Gets array of all "image" elements
     */
    public schemasMicrosoftComVml.CTImage[] getImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMAGE$56, targetList);
            schemasMicrosoftComVml.CTImage[] result = new schemasMicrosoftComVml.CTImage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "image" element
     */
    public schemasMicrosoftComVml.CTImage getImageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().find_element_user(IMAGE$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "image" element
     */
    public int sizeOfImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGE$56);
        }
    }
    
    /**
     * Sets array of all "image" element
     */
    public void setImageArray(schemasMicrosoftComVml.CTImage[] imageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(imageArray, IMAGE$56);
        }
    }
    
    /**
     * Sets ith "image" element
     */
    public void setImageArray(int i, schemasMicrosoftComVml.CTImage image)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().find_element_user(IMAGE$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(image);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "image" element
     */
    public schemasMicrosoftComVml.CTImage insertNewImage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().insert_element_user(IMAGE$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "image" element
     */
    public schemasMicrosoftComVml.CTImage addNewImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTImage target = null;
            target = (schemasMicrosoftComVml.CTImage)get_store().add_element_user(IMAGE$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "image" element
     */
    public void removeImage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGE$56, i);
        }
    }
    
    /**
     * Gets a List of "line" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTLine> getLineList()
    {
        final class LineList extends java.util.AbstractList<schemasMicrosoftComVml.CTLine>
        {
            public schemasMicrosoftComVml.CTLine get(int i)
                { return CTGroupImpl.this.getLineArray(i); }
            
            public schemasMicrosoftComVml.CTLine set(int i, schemasMicrosoftComVml.CTLine o)
            {
                schemasMicrosoftComVml.CTLine old = CTGroupImpl.this.getLineArray(i);
                CTGroupImpl.this.setLineArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTLine o)
                { CTGroupImpl.this.insertNewLine(i).set(o); }
            
            public schemasMicrosoftComVml.CTLine remove(int i)
            {
                schemasMicrosoftComVml.CTLine old = CTGroupImpl.this.getLineArray(i);
                CTGroupImpl.this.removeLine(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfLineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineList();
        }
    }
    
    /**
     * Gets array of all "line" elements
     */
    public schemasMicrosoftComVml.CTLine[] getLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINE$58, targetList);
            schemasMicrosoftComVml.CTLine[] result = new schemasMicrosoftComVml.CTLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "line" element
     */
    public schemasMicrosoftComVml.CTLine getLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().find_element_user(LINE$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "line" element
     */
    public int sizeOfLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINE$58);
        }
    }
    
    /**
     * Sets array of all "line" element
     */
    public void setLineArray(schemasMicrosoftComVml.CTLine[] lineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lineArray, LINE$58);
        }
    }
    
    /**
     * Sets ith "line" element
     */
    public void setLineArray(int i, schemasMicrosoftComVml.CTLine line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().find_element_user(LINE$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(line);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "line" element
     */
    public schemasMicrosoftComVml.CTLine insertNewLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().insert_element_user(LINE$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    public schemasMicrosoftComVml.CTLine addNewLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().add_element_user(LINE$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "line" element
     */
    public void removeLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINE$58, i);
        }
    }
    
    /**
     * Gets a List of "oval" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTOval> getOvalList()
    {
        final class OvalList extends java.util.AbstractList<schemasMicrosoftComVml.CTOval>
        {
            public schemasMicrosoftComVml.CTOval get(int i)
                { return CTGroupImpl.this.getOvalArray(i); }
            
            public schemasMicrosoftComVml.CTOval set(int i, schemasMicrosoftComVml.CTOval o)
            {
                schemasMicrosoftComVml.CTOval old = CTGroupImpl.this.getOvalArray(i);
                CTGroupImpl.this.setOvalArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTOval o)
                { CTGroupImpl.this.insertNewOval(i).set(o); }
            
            public schemasMicrosoftComVml.CTOval remove(int i)
            {
                schemasMicrosoftComVml.CTOval old = CTGroupImpl.this.getOvalArray(i);
                CTGroupImpl.this.removeOval(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfOvalArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OvalList();
        }
    }
    
    /**
     * Gets array of all "oval" elements
     */
    public schemasMicrosoftComVml.CTOval[] getOvalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OVAL$60, targetList);
            schemasMicrosoftComVml.CTOval[] result = new schemasMicrosoftComVml.CTOval[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oval" element
     */
    public schemasMicrosoftComVml.CTOval getOvalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().find_element_user(OVAL$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oval" element
     */
    public int sizeOfOvalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVAL$60);
        }
    }
    
    /**
     * Sets array of all "oval" element
     */
    public void setOvalArray(schemasMicrosoftComVml.CTOval[] ovalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ovalArray, OVAL$60);
        }
    }
    
    /**
     * Sets ith "oval" element
     */
    public void setOvalArray(int i, schemasMicrosoftComVml.CTOval oval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().find_element_user(OVAL$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oval);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oval" element
     */
    public schemasMicrosoftComVml.CTOval insertNewOval(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().insert_element_user(OVAL$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oval" element
     */
    public schemasMicrosoftComVml.CTOval addNewOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().add_element_user(OVAL$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "oval" element
     */
    public void removeOval(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVAL$60, i);
        }
    }
    
    /**
     * Gets a List of "polyline" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTPolyLine> getPolylineList()
    {
        final class PolylineList extends java.util.AbstractList<schemasMicrosoftComVml.CTPolyLine>
        {
            public schemasMicrosoftComVml.CTPolyLine get(int i)
                { return CTGroupImpl.this.getPolylineArray(i); }
            
            public schemasMicrosoftComVml.CTPolyLine set(int i, schemasMicrosoftComVml.CTPolyLine o)
            {
                schemasMicrosoftComVml.CTPolyLine old = CTGroupImpl.this.getPolylineArray(i);
                CTGroupImpl.this.setPolylineArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTPolyLine o)
                { CTGroupImpl.this.insertNewPolyline(i).set(o); }
            
            public schemasMicrosoftComVml.CTPolyLine remove(int i)
            {
                schemasMicrosoftComVml.CTPolyLine old = CTGroupImpl.this.getPolylineArray(i);
                CTGroupImpl.this.removePolyline(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfPolylineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PolylineList();
        }
    }
    
    /**
     * Gets array of all "polyline" elements
     */
    public schemasMicrosoftComVml.CTPolyLine[] getPolylineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLYLINE$62, targetList);
            schemasMicrosoftComVml.CTPolyLine[] result = new schemasMicrosoftComVml.CTPolyLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "polyline" element
     */
    public schemasMicrosoftComVml.CTPolyLine getPolylineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().find_element_user(POLYLINE$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "polyline" element
     */
    public int sizeOfPolylineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYLINE$62);
        }
    }
    
    /**
     * Sets array of all "polyline" element
     */
    public void setPolylineArray(schemasMicrosoftComVml.CTPolyLine[] polylineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(polylineArray, POLYLINE$62);
        }
    }
    
    /**
     * Sets ith "polyline" element
     */
    public void setPolylineArray(int i, schemasMicrosoftComVml.CTPolyLine polyline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().find_element_user(POLYLINE$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(polyline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "polyline" element
     */
    public schemasMicrosoftComVml.CTPolyLine insertNewPolyline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().insert_element_user(POLYLINE$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "polyline" element
     */
    public schemasMicrosoftComVml.CTPolyLine addNewPolyline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().add_element_user(POLYLINE$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "polyline" element
     */
    public void removePolyline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYLINE$62, i);
        }
    }
    
    /**
     * Gets a List of "rect" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTRect> getRectList()
    {
        final class RectList extends java.util.AbstractList<schemasMicrosoftComVml.CTRect>
        {
            public schemasMicrosoftComVml.CTRect get(int i)
                { return CTGroupImpl.this.getRectArray(i); }
            
            public schemasMicrosoftComVml.CTRect set(int i, schemasMicrosoftComVml.CTRect o)
            {
                schemasMicrosoftComVml.CTRect old = CTGroupImpl.this.getRectArray(i);
                CTGroupImpl.this.setRectArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTRect o)
                { CTGroupImpl.this.insertNewRect(i).set(o); }
            
            public schemasMicrosoftComVml.CTRect remove(int i)
            {
                schemasMicrosoftComVml.CTRect old = CTGroupImpl.this.getRectArray(i);
                CTGroupImpl.this.removeRect(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfRectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RectList();
        }
    }
    
    /**
     * Gets array of all "rect" elements
     */
    public schemasMicrosoftComVml.CTRect[] getRectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECT$64, targetList);
            schemasMicrosoftComVml.CTRect[] result = new schemasMicrosoftComVml.CTRect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rect" element
     */
    public schemasMicrosoftComVml.CTRect getRectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().find_element_user(RECT$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rect" element
     */
    public int sizeOfRectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECT$64);
        }
    }
    
    /**
     * Sets array of all "rect" element
     */
    public void setRectArray(schemasMicrosoftComVml.CTRect[] rectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rectArray, RECT$64);
        }
    }
    
    /**
     * Sets ith "rect" element
     */
    public void setRectArray(int i, schemasMicrosoftComVml.CTRect rect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().find_element_user(RECT$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rect);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rect" element
     */
    public schemasMicrosoftComVml.CTRect insertNewRect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().insert_element_user(RECT$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rect" element
     */
    public schemasMicrosoftComVml.CTRect addNewRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().add_element_user(RECT$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "rect" element
     */
    public void removeRect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECT$64, i);
        }
    }
    
    /**
     * Gets a List of "roundrect" elements
     */
    public java.util.List<schemasMicrosoftComVml.CTRoundRect> getRoundrectList()
    {
        final class RoundrectList extends java.util.AbstractList<schemasMicrosoftComVml.CTRoundRect>
        {
            public schemasMicrosoftComVml.CTRoundRect get(int i)
                { return CTGroupImpl.this.getRoundrectArray(i); }
            
            public schemasMicrosoftComVml.CTRoundRect set(int i, schemasMicrosoftComVml.CTRoundRect o)
            {
                schemasMicrosoftComVml.CTRoundRect old = CTGroupImpl.this.getRoundrectArray(i);
                CTGroupImpl.this.setRoundrectArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComVml.CTRoundRect o)
                { CTGroupImpl.this.insertNewRoundrect(i).set(o); }
            
            public schemasMicrosoftComVml.CTRoundRect remove(int i)
            {
                schemasMicrosoftComVml.CTRoundRect old = CTGroupImpl.this.getRoundrectArray(i);
                CTGroupImpl.this.removeRoundrect(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfRoundrectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RoundrectList();
        }
    }
    
    /**
     * Gets array of all "roundrect" elements
     */
    public schemasMicrosoftComVml.CTRoundRect[] getRoundrectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROUNDRECT$66, targetList);
            schemasMicrosoftComVml.CTRoundRect[] result = new schemasMicrosoftComVml.CTRoundRect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "roundrect" element
     */
    public schemasMicrosoftComVml.CTRoundRect getRoundrectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().find_element_user(ROUNDRECT$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "roundrect" element
     */
    public int sizeOfRoundrectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUNDRECT$66);
        }
    }
    
    /**
     * Sets array of all "roundrect" element
     */
    public void setRoundrectArray(schemasMicrosoftComVml.CTRoundRect[] roundrectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roundrectArray, ROUNDRECT$66);
        }
    }
    
    /**
     * Sets ith "roundrect" element
     */
    public void setRoundrectArray(int i, schemasMicrosoftComVml.CTRoundRect roundrect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().find_element_user(ROUNDRECT$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(roundrect);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "roundrect" element
     */
    public schemasMicrosoftComVml.CTRoundRect insertNewRoundrect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().insert_element_user(ROUNDRECT$66, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "roundrect" element
     */
    public schemasMicrosoftComVml.CTRoundRect addNewRoundrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().add_element_user(ROUNDRECT$66);
            return target;
        }
    }
    
    /**
     * Removes the ith "roundrect" element
     */
    public void removeRoundrect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUNDRECT$66, i);
        }
    }
    
    /**
     * Gets a List of "diagram" elements
     */
    public java.util.List<schemasMicrosoftComOfficeOffice.CTDiagram> getDiagramList()
    {
        final class DiagramList extends java.util.AbstractList<schemasMicrosoftComOfficeOffice.CTDiagram>
        {
            public schemasMicrosoftComOfficeOffice.CTDiagram get(int i)
                { return CTGroupImpl.this.getDiagramArray(i); }
            
            public schemasMicrosoftComOfficeOffice.CTDiagram set(int i, schemasMicrosoftComOfficeOffice.CTDiagram o)
            {
                schemasMicrosoftComOfficeOffice.CTDiagram old = CTGroupImpl.this.getDiagramArray(i);
                CTGroupImpl.this.setDiagramArray(i, o);
                return old;
            }
            
            public void add(int i, schemasMicrosoftComOfficeOffice.CTDiagram o)
                { CTGroupImpl.this.insertNewDiagram(i).set(o); }
            
            public schemasMicrosoftComOfficeOffice.CTDiagram remove(int i)
            {
                schemasMicrosoftComOfficeOffice.CTDiagram old = CTGroupImpl.this.getDiagramArray(i);
                CTGroupImpl.this.removeDiagram(i);
                return old;
            }
            
            public int size()
                { return CTGroupImpl.this.sizeOfDiagramArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DiagramList();
        }
    }
    
    /**
     * Gets array of all "diagram" elements
     */
    public schemasMicrosoftComOfficeOffice.CTDiagram[] getDiagramArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIAGRAM$68, targetList);
            schemasMicrosoftComOfficeOffice.CTDiagram[] result = new schemasMicrosoftComOfficeOffice.CTDiagram[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "diagram" element
     */
    public schemasMicrosoftComOfficeOffice.CTDiagram getDiagramArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().find_element_user(DIAGRAM$68, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "diagram" element
     */
    public int sizeOfDiagramArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGRAM$68);
        }
    }
    
    /**
     * Sets array of all "diagram" element
     */
    public void setDiagramArray(schemasMicrosoftComOfficeOffice.CTDiagram[] diagramArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(diagramArray, DIAGRAM$68);
        }
    }
    
    /**
     * Sets ith "diagram" element
     */
    public void setDiagramArray(int i, schemasMicrosoftComOfficeOffice.CTDiagram diagram)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().find_element_user(DIAGRAM$68, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(diagram);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "diagram" element
     */
    public schemasMicrosoftComOfficeOffice.CTDiagram insertNewDiagram(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().insert_element_user(DIAGRAM$68, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "diagram" element
     */
    public schemasMicrosoftComOfficeOffice.CTDiagram addNewDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().add_element_user(DIAGRAM$68);
            return target;
        }
    }
    
    /**
     * Removes the ith "diagram" element
     */
    public void removeDiagram(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGRAM$68, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$70);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$70);
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
            return get_store().find_attribute_user(ID$70) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$70);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$70);
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
            get_store().remove_attribute(ID$70);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$72);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$72);
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
            return get_store().find_attribute_user(STYLE$72) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$72);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$72);
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
            get_store().remove_attribute(STYLE$72);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$74);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$74);
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
            return get_store().find_attribute_user(HREF$74) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$74);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HREF$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HREF$74);
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
            get_store().remove_attribute(HREF$74);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$76);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$76);
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
            return get_store().find_attribute_user(TARGET$76) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$76);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$76);
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
            get_store().remove_attribute(TARGET$76);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$78);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$78);
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
            return get_store().find_attribute_user(CLASS1$78) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$78);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$78);
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
            get_store().remove_attribute(CLASS1$78);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$80);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$80);
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
            return get_store().find_attribute_user(TITLE$80) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$80);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$80);
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
            get_store().remove_attribute(TITLE$80);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALT$82);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALT$82);
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
            return get_store().find_attribute_user(ALT$82) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALT$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALT$82);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALT$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALT$82);
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
            get_store().remove_attribute(ALT$82);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDSIZE$84);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDSIZE$84);
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
            return get_store().find_attribute_user(COORDSIZE$84) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDSIZE$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDSIZE$84);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDSIZE$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COORDSIZE$84);
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
            get_store().remove_attribute(COORDSIZE$84);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDORIGIN$86);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDORIGIN$86);
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
            return get_store().find_attribute_user(COORDORIGIN$86) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COORDORIGIN$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COORDORIGIN$86);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COORDORIGIN$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COORDORIGIN$86);
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
            get_store().remove_attribute(COORDORIGIN$86);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPCOORDS$88);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WRAPCOORDS$88);
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
            return get_store().find_attribute_user(WRAPCOORDS$88) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPCOORDS$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPCOORDS$88);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WRAPCOORDS$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WRAPCOORDS$88);
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
            get_store().remove_attribute(WRAPCOORDS$88);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINT$90);
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
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(PRINT$90);
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
            return get_store().find_attribute_user(PRINT$90) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRINT$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRINT$90);
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
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(PRINT$90);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(PRINT$90);
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
            get_store().remove_attribute(PRINT$90);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$92);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPID$92);
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
            return get_store().find_attribute_user(SPID$92) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPID$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPID$92);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPID$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPID$92);
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
            get_store().remove_attribute(SPID$92);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONED$94);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ONED$94);
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
            return get_store().find_attribute_user(ONED$94) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONED$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONED$94);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ONED$94);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ONED$94);
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
            get_store().remove_attribute(ONED$94);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGROUPID$96);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REGROUPID$96);
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
            return get_store().find_attribute_user(REGROUPID$96) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGROUPID$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGROUPID$96);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REGROUPID$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REGROUPID$96);
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
            get_store().remove_attribute(REGROUPID$96);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
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
            return get_store().find_attribute_user(DOUBLECLICKNOTIFY$98) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOUBLECLICKNOTIFY$98);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(DOUBLECLICKNOTIFY$98);
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
            get_store().remove_attribute(DOUBLECLICKNOTIFY$98);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUTTON$100);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BUTTON$100);
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
            return get_store().find_attribute_user(BUTTON$100) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUTTON$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUTTON$100);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BUTTON$100);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(BUTTON$100);
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
            get_store().remove_attribute(BUTTON$100);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERHIDDEN$102);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERHIDDEN$102);
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
            return get_store().find_attribute_user(USERHIDDEN$102) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERHIDDEN$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERHIDDEN$102);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERHIDDEN$102);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(USERHIDDEN$102);
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
            get_store().remove_attribute(USERHIDDEN$102);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BULLET$104);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BULLET$104);
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
            return get_store().find_attribute_user(BULLET$104) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BULLET$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BULLET$104);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(BULLET$104);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(BULLET$104);
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
            get_store().remove_attribute(BULLET$104);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HR$106);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HR$106);
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
            return get_store().find_attribute_user(HR$106) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HR$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HR$106);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HR$106);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HR$106);
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
            get_store().remove_attribute(HR$106);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRSTD$108);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRSTD$108);
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
            return get_store().find_attribute_user(HRSTD$108) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRSTD$108);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRSTD$108);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRSTD$108);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HRSTD$108);
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
            get_store().remove_attribute(HRSTD$108);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRNOSHADE$110);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRNOSHADE$110);
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
            return get_store().find_attribute_user(HRNOSHADE$110) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRNOSHADE$110);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRNOSHADE$110);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(HRNOSHADE$110);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(HRNOSHADE$110);
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
            get_store().remove_attribute(HRNOSHADE$110);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRPCT$112);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(HRPCT$112);
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
            return get_store().find_attribute_user(HRPCT$112) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRPCT$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRPCT$112);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(HRPCT$112);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(HRPCT$112);
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
            get_store().remove_attribute(HRPCT$112);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRALIGN$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HRALIGN$114);
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
            target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().find_attribute_user(HRALIGN$114);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_default_attribute_value(HRALIGN$114);
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
            return get_store().find_attribute_user(HRALIGN$114) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HRALIGN$114);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HRALIGN$114);
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
            target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().find_attribute_user(HRALIGN$114);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STHrAlign)get_store().add_attribute_user(HRALIGN$114);
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
            get_store().remove_attribute(HRALIGN$114);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$116);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$116);
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
            return get_store().find_attribute_user(ALLOWINCELL$116) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWINCELL$116);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWINCELL$116);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWINCELL$116);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWINCELL$116);
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
            get_store().remove_attribute(ALLOWINCELL$116);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$118);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWOVERLAP$118);
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
            return get_store().find_attribute_user(ALLOWOVERLAP$118) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWOVERLAP$118);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWOVERLAP$118);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ALLOWOVERLAP$118);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ALLOWOVERLAP$118);
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
            get_store().remove_attribute(ALLOWOVERLAP$118);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$120);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERDRAWN$120);
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
            return get_store().find_attribute_user(USERDRAWN$120) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERDRAWN$120);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERDRAWN$120);
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
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(USERDRAWN$120);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(USERDRAWN$120);
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
            get_store().remove_attribute(USERDRAWN$120);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOPCOLOR$122);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERTOPCOLOR$122);
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
            return get_store().find_attribute_user(BORDERTOPCOLOR$122) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOPCOLOR$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERTOPCOLOR$122);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERTOPCOLOR$122);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERTOPCOLOR$122);
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
            get_store().remove_attribute(BORDERTOPCOLOR$122);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFTCOLOR$124);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERLEFTCOLOR$124);
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
            return get_store().find_attribute_user(BORDERLEFTCOLOR$124) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFTCOLOR$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERLEFTCOLOR$124);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERLEFTCOLOR$124);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERLEFTCOLOR$124);
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
            get_store().remove_attribute(BORDERLEFTCOLOR$124);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
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
            return get_store().find_attribute_user(BORDERBOTTOMCOLOR$126) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERBOTTOMCOLOR$126);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERBOTTOMCOLOR$126);
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
            get_store().remove_attribute(BORDERBOTTOMCOLOR$126);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
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
            return get_store().find_attribute_user(BORDERRIGHTCOLOR$128) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERRIGHTCOLOR$128);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERRIGHTCOLOR$128);
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
            get_store().remove_attribute(BORDERRIGHTCOLOR$128);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUT$130);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUT$130);
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
            return get_store().find_attribute_user(DGMLAYOUT$130) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUT$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMLAYOUT$130);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUT$130);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMLAYOUT$130);
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
            get_store().remove_attribute(DGMLAYOUT$130);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMNODEKIND$132);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMNODEKIND$132);
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
            return get_store().find_attribute_user(DGMNODEKIND$132) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMNODEKIND$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMNODEKIND$132);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMNODEKIND$132);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMNODEKIND$132);
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
            get_store().remove_attribute(DGMNODEKIND$132);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUTMRU$134);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUTMRU$134);
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
            return get_store().find_attribute_user(DGMLAYOUTMRU$134) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUTMRU$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMLAYOUTMRU$134);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUTMRU$134);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMLAYOUTMRU$134);
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
            get_store().remove_attribute(DGMLAYOUTMRU$134);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSETMODE$136);
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
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$136);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_default_attribute_value(INSETMODE$136);
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
            return get_store().find_attribute_user(INSETMODE$136) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$136);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETMODE$136);
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
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$136);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().add_attribute_user(INSETMODE$136);
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
            get_store().remove_attribute(INSETMODE$136);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLED$138);
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
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLED$138);
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
            return get_store().find_attribute_user(FILLED$138) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLED$138);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLED$138);
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
            target = (schemasMicrosoftComVml.STTrueFalse)get_store().find_attribute_user(FILLED$138);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STTrueFalse)get_store().add_attribute_user(FILLED$138);
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
            get_store().remove_attribute(FILLED$138);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$140);
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
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(FILLCOLOR$140);
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
            return get_store().find_attribute_user(FILLCOLOR$140) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLCOLOR$140);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLCOLOR$140);
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
            target = (schemasMicrosoftComVml.STColorType)get_store().find_attribute_user(FILLCOLOR$140);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STColorType)get_store().add_attribute_user(FILLCOLOR$140);
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
            get_store().remove_attribute(FILLCOLOR$140);
        }
    }
    
    /**
     * Gets the "editas" attribute
     */
    public schemasMicrosoftComVml.STEditAs.Enum getEditas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITAS$142);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STEditAs.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "editas" attribute
     */
    public schemasMicrosoftComVml.STEditAs xgetEditas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STEditAs target = null;
            target = (schemasMicrosoftComVml.STEditAs)get_store().find_attribute_user(EDITAS$142);
            return target;
        }
    }
    
    /**
     * True if has "editas" attribute
     */
    public boolean isSetEditas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDITAS$142) != null;
        }
    }
    
    /**
     * Sets the "editas" attribute
     */
    public void setEditas(schemasMicrosoftComVml.STEditAs.Enum editas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITAS$142);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDITAS$142);
            }
            target.setEnumValue(editas);
        }
    }
    
    /**
     * Sets (as xml) the "editas" attribute
     */
    public void xsetEditas(schemasMicrosoftComVml.STEditAs editas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STEditAs target = null;
            target = (schemasMicrosoftComVml.STEditAs)get_store().find_attribute_user(EDITAS$142);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STEditAs)get_store().add_attribute_user(EDITAS$142);
            }
            target.set(editas);
        }
    }
    
    /**
     * Unsets the "editas" attribute
     */
    public void unsetEditas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDITAS$142);
        }
    }
    
    /**
     * Gets the "tableproperties" attribute
     */
    public java.lang.String getTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLEPROPERTIES$144);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableproperties" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLEPROPERTIES$144);
            return target;
        }
    }
    
    /**
     * True if has "tableproperties" attribute
     */
    public boolean isSetTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLEPROPERTIES$144) != null;
        }
    }
    
    /**
     * Sets the "tableproperties" attribute
     */
    public void setTableproperties(java.lang.String tableproperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLEPROPERTIES$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLEPROPERTIES$144);
            }
            target.setStringValue(tableproperties);
        }
    }
    
    /**
     * Sets (as xml) the "tableproperties" attribute
     */
    public void xsetTableproperties(org.apache.xmlbeans.XmlString tableproperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLEPROPERTIES$144);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TABLEPROPERTIES$144);
            }
            target.set(tableproperties);
        }
    }
    
    /**
     * Unsets the "tableproperties" attribute
     */
    public void unsetTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLEPROPERTIES$144);
        }
    }
    
    /**
     * Gets the "tablelimits" attribute
     */
    public java.lang.String getTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLELIMITS$146);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tablelimits" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLELIMITS$146);
            return target;
        }
    }
    
    /**
     * True if has "tablelimits" attribute
     */
    public boolean isSetTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLELIMITS$146) != null;
        }
    }
    
    /**
     * Sets the "tablelimits" attribute
     */
    public void setTablelimits(java.lang.String tablelimits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLELIMITS$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLELIMITS$146);
            }
            target.setStringValue(tablelimits);
        }
    }
    
    /**
     * Sets (as xml) the "tablelimits" attribute
     */
    public void xsetTablelimits(org.apache.xmlbeans.XmlString tablelimits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLELIMITS$146);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TABLELIMITS$146);
            }
            target.set(tablelimits);
        }
    }
    
    /**
     * Unsets the "tablelimits" attribute
     */
    public void unsetTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLELIMITS$146);
        }
    }
}
