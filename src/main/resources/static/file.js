const {ChatGPT} = require("chat-gpt")

const chatGPT = new ChatGPT()

async function generateResponse(userInput) {
    const response = await chatGPT.generateResponse(userInput)
    return response.data.text
}

function handleInput() {
    const userInput = document.getElementById("input-text").value
    console.log(userInput);
}
