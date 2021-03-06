package com.example.myvkclient.presentation.screen.login

import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.example.myvkclient.App
import com.example.myvkclient.data.datasource.SessionDataSource
import com.example.myvkclient.domain.repository.SessionRepository
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import com.example.myvkclient.presentation.screen.main.MainView
import io.reactivex.android.schedulers.AndroidSchedulers
import ru.terrakok.cicerone.Router
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class LoginPresenter @Inject constructor(
    private val sessionRepository: SessionRepository,
    private val sessionDataSource: SessionDataSource,
    private val router: Router
) : BasePresenter<LoginView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()


    }

//    fun login() {
//        router.newRootScreen(Screen.ProfileViewScreen())
//    }

    fun login(name: String, password: String) {
        sessionRepository
            .login(name, password)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    sessionDataSource.saveToken("PashaPostnikov")
                    router.newRootScreen(Screen.ProfileViewScreen())
                },
                {
                    Timber.e(it.message.orEmpty())
                    viewState.shomMessage("User not found")
                }
            )
            .untilDestroy()
    }
}