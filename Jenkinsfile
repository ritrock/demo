def gv
pipeline{
  agent any

  environment{
    NEW_VERSION='1.3.0'
  }
  stages{

    stage("init"){
      steps{
        script {
          gv = load "script.groovy"
        }
        
      }
    }
    stage("build"){
      steps{
        script{
            gv.buildApp()
        }
        
      }
    }
      stage("test"){
        steps{
          script{
            gv.buildTest()
          }
      }
    }
       stage("deploy"){
        steps{
          script{
            gv.buildDeploy()
          }
      }
    }
  }
}
        
