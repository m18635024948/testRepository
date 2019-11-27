package co.jp.aoyama.macchinetta.app.order.info;

import java.io.Serializable;
import java.util.Map;

public class OptionJacketWashableInfo implements Serializable{
	private static final long serialVersionUID = -6866873681304245953L;
	
	//JACKETモデル
	private String wjJacketModel;
	
	private Map<String,String> wjJacketModelMap;
		
	//フロント釦数
    private String wjFrontBtnCnt;
    
    private Map<String,String> wjFrontBtnCntMap;
    
    //ラペルデザイン
    private String wjLapelDesign;
    
    private Map<String,String> wjLapelDesignMap;
    
    //ラペルモデル
    private String wjJacketLapelModel;
    
    //グレード
    private String wjGrade;

    private Map<String,String> wjGradeMap;
    //裏仕様
  	private String wjBackSpec;
      
    private Map<String,String> wjBackSpecMap;
    
    //台場
    private String wjFort;
    
    private Map<String,String> wjFortMap;
    //襟裏（ヒゲ）
    private String wjBackCollar;
    
    private Map<String,String> wjBackCollarMap;
    
    //襟吊
    private String wjChainHange;
    
    private Map<String,String> wjChainHangeMap;
    
    //ラペル幅
    private String wjLapelWidth;
    
    private Map<String,String> wjLapelWidthMap;
    
    //フラワーホール
    private String wjFlowerHole;
    
    private Map<String,String> wjFlowerHoleMap;
    
    //胸ポケット
    private String wjBreastPkt;
    
    private Map<String,String> wjBreastPktMap;
    
    //腰ポケット
    private String wjWaistPkt;
    
    private Map<String,String> wjWaistPktMap;
    
    //チェンジポケット
    private String wjChangePkt;
    
    private Map<String,String> wjChangePktMap;
    
    //スランテッドポケット
    private String wjSlantedPkt;
    
    private Map<String,String> wjSlantedPktMap;
    
    //忍びポケット
    private String wjCoinPkt;
    
    private Map<String,String> wjCoinPktMap;
    
    //袖仕様
    private String wjSleeveSpec;
    
    private Map<String,String> wjSleeveSpecMap;
    
    //マニカ
    private String wjManica;
    
    private Map<String,String> wjManicaMap;
    
    //袖釦
    private String wjSleeveBtnType;
    
    private Map<String,String> wjSleeveBtnTypeMap;
    
    //袖釦数
    private String wjSleeveBtnCnt;
    
    //袖口
    private String wjCuffSpec;
    
    private Map<String,String> wjCuffSpecMap;
    
    //内ポケット変更
    private String wjInsidePktChange;
    
    private Map<String,String> wjInsidePktChangeMap;
    
    //下前胸内ポケット仕様
    private String wjBreastInnerPkt;
    
    private Map<String,String> wjBreastInnerPktMap;
    
    //ステッチ種類
    private String wjStitch;
    
    private Map<String,String> wjStitchMap;
    
    //ステッチ変更
    private String wjStitchModify;
    
    private Map<String,String> wjStitchModifyMap;
    
    //ステッチ変更箇所
    private String wjStitchModifyPlace1;
    
    private String wjStitchModifyPlace2;
    
    private String wjStitchModifyPlace3;
    
    private String wjStitchModifyPlace4;
    
    private String wjStitchModifyPlace5;
    
    private String wjStitchModifyPlace6;
    
    private String wjStitchModifyPlace7;
    
    private String wjStitchModifyPlace8;
    
    private String wjStitchModifyPlace9;
    
    private Map<String,String> wjStitchModifyPlaceMap;
    
    //ダブルステッチ変更
    private String wjDStitchModify;
    
    private Map<String,String> wjDStitchModifyMap;
    
    //ダブルステッチ変更箇所
    private String wjDStitchModifyPlace1;
    
    private String wjDStitchModifyPlace2;
    
    private String wjDStitchModifyPlace3;
    
    private String wjDStitchModifyPlace4;
    
    private String wjDStitchModifyPlace5;
    
    private String wjDStitchModifyPlace6;
    
    private String wjDStitchModifyPlace7;
    
    private String wjDStitchModifyPlace8;
    
    private String wjDStitchModifyPlace9;
    
    private Map<String,String> wjDStitchModifyPlaceMap;
    
    //AMF色指定
    private String wjAmfColor;
    
    private Map<String,String> wjAmfColorMap;
    
    //AMF糸色 
    private String wjAmfColorPlaceAll;
    
    private Map<String,String> wjAmfColorPlaceAllMap;
    
    //AMF色指定箇所
    private String wjAmfColorPlace1;
    
    private String wjAmfColorPlace2;
    
    private String wjAmfColorPlace3;
    
    private String wjAmfColorPlace4;
    
    private String wjAmfColorPlace5;
    
    private String wjAmfColorPlace6;
    
    private String wjAmfColorPlace7;
    
    private String wjAmfColorPlace8;
    
    private String wjAmfColorPlace9;
    
    private String wjAmfColorPlace10;
    
    private Map<String,String> wjAmfColorPlaceMap;
    
    //AMF糸色  ラペル・フロント
    private String wjAmfColor1;
    
    //AMF糸色  胸箱ポケット
    private String wjAmfColor2;
    
    //AMF糸色  腰フラップポケット
    private String wjAmfColor3;
  
    //AMF糸色  ダーツ
    private String wjAmfColor4;
    
    //AMF糸色  肩線
    private String wjAmfColor5;
    
    //AMF糸色  袖山
    private String wjAmfColor6;
    
    //AMF糸色  外袖
    private String wjAmfColor7;
    
    //AMF糸色  袖開き
    private String wjAmfColor8;
    
    //AMF糸色  背中心
    private String wjAmfColor9;
    
    //AMF糸色  ベント
    private String wjAmfColor10;
    
    //AMF色 key&value
    private Map<String,String> wjAmfColorsMap;
    
    //ボタンホール色指定
    private String wjBhColor;
    
    private Map<String,String> wjBhColorMap;
    
    //ボタンホール色指定糸色
    private String wjBhColorPlaceAll;
    
    private Map<String,String> wjBhColorPlaceAllMap;
    
    //ボタンホール色指定箇所
    private String wjBhColorPlace1;
    
    private String wjBhColorPlace2;
    
    private String wjBhColorPlace3;
    
    private String wjBhColorPlace4;
    
    private String wjBhColorPlace5;
    
    private String wjBhColorPlace6;
    
    private String wjBhColorPlace7;
    
    private String wjBhColorPlace8;
    
    private String wjBhColorPlace9;
    
    private String wjBhColorPlace10;
    
    private String wjBhColorPlace11;
    
    private String wjBhColorPlace12;
    
    private String wjBhColorPlace13;
    
    private String wjBhColorPlace14;
    
    private String wjBhColorPlace15;
    
    private String wjBhColorPlace16;
    
    private String wjBhColorPlace17;
    
    private Map<String,String> wjBhColorPlaceMap;
    
    //ボタンホール色指定糸色  フラワーホール(上前1)
    private String wjBhColor1;
    
