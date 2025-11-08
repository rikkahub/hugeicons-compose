package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Helicopter: ImageVector
    get() {
        if (_helicopter != null) {
            return _helicopter!!
        }
        _helicopter = ImageVector.Builder(
            name = "Helicopter",
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
        moveTo(14f, 4f)
        lineTo(14f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.1838f, 7.82217f)
        lineTo(7.05164f, 8.04637f)
        curveTo(6.33648f, 8.06885f, 5.9789f, 8.08009f, 5.6717f, 7.94382f)
        curveTo(5.08379f, 7.68303f, 4.84517f, 7.06182f, 4.58224f, 6.51632f)
        curveTo(4.28874f, 5.9074f, 3.73021f, 6.00588f, 3.15095f, 6.00588f)
        curveTo(2.53725f, 6.00588f, 2.23041f, 6.00588f, 2.07897f, 6.21415f)
        curveTo(1.92753f, 6.42241f, 2.01183f, 6.72847f, 2.18043f, 7.34059f)
        lineTo(2.23713f, 7.54646f)
        curveTo(2.52367f, 8.58683f, 2.66695f, 9.10701f, 3.01257f, 9.48147f)
        curveTo(3.3582f, 9.85594f, 3.85296f, 10.027f, 4.84247f, 10.3692f)
        lineTo(9.16779f, 11.8648f)
        curveTo(10.0835f, 12.1814f, 10.5514f, 12.5853f, 11.0192f, 13.4588f)
        curveTo(11.7405f, 14.8054f, 12.1011f, 15.4788f, 12.6253f, 15.957f)
        curveTo(13.0094f, 16.3073f, 13.454f, 16.5787f, 13.9357f, 16.7568f)
        curveTo(14.5933f, 17f, 15.3359f, 17f, 16.8209f, 17f)
        horizontalLineTo(20.7356f)
        curveTo(21.6061f, 17f, 22f, 16.4839f, 22f, 15.6884f)
        curveTo(22f, 14.1725f, 22f, 13.4145f, 21.8765f, 12.7899f)
        curveTo(21.3762f, 10.2594f, 19.4337f, 8.30451f, 16.9803f, 7.86242f)
        curveTo(16.3748f, 7.7533f, 15.6444f, 7.77626f, 14.1838f, 7.82217f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 13.5f)
        horizontalLineTo(19f)
        curveTo(16.2386f, 13.5f, 14f, 11.2614f, 14f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20f)
        horizontalLineTo(14f)
        moveTo(21f, 20f)
        horizontalLineTo(19f)
        moveTo(19f, 20f)
        lineTo(20f, 17f)
        moveTo(19f, 20f)
        horizontalLineTo(14f)
        moveTo(14f, 20f)
        lineTo(15f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 4f)
        horizontalLineTo(17f)
        }
        }.build()

        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
