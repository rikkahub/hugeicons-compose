package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WirelessCloudAccess: ImageVector
    get() {
        if (_wirelessCloudAccess != null) {
            return _wirelessCloudAccess!!
        }
        _wirelessCloudAccess = ImageVector.Builder(
            name = "WirelessCloudAccess",
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
        moveTo(17.4776f, 8.39801f)
        lineTo(17.5f, 8.39795f)
        curveTo(19.9853f, 8.39795f, 22f, 10.3784f, 22f, 12.8214f)
        curveTo(22f, 14.3551f, 21.206f, 15.7065f, 20f, 16.5f)
        moveTo(17.4776f, 8.39801f)
        curveTo(17.4924f, 8.23611f, 17.5f, 8.07215f, 17.5f, 7.90646f)
        curveTo(17.5f, 4.92055f, 15.0376f, 2.5f, 12f, 2.5f)
        curveTo(9.12324f, 2.5f, 6.76233f, 4.67106f, 6.52042f, 7.43728f)
        moveTo(17.4776f, 8.39801f)
        curveTo(17.3753f, 9.51316f, 16.9286f, 10.5307f, 16.2428f, 11.3469f)
        moveTo(6.52042f, 7.43728f)
        curveTo(3.98398f, 7.67454f, 2f, 9.77448f, 2f, 12.3299f)
        curveTo(2f, 14.0886f, 2.93963f, 15.6315f, 4.35232f, 16.5f)
        moveTo(6.52042f, 7.43728f)
        curveTo(6.67826f, 7.42251f, 6.83823f, 7.41496f, 7f, 7.41496f)
        curveTo(8.12582f, 7.41496f, 9.16474f, 7.78072f, 10.0005f, 8.39795f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15.9778f)
        curveTo(9.14883f, 15.0431f, 10.5209f, 14.5f, 11.9946f, 14.5f)
        curveTo(13.4729f, 14.5f, 14.849f, 15.0466f, 16f, 15.9866f)
        moveTo(14.1743f, 18.5f)
        curveTo(13.5182f, 18.0909f, 12.7779f, 17.8607f, 11.9946f, 17.8607f)
        curveTo(11.2152f, 17.8607f, 10.4784f, 18.0886f, 9.82477f, 18.4938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.5f)
        horizontalLineTo(12.0064f)
        }
        }.build()

        return _wirelessCloudAccess!!
    }

private var _wirelessCloudAccess: ImageVector? = null
