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

val HugeIcons.ExclamationMarkBig: ImageVector
    get() {
        if (_exclamationMarkBig != null) {
            return _exclamationMarkBig!!
        }
        _exclamationMarkBig = ImageVector.Builder(
            name = "ExclamationMarkBig",
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
            moveTo(13.5f, 12.5f)
            verticalLineTo(5.5f)
            curveTo(13.5f, 4.67157f, 12.8284f, 4f, 12f, 4f)
            curveTo(11.1716f, 4f, 10.5f, 4.67157f, 10.5f, 5.5f)
            verticalLineTo(12.5f)
            curveTo(10.5f, 13.3284f, 11.1716f, 14f, 12f, 14f)
            curveTo(12.8284f, 14f, 13.5f, 13.3284f, 13.5f, 12.5f)
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
            moveTo(12f, 20f)
            curveTo(12.8284f, 20f, 13.5f, 19.3284f, 13.5f, 18.5f)
            curveTo(13.5f, 17.6716f, 12.8284f, 17f, 12f, 17f)
            curveTo(11.1716f, 17f, 10.5f, 17.6716f, 10.5f, 18.5f)
            curveTo(10.5f, 19.3284f, 11.1716f, 20f, 12f, 20f)
            close()
        }
        }.build()

        return _exclamationMarkBig!!
    }

private var _exclamationMarkBig: ImageVector? = null
