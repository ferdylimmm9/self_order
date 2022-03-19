package tugas.project.selforder.data

import tugas.project.selforder.R
import tugas.project.selforder.classData.card

object dataCard {
    private val cardName = arrayOf("+62-123****8901", "+62-109****4321", "+62-456****1234")
    private val balance = arrayOf("Balance", "Balance", "Balance")
    private val cardBackground = intArrayOf(R.drawable.danacard, R.drawable.ovocard, R.drawable.gopaycard)
    private val cardBalance = arrayOf("Rp200.000","Rp500.000","Rp700.000")


    val listData:ArrayList<card>get() {
        var list = arrayListOf<card>()

        for (i in cardName.indices){
            var card = card()
            card.charName = cardName[i]
            card.balance = balance[i]
            card.cardBackground = cardBackground[i]
            card.cardBalance = cardBalance[i]
            list.add(card)
        }
        return list
    }
}