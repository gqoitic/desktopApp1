package com.gqoitic.desktopApp1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum Image {
    randomURL1("https://a57.foxnews.com/static.foxnews.com/foxnews.com/content/uploads/2020/06/931/524/Dolphin-istock.jpg?ve=1&tl=1"),
    randomURL2("https://media.wired.com/photos/5cdefb92b86e041493d389df/1:1/w_988,h_988,c_limit/Culture-Grumpy-Cat-487386121.jpg"),
    randomURL3("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTuvi7UQO2dg2qQwZ-bZZM1sOLlBGb9seg9OQ&usqp=CAU"),
    randomURL4("https://i.redd.it/0azo7wb1i1e11.jpg"),
    randomURL5("https://media.nature.com/lw800/magazine-assets/d41586-020-01430-5/d41586-020-01430-5_17977552.jpg"),
    randomURL6("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSd19MNVly6Ejbzi-hrLTEpLiBm58tNTWlYcw&usqp=CAU"),
    randomURL7("https://i.pinimg.com/originals/0a/4d/19/0a4d19bb243e5cfdd09e76a2e5d1a6b8.jpg"),
    randomURL8("https://www.demilked.com/magazine/wp-content/uploads/2019/11/5dde3b187defc-funny-spiderman-and-cats-adventures-thai-neung-fb4-png__700.jpg"),
    randomURL9("https://i.pinimg.com/originals/94/f8/f8/94f8f85a6c2113b9805fb074a7c25f70.jpg"),
    randomURL10("https://i.pinimg.com/originals/3c/da/56/3cda56c31c5022398cd70380c30fa4ef.jpg"),
    randomURL11("https://64.media.tumblr.com/036c3491ca544f1893a284b5ac746fd7/tumblr_pvxkrjVzhA1xb21v7o2_500.jpg"),
    randomURL12("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQNthsFgpPsqyu2WWOBYCILUUBtvvabPZ6P_A&usqp=CAU"),
    randomURL13("https://www.fjords.com/wp-content/uploads/2019/05/DSC_9680-2-2000x1152.jpg");

    private String link;

    Image(String link) {
        this.link = link;
    }

    String getLink() {
        return link;
    }

    private static final List<Image>
            VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    static Image randomImage() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
