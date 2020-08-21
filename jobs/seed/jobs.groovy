pipelineJob("Catalogue-CI") {
  description('CIJOB Cart Service')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/sandeeppe/rs-catalogue.git")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}