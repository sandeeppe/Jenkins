pipelineJob("Cart-CI") {
  description('CIJOB Cart Service')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/sandeeppe/rs-cart.git")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}
pipelineJob("Catalogue-CI") {
  description('CIJOB Cart Service')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps49/_git/rs-catalogue")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}