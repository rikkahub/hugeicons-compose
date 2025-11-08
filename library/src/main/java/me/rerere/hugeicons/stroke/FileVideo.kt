package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = ImageVector.Builder(
            name = "FileVideo",
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
        moveTo(19f, 14.0052f)
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
        moveTo(18f, 19.5f)
        lineTo(19.4453f, 20.4635f)
        curveTo(20.1297f, 20.9198f, 20.4719f, 21.1479f, 20.7359f, 21.0066f)
        curveTo(21f, 20.8653f, 21f, 20.454f, 21f, 19.6315f)
        verticalLineTo(18.3685f)
        curveTo(21f, 17.546f, 21f, 17.1347f, 20.7359f, 16.9934f)
        curveTo(20.4719f, 16.8521f, 20.1297f, 17.0802f, 19.4453f, 17.5365f)
        lineTo(18f, 18.5f)
        moveTo(18f, 19.5f)
        verticalLineTo(18.5f)
        moveTo(18f, 19.5f)
        curveTo(18f, 20.4346f, 18f, 20.9019f, 17.799f, 21.25f)
        curveTo(17.6674f, 21.478f, 17.478f, 21.6674f, 17.25f, 21.799f)
        curveTo(16.9019f, 22f, 16.4346f, 22f, 15.5f, 22f)
        horizontalLineTo(15f)
        curveTo(13.5858f, 22f, 12.8787f, 22f, 12.4393f, 21.5607f)
        curveTo(12f, 21.1213f, 12f, 20.4142f, 12f, 19f)
        curveTo(12f, 17.5858f, 12f, 16.8787f, 12.4393f, 16.4393f)
        curveTo(12.8787f, 16f, 13.5858f, 16f, 15f, 16f)
        horizontalLineTo(15.5f)
        curveTo(16.4346f, 16f, 16.9019f, 16f, 17.25f, 16.201f)
        curveTo(17.478f, 16.3326f, 17.6674f, 16.522f, 17.799f, 16.75f)
        curveTo(18f, 17.0981f, 18f, 17.5654f, 18f, 18.5f)
        }
        }.build()

        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
