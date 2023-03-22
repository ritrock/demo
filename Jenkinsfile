def gv
pipeline{
  agent any

  environment{
    NEW_VERSION='1.3.0'
  }
  stages{

    stage("init"){
      steps{
        gv = load("script.groovy")
        
      }
    }
    stage("build"){
      steps{
        gv.buildApp()
        
      }
    }
      stage("test"){
        steps{
          gv.buildTest()
      }
    }
       stage("deploy"){
        steps{
          gv.buildDeploy()
      }
    }
  }
}
        
