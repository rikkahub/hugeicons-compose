package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetThai: ImageVector
    get() {
        if (_alphabetThai != null) {
            return _alphabetThai!!
        }
        _alphabetThai = ImageVector.Builder(
            name = "AlphabetThai",
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
        moveTo(6f, 21f)
        verticalLineTo(14f)
        curveTo(6f, 13.371f, 6.24724f, 12.8125f, 6.74172f, 12.248f)
        curveTo(7.22967f, 11.671f, 8.25411f, 11.2708f, 9f, 11.0472f)
        curveTo(9.04786f, 11.0329f, 9.05246f, 10.9458f, 9.00628f, 10.9257f)
        curveTo(8.3551f, 10.6418f, 7.06568f, 10.2569f, 6.5674f, 9.59877f)
        curveTo(6.55409f, 9.58118f, 6.54743f, 9.57239f, 6.54632f, 9.57095f)
        curveTo(6.54521f, 9.5695f, 6.50377f, 9.5164f, 6.4209f, 9.41019f)
        curveTo(6f, 8.87077f, 6f, 7.80847f, 6f, 7.80847f)
        curveTo(6f, 5.93718f, 7.27312f, 4.43992f, 8.75497f, 3.69556f)
        curveTo(9.65563f, 3.23185f, 10.7241f, 3f, 11.9603f, 3f)
        curveTo(13.0375f, 3f, 14.0353f, 3.20161f, 14.9536f, 3.60484f)
        curveTo(16.9456f, 4.43574f, 18f, 6.43605f, 18f, 8.71573f)
        verticalLineTo(21f)
        }
        }.build()

        return _alphabetThai!!
    }

private var _alphabetThai: ImageVector? = null
