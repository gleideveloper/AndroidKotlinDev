package com.gleidev.activitylifecycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts.*

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * https://developer.android.com/guide/components/activities/intro-activities
 */
class MainActivity : AppCompatActivity() {
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    /**Método obrigatório para criação Activity e seus componentes
     * Local para operações leves do sistema como: setar um layout, inicializar as variáveis
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LOG", "onCreate() ${this.javaClass.simpleName}")
        resultLauncher = registerForActivityResult(StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result.data?.apply {
                    Toast.makeText(
                        this@MainActivity,
                        getStringExtra("RETURN"),
                        Toast.LENGTH_LONG
                    ).show()

                }
            }

        }
    }

    /**Método é chamado a partir do momento Activity ficou visível para o usuário
     * Método usado para fazer um request a um banco de dado, request a uma API , setar um cor de um botão
     */
    override fun onStart() {
        super.onStart()
        Log.i("LOG", "onStart() ${this.javaClass.simpleName}")
    }

    /**A maior parte da funcionalidade principal de um app é implementado no onResume
     * Método é chamado logo após o onStart quando a activity está em segundo plano
     * Local para setar os botões, inicializar as variáveis
     */
    override fun onResume() {
        super.onResume()
        Log.i("LOG", "onResume() ${this.javaClass.simpleName}")
        btnAbrirSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Text_value", edt_text.text.toString())
            resultLauncher.launch(intent)
        }
    }

    /**Método chamado depois do onResume
     * Usado para pausar um recurso usado pelo app como: consultado a um DB, request api, thread, etc.
     */
    override fun onPause() {
        super.onPause()
        Log.i("LOG", "onPause() ${this.javaClass.simpleName}")
    }

    /**Método chamado logo após o onPause
     * Usado para parar um recurso usado pelo app como: consultado a um DB, request api, thread, etc.
     */
    override fun onStop() {
        super.onStop()
        Log.i("LOG", "onStop() ${this.javaClass.simpleName}")
    }

    /**Método para destruir a activity
     * O Sistema invoca esse callback antes de uma atividade ser destruída
     * Fechar um conexão de banco, uma requisão, etc liberando todos os recurso do app
     */
    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOG", "onStop() ${this.javaClass.simpleName}")
    }
}