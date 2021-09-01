import nltk
from nltk.corpus import mac_morpho

treino = mac_morpho.tagged_sents()[1000:]
teste = mac_morpho.tagged_sents()[:1000]
etiq0 = nltk.DefaultTagger('N') #Todo mundo vai ser substantico('N')
etiq1 = nltk.UnigramTagger(treino,backoff=etiq0)#Se não conhecer, utiliza etiq0 que será substantico
print(etiq1.evaluate(teste))#precisão do etiq1
etiq2 = nltk.BigramTagger(treino, backoff=etiq1)
print(etiq2.evaluate(teste))#precisão do etiq2
etiq3 = nltk.TrigramTagger(treino, backoff=etiq2)
print(etiq3.evaluate(teste))
#Salvar modelo:
from pickle import dump
output = open('etiq.pkl','wb')
dump(etiq2, output, -1)
output.close()

#Para carregar um modelo salvo
#from pickle import load
#input = open('etiq.pkl','rb')
#tagger = load(input)
#input.close()
