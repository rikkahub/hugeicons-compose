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

val HugeIcons.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) {
            return _cloudOff!!
        }
        _cloudOff = ImageVector.Builder(
            name = "CloudOff",
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
            moveTo(17.4776f, 10.5001f)
            curveTo(17.485f, 10.5f, 17.4925f, 10.5f, 17.5f, 10.5f)
            curveTo(19.9853f, 10.5f, 22f, 12.5147f, 22f, 15f)
            curveTo(22f, 15.8582f, 21.7597f, 16.6604f, 21.3428f, 17.3428f)
            moveTo(17.4776f, 10.5001f)
            curveTo(17.4924f, 10.3354f, 17.5f, 10.1686f, 17.5f, 10f)
            curveTo(17.5f, 6.96243f, 15.0376f, 4.5f, 12f, 4.5f)
            curveTo(10.9945f, 4.5f, 10.052f, 4.76982f, 9.24101f, 5.24101f)
            moveTo(17.4776f, 10.5001f)
            curveTo(17.4039f, 11.3178f, 17.1512f, 12.0839f, 16.759f, 12.759f)
            moveTo(6.52042f, 9.5227f)
            curveTo(3.98398f, 9.76407f, 2f, 11.9003f, 2f, 14.5f)
            curveTo(2f, 17.2614f, 4.23858f, 19.5f, 7f, 19.5f)
            horizontalLineTo(17.5f)
            curveTo(18.0928f, 19.5f, 18.6588f, 19.3854f, 19.1771f, 19.1771f)
            moveTo(6.52042f, 9.5227f)
            curveTo(6.67826f, 9.50768f, 6.83823f, 9.5f, 7f, 9.5f)
            curveTo(8.12582f, 9.5f, 9.16474f, 9.87209f, 10.0005f, 10.5f)
            moveTo(6.52042f, 9.5227f)
            curveTo(6.59145f, 8.69641f, 6.84518f, 7.92232f, 7.24101f, 7.24101f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
