# text_corpus = [
#     "Human machine interface for lab abc computer applications",
#     "A survey of user opinion of computer system response time",
#     "The EPS user interface management system",
#     "System and human system engineering testing of EPS",
#     "Relation of user perceived response time to error measurement",
#     "The generation of random binary unordered trees",
#     "The intersection graph of paths in trees",
#     "Graph minors IV Widths of trees and well quasi ordering",
#     "Graph minors A survey",
# ]
import nltk
from nltk.corpus import gutenberg
from gensim import models
import pprint
from collections import defaultdict
from gensim import models
text_corpus = []

for doc in gutenberg.fileids():
    x = gutenberg.words(doc)
    text_corpus.append(x)
    
texts = text_corpus[0]



print(texts)

frequency = defaultdict(int)

for text in text_corpus:
    for token in text:
        frequency[token] += 1
#pprint.pprint(frequency)


processed_corpus = [[token for token in text if frequency[token] > 1] for text in text_corpus]

from gensim import corpora

dictionary = corpora.Dictionary(processed_corpus)
print(dictionary)


new_doc = "Human computer interaction Human"
new_vec = dictionary.doc2bow(new_doc.lower().split())
print("novo vetor de -" +new_doc)
print(new_vec)

bow_corpus = [dictionary.doc2bow(text) for text in processed_corpus]
#pprint.pprint(bow_corpus)



# train the model
tfidf = models.TfidfModel(bow_corpus)

# transform the "system minors" string
words = "system minors system minors".lower().split()
print(tfidf[dictionary.doc2bow(words)])


from gensim import similarities

index = similarities.SparseMatrixSimilarity(tfidf[bow_corpus], num_features=12)
