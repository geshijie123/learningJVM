//package com.main;
//
//import cn.hutool.json.JSONObject;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicReference;
//import java.util.stream.Collectors;
//
//public class Main20200320 {
//
//    public static void main(String[] args) {
//        getSaleCount()
//    }
//
//    static AtomicReference<BigDecimal> movie;
//    static AtomicReference<BigDecimal> fuli;
//    static AtomicReference<BigDecimal> other;
//
//
//
//    public static JSONObject getSaleCount(Map<Integer,JSONObject> back , Map<Integer,JSONObject> apply, List<Map<String, Object>> cardProductType){
//        movie= new AtomicReference<>(new BigDecimal(0));
//        fuli= new AtomicReference<>(new BigDecimal(0));
//        other= new AtomicReference<>(new BigDecimal(0));
//
//        BigDecimal backMoneyCount = back.entrySet().stream().map(one -> one.getValue().getBigDecimal("money")).reduce(BigDecimal.ZERO, BigDecimal::add);
//        System.out.println("回款总额"+backMoneyCount);
//
//
//        //遍历回款信息
//        back.entrySet().forEach(backOne->{
//            JSONObject value = backOne.getValue();
//            //回款金额
//            AtomicReference<BigDecimal> money = new AtomicReference<>(value.getBigDecimal("money"));
//            List<String> str_applys = Arrays.asList(value.getStr("apply_ids").split(","));
//
//            //开卡单id
//            List<Integer> applys = str_applys.size()==0 ?new ArrayList<>():str_applys.stream().filter(one -> {
//                try {Integer.valueOf(one);
//                }catch (Exception e){return false;}return true;
//            }).map(one->Integer.valueOf(one.trim())).collect(Collectors.toList());
//
//            //如果没有开卡单  分类到其他回款
//            if(applys.size()==0){
//                other.set(other.get().add(money.get()));
//                return;
//            }
//            //遍历开卡单
//            applys.forEach(applyOne->{
//                JSONObject applyJson = apply.get(applyOne);
//                //如果没有开卡单信息 分类到其他回款
//                if(applyJson==null){
//                    other.set(other.get().add(money.get()));
//                    return;
//                }
//
//                //开卡单应回款金额
//                BigDecimal should_back_money = applyJson.getBigDecimal("should_back_money");
//                switch (should_back_money.compareTo(money.get())){
//                    case -1://应回款小于回款
//                        //清除应回款金额
//                        apply.put(applyOne,applyJson.put("should_back_money", new BigDecimal(0)));
//                        //回款减去应回款
//                        money.set(money.get().subtract(should_back_money));;
//                        //回款金额分类
//                        add(cardProductType ,applyJson.getInt("apply_type"),should_back_money,applyJson.getBigDecimal("charge"));
//                        break;
//                    case 0://应回款等于回款
//                        //清除应回款金额
//                        apply.put(applyOne, applyJson.put("should_back_money",new BigDecimal(0)));
//                        //回款清零
//                        money.set(new BigDecimal(0));
//                        //回款金额分类
//                        add( cardProductType,applyJson.getInt("apply_type"),should_back_money,applyJson.getBigDecimal("charge"));
//                        break;
//                    case 1: //应回款大于回款
//                        //应回款更新
//                        apply.put(applyOne,applyJson.put("should_back_money",should_back_money.subtract(money.get())));
//                        //回款分类
//                        add(cardProductType ,applyJson.getInt("apply_type"),money.get(),applyJson.getBigDecimal("charge"));
//
//                        money.set(new BigDecimal(0));
//                        break;
//                    default:break;
//                }
//            });
//
//            if(money.get().compareTo(new BigDecimal(0))==1){
//                other.set(other.get().add(money.get()));
//                System.out.println("回款富裕:"+backOne.getKey()+" 富裕金额"+money.get());
//                money.set(new BigDecimal(0));
//            }
//
//        });
//
//
//
//
//        System.out.println("电影:"+movie.get());
//        System.out.println("福利:"+fuli.get());
//        System.out.println("其他:"+other.get());
//
//        System.out.println("总计:"+movie.get().add(fuli.get()).add(other.get()));
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("movie",movie.get());
//        jsonObject.put("fuli",fuli.get());
//        jsonObject.put("other",other.get());
//
//        return jsonObject;
//
//    }
//
//    private static void add(List<Map<String, Object>> cardProductType ,int type, BigDecimal money,BigDecimal charge){
//        Map<Integer,Integer> map = cardProductType.stream().collect(
//                Collectors.toMap(one->Integer.valueOf(one.get("pro_id").toString()),
//                        one->Integer.valueOf(one.get("type_id").toString()))
//        );
//        Integer integer = map.get(type);
//        if(integer==null){
//            other.set(other.get().add(money).subtract(charge));
//        }else if(integer==1){
//            movie.set(movie.get().add(money).subtract(charge));
//        }else if(integer==2){
//            fuli.set(fuli.get().add(money).subtract(charge));
//        }else if(integer==3){
//            other.set(other.get().add(money).subtract(charge));
//        }
//
//    }
//}
