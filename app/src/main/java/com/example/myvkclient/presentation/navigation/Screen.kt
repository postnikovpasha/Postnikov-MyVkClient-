package com.example.myvkclient.presentation.navigation

import androidx.fragment.app.Fragment
import com.example.myvkclient.presentation.screen.login.LoginFragment
import com.example.myvkclient.presentation.screen.profile.profileEdit.ProfileEditFragment
import com.example.myvkclient.presentation.screen.profile.profileView.ProfileViewFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

sealed class Screen(fragment: Fragment) : BaseScreen(fragment) {
    class LoginScreen : Screen(LoginFragment())
    class ProfileViewScreen : Screen(ProfileViewFragment())
    class ProfileEditScreen : Screen(ProfileEditFragment())
}

open class BaseScreen(private val fragment: Fragment) : SupportAppScreen() {
    override fun getFragment(): Fragment = fragment
}