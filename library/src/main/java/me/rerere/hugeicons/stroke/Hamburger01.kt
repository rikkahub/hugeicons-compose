package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hamburger01: ImageVector
    get() {
        if (_hamburger01 != null) {
            return _hamburger01!!
        }
        _hamburger01 = ImageVector.Builder(
            name = "Hamburger01",
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
        moveTo(14.8541f, 4f)
        horizontalLineTo(9.14593f)
        curveTo(6.6503f, 4f, 4.52873f, 5.68344f, 3.75294f, 8.02892f)
        curveTo(3.49753f, 8.80111f, 3.36982f, 9.18721f, 3.69065f, 9.59361f)
        curveTo(4.01149f, 10f, 4.53377f, 10f, 5.57833f, 10f)
        horizontalLineTo(18.4217f)
        curveTo(19.4662f, 10f, 19.9885f, 10f, 20.3093f, 9.59361f)
        curveTo(20.6302f, 9.18721f, 20.5025f, 8.80111f, 20.2471f, 8.02892f)
        curveTo(19.4713f, 5.68344f, 17.3497f, 4f, 14.8541f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 16f)
        horizontalLineTo(3.5f)
        curveTo(2.67157f, 16f, 2f, 15.3284f, 2f, 14.5f)
        curveTo(2f, 13.6716f, 2.67157f, 13f, 3.5f, 13f)
        horizontalLineTo(11.3944f)
        curveTo(11.7893f, 13f, 12.1753f, 13.1169f, 12.5038f, 13.3359f)
        lineTo(14.4453f, 14.6302f)
        curveTo(14.7812f, 14.8541f, 15.2188f, 14.8541f, 15.5547f, 14.6302f)
        lineTo(17.4962f, 13.3359f)
        curveTo(17.8247f, 13.1169f, 18.2107f, 13f, 18.6056f, 13f)
        horizontalLineTo(20.5f)
        curveTo(21.3284f, 13f, 22f, 13.6716f, 22f, 14.5f)
        curveTo(22f, 15.3284f, 21.3284f, 16f, 20.5f, 16f)
        horizontalLineTo(20f)
        moveTo(4f, 16f)
        lineTo(4.4319f, 17.7276f)
        curveTo(4.76578f, 19.0631f, 5.96573f, 20f, 7.34233f, 20f)
        horizontalLineTo(16.6577f)
        curveTo(18.0343f, 20f, 19.2342f, 19.0631f, 19.5681f, 17.7276f)
        lineTo(20f, 16f)
        moveTo(4f, 16f)
        horizontalLineTo(11f)
        moveTo(20f, 16f)
        horizontalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0078f, 7f)
        lineTo(14.9988f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 6.5f)
        lineTo(9.5f, 7.5f)
        }
        }.build()

        return _hamburger01!!
    }

private var _hamburger01: ImageVector? = null
