package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.OkFinger: ImageVector
    get() {
        if (_okFinger != null) {
            return _okFinger!!
        }
        _okFinger = ImageVector.Builder(
            name = "OkFinger",
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
        moveTo(6.375f, 22f)
        verticalLineTo(20.7166f)
        curveTo(6.375f, 19.6817f, 6.1378f, 18.6609f, 5.68218f, 17.7352f)
        lineTo(5.39077f, 17.1432f)
        curveTo(4.80497f, 15.953f, 4.5f, 14.6406f, 4.5f, 13.3099f)
        verticalLineTo(8.19048f)
        curveTo(4.5f, 7.4015f, 5.1296f, 6.76191f, 5.90625f, 6.76191f)
        curveTo(6.6829f, 6.76191f, 7.3125f, 7.4015f, 7.3125f, 8.19048f)
        moveTo(14.8125f, 22f)
        curveTo(14.8125f, 21.5674f, 14.8117f, 21.1365f, 14.8125f, 20.7212f)
        curveTo(14.8146f, 19.5775f, 16.0083f, 18.9963f, 16.9844f, 18.4266f)
        curveTo(18.0998f, 17.7757f, 18.9943f, 16.7254f, 19.4068f, 15.4608f)
        curveTo(19.678f, 14.6293f, 18.9266f, 13.9057f, 18.0293f, 13.9057f)
        curveTo(17.132f, 13.9057f, 16.3696f, 14.6903f, 15.7189f, 15.291f)
        curveTo(15.617f, 15.3851f, 15.5203f, 15.4586f, 15.4424f, 15.5084f)
        curveTo(14.1737f, 16.317f, 12.4807f, 15.3439f, 12.4807f, 13.9057f)
        curveTo(12.4807f, 12.4676f, 14.1737f, 11.4945f, 15.4424f, 12.3031f)
        curveTo(15.7584f, 12.469f, 16.019f, 12.6894f, 16.2273f, 12.9183f)
        curveTo(16.6998f, 13.4375f, 17.3234f, 13.9057f, 18.0364f, 13.9057f)
        curveTo(18.9501f, 13.9057f, 19.716f, 13.1694f, 19.4445f, 12.3212f)
        curveTo(18.7666f, 10.2034f, 16.766f, 8.66863f, 14.4034f, 8.66863f)
        curveTo(13.4062f, 8.66863f, 12.9375f, 8.95085f, 12.9375f, 8.95085f)
        lineTo(15.0823f, 3.94719f)
        curveTo(15.4571f, 3.01828f, 14.7846f, 2f, 13.7964f, 2f)
        curveTo(13.27f, 2f, 12.7888f, 2.30213f, 12.5534f, 2.78042f)
        lineTo(10.125f, 7.71429f)
        moveTo(10.125f, 7.71429f)
        lineTo(9.67741f, 8.62368f)
        moveTo(10.125f, 7.71429f)
        verticalLineTo(4.38095f)
        curveTo(10.125f, 3.59197f, 9.4954f, 2.95238f, 8.71875f, 2.95238f)
        curveTo(7.9421f, 2.95238f, 7.3125f, 3.59197f, 7.3125f, 4.38095f)
        verticalLineTo(8.19048f)
        moveTo(7.3125f, 8.19048f)
        verticalLineTo(11.5238f)
        }
        }.build()

        return _okFinger!!
    }

private var _okFinger: ImageVector? = null
