package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tips: ImageVector
    get() {
        if (_tips != null) {
            return _tips!!
        }
        _tips = ImageVector.Builder(
            name = "Tips",
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
        moveTo(20f, 8f)
        curveTo(20f, 9.93293f, 18.433f, 11.5f, 16.5f, 11.5f)
        curveTo(14.567f, 11.5f, 13f, 9.93293f, 13f, 8f)
        curveTo(13f, 6.067f, 14.567f, 4.5f, 16.5f, 4.5f)
        curveTo(18.433f, 4.5f, 20f, 6.067f, 20f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.8311f, 4.92276f)
        curveTo(14.3768f, 3.51685f, 13.0571f, 2.5f, 11.5f, 2.5f)
        curveTo(9.567f, 2.5f, 8f, 4.067f, 8f, 6f)
        curveTo(8f, 7.93293f, 9.567f, 9.5f, 11.5f, 9.5f)
        curveTo(12.1043f, 9.5f, 12.6728f, 9.34684f, 13.1689f, 9.07723f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 13.5f)
        horizontalLineTo(6.39482f)
        curveTo(6.68897f, 13.5f, 6.97908f, 13.5663f, 7.24217f, 13.6936f)
        lineTo(9.28415f, 14.6816f)
        curveTo(9.54724f, 14.8089f, 9.83735f, 14.8751f, 10.1315f, 14.8751f)
        horizontalLineTo(11.1741f)
        curveTo(12.1825f, 14.8751f, 13f, 15.6662f, 13f, 16.642f)
        curveTo(13f, 16.6814f, 12.973f, 16.7161f, 12.9338f, 16.7269f)
        lineTo(10.3929f, 17.4295f)
        curveTo(9.93707f, 17.5555f, 9.449f, 17.5116f, 9.025f, 17.3064f)
        lineTo(6.84211f, 16.2503f)
        moveTo(13f, 16f)
        lineTo(17.5928f, 14.5889f)
        curveTo(18.407f, 14.3352f, 19.2871f, 14.636f, 19.7971f, 15.3423f)
        curveTo(20.1659f, 15.8529f, 20.0157f, 16.5842f, 19.4785f, 16.8942f)
        lineTo(11.9629f, 21.2305f)
        curveTo(11.4849f, 21.5063f, 10.9209f, 21.5736f, 10.3952f, 21.4176f)
        lineTo(4f, 19.5199f)
        }
        }.build()

        return _tips!!
    }

private var _tips: ImageVector? = null
