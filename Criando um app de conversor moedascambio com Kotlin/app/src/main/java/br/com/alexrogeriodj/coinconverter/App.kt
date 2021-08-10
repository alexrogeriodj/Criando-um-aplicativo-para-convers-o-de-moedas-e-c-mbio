package br.com.alexrogeriodj.coinconverter

import android.app.Application
import android.app.Presentation
import br.com.alexrogeriodj.coinconverter.data.di.DataModules
import br.com.alexrogeriodj.coinconverter.domain.di.DomainModule
import br.com.alexrogeriodj.coinconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}