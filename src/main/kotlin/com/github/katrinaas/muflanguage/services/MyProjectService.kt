package com.github.katrinaas.muflanguage.services

import com.github.katrinaas.muflanguage.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
