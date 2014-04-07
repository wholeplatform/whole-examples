$(document).ready(function  ( )  {
    var form = new QLrt.FormWidget({name : "Box1HouseOwningStyled", submitCallback : persist});
    var section = new QLrt.SectionWidget({name : "section", label : "General information"}).appendTo(form);
    section.domElement().addClass('H1');
    var firstName = new QLrt.SimpleFormElementWidget({name : "firstName", label : "First name:", valueWidget : new QLrt.StringValueWidget()}).appendTo(section);
    firstName.domElement().addClass('red');
    var lastName = new QLrt.SimpleFormElementWidget({name : "lastName", label : "Last name:", valueWidget : new QLrt.StringValueWidget()}).appendTo(section);
    lastName.domElement().addClass('bold');
    var fullName = new QLrt.SimpleFormElementWidget({name : "fullName", label : "Full name:", valueWidget : new QLrt.StringValueWidget(new QLrt.LazyValue(function  ( )  {
    return [firstName, lastName];
}, function  ( firstName, lastName )  {
    return firstName + " " + lastName;
}))}).appendTo(section);
    fullName.domElement().addClass('red');
    var section1 = new QLrt.SectionWidget({name : "section1", label : "Application Info"}).appendTo(section);
    section1.domElement().addClass('H2');
    var text = new QLrt.TextWidget({name : "text", text : "Text text text"}).appendTo(section1);
    var applicationDate = new QLrt.SimpleFormElementWidget({name : "applicationDate", label : "Application date:", valueWidget : new QLrt.DateValueWidget()}).appendTo(section1);
    applicationDate.domElement().addClass('red');
    var section2 = new QLrt.SectionWidget({name : "section2", label : "Main questionnaire"}).appendTo(form);
    section2.domElement().addClass('H1');
    var hasSoldHouse = new QLrt.SimpleFormElementWidget({name : "hasSoldHouse", label : "Did you sell a house in 2010?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(section2);
    hasSoldHouse.domElement().addClass('red');
    var hasBoughtHouse = new QLrt.SimpleFormElementWidget({name : "hasBoughtHouse", label : "Did you buy a house in 2010?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(section2);
    var hasMaintLoan = new QLrt.SimpleFormElementWidget({name : "hasMaintLoan", label : "Did you enter a loan for maintenance/reconstruction?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(section2);
    var group = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [hasSoldHouse];
}, function  ( hasSoldHouse )  {
    return hasSoldHouse;
})).appendTo(section2);
    var sellingPrice = new QLrt.SimpleFormElementWidget({name : "sellingPrice", label : "Price the house was sold for:", valueWidget : new QLrt.MoneyValueWidget()}).appendTo(group);
    sellingPrice.domElement().addClass('green');
    var privateDebt = new QLrt.SimpleFormElementWidget({name : "privateDebt", label : "Private debts for sold house:", valueWidget : new QLrt.MoneyValueWidget()}).appendTo(group);
    privateDebt.domElement().addClass('green');
    var group1 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [sellingPrice, privateDebt];
}, function  ( sellingPrice, privateDebt )  {
    return sellingPrice - privateDebt > 0;
})).appendTo(group);
    var valueResidue = new QLrt.SimpleFormElementWidget({name : "valueResidue", label : "Value Residue:", valueWidget : new QLrt.MoneyValueWidget(new QLrt.LazyValue(function  ( )  {
    return [sellingPrice, privateDebt];
}, function  ( sellingPrice, privateDebt )  {
    return sellingPrice - privateDebt;
}))}).appendTo(group1);
    valueResidue.domElement().addClass('green');
    $('#QL-content').append(form.domElement());
    form.activate();
    function persist(data) {
        localStorage['QL-persist'] = JSON.stringify(data);
    }
});