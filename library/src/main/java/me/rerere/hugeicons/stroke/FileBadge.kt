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

val HugeIcons.FileBadge: ImageVector
    get() {
        if (_fileBadge != null) {
            return _fileBadge!!
        }
        _fileBadge = ImageVector.Builder(
            name = "FileBadge",
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
            moveTo(12.9983f, 2.50022f)
            verticalLineTo(3.00043f)
            curveTo(12.9983f, 5.83009f, 12.9983f, 7.24492f, 13.8772f, 8.12398f)
            curveTo(14.7561f, 9.00304f, 16.1707f, 9.00304f, 18.9998f, 9.00304f)
            horizontalLineTo(19.4999f)
            moveTo(4f, 8.00261f)
            curveTo(4.01954f, 5.69979f, 4.13999f, 4.41108f, 4.8825f, 3.48998f)
            curveTo(5.06155f, 3.26787f, 5.26383f, 3.06554f, 5.4859f, 2.88646f)
            curveTo(6.58513f, 2f, 8.20803f, 2f, 11.4538f, 2f)
            curveTo(12.1595f, 2f, 12.5124f, 2f, 12.8355f, 2.11406f)
            curveTo(12.9027f, 2.13778f, 12.9686f, 2.16508f, 13.0329f, 2.19583f)
            curveTo(13.342f, 2.3437f, 13.5915f, 2.59325f, 14.0905f, 3.09236f)
            lineTo(18.8282f, 7.83096f)
            curveTo(19.4063f, 8.40927f, 19.6954f, 8.69843f, 19.8477f, 9.06613f)
            curveTo(20f, 9.43383f, 20f, 9.84276f, 20f, 10.6606f)
            verticalLineTo(14.0052f)
            curveTo(20f, 17.7781f, 20f, 19.6645f, 18.8281f, 20.8366f)
            curveTo(17.8848f, 21.7801f, 16.4787f, 21.9641f, 13.9986f, 22f)
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
            moveTo(10f, 14f)
            curveTo(10f, 15.6569f, 8.65685f, 17f, 7f, 17f)
            curveTo(5.34315f, 17f, 4f, 15.6569f, 4f, 14f)
            curveTo(4f, 12.3431f, 5.34315f, 11f, 7f, 11f)
            curveTo(8.65685f, 11f, 10f, 12.3431f, 10f, 14f)
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
            moveTo(4.99999f, 16.5f)
            lineTo(4.13292f, 21.2689f)
            curveTo(4.06371f, 21.6496f, 4.35617f, 22f, 4.7431f, 22f)
            curveTo(4.90759f, 22f, 5.06533f, 21.9347f, 5.18164f, 21.8184f)
            lineTo(6.99999f, 20f)
            lineTo(8.81834f, 21.8184f)
            curveTo(8.93465f, 21.9347f, 9.0924f, 22f, 9.25688f, 22f)
            curveTo(9.64382f, 22f, 9.93628f, 21.6496f, 9.86706f, 21.2689f)
            lineTo(8.99999f, 16.5f)
        }
        }.build()

        return _fileBadge!!
    }

private var _fileBadge: ImageVector? = null
