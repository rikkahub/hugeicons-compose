package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Healtcare: ImageVector
    get() {
        if (_healtcare != null) {
            return _healtcare!!
        }
        _healtcare = ImageVector.Builder(
            name = "Healtcare",
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
        moveTo(8.39559f, 2.55196f)
        curveTo(9.8705f, 1.63811f, 11.1578f, 2.00638f, 11.9311f, 2.59299f)
        curveTo(12.2482f, 2.83351f, 12.4067f, 2.95378f, 12.5f, 2.95378f)
        curveTo(12.5933f, 2.95378f, 12.7518f, 2.83351f, 13.0689f, 2.59299f)
        curveTo(13.8422f, 2.00638f, 15.1295f, 1.63811f, 16.6044f, 2.55196f)
        curveTo(18.5401f, 3.75128f, 18.9781f, 7.7079f, 14.5133f, 11.046f)
        curveTo(13.6629f, 11.6818f, 13.2377f, 11.9996f, 12.5f, 11.9996f)
        curveTo(11.7623f, 11.9996f, 11.3371f, 11.6818f, 10.4867f, 11.046f)
        curveTo(6.02195f, 7.7079f, 6.45994f, 3.75128f, 8.39559f, 2.55196f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14f)
        horizontalLineTo(6.39482f)
        curveTo(6.68897f, 14f, 6.97908f, 14.0663f, 7.24217f, 14.1936f)
        lineTo(9.28415f, 15.1816f)
        curveTo(9.54724f, 15.3089f, 9.83735f, 15.3751f, 10.1315f, 15.3751f)
        horizontalLineTo(11.1741f)
        curveTo(12.1825f, 15.3751f, 13f, 16.1662f, 13f, 17.142f)
        curveTo(13f, 17.1814f, 12.973f, 17.2161f, 12.9338f, 17.2269f)
        lineTo(10.3929f, 17.9295f)
        curveTo(9.93707f, 18.0555f, 9.449f, 18.0116f, 9.025f, 17.8064f)
        lineTo(6.84211f, 16.7503f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16.5f)
        lineTo(17.5928f, 15.0889f)
        curveTo(18.407f, 14.8352f, 19.2871f, 15.136f, 19.7971f, 15.8423f)
        curveTo(20.1659f, 16.3529f, 20.0157f, 17.0842f, 19.4785f, 17.3942f)
        lineTo(11.9629f, 21.7305f)
        curveTo(11.4849f, 22.0063f, 10.9209f, 22.0736f, 10.3952f, 21.9176f)
        lineTo(4f, 20.0199f)
        }
        }.build()

        return _healtcare!!
    }

private var _healtcare: ImageVector? = null
