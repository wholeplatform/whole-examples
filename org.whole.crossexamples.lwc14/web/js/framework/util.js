/**
 * Convenience function wrapping $('<... class="...">).
 */
QLrt.mk = function  ( tagName, className )  {
    var elt = $('<' + tagName + '></' + tagName + '>');
    if (className !== undefined) {
        elt.addClass(className);
    }
    return elt;
};
/**
 * Base type for children.
 */
QLrt.Child = function  ( )  {
    var parent = null;
    this.setParent = function  ( parent_ )  {
    if (parent !== null) {
        throw 'parent cannot be re-set';
    }
    parent = parent_;
};
    this.appendTo = function  ( parent_ )  {
    this.setParent(parent_);
    if (parent.append !== undefined) {
        parent.append(this);
    }
    return this;
};
    // for chaining
    this.signalChange = function  ( )  {
    parent.signalChange();
};
};
/**
 * A class for lazily-evaluated expressions, by default taking care of the
 * undefined-logic.
 */
QLrt.LazyValue = function  ( dependentValues, expression, funky )  {
    this.evaluate = function  ( )  {
    var values = dependentValues();
    if (funky) {
        var args = _.map(values, function  ( wrappedValue )  {
    return (wrappedValue.defined() ? wrappedValue.value() : undefined);
});
        return expression.apply(undefined, args);
    }
    if (!_.all(values, function  ( wrappedValue )  {
    return wrappedValue.defined();
})) {
        return undefined;
    }
    return expression.apply(undefined, _.map(values, function  ( wrappedValue )  {
    return wrappedValue.value();
}));
};
};