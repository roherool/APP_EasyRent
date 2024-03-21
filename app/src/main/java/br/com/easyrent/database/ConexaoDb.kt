package br.com.easyrent.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.easyrent.database.dao.ContratoDao
import br.com.easyrent.database.dao.ImovelDao
import br.com.easyrent.database.dao.PessoaDao
import br.com.easyrent.database.dao.UsuarioDao
import br.com.easyrent.model.Contrato
import br.com.easyrent.model.Imovel
import br.com.easyrent.model.Pessoa
import br.com.easyrent.model.Usuario

@Database(entities = [Contrato::class, Imovel::class, Pessoa::class, Usuario::class], version = 1)
abstract class ConexaoDb : RoomDatabase() {

    abstract fun contratoDao(): ContratoDao
    abstract fun imovelDao(): ImovelDao
    abstract fun pessoaDao(): PessoaDao
    abstract fun usuarioDao(): UsuarioDao

    companion object {

        private lateinit var instance: ConexaoDb

        fun getDatabase(context: Context): ConexaoDb {
            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        ConexaoDb::class.java,
                        "db_easyrent"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}