$(document).ready(function  ( )  {
    var form = new QLrt.FormWidget({name : "Binary Search Tree", submitCallback : persist});
    var question = new QLrt.SimpleFormElementWidget({name : "question", label : "is the answer between 1 and 8 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(form);
    var group = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question];
}, function  ( question )  {
    return question;
})).appendTo(form);
    var question1 = new QLrt.SimpleFormElementWidget({name : "question1", label : "is the answer between 1 and 4 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group);
    var group1 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question1];
}, function  ( question1 )  {
    return question1;
})).appendTo(group);
    var question2 = new QLrt.SimpleFormElementWidget({name : "question2", label : "is the answer between 1 and 2 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group1);
    var group2 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question2];
}, function  ( question2 )  {
    return question2;
})).appendTo(group1);
    var question3 = new QLrt.SimpleFormElementWidget({name : "question3", label : "is the answer 1?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group2);
    var group3 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question3];
}, function  ( question3 )  {
    return question3;
})).appendTo(group2);
    var text = new QLrt.TextWidget({name : "text", text : "the answer is 1!"}).appendTo(group3);
    var group4 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question3];
}, function  ( question3 )  {
    return !question3;
})).appendTo(group2);
    var text1 = new QLrt.TextWidget({name : "text1", text : "the answer is 2!"}).appendTo(group4);
    var group5 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question2];
}, function  ( question2 )  {
    return !question2;
})).appendTo(group1);
    var question4 = new QLrt.SimpleFormElementWidget({name : "question4", label : "is the answer 3?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group5);
    var group6 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question4];
}, function  ( question4 )  {
    return question4;
})).appendTo(group5);
    var text2 = new QLrt.TextWidget({name : "text2", text : "the answer is 3!"}).appendTo(group6);
    var group7 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question4];
}, function  ( question4 )  {
    return !question4;
})).appendTo(group5);
    var text3 = new QLrt.TextWidget({name : "text3", text : "the answer is 4!"}).appendTo(group7);
    var group8 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question1];
}, function  ( question1 )  {
    return !question1;
})).appendTo(group);
    var question5 = new QLrt.SimpleFormElementWidget({name : "question5", label : "is the answer between 5 and 6 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group8);
    var group9 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question5];
}, function  ( question5 )  {
    return question5;
})).appendTo(group8);
    var question6 = new QLrt.SimpleFormElementWidget({name : "question6", label : "is the answer 5?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group9);
    var group10 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question6];
}, function  ( question6 )  {
    return question6;
})).appendTo(group9);
    var text4 = new QLrt.TextWidget({name : "text4", text : "the answer is 5!"}).appendTo(group10);
    var group11 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question6];
}, function  ( question6 )  {
    return !question6;
})).appendTo(group9);
    var text5 = new QLrt.TextWidget({name : "text5", text : "the answer is 6!"}).appendTo(group11);
    var group12 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question5];
}, function  ( question5 )  {
    return !question5;
})).appendTo(group8);
    var question7 = new QLrt.SimpleFormElementWidget({name : "question7", label : "is the answer 7?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group12);
    var group13 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question7];
}, function  ( question7 )  {
    return question7;
})).appendTo(group12);
    var text6 = new QLrt.TextWidget({name : "text6", text : "the answer is 7!"}).appendTo(group13);
    var group14 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question7];
}, function  ( question7 )  {
    return !question7;
})).appendTo(group12);
    var text7 = new QLrt.TextWidget({name : "text7", text : "the answer is 8!"}).appendTo(group14);
    var group15 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question];
}, function  ( question )  {
    return !question;
})).appendTo(form);
    var question8 = new QLrt.SimpleFormElementWidget({name : "question8", label : "is the answer between 9 and 12 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group15);
    var group16 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question8];
}, function  ( question8 )  {
    return question8;
})).appendTo(group15);
    var question9 = new QLrt.SimpleFormElementWidget({name : "question9", label : "is the answer between 9 and 10 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group16);
    var group17 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question9];
}, function  ( question9 )  {
    return question9;
})).appendTo(group16);
    var question10 = new QLrt.SimpleFormElementWidget({name : "question10", label : "is the answer 9?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group17);
    var group18 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question10];
}, function  ( question10 )  {
    return question10;
})).appendTo(group17);
    var text8 = new QLrt.TextWidget({name : "text8", text : "the answer is 9!"}).appendTo(group18);
    var group19 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question10];
}, function  ( question10 )  {
    return !question10;
})).appendTo(group17);
    var text9 = new QLrt.TextWidget({name : "text9", text : "the answer is 10!"}).appendTo(group19);
    var group20 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question9];
}, function  ( question9 )  {
    return !question9;
})).appendTo(group16);
    var question11 = new QLrt.SimpleFormElementWidget({name : "question11", label : "is the answer 11?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group20);
    var group21 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question11];
}, function  ( question11 )  {
    return question11;
})).appendTo(group20);
    var text10 = new QLrt.TextWidget({name : "text10", text : "the answer is 11!"}).appendTo(group21);
    var group22 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question11];
}, function  ( question11 )  {
    return !question11;
})).appendTo(group20);
    var text11 = new QLrt.TextWidget({name : "text11", text : "the answer is 12!"}).appendTo(group22);
    var group23 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question8];
}, function  ( question8 )  {
    return !question8;
})).appendTo(group15);
    var question12 = new QLrt.SimpleFormElementWidget({name : "question12", label : "is the answer between 13 and 14 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group23);
    var group24 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question12];
}, function  ( question12 )  {
    return question12;
})).appendTo(group23);
    var question13 = new QLrt.SimpleFormElementWidget({name : "question13", label : "is the answer 13?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group24);
    var group25 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question13];
}, function  ( question13 )  {
    return question13;
})).appendTo(group24);
    var text12 = new QLrt.TextWidget({name : "text12", text : "the answer is 13!"}).appendTo(group25);
    var group26 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question13];
}, function  ( question13 )  {
    return !question13;
})).appendTo(group24);
    var text13 = new QLrt.TextWidget({name : "text13", text : "the answer is 14!"}).appendTo(group26);
    var group27 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question12];
}, function  ( question12 )  {
    return !question12;
})).appendTo(group23);
    var question14 = new QLrt.SimpleFormElementWidget({name : "question14", label : "is the answer 15?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group27);
    var group28 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question14];
}, function  ( question14 )  {
    return question14;
})).appendTo(group27);
    var text14 = new QLrt.TextWidget({name : "text14", text : "the answer is 15!"}).appendTo(group28);
    var group29 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question14];
}, function  ( question14 )  {
    return !question14;
})).appendTo(group27);
    var text15 = new QLrt.TextWidget({name : "text15", text : "the answer is 16!"}).appendTo(group29);
    $('#QL-content').append(form.domElement());
    form.activate();
    function persist(data) {
        localStorage['QL-persist'] = JSON.stringify(data);
    }
});