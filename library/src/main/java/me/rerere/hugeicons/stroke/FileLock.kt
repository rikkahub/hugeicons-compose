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

val HugeIcons.FileLock: ImageVector
    get() {
        if (_fileLock != null) {
            return _fileLock!!
        }
        _fileLock = ImageVector.Builder(
            name = "FileLock",
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
            moveTo(4.5f, 11.0039f)
            verticalLineTo(9.45908f)
            curveTo(4.5f, 6.21265f, 4.5f, 4.58943f, 5.38607f, 3.48998f)
            curveTo(5.56508f, 3.26787f, 5.76731f, 3.06554f, 5.98933f, 2.88646f)
            curveTo(7.08831f, 2f, 8.71082f, 2f, 11.9558f, 2f)
            curveTo(12.6614f, 2f, 13.0141f, 2f, 13.3372f, 2.11406f)
            curveTo(13.4044f, 2.13778f, 13.4702f, 2.16508f, 13.5345f, 2.19583f)
            curveTo(13.8436f, 2.3437f, 14.093f, 2.59325f, 14.5919f, 3.09236f)
            lineTo(19.3284f, 7.83096f)
            curveTo(19.9065f, 8.40927f, 20.1955f, 8.69843f, 20.3478f, 9.06613f)
            curveTo(20.5f, 9.43383f, 20.5f, 9.84276f, 20.5f, 10.6606f)
            verticalLineTo(14.0052f)
            curveTo(20.5f, 17.7781f, 20.5f, 19.6645f, 19.3284f, 20.8366f)
            curveTo(18.3853f, 21.7801f, 16.9796f, 21.9641f, 14.5f, 22f)
            moveTo(13.5f, 2.50022f)
            verticalLineTo(3.00043f)
            curveTo(13.5f, 5.83009f, 13.5f, 7.24492f, 14.3787f, 8.12398f)
            curveTo(15.2574f, 9.00304f, 16.6716f, 9.00304f, 19.5f, 9.00304f)
            horizontalLineTo(20f)
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
            moveTo(9f, 17.5f)
            verticalLineTo(16f)
            curveTo(9f, 14.8954f, 8.10457f, 14f, 7f, 14f)
            curveTo(5.89543f, 14f, 5f, 14.8954f, 5f, 16f)
            verticalLineTo(17.5f)
            moveTo(9f, 17.5f)
            horizontalLineTo(5f)
            moveTo(9f, 17.5f)
            curveTo(9.82843f, 17.5f, 10.5f, 18.1716f, 10.5f, 19f)
            verticalLineTo(19.75f)
            curveTo(10.5f, 20.4489f, 10.5f, 20.7984f, 10.3858f, 21.074f)
            curveTo(10.2336f, 21.4416f, 9.94157f, 21.7336f, 9.57403f, 21.8858f)
            curveTo(9.29837f, 22f, 8.94891f, 22f, 8.25f, 22f)
            horizontalLineTo(5.75f)
            curveTo(5.05109f, 22f, 4.70163f, 22f, 4.42597f, 21.8858f)
            curveTo(4.05843f, 21.7336f, 3.76642f, 21.4416f, 3.61418f, 21.074f)
            curveTo(3.5f, 20.7984f, 3.5f, 20.4489f, 3.5f, 19.75f)
            verticalLineTo(19f)
            curveTo(3.5f, 18.1716f, 4.17157f, 17.5f, 5f, 17.5f)
        }
        }.build()

        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
