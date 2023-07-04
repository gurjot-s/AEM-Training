/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.training.components.bookdetail;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class bookdetail__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_book = null;
Object _dynamic_currentpage = bindings.get("currentpage");
Collection var_collectionvar3_list_coerced$ = null;
Collection var_collectionvar15_list_coerced$ = null;
Object _dynamic_example = bindings.get("example");
{
    Object var_includedresult0 = renderContext.call("include", "template.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult0));
}
out.write("\r\n");
_global_book = renderContext.call("use", com.training.core.models.BookDetail.class.getName(), obj());
out.write("<div class=\"cmp-bookDetail\">");
{
    String var_2 = (((("\r\n    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_book, "title"), "text"))) + "\r\n    current page >> ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title"), "text"))) + "\r\n    ");
    out.write(renderContext.getObjectModel().toString(var_2));
}
{
    Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_book, "getListItems");
    {
        long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
        {
            boolean var_notempty5 = (var_size4 > 0);
            if (var_notempty5) {
                {
                    long var_end8 = var_size4;
                    {
                        boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                        if (var_validstartstepend9) {
                            out.write("<ul>");
                            if (var_collectionvar3_list_coerced$ == null) {
                                var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                            }
                            long var_index10 = 0;
                            for (Object item : var_collectionvar3_list_coerced$) {
                                {
                                    boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                    if (var_traversal12) {
                                        out.write("\r\n        <li>");
                                        {
                                            Object var_13 = renderContext.call("xss", item, "text");
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</li>\r\n    ");
                                    }
                                }
                                var_index10++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar3_list_coerced$ = null;
}
{
    String var_14 = (((("\r\n    joining List Default by ,- " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_book, "getListItems"), "text"))) + "\r\n    joining List - ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("join", renderContext.getObjectModel().resolveProperty(_global_book, "getListItems"), ">>"), "text"))) + "\r\n\r\n    ");
    out.write(renderContext.getObjectModel().toString(var_14));
}
{
    Object var_collectionvar15 = renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "listChildren");
    {
        long var_size16 = ((var_collectionvar15_list_coerced$ == null ? (var_collectionvar15_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar15)) : var_collectionvar15_list_coerced$).size());
        {
            boolean var_notempty17 = (var_size16 > 0);
            if (var_notempty17) {
                {
                    long var_end20 = var_size16;
                    {
                        boolean var_validstartstepend21 = (((0 < var_size16) && true) && (var_end20 > 0));
                        if (var_validstartstepend21) {
                            out.write("<ul>");
                            if (var_collectionvar15_list_coerced$ == null) {
                                var_collectionvar15_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar15);
                            }
                            long var_index22 = 0;
                            for (Object item : var_collectionvar15_list_coerced$) {
                                {
                                    boolean var_traversal24 = (((var_index22 >= 0) && (var_index22 <= var_end20)) && true);
                                    if (var_traversal24) {
                                        out.write("\r\n        <li>");
                                        {
                                            Object var_25 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "path"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_25));
                                        }
                                        out.write("</li>\r\n    ");
                                    }
                                }
                                var_index22++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar15_list_coerced$ = null;
}
out.write("\r\n\r\n    <div>");
{
    Object var_templatevar26 = _dynamic_example;
    {
        String var_templateoptions27_field$_class = "myClass";
        {
            String var_templateoptions27_field$_text = "myText";
            {
                java.util.Map var_templateoptions27 = obj().with("class", var_templateoptions27_field$_class).with("text", var_templateoptions27_field$_text);
                callUnit(out, renderContext, var_templatevar26, var_templateoptions27);
            }
        }
    }
}
out.write("</div>//not working\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

