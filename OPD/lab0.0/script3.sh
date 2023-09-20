echo -e 'Пункт 3'

#Объединить содержимое файлов lab0/bronzor4/archeops lab0/nidoranF4/graveler в lab0/magcargo6_86
chmod u+r lab0/bronzor4/archeops
cat lab0/bronzor4/archeops lab0/nidoranF4/graveler > lab0/magcargo6_86
chmod u-r lab0/bronzor4/archeops

#создать симвоическую ссылку для файла magcarg6 с именем lab0/nidoranF4/graveleermagcargo
chmod u+w lab0/nidoranF4
ln -s /home/studs/s408648/OPD/lab1/lab0/magcargo6 lab0/nidoranF4/gravelermagcargo
chmod u-w lab0/nidoranF4

#скопировать файл magcargo6 в директорию lab0/magby8/persian
chmod u+r lab0/magcargo6
chmod u+w lab0/magby8/persian/
cp lab0/magcargo6 lab0/magby8/persian/
chmod u-r lab0/magcargo6
chmod u-w lab0/magby8/persian/

#создать жёсткую ссылку для файла clefable0 с именем lab0/magby8/rattataclefable
chmod u+r lab0/clefable0
ln lab0/clefable0 lab0/magby8/rattataclefable
chmod u-r lab0/clefable0

#скопировать рекурсивно дирректорию nidoranF4 в директорию lab0/nidoranF4/clefairy
cd lab0
mkdir tmp
#cp -r nidoranF4/* tmp/
cp -r nidoranF4/clefable tmp/
cp -r nidoranF4/clefairy tmp/
cp -r nidoranF4/graveler tmp/
cp -r nidoranF4/kabutops tmp/
cp -r nidoranF4/vibrava tmp/
cp -r nidoranF4/zigzagoon tmp/
cp -P nidoranF4/gravelermagcargo tmp
chmod u+w nidoranF4/clefairy
mv tmp nidoranF4/clefairy/
mv nidoranF4/clefairy/tmp nidoranF4/clefairy/nidoranF4
chmod u-w nidoranF4/clefairy
cd ..

#echo -e 'создать символическую ссылку с именем Copy_63 на директорию bronzor4 в каталоге lab0'
ln -s bronzor4 lab0/Copy_63

#скопировать содержимое файла seaking8 в новый файл lab0/nidoranF4/zigzagoonseaking
chmod u+r lab0/seaking8
chmod u+w lab0/nidoranF4
touch lab0/nidoranF4/zigzagoonseaking
cp lab0/seaking8 lab0/nidoranF4/zigzagoonseaking
chmod u+w lab0/nidoranF4
chmod u-r lab0/seaking8

echo -e 'готово!'
