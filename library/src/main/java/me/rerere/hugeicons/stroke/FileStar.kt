package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileStar: ImageVector
    get() {
        if (_fileStar != null) {
            return _fileStar!!
        }
        _fileStar = ImageVector.Builder(
            name = "FileStar",
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
        moveTo(20f, 14.0052f)
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
        curveTo(4f, 17.7781f, 4f, 19.6645f, 5.17157f, 20.8366f)
        curveTo(6.11466f, 21.7801f, 7.52043f, 21.9641f, 10f, 22f)
        moveTo(13f, 2.50022f)
        verticalLineTo(3.00043f)
        curveTo(13f, 5.83009f, 13f, 7.24492f, 13.8787f, 8.12398f)
        curveTo(14.7574f, 9.00304f, 16.1716f, 9.00304f, 19f, 9.00304f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5088f, 14.8215f)
        curveTo(15.6913f, 14.3928f, 16.3087f, 14.3928f, 16.4912f, 14.8215f)
        lineTo(17.3329f, 16.7988f)
        lineTo(19.509f, 16.9692f)
        curveTo(19.9822f, 17.0063f, 20.1733f, 17.5879f, 19.8118f, 17.8905f)
        lineTo(18.1566f, 19.2758f)
        lineTo(18.6635f, 21.3521f)
        curveTo(18.7741f, 21.8049f, 18.2743f, 22.1639f, 17.8696f, 21.9224f)
        lineTo(16f, 20.8067f)
        lineTo(14.1304f, 21.9224f)
        curveTo(13.7257f, 22.1639f, 13.2259f, 21.8049f, 13.3365f, 21.3521f)
        lineTo(13.8434f, 19.2758f)
        lineTo(12.1882f, 17.8905f)
        curveTo(11.8267f, 17.5879f, 12.0178f, 17.0063f, 12.491f, 16.9692f)
        lineTo(14.6671f, 16.7988f)
        lineTo(15.5088f, 14.8215f)
        }
        }.build()

        return _fileStar!!
    }

private var _fileStar: ImageVector? = null
