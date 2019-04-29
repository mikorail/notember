package com.example.fahmi.kamusonline;

import android.os.Bundle;
import android.view.View;

public class Dictionary extends HomeActivity {
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dictionary);

        url = dictionaryEntries();
    }

    public void requestApiButtonOnClick(View view){
        Request request = new Request(this);
        request.execute(url);
    }

    private String dictionaryEntries() {
        final String language = "en";
        final String word = "Ace";
        final String word_id = word.toLowerCase();
        return "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + word_id;
    }
}
