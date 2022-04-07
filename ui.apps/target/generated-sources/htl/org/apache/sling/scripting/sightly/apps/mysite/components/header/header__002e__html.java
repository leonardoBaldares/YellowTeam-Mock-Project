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
package org.apache.sling.scripting.sightly.apps.mysite.components.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<header class=\"cmp-header\">\r\n    <div class=\"cmp-header__main-nav\">\r\n        <div class=\"container\">\r\n            <nav class=\"nav justify-content-end\">\r\n                <a class=\"d-flex nav-link\" aria-current=\"page\" href=\"#\">How to buy</a>\r\n                <a class=\"d-flex nav-link\" href=\"#\">Partners</a>\r\n                <a class=\"d-flex nav-link\" href=\"#\"><span class=\"cmp-header__icon-user\"></span> Log in</a>\r\n                <a class=\"d-flex nav-link\" href=\"#\"><span class=\"cmp-header__icon-world\"></span> US EN</a>\r\n            </nav>\r\n        </div>\r\n    </div>\r\n    <div class=\"cmp-header__secondary-nav\">\r\n        <nav class=\"navbar navbar-expand-lg navbar-light p-0\">\r\n            <div class=\"container\">\r\n                <a class=\"navbar-brand\" href=\"#\">\r\n                    <img src=\"/content/dam/mysite/logo.svg\" alt=\"Jolt\" class=\"img-fluid cmp-header__logo\"/>\r\n                </a>\r\n                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n                    <span class=\"navbar-toggler-icon\"></span>\r\n                </button>\r\n                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n                        <li class=\"nav-item\">\r\n                            <a class=\"nav-link\" aria-current=\"page\" href=\"#\">Products and Services</a>\r\n                        </li>\r\n                        <li class=\"nav-item\">\r\n                            <a class=\"nav-link\" href=\"#\">Solutions</a>\r\n                        </li>\r\n                        <li class=\"nav-item\">\r\n                            <a class=\"nav-link\" href=\"#\">Support</a>\r\n                        </li>\r\n                        <li class=\"nav-item\">\r\n                            <a class=\"nav-link\" href=\"#\">Learn</a>\r\n                        </li>\r\n                    </ul>\r\n                </div>\r\n            </div>\r\n        </nav>\r\n    </div>\r\n</header>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

