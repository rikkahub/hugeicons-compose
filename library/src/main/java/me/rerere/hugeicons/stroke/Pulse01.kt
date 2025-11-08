package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pulse01: ImageVector
    get() {
        if (_pulse01 != null) {
            return _pulse01!!
        }
        _pulse01 = ImageVector.Builder(
            name = "Pulse01",
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
        moveTo(2f, 12f)
        horizontalLineTo(6f)
        lineTo(7.5f, 8f)
        lineTo(9.5f, 15f)
        lineTo(13f, 6f)
        lineTo(15.5f, 18f)
        lineTo(18f, 12f)
        horizontalLineTo(22f)
        }
        }.build()

        return _pulse01!!
    }

private var _pulse01: ImageVector? = null
