# Втора лабораториска вежба по Софтверско инженерство

## Виктор Таневски, бр. на индекс 193161
#

### Control Flow Graph
### Све е обележано во кодот test/java/SLLab2
![alt text](https://github.com/tanesoff/SI_2023_lab2_193161/blob/master/Lab2_SI_193161_CFG.png?raw=true)


### Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.

### Тест случаи според критериумот  Every statement 
1. UserNull() -> Само кажува
2. UsernameNull() -> Само кажува
3. SameUsernamePassWithSpecialChar() -> Само кажува
4. SameUsername() -> Во Листата од јузери тестов пробува да го внесит истиот јузер
5. EmailWithNoAT() -> Само кажува
6. PassWithSpace() -> Само кажува


### Тест случаи според критериумот Every path
1. muilipleConditionTXX() -> Јузерот е нул, и поминува првиот предикат
2. muilipleConditionFTX() -> Пасворд е нул а името не е
3. muilipleConditionFFT() -> Емаил е нул а пасворд и името не се
4. muilipleConditionFFF() -> Све е пополнато како сто треба

