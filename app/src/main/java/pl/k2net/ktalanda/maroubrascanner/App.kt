package pl.k2net.ktalanda.maroubrascanner

import android.app.Application

class App : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .presentationModule(PresentationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
