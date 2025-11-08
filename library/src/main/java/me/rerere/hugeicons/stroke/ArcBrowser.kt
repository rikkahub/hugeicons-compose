package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArcBrowser: ImageVector
    get() {
        if (_arcBrowser != null) {
            return _arcBrowser!!
        }
        _arcBrowser = ImageVector.Builder(
            name = "ArcBrowser",
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
        moveTo(13.5061f, 13.6018f)
        curveTo(12.905f, 13.788f, 12.2654f, 13.8885f, 11.602f, 13.8885f)
        curveTo(9.12036f, 13.8885f, 6.96846f, 12.4842f, 5.93046f, 10.431f)
        curveTo(5.48592f, 9.55161f, 4.39999f, 9.19282f, 3.50496f, 9.62957f)
        curveTo(2.60993f, 10.0663f, 2.24474f, 11.1332f, 2.68928f, 12.0126f)
        curveTo(4.3146f, 15.2277f, 7.69305f, 17.444f, 11.602f, 17.444f)
        curveTo(12.8475f, 17.444f, 14.0394f, 17.2191f, 15.138f, 16.8084f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.2384f, 14.9501f)
        curveTo(20.013f, 13.3865f, 21.2128f, 11.2053f, 21.4889f, 8.75026f)
        curveTo(21.5987f, 7.77436f, 20.8824f, 6.89583f, 19.8891f, 6.78801f)
        curveTo(18.8958f, 6.68019f, 18.0016f, 7.38391f, 17.8919f, 8.35981f)
        curveTo(17.7555f, 9.57212f, 17.2644f, 10.6794f, 16.5229f, 11.5793f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5473f, 3.99976f)
        curveTo(12.2327f, 3.99976f, 12.8592f, 4.38021f, 13.1658f, 4.98249f)
        lineTo(19.4989f, 17.427f)
        curveTo(19.9458f, 18.3052f, 19.5835f, 19.373f, 18.6897f, 19.8121f)
        curveTo(17.7958f, 20.2512f, 16.7089f, 19.8953f, 16.262f, 19.0171f)
        lineTo(11.5473f, 9.75278f)
        lineTo(9.6037f, 13.5719f)
        curveTo(8.41018f, 13.1819f, 7.37371f, 12.4516f, 6.61386f, 11.4964f)
        lineTo(9.92887f, 4.98249f)
        curveTo(10.2354f, 4.38021f, 10.8619f, 3.99976f, 11.5473f, 3.99976f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.8326f, 19.0171f)
        curveTo(6.38568f, 19.8953f, 5.29878f, 20.2512f, 4.40494f, 19.8121f)
        curveTo(3.5111f, 19.373f, 3.1488f, 18.3052f, 3.59572f, 17.427f)
        lineTo(4.89047f, 14.8828f)
        curveTo(5.78379f, 15.686f, 6.82705f, 16.3313f, 7.97447f, 16.7733f)
        lineTo(6.8326f, 19.0171f)
        }
        }.build()

        return _arcBrowser!!
    }

private var _arcBrowser: ImageVector? = null
