package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PenConnectWifi: ImageVector
    get() {
        if (_penConnectWifi != null) {
            return _penConnectWifi!!
        }
        _penConnectWifi = ImageVector.Builder(
            name = "PenConnectWifi",
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
        moveTo(17.2141f, 7.98239f)
        lineTo(18.6158f, 6.58063f)
        curveTo(19.39f, 5.80646f, 20.6452f, 5.80646f, 21.4194f, 6.58063f)
        curveTo(22.1935f, 7.3548f, 22.1935f, 8.60998f, 21.4194f, 9.38415f)
        lineTo(20.0176f, 10.7859f)
        moveTo(17.2141f, 7.98239f)
        lineTo(8.98023f, 16.2163f)
        curveTo(7.93493f, 17.2616f, 7.41226f, 17.7842f, 7.05637f, 18.4211f)
        curveTo(6.70047f, 19.058f, 6.52927f, 19.7771f, 6.18687f, 21.2151f)
        lineTo(6f, 22f)
        lineTo(6.78486f, 21.8131f)
        curveTo(8.22295f, 21.4707f, 8.94199f, 21.2995f, 9.57889f, 20.9436f)
        curveTo(10.2158f, 20.5877f, 10.7384f, 20.0651f, 11.7837f, 19.0198f)
        lineTo(20.0176f, 10.7859f)
        moveTo(17.2141f, 7.98239f)
        lineTo(20.0176f, 10.7859f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49103f, 10f)
        horizontalLineTo(7.50001f)
        moveTo(13f, 4.41644f)
        curveTo(11.5924f, 2.92344f, 9.64788f, 2f, 7.5f, 2f)
        curveTo(5.35212f, 2f, 3.40757f, 2.92344f, 2f, 4.41644f)
        moveTo(4.75f, 7.33333f)
        curveTo(5.45379f, 6.58683f, 6.42606f, 6.12512f, 7.5f, 6.12512f)
        curveTo(8.57394f, 6.12512f, 9.54621f, 6.58683f, 10.25f, 7.33333f)
        }
        }.build()

        return _penConnectWifi!!
    }

private var _penConnectWifi: ImageVector? = null
