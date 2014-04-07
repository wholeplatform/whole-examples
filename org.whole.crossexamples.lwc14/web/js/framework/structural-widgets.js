/*
 * Widgets that take care of structure (but not of values).
 */
/**
 * A widget
 */
QLrt.FormWidget = function  ( settings )  {
    if (typeof(settings) !== 'object' || settings.name === undefined || settings.submitCallback === undefined) {
        throw 'invalid or incomplete settings';
    }
    var outerContainer = QLrt.mk('div', 'formcontainer').hide().append(QLrt.mk('h2').text('Form: ' + settings.name));
    var innerContainer = QLrt.mk('div', 'form').appendTo(outerContainer);
    var submitButton = QLrt.mk('button').prop('disabled', true).append('Submit').appendTo(outerContainer).click(function  ( )  {
    settings.submitCallback(asJSON());
});
    this.domElement = function  ( )  {
    return outerContainer;
};
    var children = [];
    this.append = function  ( widget )  {
    children.push(widget);
    innerContainer.append(widget.domElement());
};
    var propagatingUpdateLatch = false;
    this.signalChange = function  ( )  {
    if (propagatingUpdateLatch)
        return;
    propagatingUpdateLatch = true;
    _.each(children, function  ( subWidget )  {
    subWidget.update();
});
    propagatingUpdateLatch = false;
    submitButton.prop('disabled', !complete());
};
    this.activate = function  ( )  {
    this.signalChange();
    // initial setting of correct visualization
    outerContainer.show();
};
    function complete() {
        return _.all(children, function  ( subWidget )  {
    return subWidget.defined();
});
    }
    function asJSON() {
        var result = {};
        _.each(children, function  ( subWidget )  {
    _.extend(result, subWidget.asJSON());
});
        return result;
    }
};
QLrt.ConditionalGroupWidget = function  ( lazyValue )  {
    QLrt.Child.call(this);
    var container = QLrt.mk('div', 'group');
    this.domElement = function  ( )  {
    return container;
};
    var children = [];
    this.append = function  ( widget )  {
    children.push(widget);
    container.append(widget.domElement());
};
    this.defined = function  ( )  {
    return !lazyValue.evaluate() || _.all(children, function  ( subWidget )  {
    return subWidget.defined();
});
};
    this.update = function  ( )  {
    var value = lazyValue.evaluate();
    container.toggle(value);
    if (value) {
        _.each(children, function  ( subWidget )  {
    subWidget.update();
});
    }
};
    this.asJSON = function  ( )  {
    var result = {};
    if (lazyValue.evaluate()) {
        _.each(children, function  ( subWidget )  {
    _.extend(result, subWidget.asJSON());
});
    }
    return result;
};
};
QLrt.ConditionalGroupWidget.prototype = Object.create(QLrt.Child.prototype);
QLrt.SimpleFormElementWidget = function  ( settings )  {
    QLrt.Child.call(this);
    if (typeof(settings) !== 'object' || settings.label === undefined || settings.valueWidget === undefined) {
        throw 'invalid or incomplete settings';
    }
    if (settings.valueWidget instanceof QLrt.Child) {
        settings.valueWidget.appendTo(this);
    }
    var outerContainer = QLrt.mk('div', 'simpleFormElement');
    QLrt.mk('label').appendTo(outerContainer).append(settings.label).append(settings.valueWidget.domElement());
    this.domElement = function  ( )  {
    return outerContainer;
};
    this.value = function  ( )  {
    return settings.valueWidget.value();
};
    this.setValue = function  ( val )  {
    return settings.valueWidget.setValue(val);
};
    this.defined = function  ( )  {
    return settings.valueWidget.defined();
};
    this.update = function  ( )  {
    settings.valueWidget.update();
};
    this.asJSON = function  ( )  {
    var result = {};
    if (!settings.valueWidget.computed) {
        result[settings.name] = this.value();
    }
    return result;
};
};
QLrt.SimpleFormElementWidget.prototype = Object.create(QLrt.Child.prototype);
QLrt.ConditionalFormElementWidget = function  ( settings )  {
    QLrt.Child.call(this);
    if (typeof(settings) !== 'object' || settings.label === undefined || settings.valueWidget === undefined || typeof(settings.lazyValue) !== 'object') {
        throw 'invalid or incomplete settings';
    }
    if (settings.valueWidget instanceof QLrt.Child) {
        settings.valueWidget.appendTo(this);
    }
    var outerContainer = QLrt.mk('div', 'conditionalFormElement');
    QLrt.mk('label').appendTo(outerContainer).append(settings.label).append(settings.valueWidget.domElement());
    this.domElement = function  ( )  {
    return outerContainer;
};
    this.value = function  ( )  {
    return settings.valueWidget.value();
};
    this.setValue = function  ( val )  {
    return settings.valueWidget.setValue(val);
};
    this.defined = function  ( )  {
    return settings.valueWidget.defined();
};
    this.update = function  ( )  {
    var value = settings.lazyValue.evaluate();
    outerContainer.toggle(value);
    if (value) {
        settings.valueWidget.update();
    }
};
    this.asJSON = function  ( )  {
    var result = {};
    if (!settings.valueWidget.computed) {
        result[settings.name] = this.value();
    }
    return result;
};
};
QLrt.ConditionalFormElementWidget.prototype = Object.create(QLrt.Child.prototype);
/** Section widget, contributed by Enrico Persiani (Whole Platform). */
QLrt.SectionWidget = function  ( settings )  {
    QLrt.Child.call(this);
    if (typeof(settings) !== 'object' || settings.label === undefined) {
        throw 'invalid or incomplete settings';
    }
    var container = QLrt.mk('section').append(QLrt.mk('h1').text(settings.label));
    this.domElement = function  ( )  {
    return container;
};
    var children = [];
    this.append = function  ( widget )  {
    children.push(widget);
    container.append(widget.domElement());
};
    this.update = function  ( )  {
    _.each(children, function  ( subWidget )  {
    subWidget.update();
});
};
    this.defined = function  ( )  {
    return _.all(children, function  ( subWidget )  {
    return subWidget.defined();
});
};
    this.asJSON = function  ( )  {
    var result = {};
    _.each(children, function  ( subWidget )  {
    _.extend(result, subWidget.asJSON());
});
    return result;
};
};
QLrt.SectionWidget.prototype = Object.create(QLrt.Child.prototype);
/** Text widget, contributed by Enrico Persiani (Whole Platform). */
QLrt.TextWidget = function  ( settings )  {
    QLrt.Child.call(this);
    if (typeof(settings) !== 'object' || settings.text === undefined) {
        throw 'invalid or incomplete settings';
    }
    var container = QLrt.mk('p').text(settings.text);
    this.domElement = function  ( )  {
    return container;
};
    this.update = function  ( )  {
};
    this.defined = function  ( )  {
};
    this.asJSON = function  ( )  {
    var result = {};
    return result;
};
};
QLrt.TextWidget.prototype = Object.create(QLrt.Child.prototype);