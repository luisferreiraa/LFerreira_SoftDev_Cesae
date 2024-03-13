//alert('Ficheiro externo')
//document.write('aaa')

function mostrarLista() {
document.write("<ul>")
for(let i=1;i<=10;i++) {
    document.write("<li>"+i+"</li>")
}
document.write("</ul>")
}

function corFundo(cor){
    document.body.style.background = cor
}

/*
function corFundoAmarelo(){
    document.body.style.background = "yellow"
}

function corFundoVerde(){
    document.body.style.background = "green"
}

function corFundoLaranja(){
    document.body.style.background = "orange"
}
*/

function mudarCor(){
    cor = document.getElementById("input-cor").value
    document.body.style.background = cor
}

function mudarCorRadio(){
    radioAmarelo = document.getElementById("cor-fundo-amarelo")
    radioVerde = document.getElementById("cor-fundo-verde")

    if(radioAmarelo.checked) {
    document.body.style.background = radioAmarelo.value
    } else {
        document.body.style.background = radioVerde.value
    }
}

function showText() {
par = "p-ex2a"


}

function fillText() {
    texto = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem, provident! Aspernatur atque praesentium eos iusto quas. Commodi quasi, dolorem error corporis ea fugiat id? Similique, ratione? Cum vero eos tempora? Beatae sed necessitatibus possimus perspiciatis odit quas exercitationem, dignissimos sapiente nisi facere iste cumque ut nostrum pariatur odio quos? Doloremque animi neque odit consectetur quaerat ipsa! Aut harum labore ullam. Velit delectus assumenda dolore dicta dolor nisi perspiciatis eaque sunt ipsam, nemo maxime, saepe provident exercitationem tempore nam aperiam consectetur reiciendis alias cupiditate natus qui, aliquid ullam veniam! Alias, adipisci? Ullam suscipit eaque ducimus ad neque nisi, deleniti id quod, reiciendis architecto maxime saepe autem enim odit iusto. Totam modi dolores commodi minima placeat sint dicta in consequatur accusantium iusto!"

}

function aumentar() {
    document.getElementById('p-ex4').style.fontSize = "40px"
    document.getElementById('p-ex4').style.textAlign = "center"
}

function diminuir() {
    document.getElementById('p-ex4').style.fontSize = "10px"
    document.getElementById('p-ex4').style.textAlign = "right"
}

function alterarTamanho(tamanho,alinhamento){
    document.getElementById('p-ex4').style.fontSize = tamanho
    document.getElementById('p-ex4').style.texAlign = alinhamento
}

function mudarTamanho('2') {
    document.getElementById('p-ex4').style.fontSize
}