    //ボタンホール色指定糸色  フラワーホール(上前2)
    private String wjBhColor2;
    
    //ボタンホール色指定糸色 フラワーホール(下前1)
    private String wjBhColor3;
  
    //ボタンホール色指定糸色  フラワーホール(下前2)
    private String wjBhColor4;
    
    //ボタンホール色指定糸色  フロント１
    private String wjBhColor5;
    
    //ボタンホール色指定糸色  フロント２
    private String wjBhColor6;
    
    //ボタンホール色指定糸色  フロント３
    private String wjBhColor7;
  
    //ボタンホール色指定糸色  上前袖口１
    private String wjBhColor8;
    
    //ボタンホール色指定糸色  上前袖口２
    private String wjBhColor9;
    
    //ボタンホール色指定糸色  上前袖口３
    private String wjBhColor10;
    
    //ボタンホール色指定糸色  上前袖口４
    private String wjBhColor11;
  
    //ボタンホール色指定糸色  上前袖口５
    private String wjBhColor12;
    
    //ボタンホール色指定糸色  下前袖口１
    private String wjBhColor13;
    
    //ボタンホール色指定糸色  下前袖口２
    private String wjBhColor14;
    
    //ボタンホール色指定糸色  下前袖口３
    private String wjBhColor15;
    
    //ボタンホール色指定糸色  下前袖口４
    private String wjBhColor16;
  
    //ボタンホール色指定糸色  下前袖口５
    private String wjBhColor17;
    
    //ボタンホール色指定色 key&value
    private Map<String,String> wjBhColorsMap;
    
    //ボタン付け糸指定
    private String wjByColor;
    
    private Map<String,String> wjByColorMap;
    
    //ボタン付け糸指定糸色
    private String wjByColorPlaceAll;
    
    private Map<String,String> wjByColorPlaceAllMap;
    
    //ボタン付け糸指定箇所
    private String wjByColorPlace1;
    
    private String wjByColorPlace2;
    
    private String wjByColorPlace3;
    
    private String wjByColorPlace4;
    
    private String wjByColorPlace5;
    
    private String wjByColorPlace6;
    
    private String wjByColorPlace7;
    
    private String wjByColorPlace8;
    
    private String wjByColorPlace9;
    
    private String wjByColorPlace10;
    
    private String wjByColorPlace11;
    
    private String wjByColorPlace12;
    
    private String wjByColorPlace13;
    
    private String wjByColorPlace14;
    
    private String wjByColorPlace15;
    
    private String wjByColorPlace16;
    
    private String wjByColorPlace17;
    
    private Map<String,String> wjByColorPlaceMap;
    
    //ボタン付け糸指定糸色   フロント下前1
    private String wjBhColorPlaceDf1;
    
    //ボタン付け糸指定糸色 フロント下前2
    private String wjBhColorPlaceDf2;
    
    //ボタン付け糸指定糸色  フロント下前3
    private String wjBhColorPlaceDf3;
  
    //ボタン付け糸指定糸色   フロント上前1
    private String wjBhColorPlaceUf1;
    
    //ボタン付け糸指定糸色   フロント上前2
    private String wjBhColorPlaceUf2;
    
    //ボタン付け糸指定糸色   フロント上前3
    private String wjBhColorPlaceUf3;
    
    //ボタン付け糸指定糸色   上前袖口１
    private String wjBhColorPlaceFcufy1;
    
    //ボタン付け糸指定糸色  上前袖口２
    private String wjBhColorPlaceFcufy2;
    
    //ボタン付け糸指定糸色   上前袖口３
    private String wjBhColorPlaceFcufy3;
    
    //ボタン付け糸指定糸色   上前袖口４
    private String wjBhColorPlaceFcufy4;
  
    //ボタン付け糸指定糸色   上前袖口５
    private String wjBhColorPlaceFcufy5;
    
    //ボタン付け糸指定糸色   下前袖口１
    private String wjBhColorPlaceBcufy1;
    
    //ボタン付け糸指定糸色   下前袖口２
    private String wjBhColorPlaceBcufy2;
    
    //ボタン付け糸指定糸色   下前袖口３
    private String wjBhColorPlaceBcufy3;
    
    //ボタン付け糸指定糸色   下前袖口４
    private String wjBhColorPlaceBcufy4;
  
    //ボタン付け糸指定糸色   下前袖口５
    private String wjBhColorPlaceBcufy5;
    
    //ボタン付け糸指定糸色 key&value
    private Map<String,String> wjByColorsMap;
    
    //ベント
    private String wjVentSpec;
    
    private Map<String,String> wjVentSpecMap;
    
    //胴裏素材
    private String wjBodyBackMate;
    
    private Map<String,String> wjBodyBackMateMap;
    
    //胴裏素材品番
    private String wjBodyBackMateStkNo;
    
    //袖裏素材
    private String wjCuffBackMate;
    
    private Map<String,String> wjCuffBackMateMap;
    
    //袖裏素材品番
    private String wjCuffBackMateStkNo;
    
    //釦素材
    private String wjBtnMate;
    
    private Map<String,String> wjBtnMateMap;
    
    //釦素材品番
    private String wjBtnMateStkNo;
    
    //形状記憶
    private String wjShapeMemory; 
    
    private Map<String,String> wjShapeMemoryMap;

	public String getWjJacketModel() {
		return wjJacketModel;
	}

	public void setWjJacketModel(String wjJacketModel) {
		this.wjJacketModel = wjJacketModel;
	}

	public Map<String, String> getWjJacketModelMap() {
		return wjJacketModelMap;
	}

	public void setWjJacketModelMap(Map<String, String> wjJacketModelMap) {
		this.wjJacketModelMap = wjJacketModelMap;
	}

	public String getWjFrontBtnCnt() {
		return wjFrontBtnCnt;
	}

	public void setWjFrontBtnCnt(String wjFrontBtnCnt) {
		this.wjFrontBtnCnt = wjFrontBtnCnt;
	}

	public Map<String, String> getWjFrontBtnCntMap() {
		return wjFrontBtnCntMap;
	}

	public void setWjFrontBtnCntMap(Map<String, String> wjFrontBtnCntMap) {
		this.wjFrontBtnCntMap = wjFrontBtnCntMap;
	}

	public String getWjLapelDesign() {
		return wjLapelDesign;
	}

	public void setWjLapelDesign(String wjLapelDesign) {
		this.wjLapelDesign = wjLapelDesign;
	}

	public Map<String, String> getWjLapelDesignMap() {
		return wjLapelDesignMap;
	}

	public void setWjLapelDesignMap(Map<String, String> wjLapelDesignMap) {
		this.wjLapelDesignMap = wjLapelDesignMap;
	}

	public String getWjGrade() {
		return wjGrade;
	}

	public void setWjGrade(String wjGrade) {
		this.wjGrade = wjGrade;
	}

	public Map<String, String> getWjGradeMap() {
		return wjGradeMap;
	}

	public void setWjGradeMap(Map<String, String> wjGradeMap) {
		this.wjGradeMap = wjGradeMap;
	}

	public String getWjBackSpec() {
		return wjBackSpec;
	}

