/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.control;

/**
Builder class for javafx.scene.control.TreeCell
@see javafx.scene.control.TreeCell
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class TreeCellBuilder<T, B extends javafx.scene.control.TreeCellBuilder<T, B>> extends javafx.scene.control.IndexedCellBuilder<T, B> {
    protected TreeCellBuilder() {
    }

    /** Creates a new instance of TreeCellBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <T> javafx.scene.control.TreeCellBuilder<T, ?> create() {
        return new javafx.scene.control.TreeCellBuilder();
    }

    private boolean __set;
    public void applyTo(javafx.scene.control.TreeCell<T> x) {
        super.applyTo(x);
        if (__set) x.setDisclosureNode(this.disclosureNode);
    }

    private javafx.scene.Node disclosureNode;
    /**
    Set the value of the {@link javafx.scene.control.TreeCell#getDisclosureNode() disclosureNode} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B disclosureNode(javafx.scene.Node x) {
        this.disclosureNode = x;
        __set = true;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.control.TreeCell} based on the properties set on this builder.
    */
    public javafx.scene.control.TreeCell<T> build() {
        javafx.scene.control.TreeCell<T> x = new javafx.scene.control.TreeCell<T>();
        applyTo(x);
        return x;
    }
}
