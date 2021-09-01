import nltk
from nltk.corpus import mac_morpho

def processar(s):
    for(w1,t1),(w2,t2) in nltk.bigrams(s):
        if(t1=='ADJ' and t2=='N'):
            print(w1,w2)
print("\nPadrão ADJ N (Adjetivo substantivo)")
for taggedSent in mac_morpho.tagged_sents():
    processar(taggedSent)
