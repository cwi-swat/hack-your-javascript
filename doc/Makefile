

all: hackyourlanguage.pdf hackyourlanguage.html hackyourlanguage.docx


%.html: %.md Makefile
	pandoc --css="http://www.cwi.nl/~storm/markdown.css"  $< -o $@	

%.pdf: %.md template.latex Makefile
	pandoc --template=template.latex $< -o $@	

%.docx: %.md Makefile
	pandoc $< -o $@	



clean:
	rm -rf hackyourlanguage.{html,pdf,docx}