	public void setWjBackSpec(String wjBackSpec) {
		this.wjBackSpec = wjBackSpec;
	}

	public Map<String, String> getWjBackSpecMap() {
		return wjBackSpecMap;
	}

	public void setWjBackSpecMap(Map<String, String> wjBackSpecMap) {
		this.wjBackSpecMap = wjBackSpecMap;
	}

	public String getWjFort() {
		return wjFort;
	}

	public void setWjFort(String wjFort) {
		this.wjFort = wjFort;
	}

	public Map<String, String> getWjFortMap() {
		return wjFortMap;
	}

	public void setWjFortMap(Map<String, String> wjFortMap) {
		this.wjFortMap = wjFortMap;
	}

	public String getWjBackCollar() {
		return wjBackCollar;
	}

	public void setWjBackCollar(String wjBackCollar) {
		this.wjBackCollar = wjBackCollar;
	}

	public Map<String, String> getWjBackCollarMap() {
		return wjBackCollarMap;
	}

	public void setWjBackCollarMap(Map<String, String> wjBackCollarMap) {
		this.wjBackCollarMap = wjBackCollarMap;
	}

	public String getWjChainHange() {
		return wjChainHange;
	}

	public void setWjChainHange(String wjChainHange) {
		this.wjChainHange = wjChainHange;
	}

	public Map<String, String> getWjChainHangeMap() {
		return wjChainHangeMap;
	}

	public void setWjChainHangeMap(Map<String, String> wjChainHangeMap) {
		this.wjChainHangeMap = wjChainHangeMap;
	}

	public String getWjLapelWidth() {
		return wjLapelWidth;
	}

	public void setWjLapelWidth(String wjLapelWidth) {
		this.wjLapelWidth = wjLapelWidth;
	}

	public Map<String, String> getWjLapelWidthMap() {
		return wjLapelWidthMap;
	}

	public void setWjLapelWidthMap(Map<String, String> wjLapelWidthMap) {
		this.wjLapelWidthMap = wjLapelWidthMap;
	}

	public String getWjFlowerHole() {
		return wjFlowerHole;
	}

	public void setWjFlowerHole(String wjFlowerHole) {
		this.wjFlowerHole = wjFlowerHole;
	}

	public Map<String, String> getWjFlowerHoleMap() {
		return wjFlowerHoleMap;
	}

	public void setWjFlowerHoleMap(Map<String, String> wjFlowerHoleMap) {
		this.wjFlowerHoleMap = wjFlowerHoleMap;
	}

	public String getWjBreastPkt() {
		return wjBreastPkt;
	}

	public void setWjBreastPkt(String wjBreastPkt) {
		this.wjBreastPkt = wjBreastPkt;
	}

	public Map<String, String> getWjBreastPktMap() {
		return wjBreastPktMap;
	}

	public void setWjBreastPktMap(Map<String, String> wjBreastPktMap) {
		this.wjBreastPktMap = wjBreastPktMap;
	}

	public String getWjWaistPkt() {
		return wjWaistPkt;
	}

	public void setWjWaistPkt(String wjWaistPkt) {
		this.wjWaistPkt = wjWaistPkt;
	}

	public Map<String, String> getWjWaistPktMap() {
		return wjWaistPktMap;
	}

	public void setWjWaistPktMap(Map<String, String> wjWaistPktMap) {
		this.wjWaistPktMap = wjWaistPktMap;
	}

	public String getWjChangePkt() {
		return wjChangePkt;
	}

	public void setWjChangePkt(String wjChangePkt) {
		this.wjChangePkt = wjChangePkt;
	}

	public Map<String, String> getWjChangePktMap() {
		return wjChangePktMap;
	}

	public void setWjChangePktMap(Map<String, String> wjChangePktMap) {
		this.wjChangePktMap = wjChangePktMap;
	}

	public String getWjSlantedPkt() {
		return wjSlantedPkt;
	}

	public void setWjSlantedPkt(String wjSlantedPkt) {
		this.wjSlantedPkt = wjSlantedPkt;
	}

	public Map<String, String> getWjSlantedPktMap() {
		return wjSlantedPktMap;
	}

	public void setWjSlantedPktMap(Map<String, String> wjSlantedPktMap) {
		this.wjSlantedPktMap = wjSlantedPktMap;
	}

	public String getWjCoinPkt() {
		return wjCoinPkt;
	}

	public void setWjCoinPkt(String wjCoinPkt) {
		this.wjCoinPkt = wjCoinPkt;
	}

	public Map<String, String> getWjCoinPktMap() {
		return wjCoinPktMap;
	}

	public void setWjCoinPktMap(Map<String, String> wjCoinPktMap) {
		this.wjCoinPktMap = wjCoinPktMap;
	}

	public String getWjSleeveSpec() {
		return wjSleeveSpec;
	}

	public void setWjSleeveSpec(String wjSleeveSpec) {
		this.wjSleeveSpec = wjSleeveSpec;
	}

	public Map<String, String> getWjSleeveSpecMap() {
		return wjSleeveSpecMap;
	}

	public void setWjSleeveSpecMap(Map<String, String> wjSleeveSpecMap) {
		this.wjSleeveSpecMap = wjSleeveSpecMap;
	}

	public String getWjManica() {
		return wjManica;
	}

	public void setWjManica(String wjManica) {
		this.wjManica = wjManica;
	}

	public Map<String, String> getWjManicaMap() {
		return wjManicaMap;
	}

	public void setWjManicaMap(Map<String, String> wjManicaMap) {
		this.wjManicaMap = wjManicaMap;
	}

	public String getWjSleeveBtnType() {
		return wjSleeveBtnType;
	}

	public void setWjSleeveBtnType(String wjSleeveBtnType) {
		this.wjSleeveBtnType = wjSleeveBtnType;
	}

	public Map<String, String> getWjSleeveBtnTypeMap() {
		return wjSleeveBtnTypeMap;
	}

	public void setWjSleeveBtnTypeMap(Map<String, String> wjSleeveBtnTypeMap) {
		this.wjSleeveBtnTypeMap = wjSleeveBtnTypeMap;
	}

	public String getWjCuffSpec() {
		return wjCuffSpec;
	}

	public void setWjCuffSpec(String wjCuffSpec) {
		this.wjCuffSpec = wjCuffSpec;
	}

	public Map<String, String> getWjCuffSpecMap() {
		return wjCuffSpecMap;
	}

	public void setWjCuffSpecMap(Map<String, String> wjCuffSpecMap) {
		this.wjCuffSpecMap = wjCuffSpecMap;
	}

	public String getWjInsidePktChange() {
		return wjInsidePktChange;
	}

	public void setWjInsidePktChange(String wjInsidePktChange) {
		this.wjInsidePktChange = wjInsidePktChange;
	}

	public Map<String, String> getWjInsidePktChangeMap() {
		return wjInsidePktChangeMap;
	}

	public void setWjInsidePktChangeMap(Map<String, String> wjInsidePktChangeMap) {
		this.wjInsidePktChangeMap = wjInsidePktChangeMap;
	}

