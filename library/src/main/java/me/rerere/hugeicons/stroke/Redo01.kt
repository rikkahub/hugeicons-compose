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

val HugeIcons.Redo01: ImageVector
    get() {
        if (_redo01 != null) {
            return _redo01!!
        }
        _redo01 = ImageVector.Builder(
            name = "Redo01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
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
            moveTo(20.9922f, 8f)
            horizontalLineTo(8.99219f)
            curveTo(5.67848f, 8f, 2.99219f, 10.6863f, 2.99219f, 14f)
            curveTo(2.99219f, 17.3137f, 5.67848f, 20f, 8.99219f, 20f)
            horizontalLineTo(12.9922f)
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
            moveTo(16.9922f, 4f)
            lineTo(18.146f, 4.87652f)
            curveTo(20.0435f, 6.31801f, 20.9922f, 7.03875f, 20.9922f, 8f)
            curveTo(20.9922f, 8.96125f, 20.0435f, 9.68199f, 18.146f, 11.1235f)
            lineTo(16.9922f, 12f)
        }
        }.build()

        return _redo01!!
    }

private var _redo01: ImageVector? = null
