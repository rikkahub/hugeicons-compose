package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = ImageVector.Builder(
            name = "Highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.6777f, 16.2071f)
        lineTo(8.79289f, 18.3223f)
        moveTo(6.6777f, 16.2071f)
        lineTo(2.5f, 20.5f)
        horizontalLineTo(6.5f)
        lineTo(8.79289f, 18.3223f)
        moveTo(6.6777f, 16.2071f)
        curveTo(6.28717f, 15.8166f, 6.29534f, 15.1872f, 6.63537f, 14.752f)
        curveTo(7.42742f, 13.7383f, 7.71531f, 12.8216f, 7.79924f, 12.1382f)
        curveTo(7.89158f, 11.3863f, 8.07366f, 10.5734f, 8.60933f, 10.0377f)
        lineTo(9.50122f, 9.14828f)
        moveTo(8.79289f, 18.3223f)
        curveTo(9.18342f, 18.7128f, 9.81278f, 18.7047f, 10.248f, 18.3646f)
        curveTo(11.2617f, 17.5726f, 12.1784f, 17.2847f, 12.8618f, 17.2008f)
        curveTo(13.6137f, 17.1084f, 14.4266f, 16.9263f, 14.9623f, 16.3907f)
        lineTo(15.8517f, 15.4988f)
        moveTo(15.8517f, 15.4988f)
        lineTo(9.50122f, 9.14828f)
        moveTo(15.8517f, 15.4988f)
        curveTo(16.2422f, 15.8893f, 16.8754f, 15.8893f, 17.2659f, 15.4988f)
        lineTo(21.5f, 11.2647f)
        moveTo(9.50122f, 9.14828f)
        curveTo(9.1107f, 8.75776f, 9.1107f, 8.12459f, 9.50122f, 7.73407f)
        lineTo(13.7353f, 3.5f)
        }
        }.build()

        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
