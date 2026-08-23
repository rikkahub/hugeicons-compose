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

val HugeIcons.ExclamationMarkSlash: ImageVector
    get() {
        if (_exclamationMarkSlash != null) {
            return _exclamationMarkSlash!!
        }
        _exclamationMarkSlash = ImageVector.Builder(
            name = "ExclamationMarkSlash",
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
            moveTo(12f, 5f)
            verticalLineTo(8f)
            moveTo(12f, 15f)
            verticalLineTo(12f)
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
            moveTo(12.125f, 18.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 18.75f)
            curveTo(12.25f, 18.8881f, 12.1381f, 19f, 12f, 19f)
            curveTo(11.8619f, 19f, 11.75f, 18.8881f, 11.75f, 18.75f)
            curveTo(11.75f, 18.6119f, 11.8619f, 18.5f, 12f, 18.5f)
            curveTo(12.1381f, 18.5f, 12.25f, 18.6119f, 12.25f, 18.75f)
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
            moveTo(4f, 4f)
            lineTo(20f, 20f)
        }
        }.build()

        return _exclamationMarkSlash!!
    }

private var _exclamationMarkSlash: ImageVector? = null
