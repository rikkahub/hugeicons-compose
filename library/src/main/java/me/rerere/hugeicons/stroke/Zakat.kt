package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Zakat: ImageVector
    get() {
        if (_zakat != null) {
            return _zakat!!
        }
        _zakat = ImageVector.Builder(
            name = "Zakat",
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
        moveTo(18.9682f, 10.3551f)
        curveTo(18.6036f, 8.33276f, 17.4684f, 6.82687f, 16.4816f, 5.94236f)
        curveTo(16.1945f, 5.68497f, 16.0509f, 5.55628f, 15.7338f, 5.43717f)
        curveTo(15.4166f, 5.31807f, 15.144f, 5.31807f, 14.5988f, 5.31807f)
        horizontalLineTo(13.4012f)
        curveTo(12.856f, 5.31807f, 12.5834f, 5.31807f, 12.2662f, 5.43717f)
        curveTo(11.9491f, 5.55628f, 11.8055f, 5.68497f, 11.5184f, 5.94236f)
        curveTo(10.5316f, 6.82687f, 9.39645f, 8.33276f, 9.03182f, 10.3551f)
        curveTo(8.76052f, 11.8597f, 10.2663f, 13f, 11.9491f, 13f)
        horizontalLineTo(16.0509f)
        curveTo(17.7337f, 13f, 19.2395f, 11.8597f, 18.9682f, 10.3551f)
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
        moveTo(13f, 16.5f)
        lineTo(17.5928f, 15.0889f)
        curveTo(18.407f, 14.8352f, 19.2871f, 15.136f, 19.7971f, 15.8423f)
        curveTo(20.1659f, 16.3529f, 20.0157f, 17.0842f, 19.4785f, 17.3942f)
        lineTo(11.9629f, 21.7305f)
        curveTo(11.4849f, 22.0063f, 10.9209f, 22.0736f, 10.3952f, 21.9176f)
        lineTo(4f, 20.0199f)
        }
        }.build()

        return _zakat!!
    }

private var _zakat: ImageVector? = null
