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
QLrt.TextWidget = function  ( settings )  {
    QLrt.Child.call(this);
    if (typeof(settings) !== 'object' || settings.label === undefined) {
        throw 'invalid or incomplete settings';
    }
    var container = QLrt.mk('p').text(settings.label);
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