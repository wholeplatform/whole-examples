$(document).ready(function  ( )  {
    var form = new QLrt.FormWidget({name : "Binary Search Tree", submitCallback : persist});
    var question = new QLrt.SimpleFormElementWidget({name : "question", label : "is the answer between 1 and 32 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(form);
    var group = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question];
}, function  ( question )  {
    return question;
})).appendTo(form);
    var question1 = new QLrt.SimpleFormElementWidget({name : "question1", label : "is the answer between 1 and 16 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group);
    var group1 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question1];
}, function  ( question1 )  {
    return question1;
})).appendTo(group);
    var question2 = new QLrt.SimpleFormElementWidget({name : "question2", label : "is the answer between 1 and 8 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group1);
    var group2 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question2];
}, function  ( question2 )  {
    return question2;
})).appendTo(group1);
    var question3 = new QLrt.SimpleFormElementWidget({name : "question3", label : "is the answer between 1 and 4 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group2);
    var group3 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question3];
}, function  ( question3 )  {
    return question3;
})).appendTo(group2);
    var question4 = new QLrt.SimpleFormElementWidget({name : "question4", label : "is the answer between 1 and 2 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group3);
    var group4 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question4];
}, function  ( question4 )  {
    return question4;
})).appendTo(group3);
    var question5 = new QLrt.SimpleFormElementWidget({name : "question5", label : "is the answer 1 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group4);
    var group5 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question5];
}, function  ( question5 )  {
    return question5;
})).appendTo(group4);
    var text = new QLrt.TextWidget({name : "text", text : "the answer is:"}).appendTo(group5);
    var text1 = new QLrt.TextWidget({name : "text1", text : "1"}).appendTo(group5);
    var group6 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question5];
}, function  ( question5 )  {
    return !question5;
})).appendTo(group4);
    var text2 = new QLrt.TextWidget({name : "text2", text : "the answer is:"}).appendTo(group6);
    var text3 = new QLrt.TextWidget({name : "text3", text : "2"}).appendTo(group6);
    var group7 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question4];
}, function  ( question4 )  {
    return !question4;
})).appendTo(group3);
    var question6 = new QLrt.SimpleFormElementWidget({name : "question6", label : "is the answer 3 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group7);
    var group8 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question6];
}, function  ( question6 )  {
    return question6;
})).appendTo(group7);
    var text4 = new QLrt.TextWidget({name : "text4", text : "the answer is:"}).appendTo(group8);
    var text5 = new QLrt.TextWidget({name : "text5", text : "3"}).appendTo(group8);
    var group9 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question6];
}, function  ( question6 )  {
    return !question6;
})).appendTo(group7);
    var text6 = new QLrt.TextWidget({name : "text6", text : "the answer is:"}).appendTo(group9);
    var text7 = new QLrt.TextWidget({name : "text7", text : "4"}).appendTo(group9);
    var group10 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question3];
}, function  ( question3 )  {
    return !question3;
})).appendTo(group2);
    var question7 = new QLrt.SimpleFormElementWidget({name : "question7", label : "is the answer between 5 and 6 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group10);
    var group11 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question7];
}, function  ( question7 )  {
    return question7;
})).appendTo(group10);
    var question8 = new QLrt.SimpleFormElementWidget({name : "question8", label : "is the answer 5 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group11);
    var group12 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question8];
}, function  ( question8 )  {
    return question8;
})).appendTo(group11);
    var text8 = new QLrt.TextWidget({name : "text8", text : "the answer is:"}).appendTo(group12);
    var text9 = new QLrt.TextWidget({name : "text9", text : "5"}).appendTo(group12);
    var group13 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question8];
}, function  ( question8 )  {
    return !question8;
})).appendTo(group11);
    var text10 = new QLrt.TextWidget({name : "text10", text : "the answer is:"}).appendTo(group13);
    var text11 = new QLrt.TextWidget({name : "text11", text : "6"}).appendTo(group13);
    var group14 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question7];
}, function  ( question7 )  {
    return !question7;
})).appendTo(group10);
    var question9 = new QLrt.SimpleFormElementWidget({name : "question9", label : "is the answer 7 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group14);
    var group15 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question9];
}, function  ( question9 )  {
    return question9;
})).appendTo(group14);
    var text12 = new QLrt.TextWidget({name : "text12", text : "the answer is:"}).appendTo(group15);
    var text13 = new QLrt.TextWidget({name : "text13", text : "7"}).appendTo(group15);
    var group16 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question9];
}, function  ( question9 )  {
    return !question9;
})).appendTo(group14);
    var text14 = new QLrt.TextWidget({name : "text14", text : "the answer is:"}).appendTo(group16);
    var text15 = new QLrt.TextWidget({name : "text15", text : "8"}).appendTo(group16);
    var group17 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question2];
}, function  ( question2 )  {
    return !question2;
})).appendTo(group1);
    var question10 = new QLrt.SimpleFormElementWidget({name : "question10", label : "is the answer between 9 and 12 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group17);
    var group18 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question10];
}, function  ( question10 )  {
    return question10;
})).appendTo(group17);
    var question11 = new QLrt.SimpleFormElementWidget({name : "question11", label : "is the answer between 9 and 10 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group18);
    var group19 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question11];
}, function  ( question11 )  {
    return question11;
})).appendTo(group18);
    var question12 = new QLrt.SimpleFormElementWidget({name : "question12", label : "is the answer 9 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group19);
    var group20 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question12];
}, function  ( question12 )  {
    return question12;
})).appendTo(group19);
    var text16 = new QLrt.TextWidget({name : "text16", text : "the answer is:"}).appendTo(group20);
    var text17 = new QLrt.TextWidget({name : "text17", text : "9"}).appendTo(group20);
    var group21 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question12];
}, function  ( question12 )  {
    return !question12;
})).appendTo(group19);
    var text18 = new QLrt.TextWidget({name : "text18", text : "the answer is:"}).appendTo(group21);
    var text19 = new QLrt.TextWidget({name : "text19", text : "10"}).appendTo(group21);
    var group22 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question11];
}, function  ( question11 )  {
    return !question11;
})).appendTo(group18);
    var question13 = new QLrt.SimpleFormElementWidget({name : "question13", label : "is the answer 11 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group22);
    var group23 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question13];
}, function  ( question13 )  {
    return question13;
})).appendTo(group22);
    var text20 = new QLrt.TextWidget({name : "text20", text : "the answer is:"}).appendTo(group23);
    var text21 = new QLrt.TextWidget({name : "text21", text : "11"}).appendTo(group23);
    var group24 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question13];
}, function  ( question13 )  {
    return !question13;
})).appendTo(group22);
    var text22 = new QLrt.TextWidget({name : "text22", text : "the answer is:"}).appendTo(group24);
    var text23 = new QLrt.TextWidget({name : "text23", text : "12"}).appendTo(group24);
    var group25 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question10];
}, function  ( question10 )  {
    return !question10;
})).appendTo(group17);
    var question14 = new QLrt.SimpleFormElementWidget({name : "question14", label : "is the answer between 13 and 14 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group25);
    var group26 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question14];
}, function  ( question14 )  {
    return question14;
})).appendTo(group25);
    var question15 = new QLrt.SimpleFormElementWidget({name : "question15", label : "is the answer 13 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group26);
    var group27 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question15];
}, function  ( question15 )  {
    return question15;
})).appendTo(group26);
    var text24 = new QLrt.TextWidget({name : "text24", text : "the answer is:"}).appendTo(group27);
    var text25 = new QLrt.TextWidget({name : "text25", text : "13"}).appendTo(group27);
    var group28 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question15];
}, function  ( question15 )  {
    return !question15;
})).appendTo(group26);
    var text26 = new QLrt.TextWidget({name : "text26", text : "the answer is:"}).appendTo(group28);
    var text27 = new QLrt.TextWidget({name : "text27", text : "14"}).appendTo(group28);
    var group29 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question14];
}, function  ( question14 )  {
    return !question14;
})).appendTo(group25);
    var question16 = new QLrt.SimpleFormElementWidget({name : "question16", label : "is the answer 15 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group29);
    var group30 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question16];
}, function  ( question16 )  {
    return question16;
})).appendTo(group29);
    var text28 = new QLrt.TextWidget({name : "text28", text : "the answer is:"}).appendTo(group30);
    var text29 = new QLrt.TextWidget({name : "text29", text : "15"}).appendTo(group30);
    var group31 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question16];
}, function  ( question16 )  {
    return !question16;
})).appendTo(group29);
    var text30 = new QLrt.TextWidget({name : "text30", text : "the answer is:"}).appendTo(group31);
    var text31 = new QLrt.TextWidget({name : "text31", text : "16"}).appendTo(group31);
    var group32 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question1];
}, function  ( question1 )  {
    return !question1;
})).appendTo(group);
    var question17 = new QLrt.SimpleFormElementWidget({name : "question17", label : "is the answer between 17 and 24 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group32);
    var group33 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question17];
}, function  ( question17 )  {
    return question17;
})).appendTo(group32);
    var question18 = new QLrt.SimpleFormElementWidget({name : "question18", label : "is the answer between 17 and 20 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group33);
    var group34 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question18];
}, function  ( question18 )  {
    return question18;
})).appendTo(group33);
    var question19 = new QLrt.SimpleFormElementWidget({name : "question19", label : "is the answer between 17 and 18 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group34);
    var group35 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question19];
}, function  ( question19 )  {
    return question19;
})).appendTo(group34);
    var question20 = new QLrt.SimpleFormElementWidget({name : "question20", label : "is the answer 17 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group35);
    var group36 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question20];
}, function  ( question20 )  {
    return question20;
})).appendTo(group35);
    var text32 = new QLrt.TextWidget({name : "text32", text : "the answer is:"}).appendTo(group36);
    var text33 = new QLrt.TextWidget({name : "text33", text : "17"}).appendTo(group36);
    var group37 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question20];
}, function  ( question20 )  {
    return !question20;
})).appendTo(group35);
    var text34 = new QLrt.TextWidget({name : "text34", text : "the answer is:"}).appendTo(group37);
    var text35 = new QLrt.TextWidget({name : "text35", text : "18"}).appendTo(group37);
    var group38 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question19];
}, function  ( question19 )  {
    return !question19;
})).appendTo(group34);
    var question21 = new QLrt.SimpleFormElementWidget({name : "question21", label : "is the answer 19 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group38);
    var group39 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question21];
}, function  ( question21 )  {
    return question21;
})).appendTo(group38);
    var text36 = new QLrt.TextWidget({name : "text36", text : "the answer is:"}).appendTo(group39);
    var text37 = new QLrt.TextWidget({name : "text37", text : "19"}).appendTo(group39);
    var group40 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question21];
}, function  ( question21 )  {
    return !question21;
})).appendTo(group38);
    var text38 = new QLrt.TextWidget({name : "text38", text : "the answer is:"}).appendTo(group40);
    var text39 = new QLrt.TextWidget({name : "text39", text : "20"}).appendTo(group40);
    var group41 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question18];
}, function  ( question18 )  {
    return !question18;
})).appendTo(group33);
    var question22 = new QLrt.SimpleFormElementWidget({name : "question22", label : "is the answer between 21 and 22 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group41);
    var group42 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question22];
}, function  ( question22 )  {
    return question22;
})).appendTo(group41);
    var question23 = new QLrt.SimpleFormElementWidget({name : "question23", label : "is the answer 21 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group42);
    var group43 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question23];
}, function  ( question23 )  {
    return question23;
})).appendTo(group42);
    var text40 = new QLrt.TextWidget({name : "text40", text : "the answer is:"}).appendTo(group43);
    var text41 = new QLrt.TextWidget({name : "text41", text : "21"}).appendTo(group43);
    var group44 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question23];
}, function  ( question23 )  {
    return !question23;
})).appendTo(group42);
    var text42 = new QLrt.TextWidget({name : "text42", text : "the answer is:"}).appendTo(group44);
    var text43 = new QLrt.TextWidget({name : "text43", text : "22"}).appendTo(group44);
    var group45 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question22];
}, function  ( question22 )  {
    return !question22;
})).appendTo(group41);
    var question24 = new QLrt.SimpleFormElementWidget({name : "question24", label : "is the answer 23 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group45);
    var group46 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question24];
}, function  ( question24 )  {
    return question24;
})).appendTo(group45);
    var text44 = new QLrt.TextWidget({name : "text44", text : "the answer is:"}).appendTo(group46);
    var text45 = new QLrt.TextWidget({name : "text45", text : "23"}).appendTo(group46);
    var group47 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question24];
}, function  ( question24 )  {
    return !question24;
})).appendTo(group45);
    var text46 = new QLrt.TextWidget({name : "text46", text : "the answer is:"}).appendTo(group47);
    var text47 = new QLrt.TextWidget({name : "text47", text : "24"}).appendTo(group47);
    var group48 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question17];
}, function  ( question17 )  {
    return !question17;
})).appendTo(group32);
    var question25 = new QLrt.SimpleFormElementWidget({name : "question25", label : "is the answer between 25 and 28 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group48);
    var group49 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question25];
}, function  ( question25 )  {
    return question25;
})).appendTo(group48);
    var question26 = new QLrt.SimpleFormElementWidget({name : "question26", label : "is the answer between 25 and 26 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group49);
    var group50 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question26];
}, function  ( question26 )  {
    return question26;
})).appendTo(group49);
    var question27 = new QLrt.SimpleFormElementWidget({name : "question27", label : "is the answer 25 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group50);
    var group51 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question27];
}, function  ( question27 )  {
    return question27;
})).appendTo(group50);
    var text48 = new QLrt.TextWidget({name : "text48", text : "the answer is:"}).appendTo(group51);
    var text49 = new QLrt.TextWidget({name : "text49", text : "25"}).appendTo(group51);
    var group52 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question27];
}, function  ( question27 )  {
    return !question27;
})).appendTo(group50);
    var text50 = new QLrt.TextWidget({name : "text50", text : "the answer is:"}).appendTo(group52);
    var text51 = new QLrt.TextWidget({name : "text51", text : "26"}).appendTo(group52);
    var group53 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question26];
}, function  ( question26 )  {
    return !question26;
})).appendTo(group49);
    var question28 = new QLrt.SimpleFormElementWidget({name : "question28", label : "is the answer 27 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group53);
    var group54 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question28];
}, function  ( question28 )  {
    return question28;
})).appendTo(group53);
    var text52 = new QLrt.TextWidget({name : "text52", text : "the answer is:"}).appendTo(group54);
    var text53 = new QLrt.TextWidget({name : "text53", text : "27"}).appendTo(group54);
    var group55 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question28];
}, function  ( question28 )  {
    return !question28;
})).appendTo(group53);
    var text54 = new QLrt.TextWidget({name : "text54", text : "the answer is:"}).appendTo(group55);
    var text55 = new QLrt.TextWidget({name : "text55", text : "28"}).appendTo(group55);
    var group56 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question25];
}, function  ( question25 )  {
    return !question25;
})).appendTo(group48);
    var question29 = new QLrt.SimpleFormElementWidget({name : "question29", label : "is the answer between 29 and 30 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group56);
    var group57 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question29];
}, function  ( question29 )  {
    return question29;
})).appendTo(group56);
    var question30 = new QLrt.SimpleFormElementWidget({name : "question30", label : "is the answer 29 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group57);
    var group58 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question30];
}, function  ( question30 )  {
    return question30;
})).appendTo(group57);
    var text56 = new QLrt.TextWidget({name : "text56", text : "the answer is:"}).appendTo(group58);
    var text57 = new QLrt.TextWidget({name : "text57", text : "29"}).appendTo(group58);
    var group59 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question30];
}, function  ( question30 )  {
    return !question30;
})).appendTo(group57);
    var text58 = new QLrt.TextWidget({name : "text58", text : "the answer is:"}).appendTo(group59);
    var text59 = new QLrt.TextWidget({name : "text59", text : "30"}).appendTo(group59);
    var group60 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question29];
}, function  ( question29 )  {
    return !question29;
})).appendTo(group56);
    var question31 = new QLrt.SimpleFormElementWidget({name : "question31", label : "is the answer 31 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group60);
    var group61 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question31];
}, function  ( question31 )  {
    return question31;
})).appendTo(group60);
    var text60 = new QLrt.TextWidget({name : "text60", text : "the answer is:"}).appendTo(group61);
    var text61 = new QLrt.TextWidget({name : "text61", text : "31"}).appendTo(group61);
    var group62 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question31];
}, function  ( question31 )  {
    return !question31;
})).appendTo(group60);
    var text62 = new QLrt.TextWidget({name : "text62", text : "the answer is:"}).appendTo(group62);
    var text63 = new QLrt.TextWidget({name : "text63", text : "32"}).appendTo(group62);
    var group63 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question];
}, function  ( question )  {
    return !question;
})).appendTo(form);
    var question32 = new QLrt.SimpleFormElementWidget({name : "question32", label : "is the answer between 33 and 48 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group63);
    var group64 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question32];
}, function  ( question32 )  {
    return question32;
})).appendTo(group63);
    var question33 = new QLrt.SimpleFormElementWidget({name : "question33", label : "is the answer between 33 and 40 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group64);
    var group65 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question33];
}, function  ( question33 )  {
    return question33;
})).appendTo(group64);
    var question34 = new QLrt.SimpleFormElementWidget({name : "question34", label : "is the answer between 33 and 36 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group65);
    var group66 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question34];
}, function  ( question34 )  {
    return question34;
})).appendTo(group65);
    var question35 = new QLrt.SimpleFormElementWidget({name : "question35", label : "is the answer between 33 and 34 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group66);
    var group67 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question35];
}, function  ( question35 )  {
    return question35;
})).appendTo(group66);
    var question36 = new QLrt.SimpleFormElementWidget({name : "question36", label : "is the answer 33 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group67);
    var group68 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question36];
}, function  ( question36 )  {
    return question36;
})).appendTo(group67);
    var text64 = new QLrt.TextWidget({name : "text64", text : "the answer is:"}).appendTo(group68);
    var text65 = new QLrt.TextWidget({name : "text65", text : "33"}).appendTo(group68);
    var group69 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question36];
}, function  ( question36 )  {
    return !question36;
})).appendTo(group67);
    var text66 = new QLrt.TextWidget({name : "text66", text : "the answer is:"}).appendTo(group69);
    var text67 = new QLrt.TextWidget({name : "text67", text : "34"}).appendTo(group69);
    var group70 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question35];
}, function  ( question35 )  {
    return !question35;
})).appendTo(group66);
    var question37 = new QLrt.SimpleFormElementWidget({name : "question37", label : "is the answer 35 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group70);
    var group71 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question37];
}, function  ( question37 )  {
    return question37;
})).appendTo(group70);
    var text68 = new QLrt.TextWidget({name : "text68", text : "the answer is:"}).appendTo(group71);
    var text69 = new QLrt.TextWidget({name : "text69", text : "35"}).appendTo(group71);
    var group72 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question37];
}, function  ( question37 )  {
    return !question37;
})).appendTo(group70);
    var text70 = new QLrt.TextWidget({name : "text70", text : "the answer is:"}).appendTo(group72);
    var text71 = new QLrt.TextWidget({name : "text71", text : "36"}).appendTo(group72);
    var group73 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question34];
}, function  ( question34 )  {
    return !question34;
})).appendTo(group65);
    var question38 = new QLrt.SimpleFormElementWidget({name : "question38", label : "is the answer between 37 and 38 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group73);
    var group74 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question38];
}, function  ( question38 )  {
    return question38;
})).appendTo(group73);
    var question39 = new QLrt.SimpleFormElementWidget({name : "question39", label : "is the answer 37 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group74);
    var group75 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question39];
}, function  ( question39 )  {
    return question39;
})).appendTo(group74);
    var text72 = new QLrt.TextWidget({name : "text72", text : "the answer is:"}).appendTo(group75);
    var text73 = new QLrt.TextWidget({name : "text73", text : "37"}).appendTo(group75);
    var group76 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question39];
}, function  ( question39 )  {
    return !question39;
})).appendTo(group74);
    var text74 = new QLrt.TextWidget({name : "text74", text : "the answer is:"}).appendTo(group76);
    var text75 = new QLrt.TextWidget({name : "text75", text : "38"}).appendTo(group76);
    var group77 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question38];
}, function  ( question38 )  {
    return !question38;
})).appendTo(group73);
    var question40 = new QLrt.SimpleFormElementWidget({name : "question40", label : "is the answer 39 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group77);
    var group78 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question40];
}, function  ( question40 )  {
    return question40;
})).appendTo(group77);
    var text76 = new QLrt.TextWidget({name : "text76", text : "the answer is:"}).appendTo(group78);
    var text77 = new QLrt.TextWidget({name : "text77", text : "39"}).appendTo(group78);
    var group79 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question40];
}, function  ( question40 )  {
    return !question40;
})).appendTo(group77);
    var text78 = new QLrt.TextWidget({name : "text78", text : "the answer is:"}).appendTo(group79);
    var text79 = new QLrt.TextWidget({name : "text79", text : "40"}).appendTo(group79);
    var group80 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question33];
}, function  ( question33 )  {
    return !question33;
})).appendTo(group64);
    var question41 = new QLrt.SimpleFormElementWidget({name : "question41", label : "is the answer between 41 and 44 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group80);
    var group81 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question41];
}, function  ( question41 )  {
    return question41;
})).appendTo(group80);
    var question42 = new QLrt.SimpleFormElementWidget({name : "question42", label : "is the answer between 41 and 42 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group81);
    var group82 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question42];
}, function  ( question42 )  {
    return question42;
})).appendTo(group81);
    var question43 = new QLrt.SimpleFormElementWidget({name : "question43", label : "is the answer 41 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group82);
    var group83 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question43];
}, function  ( question43 )  {
    return question43;
})).appendTo(group82);
    var text80 = new QLrt.TextWidget({name : "text80", text : "the answer is:"}).appendTo(group83);
    var text81 = new QLrt.TextWidget({name : "text81", text : "41"}).appendTo(group83);
    var group84 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question43];
}, function  ( question43 )  {
    return !question43;
})).appendTo(group82);
    var text82 = new QLrt.TextWidget({name : "text82", text : "the answer is:"}).appendTo(group84);
    var text83 = new QLrt.TextWidget({name : "text83", text : "42"}).appendTo(group84);
    var group85 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question42];
}, function  ( question42 )  {
    return !question42;
})).appendTo(group81);
    var question44 = new QLrt.SimpleFormElementWidget({name : "question44", label : "is the answer 43 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group85);
    var group86 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question44];
}, function  ( question44 )  {
    return question44;
})).appendTo(group85);
    var text84 = new QLrt.TextWidget({name : "text84", text : "the answer is:"}).appendTo(group86);
    var text85 = new QLrt.TextWidget({name : "text85", text : "43"}).appendTo(group86);
    var group87 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question44];
}, function  ( question44 )  {
    return !question44;
})).appendTo(group85);
    var text86 = new QLrt.TextWidget({name : "text86", text : "the answer is:"}).appendTo(group87);
    var text87 = new QLrt.TextWidget({name : "text87", text : "44"}).appendTo(group87);
    var group88 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question41];
}, function  ( question41 )  {
    return !question41;
})).appendTo(group80);
    var question45 = new QLrt.SimpleFormElementWidget({name : "question45", label : "is the answer between 45 and 46 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group88);
    var group89 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question45];
}, function  ( question45 )  {
    return question45;
})).appendTo(group88);
    var question46 = new QLrt.SimpleFormElementWidget({name : "question46", label : "is the answer 45 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group89);
    var group90 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question46];
}, function  ( question46 )  {
    return question46;
})).appendTo(group89);
    var text88 = new QLrt.TextWidget({name : "text88", text : "the answer is:"}).appendTo(group90);
    var text89 = new QLrt.TextWidget({name : "text89", text : "45"}).appendTo(group90);
    var group91 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question46];
}, function  ( question46 )  {
    return !question46;
})).appendTo(group89);
    var text90 = new QLrt.TextWidget({name : "text90", text : "the answer is:"}).appendTo(group91);
    var text91 = new QLrt.TextWidget({name : "text91", text : "46"}).appendTo(group91);
    var group92 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question45];
}, function  ( question45 )  {
    return !question45;
})).appendTo(group88);
    var question47 = new QLrt.SimpleFormElementWidget({name : "question47", label : "is the answer 47 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group92);
    var group93 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question47];
}, function  ( question47 )  {
    return question47;
})).appendTo(group92);
    var text92 = new QLrt.TextWidget({name : "text92", text : "the answer is:"}).appendTo(group93);
    var text93 = new QLrt.TextWidget({name : "text93", text : "47"}).appendTo(group93);
    var group94 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question47];
}, function  ( question47 )  {
    return !question47;
})).appendTo(group92);
    var text94 = new QLrt.TextWidget({name : "text94", text : "the answer is:"}).appendTo(group94);
    var text95 = new QLrt.TextWidget({name : "text95", text : "48"}).appendTo(group94);
    var group95 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question32];
}, function  ( question32 )  {
    return !question32;
})).appendTo(group63);
    var question48 = new QLrt.SimpleFormElementWidget({name : "question48", label : "is the answer between 49 and 56 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group95);
    var group96 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question48];
}, function  ( question48 )  {
    return question48;
})).appendTo(group95);
    var question49 = new QLrt.SimpleFormElementWidget({name : "question49", label : "is the answer between 49 and 52 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group96);
    var group97 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question49];
}, function  ( question49 )  {
    return question49;
})).appendTo(group96);
    var question50 = new QLrt.SimpleFormElementWidget({name : "question50", label : "is the answer between 49 and 50 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group97);
    var group98 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question50];
}, function  ( question50 )  {
    return question50;
})).appendTo(group97);
    var question51 = new QLrt.SimpleFormElementWidget({name : "question51", label : "is the answer 49 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group98);
    var group99 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question51];
}, function  ( question51 )  {
    return question51;
})).appendTo(group98);
    var text96 = new QLrt.TextWidget({name : "text96", text : "the answer is:"}).appendTo(group99);
    var text97 = new QLrt.TextWidget({name : "text97", text : "49"}).appendTo(group99);
    var group100 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question51];
}, function  ( question51 )  {
    return !question51;
})).appendTo(group98);
    var text98 = new QLrt.TextWidget({name : "text98", text : "the answer is:"}).appendTo(group100);
    var text99 = new QLrt.TextWidget({name : "text99", text : "50"}).appendTo(group100);
    var group101 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question50];
}, function  ( question50 )  {
    return !question50;
})).appendTo(group97);
    var question52 = new QLrt.SimpleFormElementWidget({name : "question52", label : "is the answer 51 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group101);
    var group102 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question52];
}, function  ( question52 )  {
    return question52;
})).appendTo(group101);
    var text100 = new QLrt.TextWidget({name : "text100", text : "the answer is:"}).appendTo(group102);
    var text101 = new QLrt.TextWidget({name : "text101", text : "51"}).appendTo(group102);
    var group103 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question52];
}, function  ( question52 )  {
    return !question52;
})).appendTo(group101);
    var text102 = new QLrt.TextWidget({name : "text102", text : "the answer is:"}).appendTo(group103);
    var text103 = new QLrt.TextWidget({name : "text103", text : "52"}).appendTo(group103);
    var group104 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question49];
}, function  ( question49 )  {
    return !question49;
})).appendTo(group96);
    var question53 = new QLrt.SimpleFormElementWidget({name : "question53", label : "is the answer between 53 and 54 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group104);
    var group105 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question53];
}, function  ( question53 )  {
    return question53;
})).appendTo(group104);
    var question54 = new QLrt.SimpleFormElementWidget({name : "question54", label : "is the answer 53 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group105);
    var group106 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question54];
}, function  ( question54 )  {
    return question54;
})).appendTo(group105);
    var text104 = new QLrt.TextWidget({name : "text104", text : "the answer is:"}).appendTo(group106);
    var text105 = new QLrt.TextWidget({name : "text105", text : "53"}).appendTo(group106);
    var group107 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question54];
}, function  ( question54 )  {
    return !question54;
})).appendTo(group105);
    var text106 = new QLrt.TextWidget({name : "text106", text : "the answer is:"}).appendTo(group107);
    var text107 = new QLrt.TextWidget({name : "text107", text : "54"}).appendTo(group107);
    var group108 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question53];
}, function  ( question53 )  {
    return !question53;
})).appendTo(group104);
    var question55 = new QLrt.SimpleFormElementWidget({name : "question55", label : "is the answer 55 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group108);
    var group109 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question55];
}, function  ( question55 )  {
    return question55;
})).appendTo(group108);
    var text108 = new QLrt.TextWidget({name : "text108", text : "the answer is:"}).appendTo(group109);
    var text109 = new QLrt.TextWidget({name : "text109", text : "55"}).appendTo(group109);
    var group110 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question55];
}, function  ( question55 )  {
    return !question55;
})).appendTo(group108);
    var text110 = new QLrt.TextWidget({name : "text110", text : "the answer is:"}).appendTo(group110);
    var text111 = new QLrt.TextWidget({name : "text111", text : "56"}).appendTo(group110);
    var group111 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question48];
}, function  ( question48 )  {
    return !question48;
})).appendTo(group95);
    var question56 = new QLrt.SimpleFormElementWidget({name : "question56", label : "is the answer between 57 and 60 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group111);
    var group112 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question56];
}, function  ( question56 )  {
    return question56;
})).appendTo(group111);
    var question57 = new QLrt.SimpleFormElementWidget({name : "question57", label : "is the answer between 57 and 58 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group112);
    var group113 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question57];
}, function  ( question57 )  {
    return question57;
})).appendTo(group112);
    var question58 = new QLrt.SimpleFormElementWidget({name : "question58", label : "is the answer 57 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group113);
    var group114 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question58];
}, function  ( question58 )  {
    return question58;
})).appendTo(group113);
    var text112 = new QLrt.TextWidget({name : "text112", text : "the answer is:"}).appendTo(group114);
    var text113 = new QLrt.TextWidget({name : "text113", text : "57"}).appendTo(group114);
    var group115 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question58];
}, function  ( question58 )  {
    return !question58;
})).appendTo(group113);
    var text114 = new QLrt.TextWidget({name : "text114", text : "the answer is:"}).appendTo(group115);
    var text115 = new QLrt.TextWidget({name : "text115", text : "58"}).appendTo(group115);
    var group116 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question57];
}, function  ( question57 )  {
    return !question57;
})).appendTo(group112);
    var question59 = new QLrt.SimpleFormElementWidget({name : "question59", label : "is the answer 59 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group116);
    var group117 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question59];
}, function  ( question59 )  {
    return question59;
})).appendTo(group116);
    var text116 = new QLrt.TextWidget({name : "text116", text : "the answer is:"}).appendTo(group117);
    var text117 = new QLrt.TextWidget({name : "text117", text : "59"}).appendTo(group117);
    var group118 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question59];
}, function  ( question59 )  {
    return !question59;
})).appendTo(group116);
    var text118 = new QLrt.TextWidget({name : "text118", text : "the answer is:"}).appendTo(group118);
    var text119 = new QLrt.TextWidget({name : "text119", text : "60"}).appendTo(group118);
    var group119 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question56];
}, function  ( question56 )  {
    return !question56;
})).appendTo(group111);
    var question60 = new QLrt.SimpleFormElementWidget({name : "question60", label : "is the answer between 61 and 62 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group119);
    var group120 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question60];
}, function  ( question60 )  {
    return question60;
})).appendTo(group119);
    var question61 = new QLrt.SimpleFormElementWidget({name : "question61", label : "is the answer 61 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group120);
    var group121 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question61];
}, function  ( question61 )  {
    return question61;
})).appendTo(group120);
    var text120 = new QLrt.TextWidget({name : "text120", text : "the answer is:"}).appendTo(group121);
    var text121 = new QLrt.TextWidget({name : "text121", text : "61"}).appendTo(group121);
    var group122 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question61];
}, function  ( question61 )  {
    return !question61;
})).appendTo(group120);
    var text122 = new QLrt.TextWidget({name : "text122", text : "the answer is:"}).appendTo(group122);
    var text123 = new QLrt.TextWidget({name : "text123", text : "62"}).appendTo(group122);
    var group123 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question60];
}, function  ( question60 )  {
    return !question60;
})).appendTo(group119);
    var question62 = new QLrt.SimpleFormElementWidget({name : "question62", label : "is the answer 63 ?", valueWidget : new QLrt.BooleanValueWidget()}).appendTo(group123);
    var group124 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question62];
}, function  ( question62 )  {
    return question62;
})).appendTo(group123);
    var text124 = new QLrt.TextWidget({name : "text124", text : "the answer is:"}).appendTo(group124);
    var text125 = new QLrt.TextWidget({name : "text125", text : "63"}).appendTo(group124);
    var group125 = new QLrt.ConditionalGroupWidget(new QLrt.LazyValue(function  ( )  {
    return [question62];
}, function  ( question62 )  {
    return !question62;
})).appendTo(group123);
    var text126 = new QLrt.TextWidget({name : "text126", text : "the answer is:"}).appendTo(group125);
    var text127 = new QLrt.TextWidget({name : "text127", text : "64"}).appendTo(group125);
    $('#QL-content').append(form.domElement());
    form.activate();
    function persist(data) {
        localStorage['QL-persist'] = JSON.stringify(data);
    }
});