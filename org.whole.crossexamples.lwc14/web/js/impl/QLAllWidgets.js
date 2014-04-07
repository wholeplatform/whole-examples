$(document).ready(function  ( )  {
    var form = new QLrt.FormWidget({name : "Widgets gallery", submitCallback : persist});
    var stringValue = new QLrt.SimpleFormElementWidget({name : "stringValue", label : "String value:", valueWidget : new QLrt.StringValueWidget()}).appendTo(form);
    var stringValueDefined = new QLrt.SimpleFormElementWidget({name : "stringValueDefined", label : "string defined?", valueWidget : new QLrt.BooleanValueWidget(new QLrt.LazyValue(function  ( )  {
    return [stringValue];
}, function  ( stringValue )  {
    return stringValue !== undefined;
}))}).appendTo(form);
    var enumValue = new QLrt.SimpleFormElementWidget({name : "enumValue", label : "Enum value - Quality:", valueWidget : new QLrt.EnumValueWidget(["good", "bad", "don't know"])}).appendTo(form);
    var enumValueDefined = new QLrt.SimpleFormElementWidget({name : "enumValueDefined", label : "enum choice defined?", valueWidget : new QLrt.BooleanValueWidget(new QLrt.LazyValue(function  ( )  {
    return [enumValue];
}, function  ( enumValue )  {
    return enumValue !== undefined;
}))}).appendTo(form);
    var enumChoice = new QLrt.SimpleFormElementWidget({name : "enumChoice", label : "enum choice:", valueWidget : new QLrt.StringValueWidget(new QLrt.LazyValue(function  ( )  {
    return [enumValue];
}, function  ( enumValue )  {
    return enumValue;
}))}).appendTo(form);
    var dateValue = new QLrt.SimpleFormElementWidget({name : "dateValue", label : "Date value:", valueWidget : new QLrt.DateValueWidget()}).appendTo(form);
    var dateValueDefined = new QLrt.SimpleFormElementWidget({name : "dateValueDefined", label : "date value defined?", valueWidget : new QLrt.BooleanValueWidget(new QLrt.LazyValue(function  ( )  {
    return [dateValue];
}, function  ( dateValue )  {
    return dateValue !== undefined;
}))}).appendTo(form);
    var integerValue = new QLrt.SimpleFormElementWidget({name : "integerValue", label : "Integer value:", valueWidget : new QLrt.IntegerValueWidget()}).appendTo(form);
    var integerValueDefined = new QLrt.SimpleFormElementWidget({name : "integerValueDefined", label : "integer value defined?", valueWidget : new QLrt.BooleanValueWidget(new QLrt.LazyValue(function  ( )  {
    return [integerValue];
}, function  ( integerValue )  {
    return integerValue !== undefined;
}))}).appendTo(form);
    var decimalValue = new QLrt.SimpleFormElementWidget({name : "decimalValue", label : "Decimal value:", valueWidget : new QLrt.DecimalValueWidget()}).appendTo(form);
    var decimalValueDefined = new QLrt.SimpleFormElementWidget({name : "decimalValueDefined", label : "decimal value defined?", valueWidget : new QLrt.BooleanValueWidget(new QLrt.LazyValue(function  ( )  {
    return [decimalValue];
}, function  ( decimalValue )  {
    return decimalValue !== undefined;
}))}).appendTo(form);
    var integerRangeValue = new QLrt.SimpleFormElementWidget({name : "integerRangeValue", label : "Integer range value:", valueWidget : new QLrt.RangeValueWidget({min : 0, max : 10, type : 'integer'})}).appendTo(form);
    var integerRangeValueDefined = new QLrt.SimpleFormElementWidget({name : "integerRangeValueDefined", label : "integer range value", valueWidget : new QLrt.IntegerValueWidget(new QLrt.LazyValue(function  ( )  {
    return [integerRangeValue];
}, function  ( integerRangeValue )  {
    return integerRangeValue;
}))}).appendTo(form);
    $('#QL-content').append(form.domElement());
    form.activate();
    function persist(data) {
        localStorage['QL-persist'] = JSON.stringify(data);
    }
});