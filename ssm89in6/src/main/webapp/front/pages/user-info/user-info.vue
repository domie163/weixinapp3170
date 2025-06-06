<template>
	<view class="content">
		<view :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"#ccc","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiatingchengyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}'>账号</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"20rpx","color":"rgba(16, 15, 15, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.zhanghao" placeholder="账号"></input>
		</view>
		<view :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"#ccc","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiatingchengyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}'>姓名</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"20rpx","color":"rgba(16, 15, 15, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
		<view :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"#ccc","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiatingchengyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}'>密码</view>
			<input type="password" style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"20rpx","color":"rgba(16, 15, 15, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
		<view :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"#ccc","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiatingchengyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}'>家庭角色</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"20rpx","color":"rgba(16, 15, 15, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jiatingjiaose" placeholder="家庭角色"></input>
		</view>
			<view v-if="tableName=='jiatingchengyuan'" :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"rgba(252, 252, 252, 1)","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}' class="title">性别</view>
                                <picker @change="jiatingchengyuanxingbieChange" :value="jiatingchengyuanxingbieIndex" :range="jiatingchengyuanxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"20rpx","color":"rgba(16, 15, 15, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"#ccc","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiatingchengyuan'" class="cu-form-group">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}'>手机</view>
			<input  style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"20rpx","color":"rgba(16, 15, 15, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"","backgroundColor":"rgba(255, 255, 255, 0.56)","borderColor":"#ccc","margin":"","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiatingchengyuan'" @tap="jiatingchengyuanzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(14, 13, 13, 1)","textAlign":"left"}'>照片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' v-if="ruleForm.zhaopian" style="margin: 0;" class="avator" :src="ruleForm.zhaopian" mode=""></image>
				<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		
		<view class="btn">
			<view class="box" :style="{width: 'auto'}">
				<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#409EFF","borderColor":"#409EFF","borderRadius":"32rpx","color":"#fff","borderWidth":"1","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			</view>

			<view class="box" :style="{width: 'auto'}">
				<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#E6A23C","borderColor":"#E6A23C","borderRadius":"32rpx","color":"#fff","borderWidth":"2rpx","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				jiatingchengyuanxingbieOptions: [],
				jiatingchengyuanxingbieIndex: 0,
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='jiatingchengyuan'){
				this.jiatingchengyuanxingbieOptions = "男,女".split(',');
				this.jiatingchengyuanxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.jiatingchengyuanxingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        jiatingchengyuanxingbieChange(e) {
                                this.jiatingchengyuanxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jiatingchengyuanxingbieOptions[this.jiatingchengyuanxingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.zhanghao) && `jiatingchengyuan` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiatingchengyuan` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`jiatingchengyuan` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,jiatingchengyuanzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 88rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}
	
	.cu-btn {
	  width: 100% !important;
	}

.picker-select-input {
	line-height: 88rpx;
}
</style>
