import nltk
from nltk.corpus import mac_morpho

treino = mac_morpho.tagged_sents()[1000:]
teste = mac_morpho.tagged_sents()[:1000]
etiq0 = nltk.DefaultTagger('N') #Todo mundo vai ser substantico('N')
etiq1 = nltk.UnigramTagger(treino,backoff=etiq0)#Se não conhecer, utiliza etiq0 que será substantico
print(etiq1.evaluate(teste))#precisão do etiq1
etiq2 = nltk.BigramTagger(treino, backoff=etiq1)
print(etiq2.evaluate(teste))#precisão do etiq2


