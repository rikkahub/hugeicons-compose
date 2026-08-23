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

val HugeIcons.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) {
            return _fileArchive!!
        }
        _fileArchive = ImageVector.Builder(
            name = "FileArchive",
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
            moveTo(13f, 2.50022f)
            verticalLineTo(3.00043f)
            curveTo(13f, 5.83009f, 13f, 7.24492f, 13.8787f, 8.12398f)
            curveTo(14.7574f, 9.00304f, 16.1716f, 9.00304f, 19f, 9.00304f)
            horizontalLineTo(19.5f)
            moveTo(14f, 22f)
            curveTo(16.4796f, 21.9641f, 17.8853f, 21.7801f, 18.8284f, 20.8366f)
            curveTo(20f, 19.6645f, 20f, 17.7781f, 20f, 14.0052f)
            verticalLineTo(10.6606f)
            curveTo(20f, 9.84276f, 20f, 9.43383f, 19.8478f, 9.06613f)
            curveTo(19.6955f, 8.69843f, 19.4065f, 8.40927f, 18.8284f, 7.83096f)
            lineTo(14.0919f, 3.09236f)
            curveTo(13.593f, 2.59325f, 13.3436f, 2.3437f, 13.0345f, 2.19583f)
            curveTo(12.9702f, 2.16508f, 12.9044f, 2.13778f, 12.8372f, 2.11406f)
            curveTo(12.5141f, 2f, 12.1614f, 2f, 11.4558f, 2f)
            curveTo(8.21082f, 2f, 6.58831f, 2f, 5.48933f, 2.88646f)
            curveTo(5.26731f, 3.06554f, 5.06508f, 3.26787f, 4.88607f, 3.48998f)
            curveTo(4f, 4.58943f, 4f, 6.21265f, 4f, 9.45908f)
            verticalLineTo(14.0052f)
            curveTo(4f, 15.1755f, 4f, 16.1643f, 4.03496f, 17.0065f)
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
            moveTo(10.5f, 20.5f)
            curveTo(10.5f, 21.3284f, 9.82843f, 22f, 9f, 22f)
            curveTo(8.17157f, 22f, 7.5f, 21.3284f, 7.5f, 20.5f)
            curveTo(7.5f, 19.6716f, 8.17157f, 19f, 9f, 19f)
            curveTo(9.82843f, 19f, 10.5f, 19.6716f, 10.5f, 20.5f)
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
            moveTo(9f, 19f)
            verticalLineTo(17f)
            moveTo(9f, 13f)
            verticalLineTo(11f)
            moveTo(9f, 7f)
            verticalLineTo(5f)
        }
        }.build()

        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
