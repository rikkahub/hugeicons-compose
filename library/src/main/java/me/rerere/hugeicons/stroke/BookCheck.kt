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

val HugeIcons.BookCheck: ImageVector
    get() {
        if (_bookCheck != null) {
            return _bookCheck!!
        }
        _bookCheck = ImageVector.Builder(
            name = "BookCheck",
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
            moveTo(20f, 22f)
            horizontalLineTo(6f)
            curveTo(4.89543f, 22f, 4f, 21.1046f, 4f, 20f)
            moveTo(4f, 20f)
            curveTo(4f, 18.8954f, 4.89543f, 18f, 6f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(8f)
            moveTo(4f, 20f)
            verticalLineTo(8f)
            curveTo(4f, 5.17157f, 4f, 3.75736f, 4.87868f, 2.87868f)
            curveTo(5.75736f, 2f, 7.17157f, 2f, 10f, 2f)
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
            moveTo(13f, 5f)
            lineTo(15f, 7f)
            lineTo(20f, 2f)
        }
        }.build()

        return _bookCheck!!
    }

private var _bookCheck: ImageVector? = null
