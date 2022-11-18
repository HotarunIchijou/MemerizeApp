package app.suhasdissa.memerize.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.suhasdissa.memerize.R
import app.suhasdissa.memerize.ui.components.HighlightCard

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onClickMemeView: () -> Unit,
    onClickFunnyVideo: () -> Unit,
    onClickFeed: () -> Unit,
    onClickTG: () -> Unit
) {

    LazyVerticalGrid(
        columns = GridCells.Adaptive(375.dp),
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(4.dp)
    ) {
        item {
            HighlightCard(
                onClickMemeView,
                modifier,
                R.drawable.ic_launcher_foreground,
                "Memes"
            )
        }
        item {
            HighlightCard(
                onClickFunnyVideo,
                modifier,
                R.drawable.ic_launcher_foreground,
                "Funny Videos"
            )
        }
        item {
            HighlightCard(
                onClickFeed,
                modifier,
                R.drawable.ic_launcher_foreground,
                "Funny Posts"
            )
        }
        item {
            HighlightCard(
                onClickTG,
                modifier,
                R.drawable.ic_launcher_foreground,
                "Telegram Memes"
            )
        }
    }
}