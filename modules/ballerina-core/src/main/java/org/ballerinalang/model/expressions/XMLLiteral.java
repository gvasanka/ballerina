/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.model.expressions;

import org.ballerinalang.model.NodeLocation;
import org.ballerinalang.model.NodeVisitor;
import org.ballerinalang.model.WhiteSpaceDescriptor;
import org.ballerinalang.model.types.BTypes;

/**
 * {@link XMLLiteral} represents an XML literal in Ballerina.
 *
 * @since 0.90
 */
public abstract class XMLLiteral extends AbstractExpression {

    public XMLLiteral(NodeLocation location, WhiteSpaceDescriptor whiteSpaceDescriptor) {
        super(location, whiteSpaceDescriptor);
        setType(BTypes.typeXML);
    }

    @Override
    public int getTempOffset() {
        return tempOffset;
    }

    @Override
    public void setTempOffset(int index) {
        this.tempOffset = index;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }
}