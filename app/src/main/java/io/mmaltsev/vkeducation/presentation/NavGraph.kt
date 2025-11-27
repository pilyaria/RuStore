package io.mmaltsev.vkeducation.presentation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.mmaltsev.vkeducation.presentation.applist.AppsListScreen
import io.mmaltsev.vkeducation.presentation.appdetails.AppDetailsScreen
import io.mmaltsev.vkeducation.presentation.applist.FakeApps


@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "apps_list"
    ) {

        // --- Экран списка приложений ---
        composable(route = "apps_list") {

            val apps = FakeApps.apps  // ← пока мок-данные

            AppsListScreen(
                apps = apps,
                onAppClick = { app ->
                    navController.navigate("details/${app.id}")
                }
            )
        }

        // --- Экран деталей ---
        composable(
            route = "details/{id}",
            arguments = listOf(
                navArgument(name = "id") { type = NavType.StringType }
            )
        ) {
            // ВАЖНО:
            // id автоматически попадёт в SavedStateHandle ViewModel
            // AppDetailsViewModel сам загрузит данные по id
            AppDetailsScreen(
                onBack = { navController.popBackStack() }
            )

        }
    }
}
