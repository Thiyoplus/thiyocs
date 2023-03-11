let username=prompt("Enter Your Name")
let userclg=prompt("enter your college name")

let user = {
name:username,
college:userclg,
msg(){
    return  `Your Name Is ${this.name} And Your Studied In ${this.college} College `
}
}
let student=user.msg()
document.body.innerHTML=`<h1>${student}</h1>`