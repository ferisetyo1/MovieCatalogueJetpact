package feri.com.moviecataloguejetpact

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import feri.com.moviecataloguejetpact.ui.movie_tv_fitur.MainActivity
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    private val movies = DummyData.getListMovieRepo().results
    private val tvshows = DummyData.getListTVRepo().results

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                movies?.size ?: 0
            )
        )
    }

    @Test
    fun loadMovieDetail() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.image)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(withText(movies?.get(0)?.title)))
        onView(withId(R.id.tgl)).check(matches(isDisplayed()))
        onView(withId(R.id.tgl)).check(matches(withText(movies?.get(0)?.releaseDate)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(movies?.get(0)?.genres?.map { it?.name }
            ?.joinToString(separator = ", ", limit = 4, truncated = "..."))))
        onView(withId(R.id.desc)).check(matches(isDisplayed()))
        onView(withId(R.id.desc)).check(matches(withText(movies?.get(0)?.overview)))
    }

    @Test
    fun loadTvShow() {
        onView(withId(R.id.menuTVShowFM)).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                tvshows?.size ?: 0
            )
        )
    }

    @Test
    fun loadTvShowDetail() {
        onView(withId(R.id.menuTVShowFM)).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.image)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(withText(tvshows?.get(0)?.name)))
        onView(withId(R.id.tgl)).check(matches(isDisplayed()))
        onView(withId(R.id.tgl)).check(matches(withText(tvshows?.get(0)?.firstAirDate)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(tvshows?.get(0)?.genres?.map { it?.name }
            ?.joinToString(separator = ", ", limit = 4, truncated = "..."))))
        onView(withId(R.id.desc)).check(matches(isDisplayed()))
        onView(withId(R.id.desc)).check(matches(withText(tvshows?.get(0)?.overview)))
    }
}