import nltk
text = "primeiro teste do nltk"
tokens = nltk.word_tokenize(text)
print(tokens)
print(nltk.pos_tag(tokens))
