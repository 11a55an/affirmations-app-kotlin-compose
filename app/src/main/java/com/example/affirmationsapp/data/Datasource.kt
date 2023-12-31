package com.example.affirmationsapp.data

import com.example.affirmationsapp.R
import com.example.affirmationsapp.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.affirmation1),
            Affirmation(R.string.affirmation2, R.drawable.affirmation2),
            Affirmation(R.string.affirmation3, R.drawable.affirmation3),
            Affirmation(R.string.affirmation4, R.drawable.affirmation4),
            Affirmation(R.string.affirmation5, R.drawable.affirmation5))
    }
}