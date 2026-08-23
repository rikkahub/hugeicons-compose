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

val HugeIcons.BookA: ImageVector
    get() {
        if (_bookA != null) {
            return _bookA!!
        }
        _bookA = ImageVector.Builder(
            name = "BookA",
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
            moveTo(8f, 14f)
            lineTo(11.2996f, 6.45808f)
            curveTo(11.4213f, 6.17981f, 11.6963f, 6f, 12f, 6f)
            curveTo(12.3037f, 6f, 12.5787f, 6.17981f, 12.7004f, 6.45808f)
            lineTo(16f, 14f)
            moveTo(9.5f, 11f)
            horizontalLineTo(14.5f)
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
            moveTo(20f, 22f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
            moveTo(4f, 20f)
            curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(6f)
            curveTo(20f, 4.11438f, 20f, 3.17157f, 19.4142f, 2.58579f)
            curveTo(18.8284f, 2f, 17.8856f, 2f, 16f, 2f)
            horizontalLineTo(10f)
            curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
            curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
            verticalLineTo(20f)
            close()
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
            moveTo(19.5f, 18f)
            curveTo(19.5f, 18f, 18.5f, 18.7628f, 18.5f, 20f)
            curveTo(18.5f, 21.2372f, 19.5f, 22f, 19.5f, 22f)
        }
        }.build()

        return _bookA!!
    }

private var _bookA: ImageVector? = null
