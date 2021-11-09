def info(message) 
{
    echo "\nℹ️ INFO: \n ${message}\n" 
}

def status(successState, message)
{
    if(successState)
    {
        success(message)
    }
    else
    {
        failed(message)
    }
}

def success(message)
{
    echo "\n✅ SUCCESS! \n${message}\n" 
}

def failed(message)
{
    echo "\n❌  FAIL! \n${message}\n" 
}

def trail(message)
{
    echo "\n🚩 TRAIL: \n${message}\n" 
}
