from azizjon.ibragimov.crud.controller import CrudController


a = CrudController("Aziz")

text = a.getData("Ibragimov")

text = text.encode('utf-8')
print(text)
