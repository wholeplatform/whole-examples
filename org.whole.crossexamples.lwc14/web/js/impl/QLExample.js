$(document).ready(function  ( )  {
    var form = new QLrt.FormWidget({name : "Box1HouseOwning", submitCallback : persist});
    var hasSoldHouse = new QLrt.SimpleFormElementWidget({name : "hasSoldHouse", label : "Did you sell a house in 2010?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(form);
    var hasBoughtHouse = new QLrt.SimpleFormElementWidget({name : "hasBoughtHouse", label : "Did you buy a house in 2010?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(form);
    var hasMaintLoan = new QLrt.SimpleFormElementWidget({name : "hasMaintLoan", label : "Did you enter a loan for maintenance/reconstruction?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(form);
    var group = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [hasSoldHouse];
}, function  ( hasSoldHouse )  {
    return hasSoldHouse;
})).appendTo(form);
    var sellingPrice = new QLrt.SimpleFormElementWidget({name : "sellingPrice", label : "Price the house was sold for:", valueWidget : new QLrt.MoneyValueWidget()}).appendTo(group);
    var privateDebt = new QLrt.SimpleFormElementWidget({name : "privateDebt", label : "Private debts for sold house:", valueWidget : new QLrt.MoneyValueWidget()}).appendTo(group);
    var valueResidue = new QLrt.SimpleFormElementWidget({name : "valueResidue", label : "Value Residue:", valueWidget : new QLrt.MoneyValueWidget(new QLrt.LazyValue(function  ( )  {
    return [sellingPrice, privateDebt];
}, function  ( sellingPrice, privateDebt )  {
    return sellingPrice - privateDebt;
}))}).appendTo(group);
    $('#QL-content').append(form.domElement());
    form.activate();
    function persist(data) {
        localStorage['QL-persist'] = JSON.stringify(data);
    }
});