	public String getWjBreastInnerPkt() {
		return wjBreastInnerPkt;
	}

	public void setWjBreastInnerPkt(String wjBreastInnerPkt) {
		this.wjBreastInnerPkt = wjBreastInnerPkt;
	}

	public Map<String, String> getWjBreastInnerPktMap() {
		return wjBreastInnerPktMap;
	}

	public void setWjBreastInnerPktMap(Map<String, String> wjBreastInnerPktMap) {
		this.wjBreastInnerPktMap = wjBreastInnerPktMap;
	}

	public String getWjStitch() {
		return wjStitch;
	}

	public void setWjStitch(String wjStitch) {
		this.wjStitch = wjStitch;
	}

	public Map<String, String> getWjStitchMap() {
		return wjStitchMap;
	}

	public void setWjStitchMap(Map<String, String> wjStitchMap) {
		this.wjStitchMap = wjStitchMap;
	}

	public String getWjStitchModify() {
		return wjStitchModify;
	}

	public void setWjStitchModify(String wjStitchModify) {
		this.wjStitchModify = wjStitchModify;
	}

	public Map<String, String> getWjStitchModifyMap() {
		return wjStitchModifyMap;
	}

	public void setWjStitchModifyMap(Map<String, String> wjStitchModifyMap) {
		this.wjStitchModifyMap = wjStitchModifyMap;
	}

	public Map<String, String> getWjStitchModifyPlaceMap() {
		return wjStitchModifyPlaceMap;
	}

	public void setWjStitchModifyPlaceMap(Map<String, String> wjStitchModifyPlaceMap) {
		this.wjStitchModifyPlaceMap = wjStitchModifyPlaceMap;
	}

	public String getWjDStitchModify() {
		return wjDStitchModify;
	}

	public void setWjDStitchModify(String wjDStitchModify) {
		this.wjDStitchModify = wjDStitchModify;
	}

	public Map<String, String> getWjDStitchModifyMap() {
		return wjDStitchModifyMap;
	}

	public void setWjDStitchModifyMap(Map<String, String> wjDStitchModifyMap) {
		this.wjDStitchModifyMap = wjDStitchModifyMap;
	}

	public Map<String, String> getWjDStitchModifyPlaceMap() {
		return wjDStitchModifyPlaceMap;
	}

	public void setWjDStitchModifyPlaceMap(Map<String, String> wjDStitchModifyPlaceMap) {
		this.wjDStitchModifyPlaceMap = wjDStitchModifyPlaceMap;
	}

	public String getWjAmfColor() {
		return wjAmfColor;
	}

	public void setWjAmfColor(String wjAmfColor) {
		this.wjAmfColor = wjAmfColor;
	}

	public Map<String, String> getWjAmfColorMap() {
		return wjAmfColorMap;
	}

	public void setWjAmfColorMap(Map<String, String> wjAmfColorMap) {
		this.wjAmfColorMap = wjAmfColorMap;
	}

	public String getWjAmfColorPlaceAll() {
		return wjAmfColorPlaceAll;
	}

	public void setWjAmfColorPlaceAll(String wjAmfColorPlaceAll) {
		this.wjAmfColorPlaceAll = wjAmfColorPlaceAll;
	}

	public Map<String, String> getWjAmfColorPlaceAllMap() {
		return wjAmfColorPlaceAllMap;
	}

	public void setWjAmfColorPlaceAllMap(Map<String, String> wjAmfColorPlaceAllMap) {
		this.wjAmfColorPlaceAllMap = wjAmfColorPlaceAllMap;
	}

	public Map<String, String> getWjAmfColorPlaceMap() {
		return wjAmfColorPlaceMap;
	}

	public void setWjAmfColorPlaceMap(Map<String, String> wjAmfColorPlaceMap) {
		this.wjAmfColorPlaceMap = wjAmfColorPlaceMap;
	}

	public String getWjAmfColor1() {
		return wjAmfColor1;
	}

	public void setWjAmfColor1(String wjAmfColor1) {
		this.wjAmfColor1 = wjAmfColor1;
	}

	public String getWjAmfColor2() {
		return wjAmfColor2;
	}

	public void setWjAmfColor2(String wjAmfColor2) {
		this.wjAmfColor2 = wjAmfColor2;
	}

	public String getWjAmfColor3() {
		return wjAmfColor3;
	}

	public void setWjAmfColor3(String wjAmfColor3) {
		this.wjAmfColor3 = wjAmfColor3;
	}

	public String getWjAmfColor4() {
		return wjAmfColor4;
	}

	public void setWjAmfColor4(String wjAmfColor4) {
		this.wjAmfColor4 = wjAmfColor4;
	}

	public String getWjAmfColor5() {
		return wjAmfColor5;
	}

	public void setWjAmfColor5(String wjAmfColor5) {
		this.wjAmfColor5 = wjAmfColor5;
	}

	public String getWjAmfColor6() {
		return wjAmfColor6;
	}

	public void setWjAmfColor6(String wjAmfColor6) {
		this.wjAmfColor6 = wjAmfColor6;
	}

	public String getWjAmfColor7() {
		return wjAmfColor7;
	}

	public void setWjAmfColor7(String wjAmfColor7) {
		this.wjAmfColor7 = wjAmfColor7;
	}

	public String getWjAmfColor8() {
		return wjAmfColor8;
	}

	public void setWjAmfColor8(String wjAmfColor8) {
		this.wjAmfColor8 = wjAmfColor8;
	}

	public String getWjAmfColor9() {
		return wjAmfColor9;
	}

	public void setWjAmfColor9(String wjAmfColor9) {
		this.wjAmfColor9 = wjAmfColor9;
	}

	public String getWjAmfColor10() {
		return wjAmfColor10;
	}

	public void setWjAmfColor10(String wjAmfColor10) {
		this.wjAmfColor10 = wjAmfColor10;
	}

	public Map<String, String> getWjAmfColorsMap() {
		return wjAmfColorsMap;
	}

	public void setWjAmfColorsMap(Map<String, String> wjAmfColorsMap) {
		this.wjAmfColorsMap = wjAmfColorsMap;
	}

	public String getWjBhColor() {
		return wjBhColor;
	}

	public void setWjBhColor(String wjBhColor) {
		this.wjBhColor = wjBhColor;
	}

	public Map<String, String> getWjBhColorMap() {
		return wjBhColorMap;
	}

	public void setWjBhColorMap(Map<String, String> wjBhColorMap) {
		this.wjBhColorMap = wjBhColorMap;
	}

	public String getWjBhColorPlaceAll() {
		return wjBhColorPlaceAll;
	}

	public void setWjBhColorPlaceAll(String wjBhColorPlaceAll) {
		this.wjBhColorPlaceAll = wjBhColorPlaceAll;
	}

	public Map<String, String> getWjBhColorPlaceAllMap() {
		return wjBhColorPlaceAllMap;
	}

	public void setWjBhColorPlaceAllMap(Map<String, String> wjBhColorPlaceAllMap) {
		this.wjBhColorPlaceAllMap = wjBhColorPlaceAllMap;
	}

