/**
 *  Copyright (C) 2005 Orbeon, Inc.
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the
 *  GNU Lesser General Public License as published by the Free Software Foundation; either version
 *  2.1 of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  The full text of the license is available at http://www.gnu.org/copyleft/lesser.html
 */
package org.orbeon.oxf.xforms.function;

import org.orbeon.oxf.xforms.XFormsControls;
import org.orbeon.oxf.xforms.XFormsModel;
import org.orbeon.saxon.functions.SystemFunction;

/**
 * Base class for all XForms functions.
 */
abstract public class XFormsFunction extends SystemFunction {

    private XFormsModel xFormsModel;
    private XFormsControls xFormsControls;

    protected XFormsFunction() {
    }

    public XFormsModel getXFormsModel() {
        return xFormsModel;
    }

    public void setXFormsModel(XFormsModel xFormsModel) {
        this.xFormsModel = xFormsModel;
    }

    public XFormsControls getXFormsControls() {
        return xFormsControls;
    }

    public void setXFormsControls(XFormsControls xFormsControls) {
        this.xFormsControls = xFormsControls;
    }
}