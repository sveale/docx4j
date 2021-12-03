/* NOTICE: This file has been changed by Plutext Pty Ltd for use in docx4j.
 * The package name has been changed; there may also be other changes.
 * 
 * This notice is included to meet the condition in clause 4(b) of the License. 
 */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id$ */

package org.docx4j.fonts.fop.complexscripts.fonts;

// CSOFF: LineLengthCheck

/**
 * <p>The <code>GlyphSubstitution</code> interface is implemented by a glyph substitution subtable
 * that supports the determination of glyph substitution information based on script and
 * language of the corresponding character content.</p>
 *
 * <p>This work was originally authored by Glenn Adams (gadams@apache.org).</p>
 */
public interface GlyphSubstitution {

    /**
     * Perform glyph substitution at the current index, mutating the substitution state object as required.
     * Only the context associated with the current index is processed.
     * @param ss glyph substitution state object
     * @return true if the glyph subtable was applied, meaning that the current context matches the
     * associated input context glyph coverage table
     */
    boolean substitute(GlyphSubstitutionState ss);

}