	public Map<String, String> getWjBhColorPlaceMap() {
		return wjBhColorPlaceMap;
	}

	public void setWjBhColorPlaceMap(Map<String, String> wjBhColorPlaceMap) {
		this.wjBhColorPlaceMap = wjBhColorPlaceMap;
	}

	public String getWjBhColor1() {
		return wjBhColor1;
	}

	public void setWjBhColor1(String wjBhColor1) {
		this.wjBhColor1 = wjBhColor1;
	}

	public String getWjBhColor2() {
		return wjBhColor2;
	}

	public void setWjBhColor2(String wjBhColor2) {
		this.wjBhColor2 = wjBhColor2;
	}

	public String getWjBhColor3() {
		return wjBhColor3;
	}

	public void setWjBhColor3(String wjBhColor3) {
		this.wjBhColor3 = wjBhColor3;
	}

	public String getWjBhColor4() {
		return wjBhColor4;
	}

	public void setWjBhColor4(String wjBhColor4) {
		this.wjBhColor4 = wjBhColor4;
	}

	public String getWjBhColor5() {
		return wjBhColor5;
	}

	public void setWjBhColor5(String wjBhColor5) {
		this.wjBhColor5 = wjBhColor5;
	}

	public String getWjBhColor6() {
		return wjBhColor6;
	}

	public void setWjBhColor6(String wjBhColor6) {
		this.wjBhColor6 = wjBhColor6;
	}

	public String getWjBhColor7() {
		return wjBhColor7;
	}

	public void setWjBhColor7(String wjBhColor7) {
		this.wjBhColor7 = wjBhColor7;
	}

	public String getWjBhColor8() {
		return wjBhColor8;
	}

	public void setWjBhColor8(String wjBhColor8) {
		this.wjBhColor8 = wjBhColor8;
	}

	public String getWjBhColor9() {
		return wjBhColor9;
	}

	public void setWjBhColor9(String wjBhColor9) {
		this.wjBhColor9 = wjBhColor9;
	}

	public String getWjBhColor10() {
		return wjBhColor10;
	}

	public void setWjBhColor10(String wjBhColor10) {
		this.wjBhColor10 = wjBhColor10;
	}

	public String getWjBhColor11() {
		return wjBhColor11;
	}

	public void setWjBhColor11(String wjBhColor11) {
		this.wjBhColor11 = wjBhColor11;
	}

	public String getWjBhColor12() {
		return wjBhColor12;
	}

	public void setWjBhColor12(String wjBhColor12) {
		this.wjBhColor12 = wjBhColor12;
	}

	public String getWjBhColor13() {
		return wjBhColor13;
	}

	public void setWjBhColor13(String wjBhColor13) {
		this.wjBhColor13 = wjBhColor13;
	}

	public String getWjBhColor14() {
		return wjBhColor14;
	}

	public void setWjBhColor14(String wjBhColor14) {
		this.wjBhColor14 = wjBhColor14;
	}

	public String getWjBhColor15() {
		return wjBhColor15;
	}

	public void setWjBhColor15(String wjBhColor15) {
		this.wjBhColor15 = wjBhColor15;
	}

	public String getWjBhColor16() {
		return wjBhColor16;
	}

	public void setWjBhColor16(String wjBhColor16) {
		this.wjBhColor16 = wjBhColor16;
	}

	public String getWjBhColor17() {
		return wjBhColor17;
	}

	public void setWjBhColor17(String wjBhColor17) {
		this.wjBhColor17 = wjBhColor17;
	}

	public Map<String, String> getWjBhColorsMap() {
		return wjBhColorsMap;
	}

	public void setWjBhColorsMap(Map<String, String> wjBhColorsMap) {
		this.wjBhColorsMap = wjBhColorsMap;
	}

	public String getWjByColor() {
		return wjByColor;
	}

	public void setWjByColor(String wjByColor) {
		this.wjByColor = wjByColor;
	}

	public Map<String, String> getWjByColorMap() {
		return wjByColorMap;
	}

	public void setWjByColorMap(Map<String, String> wjByColorMap) {
		this.wjByColorMap = wjByColorMap;
	}

	public String getWjByColorPlaceAll() {
		return wjByColorPlaceAll;
	}

	public void setWjByColorPlaceAll(String wjByColorPlaceAll) {
		this.wjByColorPlaceAll = wjByColorPlaceAll;
	}

	public Map<String, String> getWjByColorPlaceAllMap() {
		return wjByColorPlaceAllMap;
	}

	public void setWjByColorPlaceAllMap(Map<String, String> wjByColorPlaceAllMap) {
		this.wjByColorPlaceAllMap = wjByColorPlaceAllMap;
	}

	public Map<String, String> getWjByColorPlaceMap() {
		return wjByColorPlaceMap;
	}

	public void setWjByColorPlaceMap(Map<String, String> wjByColorPlaceMap) {
		this.wjByColorPlaceMap = wjByColorPlaceMap;
	}

	public String getWjBhColorPlaceDf1() {
		return wjBhColorPlaceDf1;
	}

	public void setWjBhColorPlaceDf1(String wjBhColorPlaceDf1) {
		this.wjBhColorPlaceDf1 = wjBhColorPlaceDf1;
	}

	public String getWjBhColorPlaceDf2() {
		return wjBhColorPlaceDf2;
	}

	public void setWjBhColorPlaceDf2(String wjBhColorPlaceDf2) {
		this.wjBhColorPlaceDf2 = wjBhColorPlaceDf2;
	}

	public String getWjBhColorPlaceDf3() {
		return wjBhColorPlaceDf3;
	}

	public void setWjBhColorPlaceDf3(String wjBhColorPlaceDf3) {
		this.wjBhColorPlaceDf3 = wjBhColorPlaceDf3;
	}

	public String getWjBhColorPlaceUf1() {
		return wjBhColorPlaceUf1;
	}

	public void setWjBhColorPlaceUf1(String wjBhColorPlaceUf1) {
		this.wjBhColorPlaceUf1 = wjBhColorPlaceUf1;
	}

	public String getWjBhColorPlaceUf2() {
		return wjBhColorPlaceUf2;
	}

	public void setWjBhColorPlaceUf2(String wjBhColorPlaceUf2) {
		this.wjBhColorPlaceUf2 = wjBhColorPlaceUf2;
	}

	public String getWjBhColorPlaceUf3() {
		return wjBhColorPlaceUf3;
	}

	public void setWjBhColorPlaceUf3(String wjBhColorPlaceUf3) {
		this.wjBhColorPlaceUf3 = wjBhColorPlaceUf3;
	}

	public String getWjBhColorPlaceFcufy1() {
		return wjBhColorPlaceFcufy1;
	}

	public void setWjBhColorPlaceFcufy1(String wjBhColorPlaceFcufy1) {
		this.wjBhColorPlaceFcufy1 = wjBhColorPlaceFcufy1;
	}

	public String getWjBhColorPlaceFcufy2() {
		return wjBhColorPlaceFcufy2;
	}

	public void setWjBhColorPlaceFcufy2(String wjBhColorPlaceFcufy2) {
		this.wjBhColorPlaceFcufy2 = wjBhColorPlaceFcufy2;
	}

