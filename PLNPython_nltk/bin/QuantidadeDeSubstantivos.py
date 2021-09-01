import nltk
from nltk.corpus import mac_morpho
#mac_morpho é um corpus português!
tagsMacMorpho = mac_morpho.tagged_words()


def findTags(tagPrefixo, taggedText):
    cfd = nltk.ConditionalFreqDist((tag,word)
        for (word, tag) in taggedText
        if tag.startswith(tagPrefixo)     
        )
    return dict((tag,cfd[tag].most_common(5))
                for tag in cfd.conditions())

tagDict = findTags('N',tagsMacMorpho)
for tag in sorted(tagDict):
    print(tag, tagDict)
