package com.example.cardshop.data

import com.example.cardshop.R
import com.example.cardshop.data.model.News
import com.example.cardshop.data.model.Popular

class Datasource() {

    fun loadPopular(): List<Popular> {
        return listOf(
            Popular(
                "Placeholder",
                42.66,
                R.drawable.pgo_en_72,
                false
            ),
            Popular(
                "Placeholder",
                36.91,
                R.drawable.pgo_en_3,
                false
            ),
            Popular(
                "Placeholder",
                34.86,
                R.drawable.pgo_en_24,
                true
            ),
            Popular(
                "Placeholder",
                34.86,
                R.drawable.pgo_en_17,
                true
            ),
        )
    }

    fun loadNews(): List<News> {
        return listOf(
            News(
                "Placeholder",
                42.66,
                R.drawable.news1,
                false,
            ),
            News(
                "Placeholder",
                36.91,
                R.drawable.news2,
                false,
            ),
            News(
                "Placeholder",
                34.86,
                R.drawable.news3,
                true,
            ),
            News(
                "Placeholder",
                42.66,
                R.drawable.news1,
                false,
            ),
            News(
                "Placeholder",
                36.91,
                R.drawable.news2,
                false,
            ),
            News(
                "Placeholder",
                34.86,
                R.drawable.news3,
                true,
            ),
            News(
                "Placeholder",
                42.66,
                R.drawable.news1,
                false,
            ),
            News(
                "Placeholder",
                36.91,
                R.drawable.news2,
                false,
            ),
            News(
                "Placeholder",
                34.86,
                R.drawable.news3,
                true,
            ),
        )
    }
}