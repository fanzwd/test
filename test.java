// 这里的命名需要表意，他不是没意义的变量，这样后面的代码好读
int personScore = 0;
int computerScore = 0;
int winScore = 10;
String scissors = "剪刀";
String rock = "石头";
String paper = "布";
while (true) {
    // 符号与变量之间要有空格，缩进要控制，代码才能看懂
    // 不要写 11 这种没有意义的数字，多处用到直接做定义
    if(personScore == winScore || computerScore == winScore) {
        if(personScore == winScore) {
            System.out.println("玩家优先胜利");
        } else if(computerScore == winScore){
            System.out.println("电脑优先胜利");
        }
        break;
    }

    System.out.println("*******************************");
    System.out.println("--------欢迎进入猜拳游戏--------");
    System.out.println("请出拳:（1是剪刀，2是石头，3是布）");
    Scanner sc = new Scanner(System.in);
    /*
     * 注释最好写在某个语句上方，而不是语句后面
     * 注意符号要有空格，代码才能清晰
     */
    //获取用户输入
    int person = sc.nextInt();
    //电脑随机出拳
    int computer = (int)(Math.random() * 3) + 1;
    String per = "用户";
    String com = "电脑";
    //用户出拳
    switch(person) {
        case 1:
            per = scissors;
            break;
        case 2:
            per = rock;
            break;
        case 3:
            per = paper;
            break;
        default:
            System.out.println("请输入1-3的数字");
            continue;
    }
    //电脑出拳
    switch(computer) {
        case 1:
            com = scissors;
            break;
        case 2:
            com = rock;
            break;
        case 3:
            com = paper;
            break;
    }

    /*
     * 注意逻辑先后，应该要加括号，这样才能保证逻辑是正确的，不然在不同的编译软件，可能会出现不同的结果
     * 如果代码太长，可以换行
     */
    //根据出拳判断输赢
    if((person == 1 && computer == 2) 
    || (person == 2 && computer == 3) 
    || (person == 3 && computer == 1)) {
        System.out.println("你出的是（" +per+ "） 电脑出的是（" + com + "）");
        System.out.println("您输了" + "电脑分数" + computerScore++);
    }else if (person == computer){
        System.out.println("你出的是（" + per + "） 电脑出的是（" + com + "）");
        System.out.println("平局");
    }else{
        System.out.println("你出的是（" + per + "） 电脑出的是（" + com + "）");
        System.out.println("恭喜您赢了" + "用户分数" + personScore++);
    }
}