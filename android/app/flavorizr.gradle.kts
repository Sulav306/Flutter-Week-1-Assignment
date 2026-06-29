import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("default")

    productFlavors {
        create("dev") {
            dimension = "default"
            applicationId = "com.sulav.week1_assignment.week1_assignment.dev"
            resValue(type = "string", name = "app_name", value = "MyApp-dev")
        }
        create("staging") {
            dimension = "default"
            applicationId = "com.sulav.week1_assignment.week1_assignment.staging"
            resValue(type = "string", name = "app_name", value = "MyApp-staging")
        }
        create("prod") {
            dimension = "default"
            applicationId = "com.sulav.week1_assignment.week1_assignment"
            resValue(type = "string", name = "app_name", value = "MyApp-prod")
        }
    }

    buildFeatures.resValues = true
}