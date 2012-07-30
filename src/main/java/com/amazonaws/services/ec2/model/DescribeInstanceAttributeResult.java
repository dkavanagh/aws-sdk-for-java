/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing an instance's attribute.
 * </p>
 */
public class DescribeInstanceAttributeResult {

    /**
     * The described instance attribute.
     */
    private InstanceAttribute instanceAttribute;

    /**
     * The described instance attribute.
     *
     * @return The described instance attribute.
     */
    public InstanceAttribute getInstanceAttribute() {
        return instanceAttribute;
    }
    
    /**
     * The described instance attribute.
     *
     * @param instanceAttribute The described instance attribute.
     */
    public void setInstanceAttribute(InstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
    }
    
    /**
     * The described instance attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceAttribute The described instance attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceAttributeResult withInstanceAttribute(InstanceAttribute instanceAttribute) {
        this.instanceAttribute = instanceAttribute;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (instanceAttribute != null) sb.append("InstanceAttribute: " + instanceAttribute + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceAttribute() == null) ? 0 : getInstanceAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeInstanceAttributeResult == false) return false;
        DescribeInstanceAttributeResult other = (DescribeInstanceAttributeResult)obj;
        
        if (other.getInstanceAttribute() == null ^ this.getInstanceAttribute() == null) return false;
        if (other.getInstanceAttribute() != null && other.getInstanceAttribute().equals(this.getInstanceAttribute()) == false) return false; 
        return true;
    }
    
}
    