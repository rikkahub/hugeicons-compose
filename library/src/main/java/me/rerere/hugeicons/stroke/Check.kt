package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = ImageVector.Builder(
            name = "Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 13.2592f)
            lineTo(7.58583f, 15.9568f)
            curveTo(8.2525f, 16.6523f, 8.58583f, 17f, 9.00004f, 17f)
            curveTo(9.41425f, 17f, 9.74759f, 16.6523f, 10.4143f, 15.9568f)
            lineTo(19f, 7f)
        }
        }.build()

        return _check!!
    }

private var _check: ImageVector? = null
