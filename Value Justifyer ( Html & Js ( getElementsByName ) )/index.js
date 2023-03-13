let output = document.getElementById("output")
let btn = document.getElementById("btn")

btn.addEventListener("click",()=>{
    alert("Are You Sure To See Your Favour One ??? ")
})

function calc(){
    let a = document.getElementsByName("ff")
    a.forEach((ff) =>{
        if(ff.checked){
            output.innerText = `${"Your Favour One : "+ff.value}`
        }
    }
    )
}