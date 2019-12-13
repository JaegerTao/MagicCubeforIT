<template>
	<div id="app">
		<img src="./assets/logo.png">
		<div>
			<el-button @click="startHacking">Start</el-button>
		</div>
		<el-table :data="tableData" style="width: 50%">
			<el-table-column prop="name" label="姓名" width="180">
			</el-table-column>
			<el-table-column prop="email" label="邮箱" width="180">
			</el-table-column>
		</el-table>
		<el-button v-on:click="sendGet()">获取数据</el-button>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				tableData: [{
					name: '王小虎',
					email: 'wangxiaohu@foxmail.com'
				}, {
					name: '张三',
					email: 'www.zhangsan.com'
				}]
			}
		},
		methods: {
			startHacking() {
				this.$notify({
					title: 'It works!',
					type: 'success',
					message: 'We\'ve laid the ground work for you. It\'s time for you to build something epic!',
					duration: 5000
				})
			},
			sendGet() {
				this.$axios.post('http://localhost:8080/index/doLogin',{
					params:{
						name: 'admin',
						pwd:'admin'
					}
				}).then(resp => {
					console.log(resp)
				}).catch(err =>{
					console.log(err)
				})
				
			}
		}
	}
</script>

<style>
	#app {
		font-family: Helvetica, sans-serif;
		text-align: center;
	}
</style>
