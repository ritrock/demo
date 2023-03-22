def buildApp(){
    echo"This is Jenkins Build..."
}

def buildTest(){
    echo"This is Jenkins Test..."
}

def buildDeploy(){
    echo"This is Jenkins Deploy..."
    echo"This is Jenkins version ${NEW_VERSION}..."
}

return this
