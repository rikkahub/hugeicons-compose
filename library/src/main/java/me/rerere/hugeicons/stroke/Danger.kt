package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Danger: ImageVector
    get() {
        if (_danger != null) {
            return _danger!!
        }
        _danger = ImageVector.Builder(
            name = "Danger",
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
        moveTo(10.5f, 11.25f)
        curveTo(10.5f, 10.2835f, 9.7165f, 9.5f, 8.75f, 9.5f)
        curveTo(7.7835f, 9.5f, 7f, 10.2835f, 7f, 11.25f)
        curveTo(7f, 12.2165f, 7.7835f, 13f, 8.75f, 13f)
        curveTo(9.7165f, 13f, 10.5f, 12.2165f, 10.5f, 11.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 11.25f)
        curveTo(17f, 10.2835f, 16.2165f, 9.5f, 15.25f, 9.5f)
        curveTo(14.2835f, 9.5f, 13.5f, 10.2835f, 13.5f, 11.25f)
        curveTo(13.5f, 12.2165f, 14.2835f, 13f, 15.25f, 13f)
        curveTo(16.2165f, 13f, 17f, 12.2165f, 17f, 11.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16f)
        lineTo(11.2929f, 15.6306f)
        curveTo(11.6262f, 15.2102f, 11.7929f, 15f, 12f, 15f)
        curveTo(12.2071f, 15f, 12.3738f, 15.2102f, 12.7071f, 15.6306f)
        lineTo(13f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(7.30558f, 2f, 3.5f, 5.76644f, 3.5f, 10.4126f)
        curveTo(3.5f, 12.1664f, 4.04229f, 13.795f, 4.96997f, 15.1428f)
        curveTo(4.71662f, 15.4221f, 4.5625f, 15.7914f, 4.5625f, 16.1962f)
        curveTo(4.5625f, 17.0674f, 5.27605f, 17.7736f, 6.15625f, 17.7736f)
        verticalLineTo(18.9929f)
        curveTo(6.15625f, 19.6422f, 6.46621f, 20.2619f, 7.02648f, 20.5901f)
        curveTo(10.2351f, 22.47f, 13.7649f, 22.47f, 16.9735f, 20.5901f)
        curveTo(17.5338f, 20.2619f, 17.8438f, 19.6422f, 17.8438f, 18.9929f)
        verticalLineTo(17.7736f)
        curveTo(18.724f, 17.7736f, 19.4375f, 17.0674f, 19.4375f, 16.1962f)
        curveTo(19.4375f, 15.7914f, 19.2834f, 15.4221f, 19.03f, 15.1428f)
        curveTo(19.9577f, 13.795f, 20.5f, 12.1664f, 20.5f, 10.4126f)
        curveTo(20.5f, 5.76644f, 16.6944f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 21.5f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 21.5f)
        verticalLineTo(20f)
        }
        }.build()

        return _danger!!
    }

private var _danger: ImageVector? = null
