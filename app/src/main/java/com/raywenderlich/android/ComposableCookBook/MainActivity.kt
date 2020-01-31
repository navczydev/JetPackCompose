package com.raywenderlich.android.ComposableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                FlexColumn {

                    inflexible {
                        TopAppBar(title = {
                            Text(text = "Dig-MenuBook")
                        })
                    }
                    flexible(flex = 1f) {
                        RecipeList(recipes = defaultRecipes)
                    }
                }
            }
        }
    }
}

/*
@Composable
@Preview
fun designUI() {
    Column {
        Text("Hello from Compose", style = TextStyle(color = Color.Blue))
        Text("Hello2 from Compose", style = TextStyle(color = Color.Green))
        Text("Hello3 from Compose", style = TextStyle(color = Color.Red))
    }
}
*/

