package com.example.myvkclient.fragment.profile

import android.app.AlertDialog
import android.content.DialogInterface
import android.widget.Toast
import com.arellomobile.mvp.MvpPresenter
import com.example.myvkclient.App
import com.example.myvkclient.navigation.Screen

class ProfileEditPresenter : MvpPresenter<ProfileEditView>() {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

    }

    // ВОЗМОЖНО СМЕНЮ НЕМНОГО ЛОГИКУ
    fun save() {
        // НЕ РАЗОБРАЛСЯ С КОНТЕКСТОМ + ТУТ БУДУТ ЕЩЕ ДЕЙСТВИЯ И AlertDialog
        //Toast.makeText(this, "Profile save",Toast.LENGTH_SHORT).show()
    }


    fun close() {
        // НЕ РАЗОБРАЛСЯ С КОНТЕКСТОМ + ТУТ БУДУТ ЕЩЕ ДЕЙСТВИЯ И AlertDialog
        //Toast.makeText(this, "Profile NOT save",Toast.LENGTH_SHORT).show()
        App.INCTANCE.router.replaceScreen(Screen.ProfileViewScreen())
    }

}