package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FileUnlocked: ImageVector
    get() {
        if (_fileUnlocked != null) {
            return _fileUnlocked!!
        }
        _fileUnlocked = ImageVector.Builder(
            name = "FileUnlocked",
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
        moveTo(14.75f, 16.5f)
        verticalLineTo(14.75f)
        curveTo(14.75f, 13.7835f, 15.5335f, 13f, 16.5f, 13f)
        curveTo(17.0781f, 13f, 17.5907f, 13.2803f, 17.9094f, 13.7124f)
        moveTo(20f, 19.25f)
        curveTo(20f, 18.0772f, 20f, 17.4908f, 19.69f, 17.0869f)
        curveTo(19.6102f, 16.9829f, 19.5171f, 16.8898f, 19.4131f, 16.81f)
        curveTo(19.0092f, 16.5f, 18.4228f, 16.5f, 17.25f, 16.5f)
        horizontalLineTo(15.75f)
        curveTo(14.5772f, 16.5f, 13.9908f, 16.5f, 13.5869f, 16.81f)
        curveTo(13.4829f, 16.8898f, 13.3898f, 16.9829f, 13.31f, 17.0869f)
        curveTo(13f, 17.4908f, 13f, 18.0772f, 13f, 19.25f)
        curveTo(13f, 20.4228f, 13f, 21.0092f, 13.31f, 21.4131f)
        curveTo(13.3898f, 21.5171f, 13.4829f, 21.6102f, 13.5869f, 21.69f)
        curveTo(13.9908f, 22f, 14.5772f, 22f, 15.75f, 22f)
        horizontalLineTo(17.25f)
        curveTo(18.4228f, 22f, 19.0092f, 22f, 19.4131f, 21.69f)
        curveTo(19.5171f, 21.6102f, 19.6102f, 21.5171f, 19.69f, 21.4131f)
        curveTo(20f, 21.0092f, 20f, 20.4228f, 20f, 19.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12.0043f)
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
        }.build()

        return _fileUnlocked!!
    }

private var _fileUnlocked: ImageVector? = null