	public String getWjBhColorPlaceFcufy3() {
		return wjBhColorPlaceFcufy3;
	}

	public void setWjBhColorPlaceFcufy3(String wjBhColorPlaceFcufy3) {
		this.wjBhColorPlaceFcufy3 = wjBhColorPlaceFcufy3;
	}

	public String getWjBhColorPlaceFcufy4() {
		return wjBhColorPlaceFcufy4;
	}

	public void setWjBhColorPlaceFcufy4(String wjBhColorPlaceFcufy4) {
		this.wjBhColorPlaceFcufy4 = wjBhColorPlaceFcufy4;
	}

	public String getWjBhColorPlaceFcufy5() {
		return wjBhColorPlaceFcufy5;
	}

	public void setWjBhColorPlaceFcufy5(String wjBhColorPlaceFcufy5) {
		this.wjBhColorPlaceFcufy5 = wjBhColorPlaceFcufy5;
	}

	public String getWjBhColorPlaceBcufy1() {
		return wjBhColorPlaceBcufy1;
	}

	public void setWjBhColorPlaceBcufy1(String wjBhColorPlaceBcufy1) {
		this.wjBhColorPlaceBcufy1 = wjBhColorPlaceBcufy1;
	}

	public String getWjBhColorPlaceBcufy2() {
		return wjBhColorPlaceBcufy2;
	}

	public void setWjBhColorPlaceBcufy2(String wjBhColorPlaceBcufy2) {
		this.wjBhColorPlaceBcufy2 = wjBhColorPlaceBcufy2;
	}

	public String getWjBhColorPlaceBcufy3() {
		return wjBhColorPlaceBcufy3;
	}

	public void setWjBhColorPlaceBcufy3(String wjBhColorPlaceBcufy3) {
		this.wjBhColorPlaceBcufy3 = wjBhColorPlaceBcufy3;
	}

	public String getWjBhColorPlaceBcufy4() {
		return wjBhColorPlaceBcufy4;
	}

	public void setWjBhColorPlaceBcufy4(String wjBhColorPlaceBcufy4) {
		this.wjBhColorPlaceBcufy4 = wjBhColorPlaceBcufy4;
	}

	public String getWjBhColorPlaceBcufy5() {
		return wjBhColorPlaceBcufy5;
	}

	public void setWjBhColorPlaceBcufy5(String wjBhColorPlaceBcufy5) {
		this.wjBhColorPlaceBcufy5 = wjBhColorPlaceBcufy5;
	}

	public Map<String, String> getWjByColorsMap() {
		return wjByColorsMap;
	}

	public void setWjByColorsMap(Map<String, String> wjByColorsMap) {
		this.wjByColorsMap = wjByColorsMap;
	}

	public String getWjVentSpec() {
		return wjVentSpec;
	}

	public void setWjVentSpec(String wjVentSpec) {
		this.wjVentSpec = wjVentSpec;
	}

	public Map<String, String> getWjVentSpecMap() {
		return wjVentSpecMap;
	}

	public void setWjVentSpecMap(Map<String, String> wjVentSpecMap) {
		this.wjVentSpecMap = wjVentSpecMap;
	}

	public String getWjBodyBackMate() {
		return wjBodyBackMate;
	}

	public void setWjBodyBackMate(String wjBodyBackMate) {
		this.wjBodyBackMate = wjBodyBackMate;
	}

	public Map<String, String> getWjBodyBackMateMap() {
		return wjBodyBackMateMap;
	}

	public void setWjBodyBackMateMap(Map<String, String> wjBodyBackMateMap) {
		this.wjBodyBackMateMap = wjBodyBackMateMap;
	}

	public String getWjCuffBackMate() {
		return wjCuffBackMate;
	}

	public void setWjCuffBackMate(String wjCuffBackMate) {
		this.wjCuffBackMate = wjCuffBackMate;
	}

	public Map<String, String> getWjCuffBackMateMap() {
		return wjCuffBackMateMap;
	}

	public void setWjCuffBackMateMap(Map<String, String> wjCuffBackMateMap) {
		this.wjCuffBackMateMap = wjCuffBackMateMap;
	}

	public String getWjBtnMate() {
		return wjBtnMate;
	}

	public void setWjBtnMate(String wjBtnMate) {
		this.wjBtnMate = wjBtnMate;
	}

	public Map<String, String> getWjBtnMateMap() {
		return wjBtnMateMap;
	}

	public void setWjBtnMateMap(Map<String, String> wjBtnMateMap) {
		this.wjBtnMateMap = wjBtnMateMap;
	}

	public String getWjBodyBackMateStkNo() {
		return wjBodyBackMateStkNo;
	}

	public void setWjBodyBackMateStkNo(String wjBodyBackMateStkNo) {
		this.wjBodyBackMateStkNo = wjBodyBackMateStkNo;
	}

	public String getWjCuffBackMateStkNo() {
		return wjCuffBackMateStkNo;
	}

	public void setWjCuffBackMateStkNo(String wjCuffBackMateStkNo) {
		this.wjCuffBackMateStkNo = wjCuffBackMateStkNo;
	}

	public String getWjBtnMateStkNo() {
		return wjBtnMateStkNo;
	}

	public void setWjBtnMateStkNo(String wjBtnMateStkNo) {
		this.wjBtnMateStkNo = wjBtnMateStkNo;
	}

	public String getWjShapeMemory() {
		return wjShapeMemory;
	}

	public void setWjShapeMemory(String wjShapeMemory) {
		this.wjShapeMemory = wjShapeMemory;
	}

	public Map<String, String> getWjShapeMemoryMap() {
		return wjShapeMemoryMap;
	}

	public void setWjShapeMemoryMap(Map<String, String> wjShapeMemoryMap) {
		this.wjShapeMemoryMap = wjShapeMemoryMap;
	}

	public String getWjJacketLapelModel() {
		return wjJacketLapelModel;
	}

	public void setWjJacketLapelModel(String wjJacketLapelModel) {
		this.wjJacketLapelModel = wjJacketLapelModel;
	}

	public String getWjSleeveBtnCnt() {
		return wjSleeveBtnCnt;
	}

	public void setWjSleeveBtnCnt(String wjSleeveBtnCnt) {
		this.wjSleeveBtnCnt = wjSleeveBtnCnt;
	}

	public String getWjStitchModifyPlace1() {
		return wjStitchModifyPlace1;
	}

	public void setWjStitchModifyPlace1(String wjStitchModifyPlace1) {
		this.wjStitchModifyPlace1 = wjStitchModifyPlace1;
	}

	public String getWjStitchModifyPlace2() {
		return wjStitchModifyPlace2;
	}

	public void setWjStitchModifyPlace2(String wjStitchModifyPlace2) {
		this.wjStitchModifyPlace2 = wjStitchModifyPlace2;
	}

	public String getWjStitchModifyPlace3() {
		return wjStitchModifyPlace3;
	}

	public void setWjStitchModifyPlace3(String wjStitchModifyPlace3) {
		this.wjStitchModifyPlace3 = wjStitchModifyPlace3;
	}

