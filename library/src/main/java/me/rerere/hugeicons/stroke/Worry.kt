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

val HugeIcons.Worry: ImageVector
    get() {
        if (_worry != null) {
            return _worry!!
        }
        _worry = ImageVector.Builder(
            name = "Worry",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(16f, 15.6f)
            lineTo(15.7307f, 15.4f)
            curveTo(15.0125f, 14.8667f, 14.1672f, 14.8667f, 13.4491f, 15.4f)
            lineTo(13.1798f, 15.6f)
            curveTo(12.4616f, 16.1333f, 11.6163f, 16.1333f, 10.8982f, 15.6f)
            lineTo(10.6288f, 15.4f)
            curveTo(9.91069f, 14.8667f, 9.06539f, 14.8667f, 8.34723f, 15.4f)
            lineTo(8f, 15.6579f)
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
            moveTo(15.625f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(8.375f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(8.75f, 8.75f)
            curveTo(8.75f, 8.33579f, 8.58211f, 8f, 8.375f, 8f)
            curveTo(8.16789f, 8f, 8f, 8.33579f, 8f, 8.75f)
            curveTo(8f, 9.16421f, 8.16789f, 9.5f, 8.375f, 9.5f)
            curveTo(8.58211f, 9.5f, 8.75f, 9.16421f, 8.75f, 8.75f)
            close()
            moveTo(16f, 8.75f)
            curveTo(16f, 8.33579f, 15.8321f, 8f, 15.625f, 8f)
            curveTo(15.4179f, 8f, 15.25f, 8.33579f, 15.25f, 8.75f)
            curveTo(15.25f, 9.16421f, 15.4179f, 9.5f, 15.625f, 9.5f)
            curveTo(15.8321f, 9.5f, 16f, 9.16421f, 16f, 8.75f)
            close()
        }
        }.build()

        return _worry!!
    }

private var _worry: ImageVector? = null
