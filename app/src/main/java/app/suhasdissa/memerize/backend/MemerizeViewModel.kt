package app.suhasdissa.memerize.backend

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

sealed interface FunnyVideoState {
    data class Success(val children: List<MemerizeModel>) : FunnyVideoState
    data class Error(val error: String) : FunnyVideoState
    object Loading : FunnyVideoState
}

class VideoViewModel : ViewModel() {
    var state: FunnyVideoState by mutableStateOf(FunnyVideoState.Loading)
        private set

    init {
        getData("videos")
    }

    private fun getData(collection: String) {
        viewModelScope.launch {
            state = FunnyVideoState.Loading
            state = try {
                FunnyVideoState.Success(
                    MemerizeApi.retrofitService.getData(collection)
                )
            } catch (e: Exception) {
                FunnyVideoState.Error(e.toString())
            }
        }
    }
}

sealed interface PostsState {
    data class Success(val children: List<MemerizeModel>) : PostsState
    data class Error(val error: String) : PostsState
    object Loading : PostsState
}

class FeedViewModel : ViewModel() {
    var state: PostsState by mutableStateOf(PostsState.Loading)
        private set

    init {
        getData("posts")
    }

    private fun getData(collection: String) {
        viewModelScope.launch {
            state = PostsState.Loading
            state = try {
                PostsState.Success(
                    MemerizeApi.retrofitService.getData(collection)
                )
            } catch (e: Exception) {
                PostsState.Error(e.toString())
            }
        }
    }
}