	public String getWjStitchModifyPlace4() {
		return wjStitchModifyPlace4;
	}

	public void setWjStitchModifyPlace4(String wjStitchModifyPlace4) {
		this.wjStitchModifyPlace4 = wjStitchModifyPlace4;
	}

	public String getWjStitchModifyPlace5() {
		return wjStitchModifyPlace5;
	}

	public void setWjStitchModifyPlace5(String wjStitchModifyPlace5) {
		this.wjStitchModifyPlace5 = wjStitchModifyPlace5;
	}

	public String getWjStitchModifyPlace6() {
		return wjStitchModifyPlace6;
	}

	public void setWjStitchModifyPlace6(String wjStitchModifyPlace6) {
		this.wjStitchModifyPlace6 = wjStitchModifyPlace6;
	}

	public String getWjStitchModifyPlace7() {
		return wjStitchModifyPlace7;
	}

	public void setWjStitchModifyPlace7(String wjStitchModifyPlace7) {
		this.wjStitchModifyPlace7 = wjStitchModifyPlace7;
	}

	public String getWjStitchModifyPlace8() {
		return wjStitchModifyPlace8;
	}

	public void setWjStitchModifyPlace8(String wjStitchModifyPlace8) {
		this.wjStitchModifyPlace8 = wjStitchModifyPlace8;
	}

	public String getWjStitchModifyPlace9() {
		return wjStitchModifyPlace9;
	}

	public void setWjStitchModifyPlace9(String wjStitchModifyPlace9) {
		this.wjStitchModifyPlace9 = wjStitchModifyPlace9;
	}

	public String getWjDStitchModifyPlace1() {
		return wjDStitchModifyPlace1;
	}

	public void setWjDStitchModifyPlace1(String wjDStitchModifyPlace1) {
		this.wjDStitchModifyPlace1 = wjDStitchModifyPlace1;
	}

	public String getWjDStitchModifyPlace2() {
		return wjDStitchModifyPlace2;
	}

	public void setWjDStitchModifyPlace2(String wjDStitchModifyPlace2) {
		this.wjDStitchModifyPlace2 = wjDStitchModifyPlace2;
	}

	public String getWjDStitchModifyPlace3() {
		return wjDStitchModifyPlace3;
	}

	public void setWjDStitchModifyPlace3(String wjDStitchModifyPlace3) {
		this.wjDStitchModifyPlace3 = wjDStitchModifyPlace3;
	}

	public String getWjDStitchModifyPlace4() {
		return wjDStitchModifyPlace4;
	}

	public void setWjDStitchModifyPlace4(String wjDStitchModifyPlace4) {
		this.wjDStitchModifyPlace4 = wjDStitchModifyPlace4;
	}

	public String getWjDStitchModifyPlace5() {
		return wjDStitchModifyPlace5;
	}

	public void setWjDStitchModifyPlace5(String wjDStitchModifyPlace5) {
		this.wjDStitchModifyPlace5 = wjDStitchModifyPlace5;
	}

	public String getWjDStitchModifyPlace6() {
		return wjDStitchModifyPlace6;
	}

	public void setWjDStitchModifyPlace6(String wjDStitchModifyPlace6) {
		this.wjDStitchModifyPlace6 = wjDStitchModifyPlace6;
	}

	public String getWjDStitchModifyPlace7() {
		return wjDStitchModifyPlace7;
	}

	public void setWjDStitchModifyPlace7(String wjDStitchModifyPlace7) {
		this.wjDStitchModifyPlace7 = wjDStitchModifyPlace7;
	}

	public String getWjDStitchModifyPlace8() {
		return wjDStitchModifyPlace8;
	}

	public void setWjDStitchModifyPlace8(String wjDStitchModifyPlace8) {
		this.wjDStitchModifyPlace8 = wjDStitchModifyPlace8;
	}

	public String getWjDStitchModifyPlace9() {
		return wjDStitchModifyPlace9;
	}

	public void setWjDStitchModifyPlace9(String wjDStitchModifyPlace9) {
		this.wjDStitchModifyPlace9 = wjDStitchModifyPlace9;
	}

	public String getWjAmfColorPlace1() {
		return wjAmfColorPlace1;
	}

	public void setWjAmfColorPlace1(String wjAmfColorPlace1) {
		this.wjAmfColorPlace1 = wjAmfColorPlace1;
	}

	public String getWjAmfColorPlace2() {
		return wjAmfColorPlace2;
	}

	public void setWjAmfColorPlace2(String wjAmfColorPlace2) {
		this.wjAmfColorPlace2 = wjAmfColorPlace2;
	}

	public String getWjAmfColorPlace3() {
		return wjAmfColorPlace3;
	}

	public void setWjAmfColorPlace3(String wjAmfColorPlace3) {
		this.wjAmfColorPlace3 = wjAmfColorPlace3;
	}

	public String getWjAmfColorPlace4() {
		return wjAmfColorPlace4;
	}

	public void setWjAmfColorPlace4(String wjAmfColorPlace4) {
		this.wjAmfColorPlace4 = wjAmfColorPlace4;
	}

	public String getWjAmfColorPlace5() {
		return wjAmfColorPlace5;
	}

	public void setWjAmfColorPlace5(String wjAmfColorPlace5) {
		this.wjAmfColorPlace5 = wjAmfColorPlace5;
	}

	public String getWjAmfColorPlace6() {
		return wjAmfColorPlace6;
	}

	public void setWjAmfColorPlace6(String wjAmfColorPlace6) {
		this.wjAmfColorPlace6 = wjAmfColorPlace6;
	}

	public String getWjAmfColorPlace7() {
		return wjAmfColorPlace7;
	}

	public void setWjAmfColorPlace7(String wjAmfColorPlace7) {
		this.wjAmfColorPlace7 = wjAmfColorPlace7;
	}

	public String getWjAmfColorPlace8() {
		return wjAmfColorPlace8;
	}

	public void setWjAmfColorPlace8(String wjAmfColorPlace8) {
		this.wjAmfColorPlace8 = wjAmfColorPlace8;
	}

	public String getWjAmfColorPlace9() {
		return wjAmfColorPlace9;
	}

	public void setWjAmfColorPlace9(String wjAmfColorPlace9) {
		this.wjAmfColorPlace9 = wjAmfColorPlace9;
	}

	public String getWjAmfColorPlace10() {
		return wjAmfColorPlace10;
	}

	public void setWjAmfColorPlace10(String wjAmfColorPlace10) {
		this.wjAmfColorPlace10 = wjAmfColorPlace10;
	}

	public String getWjBhColorPlace1() {
		return wjBhColorPlace1;
	}

	public void setWjBhColorPlace1(String wjBhColorPlace1) {
		this.wjBhColorPlace1 = wjBhColorPlace1;
	}

	public String getWjBhColorPlace2() {
		return wjBhColorPlace2;
	}

	public void setWjBhColorPlace2(String wjBhColorPlace2) {
		this.wjBhColorPlace2 = wjBhColorPlace2;
	}

	public String getWjBhColorPlace3() {
		return wjBhColorPlace3;
	}

