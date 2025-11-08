package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pulse02: ImageVector
    get() {
        if (_pulse02 != null) {
            return _pulse02!!
        }
        _pulse02 = ImageVector.Builder(
            name = "Pulse02",
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
        horizontalLineTo(5f)
        lineTo(6.5f, 8f)
        lineTo(9f, 15f)
        lineTo(10.5f, 12f)
        horizontalLineTo(12.5f)
        lineTo(14.5f, 7f)
        lineTo(16.5f, 17f)
        lineTo(19f, 12f)
        horizontalLineTo(22f)
        }
        }.build()

        return _pulse02!!
    }

private var _pulse02: ImageVector? = null
