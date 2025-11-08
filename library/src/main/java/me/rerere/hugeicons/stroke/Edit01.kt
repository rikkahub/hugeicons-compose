package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Edit01: ImageVector
    get() {
        if (_edit01 != null) {
            return _edit01!!
        }
        _edit01 = ImageVector.Builder(
            name = "Edit01",
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
        moveTo(16.9459f, 3.17305f)
        curveTo(17.5332f, 2.58578f, 17.8268f, 2.29215f, 18.1521f, 2.15173f)
        curveTo(18.6208f, 1.94942f, 19.1521f, 1.94942f, 19.6208f, 2.15173f)
        curveTo(19.946f, 2.29215f, 20.2397f, 2.58578f, 20.8269f, 3.17305f)
        curveTo(21.4142f, 3.76032f, 21.7079f, 4.05395f, 21.8483f, 4.37925f)
        curveTo(22.0506f, 4.8479f, 22.0506f, 5.37924f, 21.8483f, 5.84789f)
        curveTo(21.7079f, 6.17319f, 21.4142f, 6.46682f, 20.8269f, 7.05409f)
        lineTo(15.8054f, 12.0757f)
        curveTo(14.5682f, 13.3129f, 13.9496f, 13.9315f, 13.1748f, 14.298f)
        curveTo(12.4f, 14.6645f, 11.5294f, 14.7504f, 9.78823f, 14.9222f)
        lineTo(9f, 15f)
        lineTo(9.07778f, 14.2118f)
        curveTo(9.24958f, 12.4706f, 9.33549f, 11.6f, 9.70201f, 10.8252f)
        curveTo(10.0685f, 10.0504f, 10.6871f, 9.43183f, 11.9243f, 8.19464f)
        lineTo(16.9459f, 3.17305f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        horizontalLineTo(3.75f)
        curveTo(2.7835f, 15f, 2f, 15.7835f, 2f, 16.75f)
        curveTo(2f, 17.7165f, 2.7835f, 18.5f, 3.75f, 18.5f)
        horizontalLineTo(13.25f)
        curveTo(14.2165f, 18.5f, 15f, 19.2835f, 15f, 20.25f)
        curveTo(15f, 21.2165f, 14.2165f, 22f, 13.25f, 22f)
        horizontalLineTo(11f)
        }
        }.build()

        return _edit01!!
    }

private var _edit01: ImageVector? = null
