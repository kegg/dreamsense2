var quotes = [
"Look before you leap.",
"Never forget who you are and what you can do.",
"Not all simple solutions are the right solution.",
"Don\'t let your heart get inn the way of your brain.",
"If you don\'t think something matters, think again.",
"Before you react, think to yourself one thing. Is it really worth it?",
"If something feels like it\'s too good to be true, it most likely is.",
"Follow your gut.",
"If someone is talking, don\'t interrupt them.",
"Admitting you\'re wrong is not a sign of weakness.",
"It\'s not over until you\'re dead, and even then it\'s not over.",
"The moment you take to look behind you is a second taken away from the end goal.",
"Don\'t act differently when you think no one is watching.",
"Keep track of your good days.",
"If you keep telling yourself you aren\'t good enough, you will eventually believe it.",
"Try your hardest. Try your best.",
"There is no backspace key or white out when it comes to life. There is a learn and move forward option.",
"Sometimes the bad guy gets away.",
"Life doesn\'t have a pause button.",
"If you think you are better than someone else, think again.",
"If you have something to say, say it. Before it\'s too late.",
"Don\'t be a lemming.",
"Don\'t laugh at the wrong time. You\'ll only look like a fool.",
"Selfish desires rarely lead to gold.",
"Don\'t dance with the devil.",
"Being obsessed doesn\'t make you right.",
"You can\'t snooze through life.",
"Don\'t say you\'re sorry when you have nothing to be sorry for.",
"A conversation with yourself can lead to confusion.",
"Fight for what you believe in.",
"Never surrender if the cause is righteous.",
"Be positive. Think happy thoughts.",
"Sometimes you have to explain something over again until it sticks!",
"Let\'s not dwell on all the things meant to be seen as stupid mediocrity."
];

function randomQuote() {
  var randomNumber = Math.floor(Math.random() * (quotes.length));
  document.getElementById('quoteDisplay').innerHTML = quotes[randomNumber] +
  " - Rule #" + randomNumber;
}
window.onload=randomQuote;
