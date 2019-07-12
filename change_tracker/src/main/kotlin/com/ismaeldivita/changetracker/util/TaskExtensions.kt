package com.ismaeldivita.changetracker.util

import com.ismaeldivita.changetracker.ChangeTrackerExtension
import org.gradle.api.Project
import org.gradle.api.Task

val Task.rootProject: Project get() = project.rootProject

val Task.changeTrackerExtension: ChangeTrackerExtension
    get() = project.changeTrackerExtension