package com.main;

import cn.hutool.json.JSONObject;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main20200319 {


    static AtomicReference<BigDecimal> movie;
    static AtomicReference<BigDecimal> fuli;
    static AtomicReference<BigDecimal> other;
    /**
     * string 转 int 去重
     * @param args
     */
    public static void main(String[] args) {

        movie= new AtomicReference<>(new BigDecimal(0));
        fuli= new AtomicReference<>(new BigDecimal(0));
        other= new AtomicReference<>(new BigDecimal(0));

        Map<Integer, JSONObject> apply=new HashMap<Integer, JSONObject>(){{
            //            put(,new JSONObject(){{put("type",);put("money","");}});

            put(30087856,new JSONObject(){{put("type",1	);put("money","800.00");put("charge","800.00");}});
            put(30087857,new JSONObject(){{put("type",1	);put("money","800.00");put("charge","800.00");}});
            put(30087858,new JSONObject(){{put("type",1	);put("money","800.00");put("charge","800.00");}});
            put(30087859,new JSONObject(){{put("type",12);put("money","800.00");put("charge","800.00");}});
            put(30087860,new JSONObject(){{put("type",12);put("money","800.00");put("charge","800.00");}});
            put(30087861,new JSONObject(){{put("type",15);put("money","800.00");put("charge","800.00");}});
        }};

        Map<Integer, JSONObject> back = new HashMap<Integer, JSONObject>(){{
//            put(,new JSONObject(){{put("money",new BigDecimal(""));put("applys","");}});

             put(5141501,new JSONObject(){{put("money",new BigDecimal("100.00"));put("applys","");}});
             put(5142202,new JSONObject(){{put("money",new BigDecimal("500.00")) ;put("applys","30087856,30087859");}});
//             put(5142203,new JSONObject(){{put("money",new BigDecimal("100.00"));put("applys","30087856,30087859");}});
//             put(5142204,new JSONObject(){{put("money",new BigDecimal("900.00"));put("applys","30087856");}});
//             put(5142205,new JSONObject(){{put("money",new BigDecimal("700.00"));put("applys","30087856");}});
//             put(5142206,new JSONObject(){{put("money",new BigDecimal("600.00"));put("applys","30087856,300879201");}});
        }};




        back.entrySet().forEach(backOne->{
            JSONObject value = backOne.getValue();
            AtomicReference<BigDecimal> money = new AtomicReference<>(value.getBigDecimal("money"));
            List<String> str_applys = Arrays.asList(value.getStr("applys").split(","));
            List<Integer> applys = str_applys.size()==0 ?new ArrayList<>():str_applys.stream().filter(one->!one.equals("")).map(Integer::new).collect(Collectors.toList());
            if(applys.size()==0){
                other.set(other.get().add(money.get()));
                return;
            }
            applys.forEach(applyOne->{
                JSONObject applyJson = apply.get(applyOne);
                if(applyJson==null){
                    other.set(other.get().add(money.get()));
                    return;
                }
                BigDecimal should_back_money = applyJson.getBigDecimal("money");
                switch (should_back_money.compareTo(money.get())){
                    case -1:
                        //小于  清除应回款金额
                        apply.put(applyOne,applyJson.put("money",new BigDecimal(0)));
                        money.set(money.get().subtract(should_back_money));;
                        add(applyJson.getInt("type"),should_back_money,applyJson.getBigDecimal("charge"));
                        break;
                    case 0:
                        //等于  清除应回款金额
                        apply.put(applyOne,applyJson.put("money",new BigDecimal(0)));
                        money.set(new BigDecimal(0));
                        add(applyJson.getInt("type"),should_back_money,applyJson.getBigDecimal("charge"));
                        break;
                    case 1:
                        //大于
                        apply.put(applyOne,applyJson.put("money",should_back_money.subtract(money.get())));
                        add(applyJson.getInt("type"),money.get(),applyJson.getBigDecimal("charge"));
                        money.set(new BigDecimal(0));
                        break;
                    default:break;
                }
            });

            if(money.get().compareTo(new BigDecimal(0))==1){
                other.set(other.get().add(money.get()));
                System.out.println("回款富裕:"+backOne.getKey()+" 富裕金额"+money.get());
            }

        });

        System.out.println("电影:"+movie.get());
        System.out.println("福利:"+fuli.get());
        System.out.println("其他:"+other.get());

    }

    private static void add(int type, BigDecimal money,BigDecimal charge){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1	,1);
        map.put(2	,1);
        map.put(3	,1);
        map.put(4	,1);
        map.put(5	,1);
        map.put(6	,1);
        map.put(8	,1);
        map.put(9	,2);
        map.put(10	,2);
        map.put(13	,2);
        map.put(11	,3);
        map.put(12	,2);
        map.put(14	,3);
        map.put(15	,3);
        map.put(16	,2);
        map.put(17	,3);
        Integer integer = map.get(type);
        if(integer==null){
            other.set(other.get().add(money).subtract(charge));
        }else if(integer==1){
            movie.set(movie.get().add(money).subtract(charge));
        }else if(integer==2){
            fuli.set(fuli.get().add(money).subtract(charge));
        }else if(integer==3){
            other.set(other.get().add(money).subtract(charge));
        }

    }
//    /**
//     * string 转 int 去重
//     * @param args
//     */
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>(){{
//            addAll(Arrays.asList("30087857".split(",")));
//            addAll(Arrays.asList("30087920".split(",")));
//            addAll(Arrays.asList("30087856,30087920".split(",")));
//            addAll(Arrays.asList("30087856,30087920".split(",")));
//            addAll(Arrays.asList("30087856,30087920".split(",")));
//            addAll(Arrays.asList("30088791,30087920".split(",")));
//            addAll(Arrays.asList("30088791,30088488".split(",")));
//            addAll(Arrays.asList("30088791,30088488".split(",")));
//            addAll(Arrays.asList("30087534".split(",")));
//            addAll(Arrays.asList("30089080".split(",")));
//            addAll(Arrays.asList("30089080".split(",")));
//            addAll(Arrays.asList("30089080".split(",")));
//            addAll(Arrays.asList("30089110".split(",")));
//            addAll(Arrays.asList("30089149".split(",")));
//            addAll(Arrays.asList("30089226,30089227".split(",")));
//            addAll(Arrays.asList("30089233".split(",")));
//            addAll(Arrays.asList("30089228".split(",")));
//            addAll(Arrays.asList("30089393".split(",")));
//            addAll(Arrays.asList("30089080,30087856".split(",")));
//            addAll(Arrays.asList("30089499,30089500".split(",")));
//            addAll(Arrays.asList("30089541".split(",")));
//            addAll(Arrays.asList("30089541".split(",")));
//            addAll(Arrays.asList("30089519".split(",")));
//            addAll(Arrays.asList("30089541".split(",")));
//            addAll(Arrays.asList("30089414".split(",")));
//            addAll(Arrays.asList("30089414".split(",")));
//        }};
//
//        Set<Integer> set=new HashSet<Integer>();
//        set.addAll(list.stream().map(one->Integer.valueOf(one)).collect(Collectors.toList()));
//        set.forEach(System.out::println);
//    }



}
