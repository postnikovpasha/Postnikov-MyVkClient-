package com.example.myvkclient.presentation.screen.profile.profileView

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.myvkclient.App
import com.example.myvkclient.presentation.common.BasePresenter
import com.example.myvkclient.presentation.navigation.Screen
import com.example.myvkclient.presentation.screen.profile.profileView.ProfileView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class ProfileViewPresenter @Inject constructor(private val router: Router) : BasePresenter<ProfileView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showProfile("Pavel Postnikov")
        viewState.showStatus("CFT - the best company!")
        viewState.showCity("Tomsk")
        viewState.showBirthday("1 July 1997")

    }

    fun logout() {
        router.newRootScreen(Screen.LoginScreen())
    }

    fun profileEdit() {
        router.newRootScreen(Screen.ProfileEditScreen())
    }

}