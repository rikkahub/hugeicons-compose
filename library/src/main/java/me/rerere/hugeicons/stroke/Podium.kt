package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Podium: ImageVector
    get() {
        if (_podium != null) {
            return _podium!!
        }
        _podium = ImageVector.Builder(
            name = "Podium",
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
        moveTo(9.29424f, 14f)
        curveTo(7.91955f, 14f, 7.23221f, 14f, 6.65717f, 13.7642f)
        curveTo(6.02495f, 13.5049f, 5.48333f, 13.0456f, 5.10588f, 12.4488f)
        curveTo(4.76258f, 11.9059f, 4.6117f, 11.1951f, 4.30994f, 9.77358f)
        curveTo(4.05199f, 8.55844f, 3.92302f, 7.95087f, 4.04847f, 7.4685f)
        curveTo(4.186f, 6.93967f, 4.52244f, 6.49392f, 4.97901f, 6.23561f)
        curveTo(5.39547f, 6f, 5.98301f, 6f, 7.15811f, 6f)
        horizontalLineTo(16.8419f)
        curveTo(18.017f, 6f, 18.6045f, 6f, 19.021f, 6.23561f)
        curveTo(19.4776f, 6.49392f, 19.814f, 6.93967f, 19.9515f, 7.4685f)
        curveTo(20.077f, 7.95087f, 19.948f, 8.55844f, 19.6901f, 9.77359f)
        curveTo(19.3883f, 11.1951f, 19.2374f, 11.9059f, 18.8941f, 12.4488f)
        curveTo(18.5167f, 13.0456f, 17.9751f, 13.5049f, 17.3428f, 13.7642f)
        curveTo(16.7678f, 14f, 16.0804f, 14f, 14.7058f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        lineTo(6.51493f, 3.94029f)
        curveTo(6.80001f, 2.79997f, 7.82459f, 2f, 9f, 2f)
        moveTo(18f, 6f)
        lineTo(17.4851f, 3.94029f)
        curveTo(17.2f, 2.79997f, 16.1754f, 2f, 15f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.28421f, 12f)
        lineTo(10.0603f, 17.5726f)
        curveTo(10.1053f, 17.8955f, 10.1278f, 18.0569f, 10.0834f, 18.1822f)
        curveTo(9.87682f, 18.7653f, 9.08754f, 18.3874f, 8.66068f, 18.5626f)
        curveTo(8.53152f, 18.6156f, 8.41501f, 18.7004f, 8.32003f, 18.8107f)
        curveTo(8.20789f, 18.9409f, 8.13871f, 19.1192f, 8.00036f, 19.4758f)
        curveTo(7.73896f, 20.1496f, 7.15042f, 21.0988f, 7.78292f, 21.7379f)
        curveTo(8.04234f, 22f, 8.50275f, 22f, 9.42357f, 22f)
        horizontalLineTo(14.5764f)
        curveTo(15.4972f, 22f, 15.9577f, 22f, 16.2171f, 21.7379f)
        curveTo(16.8496f, 21.0988f, 16.261f, 20.1496f, 15.9996f, 19.4758f)
        curveTo(15.8613f, 19.1192f, 15.7921f, 18.9409f, 15.68f, 18.8107f)
        curveTo(15.585f, 18.7004f, 15.4685f, 18.6156f, 15.3393f, 18.5626f)
        curveTo(14.9125f, 18.3874f, 14.1232f, 18.7653f, 13.9166f, 18.1822f)
        curveTo(13.8722f, 18.0569f, 13.8947f, 17.8955f, 13.9397f, 17.5726f)
        lineTo(14.7158f, 12f)
        }
        }.build()

        return _podium!!
    }

private var _podium: ImageVector? = null
