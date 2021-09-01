import nltk
from nltk.corpus import mac_morpho

#Salvar modelo:
#from pickle import dump
#output = open('etiq.pkl','wb')
#dump(etiq2, output, -1)
#output.close()

#Para carregar um modelo salvo
from pickle import load
input = open('etiq.pkl','rb')
tagger = load(input)
input.close()

frase = nltk.word_tokenize("Alguma coisa uma hora irá acontecer... Eu espero.")
print(frase, " ", tagger.tag(frase))
