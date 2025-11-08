package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Diamond01: ImageVector
    get() {
        if (_diamond01 != null) {
            return _diamond01!!
        }
        _diamond01 = ImageVector.Builder(
            name = "Diamond01",
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
        moveTo(6.959f, 7.03438f)
        lineTo(8.04435f, 5.72804f)
        curveTo(10.1093f, 3.24268f, 11.1417f, 2f, 12.5f, 2f)
        curveTo(13.8583f, 2f, 14.8907f, 3.24268f, 16.9556f, 5.72803f)
        lineTo(18.041f, 7.03437f)
        curveTo(20.0137f, 9.4087f, 21f, 10.5959f, 21f, 12f)
        curveTo(21f, 13.4041f, 20.0137f, 14.5913f, 18.041f, 16.9656f)
        lineTo(16.9557f, 18.272f)
        curveTo(14.8907f, 20.7573f, 13.8583f, 22f, 12.5f, 22f)
        curveTo(11.1417f, 22f, 10.1093f, 20.7573f, 8.04435f, 18.272f)
        lineTo(6.95901f, 16.9656f)
        curveTo(4.98634f, 14.5913f, 4f, 13.4041f, 4f, 12f)
        curveTo(4f, 10.5959f, 4.98633f, 9.4087f, 6.959f, 7.03438f)
        }
        }.build()

        return _diamond01!!
    }

private var _diamond01: ImageVector? = null
