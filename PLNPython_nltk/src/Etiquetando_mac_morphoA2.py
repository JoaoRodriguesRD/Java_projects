import nltk
from nltk.corpus import mac_morpho
#mac_morpho é um corpus português!
tagsMacMorpho = mac_morpho.tagged_words()

#FreqDist: quais são as frequencias das etiquetas
fdTags = nltk.FreqDist(tag for(word, tag) in tagsMacMorpho)
print(fdTags.most_common())