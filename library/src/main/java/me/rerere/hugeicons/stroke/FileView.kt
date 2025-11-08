package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileView: ImageVector
    get() {
        if (_fileView != null) {
            return _fileView!!
        }
        _fileView = ImageVector.Builder(
            name = "FileView",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13.0052f)
        verticalLineTo(10.6606f)
        curveTo(19f, 9.84276f, 19f, 9.43383f, 18.8478f, 9.06613f)
        curveTo(18.6955f, 8.69843f, 18.4065f, 8.40927f, 17.8284f, 7.83096f)
        lineTo(13.0919f, 3.09236f)
        curveTo(12.593f, 2.59325f, 12.3436f, 2.3437f, 12.0345f, 2.19583f)
        curveTo(11.9702f, 2.16508f, 11.9044f, 2.13778f, 11.8372f, 2.11406f)
        curveTo(11.5141f, 2f, 11.1614f, 2f, 10.4558f, 2f)
        curveTo(7.21082f, 2f, 5.58831f, 2f, 4.48933f, 2.88646f)
        curveTo(4.26731f, 3.06554f, 4.06508f, 3.26787f, 3.88607f, 3.48998f)
        curveTo(3f, 4.58943f, 3f, 6.21265f, 3f, 9.45908f)
        verticalLineTo(14.0052f)
        curveTo(3f, 17.7781f, 3f, 19.6645f, 4.17157f, 20.8366f)
        curveTo(5.11466f, 21.7801f, 6.52043f, 21.9641f, 9f, 22f)
        moveTo(12f, 2.50022f)
        verticalLineTo(3.00043f)
        curveTo(12f, 5.83009f, 12f, 7.24492f, 12.8787f, 8.12398f)
        curveTo(13.7574f, 9.00304f, 15.1716f, 9.00304f, 18f, 9.00304f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 22f)
        curveTo(18.7614f, 22f, 21f, 19f, 21f, 19f)
        curveTo(21f, 19f, 18.7614f, 16f, 16f, 16f)
        curveTo(13.2386f, 16f, 11f, 19f, 11f, 19f)
        curveTo(11f, 19f, 13.2386f, 22f, 16f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9902f, 19f)
        horizontalLineTo(15.9992f)
        }
        }.build()

        return _fileView!!
    }

private var _fileView: ImageVector? = null
