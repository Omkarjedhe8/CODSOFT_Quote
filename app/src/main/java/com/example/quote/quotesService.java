package com.example.quote;

import java.util.concurrent.ThreadLocalRandom;

public class quotesService {

    String[] getQuotes() {

        String[] quotes =new String[] { "“Fortune favors the bold.” – Virgil Life is what happens when you’re busy making other plans. John Lennon ..." ,"“I think, therefore I am.” – René Descartes ..." ,"“Time is money.” – Benjamin Franklin ..." ,"“I came, I saw, I conquered.” – Julius Caesar ..." ,"When life gives you lemons, make lemonade.” – Elbert Hubbard ..." ,  };
        return quotes;


    }

    String getRandomQuotes(){

        String quote;
        int quotesArrayLen = getQuotes().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote =getQuotes()[randomNum];
        return  quote;

    }



}
