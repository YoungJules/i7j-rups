/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2024 Apryse Group NV
    Authors: Apryse Software.

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation with the addition of the
    following permission added to Section 15 as permitted in Section 7(a):
    FOR ANY PART OF THE COVERED WORK IN WHICH THE COPYRIGHT IS OWNED BY
    APRYSE GROUP. APRYSE GROUP DISCLAIMS THE WARRANTY OF NON INFRINGEMENT
    OF THIRD PARTY RIGHTS

    This program is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
    or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.
    You should have received a copy of the GNU Affero General Public License
    along with this program; if not, see http://www.gnu.org/licenses or write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA, 02110-1301 USA, or download the license from the following URL:
    http://itextpdf.com/terms-of-use/

    The interactive user interfaces in modified source and object code versions
    of this program must display Appropriate Legal Notices, as required under
    Section 5 of the GNU Affero General Public License.

    In accordance with Section 7(b) of the GNU Affero General Public License,
    a covered work must retain the producer line in every PDF that is created
    or manipulated using iText.

    You can be released from the requirements of the license by purchasing
    a commercial license. Buying such a license is mandatory as soon as you
    develop commercial activities involving the iText software without
    disclosing the source code of your own applications.
    These activities include: offering paid services to customers as an ASP,
    serving PDFs on the fly in a web application, shipping iText with a closed
    source product.

    For more information, please contact iText Software Corp. at this
    address: sales@itextpdf.com
 */
package com.itextpdf.rups.view.itext.treenodes.asn1;

import org.bouncycastle.asn1.ASN1Boolean;

/**
 * Tree node for showing BOOLEAN ASN.1 objects.
 */
public final class Asn1BooleanTreeNode extends AbstractAsn1TreeNode {
    /**
     * Icon to use for BOOLEAN ASN.1 objects.
     */
    private static final String ICON = "boolean.png";

    /**
     * Creates a new tree node for a BOOLEAN ASN.1 object.
     *
     * @param bool BOOLEAN ASN.1 object.
     */
    public Asn1BooleanTreeNode(ASN1Boolean bool) {
        super(ICON, bool);
    }

    /**
     * Creates a new BOOLEAN object tree node with the specified RFC field
     * name and object value.
     *
     * @param rfcFieldName RFC field name string.
     * @param value        Value for the ASN.1 BOOLEAN object for this node.
     */
    public Asn1BooleanTreeNode(String rfcFieldName, boolean value) {
        this(ASN1Boolean.getInstance(value));
        setRfcFieldName(rfcFieldName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAsn1Type() {
        return "BOOLEAN";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ASN1Boolean getAsn1Primitive() {
        return (ASN1Boolean) super.getAsn1Primitive();
    }
}
