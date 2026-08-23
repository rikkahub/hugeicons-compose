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

val HugeIcons.Annoyed: ImageVector
    get() {
        if (_annoyed != null) {
            return _annoyed!!
        }
        _annoyed = ImageVector.Builder(
            name = "Annoyed",
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
            moveTo(12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 15f)
            horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 8f)
            curveTo(7.51931f, 8f, 8.74652f, 8f, 9.5f, 8.70898f)
            moveTo(9.5f, 8.70898f)
            curveTo(9.71381f, 8.91016f, 10f, 9.22386f, 10f, 9.5f)
            curveTo(10f, 9.77614f, 9.77614f, 10f, 9.5f, 10f)
            curveTo(9.20618f, 10f, 8.996f, 9.75659f, 9f, 9.5f)
            curveTo(9.0046f, 9.2053f, 9.33335f, 8.92413f, 9.5f, 8.70898f)
            close()
            moveTo(14f, 8f)
            curveTo(14.5193f, 8f, 15.7465f, 8f, 16.5f, 8.70898f)
            moveTo(16.5f, 8.70898f)
            curveTo(16.7138f, 8.91016f, 17f, 9.22386f, 17f, 9.5f)
            curveTo(17f, 9.77614f, 16.7761f, 10f, 16.5f, 10f)
            curveTo(16.2062f, 10f, 15.996f, 9.75659f, 16f, 9.5f)
            curveTo(16.0046f, 9.2053f, 16.3334f, 8.92413f, 16.5f, 8.70898f)
            close()
        }
        }.build()

        return _annoyed!!
    }

private var _annoyed: ImageVector? = null
