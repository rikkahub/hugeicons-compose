package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wise: ImageVector
    get() {
        if (_wise != null) {
            return _wise!!
        }
        _wise = ImageVector.Builder(
            name = "Wise",
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
        moveTo(10.9999f, 22f)
        lineTo(19f, 2f)
        horizontalLineTo(7.00002f)
        lineTo(9.49994f, 6.5f)
        lineTo(4.99994f, 11f)
        horizontalLineTo(11.9999f)
        }
        }.build()

        return _wise!!
    }

private var _wise: ImageVector? = null
