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

val HugeIcons.PointerOff: ImageVector
    get() {
        if (_pointerOff != null) {
            return _pointerOff!!
        }
        _pointerOff = ImageVector.Builder(
            name = "PointerOff",
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
            moveTo(17.4939f, 12.5f)
            lineTo(17.4939f, 12.2667f)
            curveTo(17.4938f, 11.553f, 17.4937f, 11.1962f, 17.4036f, 10.9063f)
            curveTo(17.2082f, 10.2776f, 16.7159f, 9.78538f, 16.0871f, 9.59005f)
            curveTo(15.7973f, 9.5f, 15.4404f, 9.5f, 14.7267f, 9.5f)
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
            moveTo(17.8166f, 10.5f)
            curveTo(18.445f, 10.5f, 18.7591f, 10.5f, 19.0167f, 10.57f)
            curveTo(19.7013f, 10.756f, 20.2361f, 11.2908f, 20.4222f, 11.9754f)
            curveTo(20.4922f, 12.233f, 20.4922f, 12.5472f, 20.4923f, 13.1755f)
            lineTo(20.4923f, 13.9997f)
            curveTo(20.4924f, 14.7636f, 20.4924f, 15.4236f, 20.4789f, 16f)
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
            moveTo(8.49325f, 8.5f)
            verticalLineTo(13.5f)
            lineTo(6.18555f, 11.3369f)
            curveTo(5.38704f, 10.738f, 4.24578f, 10.9616f, 3.73224f, 11.8174f)
            curveTo(3.40186f, 12.3681f, 3.41356f, 13.0587f, 3.76241f, 13.5979f)
            lineTo(6.3221f, 17.5095f)
            curveTo(7.39751f, 19.1529f, 7.93522f, 19.9746f, 8.74348f, 20.4492f)
            curveTo(8.8247f, 20.4969f, 8.90759f, 20.5417f, 8.99197f, 20.5836f)
            curveTo(9.83171f, 21f, 10.8137f, 21f, 12.7777f, 21f)
            horizontalLineTo(13.4929f)
            curveTo(16.3018f, 21f, 17.7063f, 21f, 18.7152f, 20.3259f)
            curveTo(19.0031f, 20.1335f, 19.2642f, 19.9049f, 19.4924f, 19.6464f)
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
            moveTo(11.4924f, 6f)
            verticalLineTo(3.5f)
            curveTo(11.4924f, 2.67157f, 10.8208f, 2f, 9.99237f, 2f)
            curveTo(9.16394f, 2f, 8.49237f, 2.67157f, 8.49237f, 3.5f)
            verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99237f, 2f)
            lineTo(21.9924f, 22f)
        }
        }.build()

        return _pointerOff!!
    }

private var _pointerOff: ImageVector? = null
