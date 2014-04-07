/*
 * Implementations of ValueWidgets, i.e. widgets which holds and visualize a value.
 */
QLrt.BaseValueWidget = function  ( lazyValue )  {
    QLrt.Child.call(this);
    this.createElement = function  ( )  {
    throw 'createElement not implemented';
};
    this.computed = (lazyValue !== undefined);
    var elt = null;
    this.domElement = function  ( )  {
    if (elt === null) {
        elt = this.createElement(this.signalChange).prop('disabled', this.computed).change(this.signalChange);
    }
    // this.signalChange is passed as a callback in case the element created doesn't support .change(..)
    return elt;
};
    this.value = function  ( )  {
    return (this.defined() ? this.valueInternal() : undefined);
};
    this.defined = function  ( )  {
    return this.computed || this.definedInternal();
};
    this.update = function  ( )  {
    if (this.computed) {
        this.setValue(lazyValue.evaluate());
    }
};
    this.setValue = function  ( val )  {
    throw 'setValue not implemented';
};
    this.valueInternal = function  ( )  {
    throw 'valueInternal not implemented';
};
    this.definedInternal = function  ( )  {
    throw 'definedInternal not implemented';
};
};
QLrt.BaseValueWidget.prototype = Object.create(QLrt.Child.prototype);
QLrt.uniqueId = 0;
QLrt.BooleanValueWidget = function  ( lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    var selectTrue = null, selectFalse = null;
    this.createElement = function  ( )  {
    var span = QLrt.mk('span');
    var currentUniqueId = QLrt.uniqueId++;
    selectTrue = QLrt.mk('input').attr('type', 'radio').attr('name', 'boolean-widget-uid-' + currentUniqueId);
    selectFalse = QLrt.mk('input').attr('type', 'radio').attr('name', 'boolean-widget-uid-' + currentUniqueId);
    span.append(wrapInLabel(selectTrue, "true")).append(wrapInLabel(selectFalse, "false"));
    return span;
};
    function wrapInLabel(elt, labelText) {
        return QLrt.mk('label').append(labelText).append(elt);
    }
    this.setValue = function  ( val )  {
    selectTrue.prop('checked', val);
    selectFalse.prop('checked', !val);
};
    this.valueInternal = function  ( )  {
    return selectTrue.prop('checked');
};
    this.definedInternal = function  ( )  {
    return selectTrue.prop('checked') || selectFalse.prop('checked');
};
};
QLrt.BooleanValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.MoneyValueWidget = function  ( lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    this.createElement = function  ( )  {
    return QLrt.mk('input').attr('type', 'text').autoNumeric('init');
};
    this.setValue = function  ( val )  {
    this.domElement().autoNumeric('set', (val === undefined ? '' : val));
};
    this.valueInternal = function  ( val )  {
    return this.domElement().autoNumeric('get');
};
    this.definedInternal = function  ( )  {
    return (this.valueInternal() !== '');
};
};
QLrt.MoneyValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.StringValueWidget = function  ( lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    this.createElement = function  ( )  {
    return QLrt.mk('input').attr('type', 'text');
};
    this.setValue = function  ( val )  {
    this.domElement().val(val);
};
    this.valueInternal = function  ( )  {
    return this.domElement().val();
};
    this.definedInternal = function  ( )  {
    return (this.valueInternal() !== '');
};
};
QLrt.StringValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.EnumValueWidget = function  ( enumeration, lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    var optionElements = {};
    this.createElement = function  ( )  {
    var select = QLrt.mk('select', 'enum-widget');
    QLrt.mk('option').append("Make a choice").appendTo(select);
    _.each(enumeration, function  ( literal )  {
    var option = QLrt.mk('option').append(literal).appendTo(select);
    optionElements[literal] = option;
});
    return select;
};
    this.setValue = function  ( val )  {
    _.each(optionElements, function  ( option, literal )  {
    option.prop('selected', val === literal);
});
};
    this.valueInternal = function  ( )  {
    var result = undefined;
    _.each(optionElements, function  ( option, literal )  {
    if (option.prop('selected')) {
        result = literal;
    }
});
    return result;
};
    this.definedInternal = function  ( )  {
    return (this.valueInternal() !== undefined);
};
};
QLrt.EnumValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.DateValueWidget = function  ( lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    this.createElement = function  ( )  {
    return QLrt.mk('input').attr('type', 'text').datepicker();
};
    this.setValue = function  ( val )  {
    this.domElement().val(val);
};
    this.valueInternal = function  ( val )  {
    return this.domElement().val();
};
    this.definedInternal = function  ( )  {
    return (this.valueInternal() !== '');
};
};
QLrt.DateValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.IntegerValueWidget = function  ( lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    this.createElement = function  ( )  {
    return QLrt.mk('input').attr('type', 'number').keypress(checkCharacter);
};
    var regex = /[0-9]/;
    function checkCharacter(event) {
        var key = String.fromCharCode(event.keyCode);
        if (!regex.test(key)) {
            event.preventDefault();
        }
    }
    this.setValue = function  ( val )  {
    this.domElement().val(val);
};
    this.valueInternal = function  ( )  {
    return this.domElement().val();
};
    this.definedInternal = function  ( )  {
    return (this.valueInternal() !== '');
};
};
QLrt.IntegerValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.DecimalValueWidget = function  ( lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    this.createElement = function  ( )  {
    return QLrt.mk('input').attr('type', 'number').keypress(checkCharacter);
};
    var regex = /[0-9]|\./;
    var self = this;
    function checkCharacter(event) {
        var key = String.fromCharCode(event.keyCode);
        if (key === '.') {
            var val = self.valueInternal();
            if (val === '') {
                self.setValue('0');
            } else {
                if (!regex.test(key) || (key === '.' && val.indexOf('.') > -1)) {
                    event.preventDefault();
                }
            }
        }
    }
    this.setValue = function  ( val )  {
    this.domElement().val(val);
};
    this.valueInternal = function  ( )  {
    return this.domElement().val();
};
    this.definedInternal = function  ( )  {
    return (this.valueInternal() !== '');
};
};
QLrt.DecimalValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);
QLrt.RangeValueWidget = function  ( settings, lazyValue )  {
    QLrt.BaseValueWidget.call(this, lazyValue);
    var self = this;
    this.createElement = function  ( changeCallback )  {
    var sliderSettings = {min : settings.min, max : settings.max, slide : function  ( event, ui )  {
    changeCallback.call(self);
}};
    if (settings.step !== undefined) {
        sliderSettings.step = settings.step;
    } else {
        if (settings.type === 'integer') {
            sliderSettings.step = 1;
        }
    }
    return QLrt.mk('div').slider(sliderSettings);
};
    this.setValue = function  ( val )  {
    this.domElement().slider("value", val);
};
    this.valueInternal = function  ( )  {
    return this.domElement().slider("value");
};
    this.definedInternal = function  ( )  {
    return true;
};
};
QLrt.RangeValueWidget.prototype = Object.create(QLrt.BaseValueWidget.prototype);