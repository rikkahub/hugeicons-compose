package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tick01: ImageVector
    get() {
        if (_tick01 != null) {
            return _tick01!!
        }
        _tick01 = ImageVector.Builder(
            name = "Tick01",
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
        moveTo(5f, 14.5f)
        curveTo(5f, 14.5f, 6.5f, 14.5f, 8.5f, 18f)
        curveTo(8.5f, 18f, 14.0588f, 8.83333f, 19f, 7f)
        }
        }.build()

        return _tick01!!
    }

private var _tick01: ImageVector? = null
