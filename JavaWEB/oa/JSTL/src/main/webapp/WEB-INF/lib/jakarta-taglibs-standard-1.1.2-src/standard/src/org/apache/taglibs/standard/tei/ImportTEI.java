/*
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.apache.taglibs.standard.tei;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;

/**
 * <p>An implementation of TagExtraInfo that implements validation for
 * &lt;c:import&gt;'s attributes</p>
 *
 * @author Shawn Bayern
 */
public class ImportTEI extends TagExtraInfo {

    final private static String VAR = "var";
    final private static String VAR_READER = "varReader";

    public boolean isValid(TagData us) {
	// don't allow both VAR and VAR_READER, together
	if (Util.isSpecified(us, VAR) && Util.isSpecified(us, VAR_READER))
	    return false;

        return true;
    }

}
