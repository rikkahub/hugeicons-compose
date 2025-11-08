package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tornado02: ImageVector
    get() {
        if (_tornado02 != null) {
            return _tornado02!!
        }
        _tornado02 = ImageVector.Builder(
            name = "Tornado02",
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
        moveTo(9.01654f, 6.15879f)
        curveTo(10.9944f, 4.77262f, 17.9171f, 3.55944f, 18.906f, 6.15879f)
        curveTo(20.3862f, 10.0497f, 3.87743f, 12.3805f, 5.06077f, 6.15849f)
        curveTo(5.55508f, 3.55944f, 10.5002f, 2f, 12.9725f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11.1934f)
        curveTo(15.423f, 13.0706f, 8.5771f, 13.8244f, 6f, 11.7816f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0219f, 21.6941f)
        curveTo(13.0436f, 21.8816f, 12.0077f, 21.989f, 11f, 21.9995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15.166f)
        curveTo(9.07731f, 16.0444f, 12.3835f, 15.9574f, 15f, 15.2812f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.03906f, 18.5039f)
        curveTo(9.49304f, 18.8598f, 11.2867f, 18.8854f, 12.9988f, 18.6635f)
        }
        }.build()

        return _tornado02!!
    }

private var _tornado02: ImageVector? = null
