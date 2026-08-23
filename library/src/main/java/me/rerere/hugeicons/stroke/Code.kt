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

val HugeIcons.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = ImageVector.Builder(
            name = "Code",
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
            moveTo(16f, 6.99998f)
            lineTo(19.0664f, 9.64296f)
            curveTo(20.3554f, 10.7541f, 21f, 11.3096f, 21f, 12f)
            curveTo(21f, 12.6903f, 20.3555f, 13.2459f, 19.0664f, 14.357f)
            lineTo(16f, 17f)
        }

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
            moveTo(8f, 6.99998f)
            lineTo(4.93365f, 9.64296f)
            curveTo(3.64455f, 10.7541f, 3f, 11.3096f, 3f, 12f)
            curveTo(3f, 12.6903f, 3.64455f, 13.2459f, 4.93365f, 14.357f)
            lineTo(8f, 17f)
        }
        }.build()

        return _code!!
    }

private var _code: ImageVector? = null
