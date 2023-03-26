function fact(){
    let number = document.getElementById("number").value
    let fact = 1
    for(let i=1;i<=number;i++){
        fact=fact*i
    }
    return(fact)

}
let btn = document.getElementById("btn")
btn.addEventListener("click",()=>{
alert("Your Factorial Value : "+fact())
});