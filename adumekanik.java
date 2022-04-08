                if (p1Action == 1 && p2Action == 1){
                            p1MovePrio = p1ActiveMons.getMoves().get(p1Move).getPriority();
                            p2MovePrio = p2ActiveMons.getMoves().get(p2Move).getPriority();
                            double p1MonsSpeed = p1ActiveMons.getBaseStats().getSpeed();
                            double p2MonsSpeed = p2ActiveMons.getBaseStats().getSpeed();
                            if ((p1MovePrio > p2MovePrio)||((p1MovePrio == p2MovePrio)&&(p1MonsSpeed >= p2MonsSpeed))){
                                //Attacker Turn
                                System.out.printf("%s's Monster Move First!!!%n", p1.getPlayerName());
                                System.out.printf("%s Use %s!!!%n", p1ActiveMons.getName(), p1ActiveMons.getMoves().get(p1Move).getName());
                                p1ActiveMons.getMoves().get(p1Move).applyDamage(p1ActiveMons, p2ActiveMons, listOfEffectivity);
                                System.out.printf("%s current HP : %s%n", p1ActiveMons.getName(), p1ActiveMons.getBaseStats().getHealthPoint());
                                System.out.printf("%s current HP : %s%n", p2ActiveMons.getName(), p2ActiveMons.getBaseStats().getHealthPoint());
                                if (p2ActiveMons.getBaseStats().isMonsterDead()){
                                    System.out.printf("%s is Dead :(%n", p2ActiveMons.getName());
                                    if (!p2.isLose()){
                                        p2.printMonsters();
                                        System.out.println("Choose New Monster Id: ");
                                        int choosenId = scan.nextInt();
                                        while (p2.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0 || p2.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                            if (p2.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0){   
                                                System.out.println("Monster sudah mati, silahkan pilih monster lain.");
                                                System.out.println("Choose Monster Id : ");
                                                choosenId = scan.nextInt();
                                            }
                                            else if (p2.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                                System.out.println("Monster sedang tertidur, silahkan pilih monster lain.");
                                                System.out.println("Choose Monster Id : ");
                                                choosenId = scan.nextInt();
                                            }
                                        }
                                        p2ActiveMons = p2.getListOfMonster().get(choosenId-1);
                                        System.out.printf("%s's Active Monster : %s%n", p2.getPlayerName(), p2ActiveMons.getName());
                                    }else{
                                        endGame = true;
                                    }
                                } 
                                else if (!p2ActiveMons.getBaseStats().isMonsterDead()){
                                    System.out.printf("%s's Monster Turn!!!%n", p2.getPlayerName());
                                    System.out.printf("%s Use %s!!!%n", p2ActiveMons.getName(), p2ActiveMons.getMoves().get(p2Move).getName());
                                    p2ActiveMons.getMoves().get(p2Move).applyDamage(p2ActiveMons, p1ActiveMons, listOfEffectivity);
                                    System.out.printf("%s current HP : %s%n", p1ActiveMons.getName(), p1ActiveMons.getBaseStats().getHealthPoint());
                                    System.out.printf("%s current HP : %s%n", p2ActiveMons.getName(), p2ActiveMons.getBaseStats().getHealthPoint());
                                    if (p1ActiveMons.getBaseStats().isMonsterDead()){
                                        if (!p1.isLose()){
                                            System.out.printf("%s is Dead :(%n", p1ActiveMons.getName());
                                            p1.printMonsters();
                                            System.out.println("Choose New Monster Id: ");
                                            int choosenId = scan.nextInt();
                                            while (p1.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0 || p1.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                                if (p1.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0){   
                                                    System.out.println("Monster sudah mati, silahkan pilih monster lain.");
                                                    System.out.println("Choose Monster Id : ");
                                                    choosenId = scan.nextInt();
                                                }
                                                else if (p1.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                                    System.out.println("Monster sedang tertidur, silahkan pilih monster lain.");
                                                    System.out.println("Choose Monster Id : ");
                                                    choosenId = scan.nextInt();
                                                }
                                            }
                                            p1ActiveMons = p1.getListOfMonster().get(choosenId-1);
                                            System.out.printf("%s's Active Monster : %s%n", p1.getPlayerName(), p1ActiveMons.getName());
                                        }
                                            else{
                                            endGame = true;
                                        }
                                    } 
                                }
                            }
                            else if ((p1MovePrio < p2MovePrio)||(p1MonsSpeed < p2MonsSpeed)){
                                //Attacker Turn
                                System.out.printf("%s's Monster Move First!!!%n", p2.getPlayerName());
                                System.out.printf("%s Use %s!!!%n", p2ActiveMons.getName(), p2ActiveMons.getMoves().get(p2Move).getName());
                                p2ActiveMons.getMoves().get(p2Move).applyDamage(p2ActiveMons, p1ActiveMons, listOfEffectivity);
                                System.out.printf("%s current HP : %s%n", p1ActiveMons.getName(), p1ActiveMons.getBaseStats().getHealthPoint());
                                System.out.printf("%s current HP : %s%n", p2ActiveMons.getName(), p2ActiveMons.getBaseStats().getHealthPoint());
                                if (p1ActiveMons.getBaseStats().isMonsterDead()){
                                    if (!p1.isLose()){
                                        System.out.printf("%s is Dead :(%n", p1ActiveMons.getName());
                                        p1.printMonsters();
                                        System.out.println("Choose New Monster Id: ");
                                        int choosenId = scan.nextInt();
                                        while (p1.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0 || p1.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                            if (p1.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0){   
                                                System.out.println("Monster sudah mati, silahkan pilih monster lain.");
                                                System.out.println("Choose Monster Id : ");
                                                choosenId = scan.nextInt();
                                            }
                                            else if (p1.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                                System.out.println("Monster sedang tertidur, silahkan pilih monster lain.");
                                                System.out.println("Choose Monster Id : ");
                                                choosenId = scan.nextInt();
                                            }
                                        }
                                        p1ActiveMons = p1.getListOfMonster().get(choosenId-1);
                                        System.out.printf("%s's Active Monster : %s%n", p1.getPlayerName(), p1ActiveMons.getName());
                                    }
                                } 
                                else if (!p1ActiveMons.getBaseStats().isMonsterDead()){
                                    System.out.printf("%s's Monster Turn!!!%n", p1.getPlayerName());
                                    System.out.printf("%s Use %s!!!%n", p1ActiveMons.getName(), p1ActiveMons.getMoves().get(p1Move).getName());
                                    p1ActiveMons.getMoves().get(p1Move).applyDamage(p1ActiveMons, p2ActiveMons, listOfEffectivity);;
                                    System.out.printf("%s current HP : %s%n", p1ActiveMons.getName(), p1ActiveMons.getBaseStats().getHealthPoint());
                                    System.out.printf("%s current HP : %s%n", p2ActiveMons.getName(), p2ActiveMons.getBaseStats().getHealthPoint());
                                    if (p2ActiveMons.getBaseStats().isMonsterDead()){
                                        if (p2.isLose()){    
                                            System.out.printf("%s is Dead :(%n", p2ActiveMons.getName());
                                            p2.printMonsters();
                                            System.out.println("Choose New Monster Id: ");
                                            int choosenId = scan.nextInt();
                                            while (p2.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0 || p2.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                                if (p2.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0){   
                                                    System.out.println("Monster sudah mati, silahkan pilih monster lain.");
                                                    System.out.println("Choose Monster Id : ");
                                                    choosenId = scan.nextInt();
                                                }
                                                else if (p2.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                                    System.out.println("Monster sedang tertidur, silahkan pilih monster lain.");
                                                    System.out.println("Choose Monster Id : ");
                                                    choosenId = scan.nextInt();
                                                }
                                            }
                                            p2ActiveMons = p2.getListOfMonster().get(choosenId-1);
                                            System.out.printf("%s's Active Monster : %s%n", p2.getPlayerName(), p2ActiveMons.getName());
                                        }
                                        else{
                                            endGame = true;
                                        }
                                    } 
                                }
                            }
                        }
                        else if (p1Action == 1 && p2Action == 2){
                            System.out.printf("Only %s's Monster Move!!!%n", p1.getPlayerName());
                            System.out.printf("%s Use %s!!!%n", p1ActiveMons.getName(), p1ActiveMons.getMoves().get(p1Move).getName());
                            p1ActiveMons.getMoves().get(p1Move).applyDamage(p1ActiveMons, p2ActiveMons, listOfEffectivity);
                            System.out.printf("%s current HP : %s%n", p1ActiveMons.getName(), p1ActiveMons.getBaseStats().getHealthPoint());
                            System.out.printf("%s current HP : %s%n", p2ActiveMons.getName(), p2ActiveMons.getBaseStats().getHealthPoint());
                            if (p2ActiveMons.getBaseStats().isMonsterDead()){
                                if (!p2.isLose()){
                                    System.out.printf("%s is Dead :(%n", p2ActiveMons.getName());
                                    p2.printMonsters();
                                    System.out.println("Choose New Monster Id: ");
                                    int choosenId = scan.nextInt();
                                    while (p2.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0 || p2.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                        if (p2.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0){   
                                            System.out.println("Monster sudah mati, silahkan pilih monster lain.");
                                            System.out.println("Choose Monster Id : ");
                                            choosenId = scan.nextInt();
                                        }
                                        else if (p2.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                            System.out.println("Monster sedang tertidur, silahkan pilih monster lain.");
                                            System.out.println("Choose Monster Id : ");
                                            choosenId = scan.nextInt();
                                        }
                                    }
                                    p2ActiveMons = p2.getListOfMonster().get(choosenId-1);
                                    System.out.printf("%s's Active Monster : %s%n", p2.getPlayerName(), p2ActiveMons.getName());
                                }
                            } 
                        }
                        else if (p1Action == 2 && p2Action == 1){
                            //Attacker Turn
                            System.out.printf("Only %s's Monster Move!!!%n", p2.getPlayerName());
                            System.out.printf("%s Use %s!!!%n", p2ActiveMons.getName(), p2ActiveMons.getMoves().get(p2Move).getName());
                            p2ActiveMons.getMoves().get(p2Move).applyDamage(p2ActiveMons, p1ActiveMons, listOfEffectivity);
                            System.out.printf("%s current HP : %s%n", p1ActiveMons.getName(), p1ActiveMons.getBaseStats().getHealthPoint());
                            System.out.printf("%s current HP : %s%n", p2ActiveMons.getName(), p2ActiveMons.getBaseStats().getHealthPoint());
                            if (p1ActiveMons.getBaseStats().isMonsterDead()){
                                if (!p2.isLose()){
                                    System.out.printf("%s is Dead :(%n", p1ActiveMons.getName());
                                    p1.printMonsters();
                                    System.out.println("Choose New Monster Id: ");
                                    int choosenId = scan.nextInt();
                                    while (p1.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0 || p1.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                        if (p1.getListOfMonster().get(choosenId-1).getBaseStats().getHealthPoint() == 0){   
                                            System.out.println("Monster sudah mati, silahkan pilih monster lain.");
                                            System.out.println("Choose Monster Id : ");
                                            choosenId = scan.nextInt();
                                        }
                                        else if (p1.getListOfMonster().get(choosenId-1).getRemainingSleep() > 0){
                                            System.out.println("Monster sedang tertidur, silahkan pilih monster lain.");
                                            System.out.println("Choose Monster Id : ");
                                            choosenId = scan.nextInt();
                                        }
                                    }
                                    p1ActiveMons = p1.getListOfMonster().get(choosenId-1);
                                    System.out.printf("%s's Active Monster : %s%n", p1.getPlayerName(), p1ActiveMons.getName());
                                }
                                else{
                                    endGame = true;
                                }
                            } 
                        }    
                        else {
                            System.out.println("Kedua Player Melakukan Switch Monster, Masuk Round Berikutnya.");
                        }       
                    }
                    if (p1.isLose() && !p2.isLose()){
                        System.out.printf("All %s Monsters Are Dead%n", p1.getPlayerName());
                        System.out.printf("%s win the game!!!%n", p2.getPlayerName());
                        isEnd = true;
                    }
                    else if (!p1.isLose() && p2.isLose()){
                        System.out.printf("All %s Monsters Are Dead%n", p2.getPlayerName());
                        System.out.printf("%s win the game!!!%n", p1.getPlayerName());
                        isEnd = true;
                    }
                }
