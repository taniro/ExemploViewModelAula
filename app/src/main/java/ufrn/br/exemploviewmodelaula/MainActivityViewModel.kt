package ufrn.br.exemploviewmodelaula

import android.support.v4.os.IResultReceiver._Parcel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var _contador = MutableLiveData<Int>(0)
    var contador:LiveData<Int> = _contador

    fun incrementa(){
        this._contador.value = this._contador.value!!.plus(1)
    }

    private var _texto = MutableLiveData<String>("")
    var texto:LiveData<String> = _texto
}