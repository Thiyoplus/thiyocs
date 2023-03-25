function alerts(msg){

    let maindiv = document.getElementById("main")
    let div = document.createElement("div")
    div.className = "container"
    let text = document.createTextNode(msg)
    
    maindiv.prepend(div)
    div.prepend(text)

}

alerts("printed successsfully")