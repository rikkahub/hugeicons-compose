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

val HugeIcons.FileClock: ImageVector
    get() {
        if (_fileClock != null) {
            return _fileClock!!
        }
        _fileClock = ImageVector.Builder(
            name = "FileClock",
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
            moveTo(13f, 17f)
            arcTo(5f, 5f, 0f, true, false, 3f, 17f)
            arcTo(5f, 5f, 0f, true, false, 13f, 17f)
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
            moveTo(8f, 15f)
            verticalLineTo(17f)
            lineTo(9.5f, 17.5f)
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
            moveTo(14f, 2.50022f)
            verticalLineTo(3.00043f)
            curveTo(14f, 5.83009f, 14f, 7.24492f, 14.8786f, 8.12398f)
            curveTo(15.7573f, 9.00304f, 17.1715f, 9.00304f, 20f, 9.00304f)
            horizontalLineTo(20.5f)
            moveTo(5f, 9.00304f)
            curveTo(5.00194f, 6.05815f, 5.0424f, 4.5367f, 5.88598f, 3.48998f)
            curveTo(6.06499f, 3.26787f, 6.26722f, 3.06554f, 6.48924f, 2.88646f)
            curveTo(7.58822f, 2f, 9.21075f, 2f, 12.4558f, 2f)
            curveTo(13.1613f, 2f, 13.5141f, 2f, 13.8371f, 2.11406f)
            curveTo(13.9043f, 2.13778f, 13.9702f, 2.16508f, 14.0345f, 2.19583f)
            curveTo(14.3435f, 2.3437f, 14.593f, 2.59325f, 15.0918f, 3.09236f)
            lineTo(19.8284f, 7.83096f)
            curveTo(20.4065f, 8.40927f, 20.6955f, 8.69843f, 20.8478f, 9.06613f)
            curveTo(21f, 9.43383f, 21f, 9.84276f, 21f, 10.6606f)
            verticalLineTo(14.0052f)
            curveTo(21f, 17.7781f, 21f, 19.6645f, 19.8284f, 20.8366f)
            curveTo(18.8853f, 21.7801f, 17.4795f, 21.9641f, 15f, 22f)
        }
        }.build()

        return _fileClock!!
    }

private var _fileClock: ImageVector? = null