	public void setWjBhColorPlace3(String wjBhColorPlace3) {
		this.wjBhColorPlace3 = wjBhColorPlace3;
	}

	public String getWjBhColorPlace4() {
		return wjBhColorPlace4;
	}

	public void setWjBhColorPlace4(String wjBhColorPlace4) {
		this.wjBhColorPlace4 = wjBhColorPlace4;
	}

	public String getWjBhColorPlace5() {
		return wjBhColorPlace5;
	}

	public void setWjBhColorPlace5(String wjBhColorPlace5) {
		this.wjBhColorPlace5 = wjBhColorPlace5;
	}

	public String getWjBhColorPlace6() {
		return wjBhColorPlace6;
	}

	public void setWjBhColorPlace6(String wjBhColorPlace6) {
		this.wjBhColorPlace6 = wjBhColorPlace6;
	}

	public String getWjBhColorPlace7() {
		return wjBhColorPlace7;
	}

	public void setWjBhColorPlace7(String wjBhColorPlace7) {
		this.wjBhColorPlace7 = wjBhColorPlace7;
	}

	public String getWjBhColorPlace8() {
		return wjBhColorPlace8;
	}

	public void setWjBhColorPlace8(String wjBhColorPlace8) {
		this.wjBhColorPlace8 = wjBhColorPlace8;
	}

	public String getWjBhColorPlace9() {
		return wjBhColorPlace9;
	}

	public void setWjBhColorPlace9(String wjBhColorPlace9) {
		this.wjBhColorPlace9 = wjBhColorPlace9;
	}

	public String getWjBhColorPlace10() {
		return wjBhColorPlace10;
	}

	public void setWjBhColorPlace10(String wjBhColorPlace10) {
		this.wjBhColorPlace10 = wjBhColorPlace10;
	}

	public String getWjBhColorPlace11() {
		return wjBhColorPlace11;
	}

	public void setWjBhColorPlace11(String wjBhColorPlace11) {
		this.wjBhColorPlace11 = wjBhColorPlace11;
	}

	public String getWjBhColorPlace12() {
		return wjBhColorPlace12;
	}

	public void setWjBhColorPlace12(String wjBhColorPlace12) {
		this.wjBhColorPlace12 = wjBhColorPlace12;
	}

	public String getWjBhColorPlace13() {
		return wjBhColorPlace13;
	}

	public void setWjBhColorPlace13(String wjBhColorPlace13) {
		this.wjBhColorPlace13 = wjBhColorPlace13;
	}

	public String getWjBhColorPlace14() {
		return wjBhColorPlace14;
	}

	public void setWjBhColorPlace14(String wjBhColorPlace14) {
		this.wjBhColorPlace14 = wjBhColorPlace14;
	}

	public String getWjBhColorPlace15() {
		return wjBhColorPlace15;
	}

	public void setWjBhColorPlace15(String wjBhColorPlace15) {
		this.wjBhColorPlace15 = wjBhColorPlace15;
	}

	public String getWjBhColorPlace16() {
		return wjBhColorPlace16;
	}

	public void setWjBhColorPlace16(String wjBhColorPlace16) {
		this.wjBhColorPlace16 = wjBhColorPlace16;
	}

	public String getWjBhColorPlace17() {
		return wjBhColorPlace17;
	}

	public void setWjBhColorPlace17(String wjBhColorPlace17) {
		this.wjBhColorPlace17 = wjBhColorPlace17;
	}

	public String getWjByColorPlace1() {
		return wjByColorPlace1;
	}

	public void setWjByColorPlace1(String wjByColorPlace1) {
		this.wjByColorPlace1 = wjByColorPlace1;
	}

	public String getWjByColorPlace2() {
		return wjByColorPlace2;
	}

	public void setWjByColorPlace2(String wjByColorPlace2) {
		this.wjByColorPlace2 = wjByColorPlace2;
	}

	public String getWjByColorPlace3() {
		return wjByColorPlace3;
	}

	public void setWjByColorPlace3(String wjByColorPlace3) {
		this.wjByColorPlace3 = wjByColorPlace3;
	}

	public String getWjByColorPlace4() {
		return wjByColorPlace4;
	}

	public void setWjByColorPlace4(String wjByColorPlace4) {
		this.wjByColorPlace4 = wjByColorPlace4;
	}

	public String getWjByColorPlace5() {
		return wjByColorPlace5;
	}

	public void setWjByColorPlace5(String wjByColorPlace5) {
		this.wjByColorPlace5 = wjByColorPlace5;
	}

	public String getWjByColorPlace6() {
		return wjByColorPlace6;
	}

	public void setWjByColorPlace6(String wjByColorPlace6) {
		this.wjByColorPlace6 = wjByColorPlace6;
	}

	public String getWjByColorPlace7() {
		return wjByColorPlace7;
	}

	public void setWjByColorPlace7(String wjByColorPlace7) {
		this.wjByColorPlace7 = wjByColorPlace7;
	}

	public String getWjByColorPlace8() {
		return wjByColorPlace8;
	}

	public void setWjByColorPlace8(String wjByColorPlace8) {
		this.wjByColorPlace8 = wjByColorPlace8;
	}

	public String getWjByColorPlace9() {
		return wjByColorPlace9;
	}

	public void setWjByColorPlace9(String wjByColorPlace9) {
		this.wjByColorPlace9 = wjByColorPlace9;
	}

	public String getWjByColorPlace10() {
		return wjByColorPlace10;
	}

	public void setWjByColorPlace10(String wjByColorPlace10) {
		this.wjByColorPlace10 = wjByColorPlace10;
	}

	public String getWjByColorPlace11() {
		return wjByColorPlace11;
	}

	public void setWjByColorPlace11(String wjByColorPlace11) {
		this.wjByColorPlace11 = wjByColorPlace11;
	}

	public String getWjByColorPlace12() {
		return wjByColorPlace12;
	}

	public void setWjByColorPlace12(String wjByColorPlace12) {
		this.wjByColorPlace12 = wjByColorPlace12;
	}

	public String getWjByColorPlace13() {
		return wjByColorPlace13;
	}

	public void setWjByColorPlace13(String wjByColorPlace13) {
		this.wjByColorPlace13 = wjByColorPlace13;
	}

	public String getWjByColorPlace14() {
		return wjByColorPlace14;
	}

	public void setWjByColorPlace14(String wjByColorPlace14) {
		this.wjByColorPlace14 = wjByColorPlace14;
	}

	public String getWjByColorPlace15() {
		return wjByColorPlace15;
	}

	public void setWjByColorPlace15(String wjByColorPlace15) {
		this.wjByColorPlace15 = wjByColorPlace15;
	}

	public String getWjByColorPlace16() {
		return wjByColorPlace16;
	}

	public void setWjByColorPlace16(String wjByColorPlace16) {
		this.wjByColorPlace16 = wjByColorPlace16;
	}

	public String getWjByColorPlace17() {
		return wjByColorPlace17;
	}

	public void setWjByColorPlace17(String wjByColorPlace17) {
		this.wjByColorPlace17 = wjByColorPlace17;
	}
}
