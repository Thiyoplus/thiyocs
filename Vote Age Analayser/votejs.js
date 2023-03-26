function vote(){
 let input = document.getElementById("input").value
 let output = document.getElementById("output")
    if (input>=18){
     alert("Congrats !! , Your Eligible")
    }
    else if (input==null || input==""){
        alert('Please Enter Your Valid Value')
    }
    else{
        alert('Sorry !! , Your Not')
    }
}

