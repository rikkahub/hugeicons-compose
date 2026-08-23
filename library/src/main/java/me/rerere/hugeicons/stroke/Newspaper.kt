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

val HugeIcons.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = ImageVector.Builder(
            name = "Newspaper",
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
            moveTo(19.4922f, 21f)
            horizontalLineTo(7.49219f)
            curveTo(5.13516f, 21f, 3.95665f, 21f, 3.22442f, 20.2678f)
            curveTo(2.49219f, 19.5355f, 2.49219f, 18.357f, 2.49219f, 16f)
            verticalLineTo(8f)
            curveTo(2.49219f, 5.64298f, 2.49219f, 4.46447f, 3.22442f, 3.73223f)
            curveTo(3.95665f, 3f, 5.13516f, 3f, 7.49219f, 3f)
            horizontalLineTo(12.4922f)
            curveTo(14.8492f, 3f, 16.0277f, 3f, 16.76f, 3.73223f)
            curveTo(17.4922f, 4.46447f, 17.4922f, 5.64298f, 17.4922f, 8f)
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
            moveTo(11.9922f, 6f)
            horizontalLineTo(7.99219f)
            curveTo(7.04938f, 6f, 6.57797f, 6f, 6.28508f, 6.29289f)
            curveTo(5.99219f, 6.58579f, 5.99219f, 7.05719f, 5.99219f, 8f)
            curveTo(5.99219f, 8.94281f, 5.99219f, 9.41421f, 6.28508f, 9.70711f)
            curveTo(6.57797f, 10f, 7.04938f, 10f, 7.99219f, 10f)
            horizontalLineTo(11.9922f)
            curveTo(12.935f, 10f, 13.4064f, 10f, 13.6993f, 9.70711f)
            curveTo(13.9922f, 9.41421f, 13.9922f, 8.94281f, 13.9922f, 8f)
            curveTo(13.9922f, 7.05719f, 13.9922f, 6.58579f, 13.6993f, 6.29289f)
            curveTo(13.4064f, 6f, 12.935f, 6f, 11.9922f, 6f)
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
            moveTo(5.99219f, 14f)
            lineTo(13.9922f, 14f)
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
            moveTo(5.99219f, 18f)
            horizontalLineTo(10.9922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.4922f, 8f)
            horizontalLineTo(18.4922f)
            curveTo(19.9064f, 8f, 20.6135f, 8f, 21.0528f, 8.43934f)
            curveTo(21.4922f, 8.87868f, 21.4922f, 9.58579f, 21.4922f, 11f)
            verticalLineTo(19f)
            curveTo(21.4922f, 20.1046f, 20.5968f, 21f, 19.4922f, 21f)
            curveTo(18.3876f, 21f, 17.4922f, 20.1046f, 17.4922f, 19f)
            verticalLineTo(8f)
            close()
        }
        }.build()

        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
