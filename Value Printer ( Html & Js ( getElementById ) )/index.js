let input =  document.getElementById("input-value")
let btn = document.getElementById("btn-value")
let printer = document.getElementById("print-value")

btn.addEventListener("click",()=>{
    alert("Are You Agree To Printing Your Value")
    printer.innerText = " Your Printing Value : "+input.value
})
