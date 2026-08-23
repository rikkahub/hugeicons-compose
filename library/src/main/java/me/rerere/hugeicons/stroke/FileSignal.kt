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

val HugeIcons.FileSignal: ImageVector
    get() {
        if (_fileSignal != null) {
            return _fileSignal!!
        }
        _fileSignal = ImageVector.Builder(
            name = "FileSignal",
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
            moveTo(14.5f, 15.9164f)
            curveTo(13.0924f, 14.4234f, 11.1479f, 13.5f, 9f, 13.5f)
            curveTo(6.85212f, 13.5f, 4.90757f, 14.4234f, 3.5f, 15.9164f)
            moveTo(6.25f, 18.8333f)
            curveTo(6.95379f, 18.0868f, 7.92606f, 17.6251f, 9f, 17.6251f)
            curveTo(10.0739f, 17.6251f, 11.0462f, 18.0868f, 11.75f, 18.8333f)
            moveTo(9.12579f, 21.75f)
            horizontalLineTo(9.00079f)
            moveTo(9.25079f, 21.75f)
            curveTo(9.25079f, 21.8881f, 9.13886f, 22f, 9.00079f, 22f)
            curveTo(8.86272f, 22f, 8.75079f, 21.8881f, 8.75079f, 21.75f)
            curveTo(8.75079f, 21.6119f, 8.86272f, 21.5f, 9.00079f, 21.5f)
            curveTo(9.13886f, 21.5f, 9.25079f, 21.6119f, 9.25079f, 21.75f)
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
            moveTo(4.5f, 10.0035f)
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
        }.build()

        return _fileSignal!!
    }

private var _fileSignal: ImageVector? = null
