package com.powerdino.splatoon3_companion

import android.content.Context
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.platform.app.InstrumentationRegistry
import com.powerdino.splatoon3_companion.ui.MainEntryComposable
import com.powerdino.splatoon3_companion.ui.theme.Splatoon3_CompanionTheme
import org.junit.Rule
import org.junit.Test

class NavigationAndLoadingTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun testLoading(){
        composeTestRule.setContent {
            Splatoon3_CompanionTheme {
                MainEntryComposable()
            }
        }
        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
        val loadingTest = context.resources.getString(R.string.loading)
        val schedulesText = context.resources.getString(R.string.app_name)

        composeTestRule.onNodeWithTag(loadingTest).assertIsDisplayed()
        composeTestRule.waitUntilAtLeastOneExists(
            hasText(schedulesText)
        )

        composeTestRule.onNodeWithText(schedulesText).assertIsDisplayed()
    }

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun navigationTest(){
        composeTestRule.setContent {
            Splatoon3_CompanionTheme {
                MainEntryComposable()
            }
        }

        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
        val schedulesText = context.resources.getString(R.string.app_name)
        val competitiveText = context.resources.getString(R.string.comp)
        val openCompetitive = context.resources.getString(R.string.anarchy_open)
        val normalText = context.resources.getString(R.string.regular)
        val testTagNormal = context.resources.getString(R.string.testTagRegular)

        composeTestRule.waitUntilAtLeastOneExists(
            hasText(schedulesText)
        )

        composeTestRule.onNodeWithText(competitiveText).performClick()


        composeTestRule.waitUntilAtLeastOneExists(
            hasText(openCompetitive)
        )

        composeTestRule.onNodeWithText(openCompetitive).assertIsDisplayed()

        composeTestRule.onNodeWithText(normalText).performClick()

        composeTestRule.waitUntilAtLeastOneExists(
            hasTestTag(testTagNormal)
        )

        composeTestRule.onNodeWithTag(testTagNormal).assertIsDisplayed()

    }
}