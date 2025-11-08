package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = ImageVector.Builder(
            name = "Carrot",
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
        moveTo(8.20026f, 9.07541f)
        curveTo(6.09891f, 11.1768f, 0.635392f, 20.0024f, 2.31647f, 21.6835f)
        curveTo(3.99756f, 23.3646f, 12.8232f, 17.9011f, 14.9246f, 15.7997f)
        curveTo(17.0259f, 13.6984f, 18.2868f, 12.4376f, 14.9246f, 9.07541f)
        curveTo(11.5624f, 5.71325f, 10.3016f, 6.97406f, 8.20026f, 9.07541f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 15.5f)
        lineTo(13f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 11f)
        lineTo(8.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 19f)
        lineTo(8f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        curveTo(15.5185f, 2.51852f, 15.8555f, 3.63331f, 15.0001f, 5.11102f)
        moveTo(22f, 9f)
        curveTo(21.4815f, 8.48148f, 20.3668f, 8.14445f, 18.8892f, 9f)
        moveTo(19.2782f, 4.72192f)
        lineTo(17.3339f, 6.66636f)
        }
        }.build()

        return _carrot!!
    }

private var _carrot: ImageVector? = null
